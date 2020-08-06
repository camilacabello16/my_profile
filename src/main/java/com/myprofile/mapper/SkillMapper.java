package com.myprofile.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.myprofile.model.SkillModel;

public class SkillMapper implements RowMapper<SkillModel> {

	@Override
	public SkillModel mapRow(ResultSet resultSet) {
		try {
			SkillModel skill = new SkillModel();
			skill.setId(resultSet.getLong("id"));
			skill.setNameSkill(resultSet.getString("nameskill"));
			skill.setExpert(resultSet.getInt("expert"));
			return skill;
		}catch(SQLException e) {
			return null;
		}
	}
	
}
