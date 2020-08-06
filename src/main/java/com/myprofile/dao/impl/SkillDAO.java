package com.myprofile.dao.impl;

import java.util.List;

import com.myprofile.dao.ISkillDAO;
import com.myprofile.mapper.SkillMapper;
import com.myprofile.model.SkillModel;

public class SkillDAO extends AbstractDAO<SkillModel> implements ISkillDAO {

	@Override
	public List<SkillModel> findAll() {
		String sql = "SELECT * FROM skill";
		return query(sql, new SkillMapper());
	}

	@Override
	public Long save(SkillModel skillModel) {
		String sql = "INSERT INTO skill (nameskill, expert) VALUES (?, ?)";
		return insert(sql, skillModel.getNameSkill(), skillModel.getExpert());
	}
}
