package com.xmh.o2o.dto;

public class Result<T> {

	private boolean success;
	private Integer status;
	private T data;
	private String msg;
	
	
	public Result(boolean success, Integer status, T data, String msg) {
		this.success = success;
		this.status = status;
		this.data = data;
		this.msg = msg;
	}
	
	
	public Result() {
		
	}


	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
