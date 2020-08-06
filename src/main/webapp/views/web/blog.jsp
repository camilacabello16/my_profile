<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Blog</title>
</head>
<body>
	<main class="wp-main-content">
		<div class="wp-blog-content">
			<div class="tech-skill--title">
				<p>subject</p>
			</div>
			<form action="<c:url value='/blog'/>" id="blogForm" method="get">
				<div class="table-subject">
					<table class="table table-hover">
						<thead>
							<tr class="table-sub-title">
								<th></th>
								<th>Code</th>
								<th>Name</th>
								<th>Grade</th>
								<th>Word Grade</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="item" items="${model.listResult}">
								<tr class="table-sub-list">
									<td>${item.id }</td>
									<td>${item.code}</td>
									<td>${item.nameSubject }</td>
									<td>${item.grade }</td>
									<td>${item.wordGrade }</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<ul class="pagination" id="pagination"></ul>
					<input type="hidden" value="" id="page" name="page" /> <input
						type="hidden" value="" id="maxPageItem" name="maxPageItem" />
				</div>
			</form>
		</div>
	</main>

	<script type="text/javascript">
		var currPage = $
		{
			model.page
		};
		var totalPage = $
		{
			model.totalPage
		};
		var limit = 2;
		$(function() {
			window.pagObj = $('#pagination').twbsPagination({
				totalPages : totalPage,
				visiblePages : 5,
				startPage : currPage,
				onPageClick : function(event, page) {
					if (currPage != page) {
						$('#page').val(page);
						$('#maxPageItem').val(limit);
						$('#blogForm').submit();
					}
				}
			})
		});
	</script>
</body>
</html>