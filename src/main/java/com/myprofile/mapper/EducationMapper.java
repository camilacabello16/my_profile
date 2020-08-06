package com.myprofile.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.myprofile.model.EducationModel;

public class EducationMapper implements RowMapper<EducationModel> {

	@Override
	public EducationModel mapRow(ResultSet resultSet) {
		try {
			EducationModel education = new EducationModel();
			education.setId(resultSet.getLong("id"));
			education.setNumberOrder(resultSet.getInt("numberorder"));
			education.setTime(resultSet.getString("time"));
			education.setNameSchool(resultSet.getString("nameschool"));
			return education;
		}catch(SQLException e) {
			return null;
		}
	}
}
