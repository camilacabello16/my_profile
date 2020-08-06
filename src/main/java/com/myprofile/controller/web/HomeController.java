package com.myprofile.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myprofile.model.EducationModel;
import com.myprofile.model.SkillModel;
import com.myprofile.service.IEducationService;
import com.myprofile.service.ISkillService;

@WebServlet(urlPatterns = {"/home"})
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = 4582696715571420089L;
	
	@Inject
	private ISkillService skillService;
	
	@Inject
	private IEducationService educationService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SkillModel skill = new SkillModel();
		skill.setListResult(skillService.findAll());
		req.setAttribute("skills", skill);
		EducationModel education = new EducationModel();
		education.setListResult(educationService.findAll());
		req.setAttribute("education", education);
		
		RequestDispatcher rd = req.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
