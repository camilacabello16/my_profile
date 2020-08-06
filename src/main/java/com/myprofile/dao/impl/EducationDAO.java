package com.myprofile.dao.impl;

import java.util.List;

import com.myprofile.dao.IEducationDAO;
import com.myprofile.mapper.EducationMapper;
import com.myprofile.model.EducationModel;

public class EducationDAO extends AbstractDAO<EducationModel> implements IEducationDAO {

	@Override
	public List<EducationModel> findAll() {
		String sql = "SELECT * FROM education";
		return query(sql, new EducationMapper());
	}
}
