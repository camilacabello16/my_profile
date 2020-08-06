package com.myprofile.controller.web.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myprofile.model.SubjectModel;
import com.myprofile.service.ISubjectService;
import com.myprofile.service.impl.SubjectService;
import com.myprofile.utils.HttpUtil;

@WebServlet(urlPatterns = {"/api-blog"})
public class SubjectAPI extends HttpServlet {
	
	@Inject
	private ISubjectService subjectService;

	private static final long serialVersionUID = -1999371539342372293L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		//convert json to model
		SubjectModel subjectModel = HttpUtil.of(req.getReader()).toModel(SubjectModel.class);
		subjectModel = subjectService.save(subjectModel);
		mapper.writeValue(resp.getOutputStream(), subjectModel);
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
}
