package com.example.jobportaldb.Interface;

import com.example.jobportaldb.Model.RequestModel;
import com.example.jobportaldb.Model.ResponseModel;

public interface IUser {
	public ResponseModel getUserInfo();
	public ResponseModel addUser(RequestModel mRequestModel);

}
