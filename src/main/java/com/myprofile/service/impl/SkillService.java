package com.myprofile.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.myprofile.dao.ISkillDAO;
import com.myprofile.model.SkillModel;
import com.myprofile.service.ISkillService;

public class SkillService implements ISkillService {

	@Inject
	private ISkillDAO skillDao; 
	
	@Override
	public List<SkillModel> findAll() {
		return skillDao.findAll();
	}

	@Override
	public SkillModel save(SkillModel skillModel) {
		Long skillId = skillDao.save(skillModel);
		return null;
	}

}
