package com.daodaofun.realm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.util.JdbcUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyJdbcRealm  extends JdbcRealm{

	
	private static final Logger log = LoggerFactory.getLogger(MyJdbcRealm.class);

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		String username = upToken.getUsername();
		if(username == null) {
			throw new AccountException("Null usernames are not allowed by this realm");
		}
		
		Connection conn = null;
		AuthenticationInfo info = null;
		
		try {
			conn = dataSource.getConnection();
			String password = getPasswordForUser(conn,username);
			if(password == null) {
				throw new UnknownAccountException("No account found for user[" + username + "]");
			}
			
			SimpleAuthenticationInfo saInfo = new SimpleAuthenticationInfo(username,password,getName());
			saInfo.setCredentialsSalt(ByteSource.Util.bytes(username));
			info = saInfo;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return info;
	}
	
	
	private String getPasswordForUser(Connection conn, String username) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String password = null;
		
		try {
			ps = conn.prepareStatement(authenticationQuery);
			ps.setString(1, username);
			rs = ps.executeQuery();
			boolean foundResult = false;
			while(rs.next()) {
				if(foundResult) {
					throw new  AuthenticationException("More than one user found for user[" + username  + 
				"].Usernames must be unique");
				}
				password = rs.getString(1);
				foundResult = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.closeResultSet(rs);
			JdbcUtils.closeStatement(ps);
		}
		return password;
	}
	
	
}
