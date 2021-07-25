package com.example.jobportaldb.Interface;

import com.example.jobportaldb.Model.RequestModel;
import com.example.jobportaldb.Model.ResponseModel;

public interface IJobService {
	public ResponseModel getJobInfo();
	public ResponseModel addJobs(RequestModel mRequestModel);
	public ResponseModel getJobapplied();
	public ResponseModel getjobId(RequestModel mRequestModel);

}
