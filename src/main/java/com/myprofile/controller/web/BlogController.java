package com.myprofile.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myprofile.contant.SystemContant;
import com.myprofile.model.SubjectModel;
import com.myprofile.service.ISubjectService;

@WebServlet(urlPatterns = { "/blog" })
public class BlogController extends HttpServlet {

	@Inject
	private ISubjectService subjectService;

	private static final long serialVersionUID = 4582696715571420089L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SubjectModel subject = new SubjectModel();
		String pageStr = req.getParameter("page");
		String maxPageItemStr = req.getParameter("maxPageItem");
		if (pageStr != null) {
			subject.setPage(Integer.parseInt(pageStr));
		} else {
			subject.setPage(1);
		}
		if (maxPageItemStr != null) {
			subject.setMaxPageItem(Integer.parseInt("maxPageItemStr"));
		}
		int offset = (subject.getPage() - 1) * subject.getMaxPageItem();
		subject.setListResult(subjectService.findAll(offset, subject.getMaxPageItem()));
		subject.setTotalItem(subjectService.getTotalItem());
		subject.setTotalPage((int) Math.ceil((double) subject.getTotalItem() / subject.getMaxPageItem()));
		req.setAttribute(SystemContant.MODEL, subject);
		RequestDispatcher rd = req.getRequestDispatcher("/views/web/blog.jsp");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
