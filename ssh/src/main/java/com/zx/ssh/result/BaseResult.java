package com.zx.ssh.result;

/**
 * 返回结果集对象
 * @author yanta
 *
 */
public class BaseResult {

	private int code;
	
	private String msg;
	
	private Object obj;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public BaseResult(int code, String msg, Object obj) {
		super();
		this.code = code;
		this.msg = msg;
		this.obj = obj;
	}
	
	public static BaseResult getBaseResult(int code, String msg, Object obj) {
		return new BaseResult(code, msg, obj);
	}
}
