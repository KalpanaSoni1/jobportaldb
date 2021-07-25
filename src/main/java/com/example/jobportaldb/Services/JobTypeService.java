package com.example.jobportaldb.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jobportaldb.Interface.IJobTypeService;
import com.example.jobportaldb.Model.JobType;
import com.example.jobportaldb.Model.ResponseModel;
import com.example.jobportaldb.Repo.JobTypeRepo;
import com.example.jobportaldb.Utils.AppConstant;
import com.example.jobportaldb.Utils.Util;


@Service
public class JobTypeService implements IJobTypeService {
	@Autowired
	JobTypeRepo mjob;
	
	@Override
	public ResponseModel getjobTypeInfo() {
		try {

			List<JobType> mList = mjob.findAll();

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
