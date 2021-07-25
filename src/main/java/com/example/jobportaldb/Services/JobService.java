package com.example.jobportaldb.Services;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jobportaldb.Interface.IJobService;
import com.example.jobportaldb.Model.Job;
import com.example.jobportaldb.Model.RequestModel;
import com.example.jobportaldb.Model.ResponseModel;
import com.example.jobportaldb.Repo.JobRepo;
import com.example.jobportaldb.Utils.AppConstant;
import com.example.jobportaldb.Utils.Util;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class JobService implements IJobService {
	@Autowired
    JobRepo mjob;
	
	
	@Override
	public ResponseModel getJobInfo() {
		try {

			List<Job> mList = mjob.findAll();

			if (mList != null && !mList.isEmpty()) {

				return Util.setResponse(AppConstant.SUCCESS_STATUS_CODE, AppConstant.SUCCESS_API_MESSGAE, mList);
			} else {
				return Util.setResponse(AppConstant.ERROR_STATUS_CODE, AppConstant.NO_RECORD_FOUND, null);
			}

		} catch (Exception e) {
			e.printStackTrace();
			
			return Util.setResponse(AppConstant.ERROR_STATUS_CODE, AppConstant.ERROR_API_MESSAGE, null);
		}
	}


	@Override
	public ResponseModel addJobs(RequestModel mRequestModel) {
		try {

			if (mRequestModel.getData() != null && mRequestModel.getData() != "") {
				ObjectMapper mapper = new ObjectMapper();
				Job msiteModel = mapper.readValue(mRequestModel.getData(), Job.class);
				msiteModel.setCreatedDate(Util.getCurrentSQLTimeStamp());
				msiteModel.setUsercount(0);
            	msiteModel = mjob.save(msiteModel);
               
				if (msiteModel != null && msiteModel.getJob_id()>0) {
					return Util.setResponse(AppConstant.SUCCESS_STATUS_CODE, "Job Added Succesfully", msiteModel);
				} else {
					return Util.setResponse(AppConstant.ERROR_STATUS_CODE, AppConstant.ERROR_SAVINGDATA, null);
				}
			} else {
				return Util.setResponse(AppConstant.ERROR_STATUS_CODE, AppConstant.NO_DATA, null);
			}

		} catch (Exception e) {

			e.printStackTrace();
			return Util.setResponse(AppConstant.ERROR_STATUS_CODE, AppConstant.ERROR_API_MESSAGE, null);

		}
	}


	@Override
	public ResponseModel getJobapplied() {
		try {

			List<Job> mList = mjob.getJob();

			if (mList != null && !mList.isEmpty()) {

				return Util.setResponse(AppConstant.SUCCESS_STATUS_CODE, AppConstant.SUCCESS_API_MESSGAE, mList);
			} else {
				return Util.setResponse(AppConstant.ERROR_STATUS_CODE, AppConstant.NO_RECORD_FOUND, null);
			}

		} catch (Exception e) {
			e.printStackTrace();
			
			return Util.setResponse(AppConstant.ERROR_STATUS_CODE, AppConstant.ERROR_API_MESSAGE, null);
		}
	}


	@Override
	public ResponseModel getjobId(RequestModel mRequestModel) {
		try {

			int job_id = 0;
			

			JSONObject mJsonObject = new JSONObject(mRequestModel.getData());

			if (mJsonObject.has("job_id"))
				if (!mJsonObject.isNull("job_id"))
					job_id = mJsonObject.getInt("job_id");

			
			return getCalculatedRevenueBy(job_id); //calculate revenue by given parmas

		} catch (Exception e) {

			
			return Util.setResponse(AppConstant.ERROR_STATUS_CODE, AppConstant.ERROR_API_MESSAGE, null);
		}
	}


	private ResponseModel getCalculatedRevenueBy(int job_id) {
		
		try {
        // TODO Auto-generated method stub
		List<Job> countList = mjob.getJobByid( job_id);
		return Util.setResponse(AppConstant.SUCCESS_STATUS_CODE, AppConstant.SUCCESS_API_MESSGAE,
				countList);

	}
	catch (Exception e) {
		return Util.setResponse(AppConstant.ERROR_STATUS_CODE, AppConstant.ERROR_API_MESSAGE, null);
	}
	}
}
