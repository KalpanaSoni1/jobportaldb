package com.example.jobportaldb.Utils;

import com.example.jobportaldb.Model.ResponseModel;

public class Util {
	public static ResponseModel setResponse(final Integer status_code, final String response_message,
			final Object myObjectList) {
		ResponseModel response = new ResponseModel();
		response.setStatus(status_code);
		response.setMessage(response_message);
		response.setMyObjectList(myObjectList);
		return response;
	}
	public static java.sql.Timestamp getCurrentSQLTimeStamp() {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());
		return timestamp;
	}
}
