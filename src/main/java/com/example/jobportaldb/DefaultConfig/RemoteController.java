package com.example.jobportaldb.DefaultConfig;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.jobportaldb.Model.Job;
import com.example.jobportaldb.Model.JobLocation;
import com.example.jobportaldb.Model.JobSkill;
import com.example.jobportaldb.Model.JobType;
import com.example.jobportaldb.Model.ResponseModel;
import com.example.jobportaldb.Repo.JobLocationRepo;
import com.example.jobportaldb.Repo.JobRepo;
import com.example.jobportaldb.Repo.JobSkillRepo;
import com.example.jobportaldb.Repo.JobTypeRepo;
import com.example.jobportaldb.Utils.Util;



@RestController
public class RemoteController {

	
	@Autowired
	JobRepo mJobRepo;

	@Autowired
	JobLocationRepo mUserRepo;
	
	@Autowired
	JobTypeRepo mJobTypeRepo;

	@Autowired
	JobSkillRepo mPJobSkillRepo;

	@RequestMapping(value = "/defaultConfig", method = RequestMethod.GET)
	public ResponseModel addDefaultSettingToDB() throws UnknownHostException {
		// if (tokken.equals(AppConstant.DEFAULT_TOKKEN)) {
		ResponseModel mResponse = null;
		try {

			
				
					Job mJobDetails = new Job();

					List<JobLocation> JobLocationList = new ArrayList<>();
					
					// --------------------------JobLocation------------------------------------//
					JobLocation viewJobLocation = new JobLocation();
					viewJobLocation.setLstate("Uttar Pardesh");
					viewJobLocation.setLcity("Noida");
					
					mUserRepo.save(viewJobLocation);
					JobLocationList.add(viewJobLocation);

					JobLocation viewJobLocation1 = new JobLocation();
					viewJobLocation1.setLstate("Uttar Pardesh");
					viewJobLocation1.setLcity("Shahjahanpur");
					
					mUserRepo.save(viewJobLocation1);
					JobLocationList.add(viewJobLocation1);
					
					// ----------------------JobSkillList----------------------------------------//

					List<JobSkill> JobSkillList = new ArrayList<>();
					
					JobSkill viewJobSkill = new JobSkill();
					viewJobSkill.setSkill_level("Java");
					
					mPJobSkillRepo.save(viewJobSkill);
					JobSkillList.add(viewJobSkill);
					
					JobSkill viewJobSkill1 = new JobSkill();
					viewJobSkill1.setSkill_level("c++");
					
					mPJobSkillRepo.save(viewJobSkill1);
					JobSkillList.add(viewJobSkill1);
					
					JobSkill viewJobSkill2 = new JobSkill();
					viewJobSkill2.setSkill_level("MySql");
					
					mPJobSkillRepo.save(viewJobSkill2);
					JobSkillList.add(viewJobSkill2);
					
					JobSkill viewJobSkill3 = new JobSkill();
					viewJobSkill3.setSkill_level(".Net");
					
					mPJobSkillRepo.save(viewJobSkill3);
					JobSkillList.add(viewJobSkill3);

					// --------------------------------JobTypeList------------------------------//

					List<JobType> JobTypeList = new ArrayList<>();
					
					JobType viewJobType = new JobType();
					viewJobType.setName("Full-time");					
					mJobTypeRepo.save(viewJobType);
					JobTypeList.add(viewJobType);
					
					JobType viewJobType1 = new JobType();
					viewJobType1.setName("Part-time");					
					mJobTypeRepo.save(viewJobType1);
					JobTypeList.add(viewJobType1);
					
					

				// ------------------------  JobDetails -----------------//
				mJobDetails.setCreatedDate(Util.getCurrentSQLTimeStamp());
				mJobDetails.setDescription("software developer");
				mJobDetails.setJob_code("KPL0031");
				mJobDetails.setJob_name("software developer");
				mJobDetails.setJob_type(viewJobType1);
				mJobDetails.setMlocation(viewJobLocation1);
                mJobDetails.setEmailId("soni@gmail.com");
                mJobDetails.setUsername("kalpana");
                mJobDetails.setPhoneNumber("888888888");
                mJobDetails.setCompanyName("Infosys pvt ltd");
                mJobDetails.setSalary("20000");
                mJobDetails.setExperience(1);
                mJobDetails.setClosingdate(Util.getCurrentSQLTimeStamp());
				mJobDetails.setJobSkill(JobSkillList);	
   
					
					Job response = mJobRepo.save(mJobDetails);

					if (response != null) {
						mResponse = new ResponseModel();
						mResponse.setMessage("Successfully added");
						mResponse.setStatus(0);
						mResponse.setMyObjectList(null);
					} else {
						mResponse = new ResponseModel();
						mResponse.setMessage("Unsuccessfull while adding");
						mResponse.setStatus(0);
						mResponse.setMyObjectList(null);
					}
				
				
			
		} catch (Exception e) {
			mResponse = new ResponseModel();
			mResponse.setMessage("Duplicate Record");
			mResponse.setStatus(0);
			mResponse.setMyObjectList(null);
		}
		return mResponse;
	}
}
