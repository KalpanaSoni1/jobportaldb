package com.example.jobportaldb.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.jobportaldb.Model.Job;

public interface JobRepo  extends JpaRepository<Job,Long> {
	@Query(value="update Job_detatils s set s.usercount = (s.usercount +1) where s.job_id = ?1 ",nativeQuery = true)
	Job updateJob(int Job_id);
	
	@Query(value="select * from job_detatils m where  m.usercount > 0",nativeQuery = true)
	List<Job> getJob();
	
	@Query(value="SELECT * FROM job_detatils m WHERE m.job_id= ?1 ",nativeQuery = true)
	List<Job> getJobByid(@Param("job_id") long job_id);
	
	
}
