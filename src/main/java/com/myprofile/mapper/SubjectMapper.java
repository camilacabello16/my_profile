package com.myprofile.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.myprofile.model.SubjectModel;

public class SubjectMapper implements RowMapper<SubjectModel> {

	@Override
	public SubjectModel mapRow(ResultSet resultSet) {
		try {
			SubjectModel subject = new SubjectModel();
			subject.setId(resultSet.getLong("id"));
			subject.setCode(resultSet.getString("code"));
			subject.setNameSubject(resultSet.getString("namesubject"));
			subject.setGrade(resultSet.getInt("grades"));
			subject.setWordGrade(resultSet.getString("wordgrades"));
			return subject;
		}catch(SQLException e) {
			return null;
		}
	}
}
