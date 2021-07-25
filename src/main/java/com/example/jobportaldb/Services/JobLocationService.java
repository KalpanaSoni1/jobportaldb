package com.example.jobportaldb.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jobportaldb.Interface.IJobLocationService;
import com.example.jobportaldb.Model.JobLocation;
import com.example.jobportaldb.Model.ResponseModel;
import com.example.jobportaldb.Repo.JobLocationRepo;
import com.example.jobportaldb.Utils.AppConstant;
import com.example.jobportaldb.Utils.Util;


@Service
public class JobLocationService implements IJobLocationService {
	
	@Autowired
	JobLocationRepo mjob;
	
	
	
	@Override
	public ResponseModel getjobLocationInfo() {
		try {

			List<JobLocation> mList = mjob.findAll();

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

}
