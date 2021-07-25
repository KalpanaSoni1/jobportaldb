package com.example.jobportaldb.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jobportaldb.Interface.IUser;
import com.example.jobportaldb.Model.Job;
import com.example.jobportaldb.Model.RequestModel;
import com.example.jobportaldb.Model.ResponseModel;
import com.example.jobportaldb.Model.UserDetails;
import com.example.jobportaldb.Repo.JobRepo;
import com.example.jobportaldb.Repo.UserRepo;
import com.example.jobportaldb.Utils.AppConstant;
import com.example.jobportaldb.Utils.Util;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class UserService implements IUser {
	@Autowired
    UserRepo mjob;
	
	@Autowired
    JobRepo mjobrepo;
	
	@Override
	public ResponseModel getUserInfo() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ResponseModel addUser(RequestModel mRequestModel) {
		try {

			if (mRequestModel.getData() != null && mRequestModel.getData() != "") {
				ObjectMapper mapper = new ObjectMapper();
				UserDetails msiteModel = mapper.readValue(mRequestModel.getData(), UserDetails.class);
            	msiteModel = mjob.save(msiteModel);
            	Job mjob=mjobrepo.updateJob(msiteModel.getmJob().getJob_id());
					

				if (msiteModel != null && msiteModel.getUserId()>0) {
					return Util.setResponse(AppConstant.SUCCESS_STATUS_CODE, "Applied Succesfully", msiteModel);
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

}
