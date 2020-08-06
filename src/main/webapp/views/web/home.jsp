<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Profile</title>
</head>
<body>
	<main class="wp-main-content">
		<div class="wp-home-content">
			<div class="container">
				<div class="row">
					<div class="about-content">
						<div class="my-img">
							<img src="<c:url value='/template/web/asset/add-user.png' />" />
						</div>
						<div class="about-txt">
							<p>Hi! I Am Hieu.</p>
							<p>Intern Developer.</p>
							<p>Living in Ha Noi.</p>
						</div>
					</div>
					<div class="wp-tech-skill">
						<div class="tech-skill--title">
							<p>Technical skills</p>
						</div>
						<div class="tech-skill-content">
							<ul class="tech-skill-list">
								<c:forEach var="skill" items="${skills.listResult}">
									<li class="tech-skill-item">
										<p>
											${skill.nameSkill }<span> : ${skill.expert }%</span>
										</p>
										<div class="skill-line" style="width: ${skill.expert}%;"></div>
									</li>
								</c:forEach>
							</ul>
						</div>
					</div>
					<div class="wp-education-content">
						<div class="tech-skill--title">
							<p>Education</p>
						</div>
						<table class="table table-hover">
							<tbody>
								<c:forEach var="education" items="${education.listResult }">
									<tr class="line-table">
										<td class="number-order">${education.numberOrder }</td>
										<td class="time-education">${education.time }</td>
										<td>${education.nameSchool }</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<ul class="pagination" id="pagination"></ul>
					</div>
					<div class="wp-experience-content">
						<div class="tech-skill--title">
							<p>experience</p>
						</div>
						<div class="experience-content">
							<div class="time-experience">
								<p>9/2019 - 1/2020</p>
							</div>
							<div class="ex-detail">
								<p class="ex-position">Intern Front-end Developer</p>
								<p class="ex-txt">Lorem ipsum dolor sit amet consectetur
									adipisicing elit. Qui dolorum id nostrum ipsa? Perspiciatis
									aperiam, maiores vel, soluta dolore nobis numquam deserunt
									obcaecati neque laboriosam fugit impedit sint ipsa. Neque.</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>
</body>
</html>