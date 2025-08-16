package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.MySQLConfig;
import entity.Roles;

public class RoleRepository {

	public List<Roles> findAllRoles(){
		List<Roles> listRoles = new ArrayList<Roles>();
		String query = "SELECT * FROM roles r ";
		
		Connection connection = MySQLConfig.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Roles roles = new Roles();
				roles.setId(resultSet.getInt("id"));
				roles.setName(resultSet.getString("name"));
				roles.setDescription(resultSet.getString("description"));
				listRoles.add(roles);
			}
			}catch (Exception e) {
				System.out.println("findAllRoles" + e.getMessage());
		}
		return listRoles;
	}


}
