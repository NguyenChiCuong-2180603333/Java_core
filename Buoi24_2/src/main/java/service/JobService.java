package service;

import java.util.List;

import entity.Jobs;
import repository.JobRepository;

public class JobService {

	private JobRepository jobRepository = new JobRepository();
	public List<Jobs> getAllJob(){
		return jobRepository.findAllJob();
	}

}
