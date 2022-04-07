package com.example.jobportaldb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.jobportaldb.Interface.IJobLocationService;
import com.example.jobportaldb.Interface.IJobService;
import com.example.jobportaldb.Interface.IJobSkillService;
import com.example.jobportaldb.Interface.IJobTypeService;
import com.example.jobportaldb.Interface.IUser;
import com.example.jobportaldb.Model.RequestModel;
import com.example.jobportaldb.Model.ResponseModel;

@RestController
public class JobsController {
	@Autowired
	IJobService mIJobService;
	
	@Autowired
	IJobLocationService mIJobLocationService;
	
	@Autowired
	IJobSkillService mIJobSkillService;
	
	@Autowired
	IJobTypeService mIJobTypeService;
	
	@Autowired
	IUser User;
	
	@CrossOrigin
	@RequestMapping(value = "getJobs", method = RequestMethod.GET)
	public ResponseModel getjobsList() {
		return mIJobService.getJobInfo();
	}
	
	
	// Add add job data
    @CrossOrigin
	@RequestMapping(value = "addJob", method = RequestMethod.POST)
	public ResponseModel addJobinfo(@RequestBody RequestModel mRequestModel) {
     return mIJobService.addJobs(mRequestModel);
	}
    
	@CrossOrigin
	@RequestMapping(value = "getJobLocation", method = RequestMethod.GET)
	public ResponseModel getJobLocationList() {
		return mIJobLocationService.getjobLocationInfo();
	}
	@CrossOrigin
	@RequestMapping(value = "getjobsSkill", method = RequestMethod.GET)
	public ResponseModel getjobsSkillList() {
		return mIJobSkillService.getobSkillInfo();
	}
	@CrossOrigin
	@RequestMapping(value = "getjobsType", method = RequestMethod.GET)
	public ResponseModel getjobsTypeList() {
		return mIJobTypeService.getjobTypeInfo();
	}
	@CrossOrigin
	@RequestMapping(value = "addUser", method = RequestMethod.POST)
	public ResponseModel adduserinfo(@RequestBody RequestModel mRequestModel) {

		return User.addUser(mRequestModel);
	}
	@CrossOrigin
	@RequestMapping(value = "getjobapplied", method = RequestMethod.GET)
	public ResponseModel getjobapplied() {

		return mIJobService.getJobapplied();
	}
	@CrossOrigin
	@RequestMapping(value = "getjobId", method = RequestMethod.POST)
	public ResponseModel getjobpagebyid(@RequestBody RequestModel mRequestModel) {

		return mIJobService.getjobId(mRequestModel);
	}
}
