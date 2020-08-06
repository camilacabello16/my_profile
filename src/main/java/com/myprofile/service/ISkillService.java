package com.myprofile.service;

import java.util.List;

import com.myprofile.model.SkillModel;

public interface ISkillService {
	List<SkillModel> findAll();
	SkillModel save(SkillModel skillModel);
}
