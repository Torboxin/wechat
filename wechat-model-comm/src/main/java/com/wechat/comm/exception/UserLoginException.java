package com.wechat.comm.exception;

import org.apache.shiro.authc.AccountException;

public class UserLoginException extends AccountException {

	/**
	 * serialVersionUID : TODO(描述此变量)
	 */
	private static final long serialVersionUID = 1L;

	public UserLoginException() {
		super();
	}

	public UserLoginException(String message) {
		super(message);
	}

	public UserLoginException(Throwable cause) {
		super(cause);
	}

	public UserLoginException(Throwable cause, String message) {
		super(message, cause);
	}
}
