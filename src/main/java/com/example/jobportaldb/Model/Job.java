package com.example.jobportaldb.Model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name = "Job_detatils")
public class Job {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Job_id", nullable = false)
	private int Job_id;
	
	@Column(name = "Job_code", length = 20)
    private String Job_code;
	
    @Column(name = "Job_name", length = 50)
    private String Job_name;
    
    @Column(name = "company_name", length = 50)
    private String CompanyName;
    
	@Column(name = "description", length = 150)
    private String description;
  
	@Column(name = "user_name", length = 20)
    private String username;
	
	 @Column(name = "contact_number", length = 15)
	 private String phoneNumber;
	 
	 @Column(name = "email_id", length = 100)
	 private String emailId;
	 
	  @Column(name = "usercount", length=30)
	  private int usercount;
	 
	  @Column(name = "salary", length=30)
	  private String salary;
	  
	  @Column(name = "experience", length=30)
	  private int experience;
	  
	 @Column(name = "CreatedDate")
	 @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Kolkata")
	 private Timestamp CreatedDate;
	
	 @Column(name = "Closingdate")
	 @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Kolkata")
	 private Timestamp Closingdate;
	    
	 
	 public Timestamp getClosingdate() {
		return Closingdate;
	}

	public void setClosingdate(Timestamp closingdate) {
		Closingdate = closingdate;
	}

	public int getUsercount() {
		return usercount;
	 }

	 public void setUsercount(int usercount) {
		this.usercount = usercount;
	 }

	 @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	 @JoinColumn(name = "mlocation_fk")
	 private  JobLocation mlocation;   
	 
	 public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
     @JoinColumn(name = "Job_type_fk")
     private  JobType Job_type;

	 @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	 @JoinColumn(name = "Job_Skill_fk")
     private  List<JobSkill> JobSkill=new ArrayList<>();;

	 
     public List<JobSkill> getJobSkill() {
		return JobSkill;
	 }

	 public void setJobSkill(List<JobSkill> jobSkill) {
		JobSkill = jobSkill;
	}

	public int getJob_id() {
		return Job_id;
	}

	public void setJob_id(int job_id) {
		Job_id = job_id;
	}

	public String getJob_code() {
		return Job_code;
	}

	public void setJob_code(String job_code) {
		Job_code = job_code;
	}

	public String getJob_name() {
		return Job_name;
	}

	public void setJob_name(String job_name) {
		Job_name = job_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Timestamp getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		CreatedDate = createdDate;
	}

	public JobLocation getMlocation() {
		return mlocation;
	}

	public void setMlocation(JobLocation mlocation) {
		this.mlocation = mlocation;
	}

	public JobType getJob_type() {
		return Job_type;
	}

	public void setJob_type(JobType job_type) {
		Job_type = job_type;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	

}
