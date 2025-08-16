package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.MySQLConfig;
import entity.Jobs;

public class JobRepository {

	public List<Jobs> findAllJob(){
		List<Jobs> listJobs = new ArrayList<Jobs>();
		String query = "SELECT * FROM jobs j";
		Connection connection = MySQLConfig.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Jobs jobs = new Jobs();
				jobs.setId(resultSet.getInt("id"));
				jobs.setName(resultSet.getString("name"));
				jobs.setStart_date(resultSet.getDate("start_date"));
				jobs.setEnd_date(resultSet.getDate("end_date"));
				listJobs.add(jobs);
			}
			
		}catch (Exception e) {
			System.out.println("findAllJob " + e.getMessage());
		}
		return listJobs;
	}


}
