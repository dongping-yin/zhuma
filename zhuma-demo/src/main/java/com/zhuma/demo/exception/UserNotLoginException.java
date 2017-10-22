package com.zhuma.demo.exception;

/**
 * @desc 用户未登录异常
 * 
 * @author zhumaer
 * @since 9/18/2017 3:00 PM
 */
public class UserNotLoginException extends BusinessException {

	private static final long serialVersionUID = -1879503946782379204L;

	public UserNotLoginException() {
		super();
	}

	public UserNotLoginException(String msg, Throwable cause, Object... objects) {
		super(msg, cause, objects);
	}

	public UserNotLoginException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public UserNotLoginException(Throwable cause) {
		super(cause);
	}

	public UserNotLoginException(String msg) {
		super(msg);
	}

	public UserNotLoginException(String format, Object... objects) {
		super(format, objects);
	}

}