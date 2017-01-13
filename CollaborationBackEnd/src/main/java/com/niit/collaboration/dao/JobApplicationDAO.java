package com.niit.collaboration.dao;

import java.util.List;

import com.niit.collaboration.model.JobApplication;

public interface JobApplicationDAO {
	
	public JobApplication getJobApplication(String Id);//to get the jobApplication for a particular job
	
	public JobApplication getJobApplication(String emailId,String jobId);
	
	public List<JobApplication> list();
	
	public boolean saveJobApplication(JobApplication jobApplication);
	
	public boolean updateJobApplication(JobApplication jobApplication);
	
	public List<JobApplication> myAppliedJob(String emailID);


}
