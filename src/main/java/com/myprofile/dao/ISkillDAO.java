package com.myprofile.dao;

import java.util.List;

import com.myprofile.model.SkillModel;

public interface ISkillDAO {
	List<SkillModel> findAll();
	Long save(SkillModel skillModel);
}
