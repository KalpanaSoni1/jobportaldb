package com.example.jobportaldb.Model;

public class ResponseModel {

	private Integer status;
	private String message;
	private Object myObjectList;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getMyObjectList() {
		return myObjectList;
	}

	public void setMyObjectList(Object myObjectList) {
		this.myObjectList = myObjectList;
	}

	@Override
	public String toString() {
		return "USERLOG:[status:"+status+",message:"+message+"]";
	}

}
