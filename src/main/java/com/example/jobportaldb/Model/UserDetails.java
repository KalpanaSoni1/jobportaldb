package com.example.jobportaldb.Model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity

@Table(name = "user_details")
public class UserDetails {
 
 	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long userId;


    @Column(name = "user_Name", length = 50)
    private String username;

    @Column(name = "user_email_id", length = 100)
    private String useremail;

    @Column(name = "user_number", length = 15)
    private String usernumber;
    
    @OneToOne(cascade = CascadeType.MERGE , fetch = FetchType.EAGER)
    @JoinTable(name = "m_Job_fk")
    private Job mJob;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUsernumber() {
		return usernumber;
	}

	public void setUsernumber(String usernumber) {
		this.usernumber = usernumber;
	}

	public Job getmJob() {
		return mJob;
	}

	public void setmJob(Job mJob) {
		this.mJob = mJob;
	}

  


}
