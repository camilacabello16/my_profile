package com.myprofile.dao;

import java.util.List;

import com.myprofile.model.EducationModel;

public interface IEducationDAO extends GenericDAO<EducationModel> {
	List<EducationModel> findAll();
}
