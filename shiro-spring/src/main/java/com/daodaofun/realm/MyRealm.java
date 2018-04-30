package com.daodaofun.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAccount;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.AuthenticatingRealm;

/**
 * 自定义的Realm
 * 没有和数据库进行真实的比较
 * @author qiudaozhang
 *
 */
public class MyRealm  extends AuthenticatingRealm{

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		Object principal = upToken.getPrincipal();
		Object credentials = upToken.getCredentials();
		if(principal.toString().equals("feifie")) {
			throw new UnknownAccountException("非法账号");
		}
		AuthenticationInfo info = null;
		info = new SimpleAccount(principal, credentials, getName());
		return info;
	}


}
