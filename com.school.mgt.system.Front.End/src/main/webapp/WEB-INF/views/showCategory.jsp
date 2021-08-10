<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/index.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/main.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Display Students</title>
</head>
<body>
<div id='firstHeader' class='firstHeader' name='firstHeader'>
        
        <h1 style="text-align:center"><ins>S & A The Promise of God Enteprise <p>(<abbr title="S & A The Promise of God Enteprise">S&A TPG</abbr>)</p></ins></h1>
    </div>
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/ecommerce/indexForm">HOME</a></li>
            <li><a href="${pageContext.request.contextPath}/ecommerce/showForm">Add product</a></li>
            <li><a href="${pageContext.request.contextPath}/category/showCate">Add Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/ecommerce/display">Display</a></li>
            <li><a href="${pageContext.request.contextPath}/category/displaycate">Display Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/ecommerce/moreProductForm">Add More Product</a></li>
            <li><a href="">to assign</a></li>
            <form action="${pageContext.request.contextPath}/ecommerce/search" method="post" id="searchForm">
            	<input type="text" name="id" id="input" />
                <input type="submit" id="input" class="form-control" value="Search" />
            </form>
            
        </ul>

    </nav>

 <br />
    <br />
<h1 style='text-align: center;'>Welcome to Ecommerce Product Services</h1>
	 <br />
    <br />
		<table border="1">
			<thead>
				<tr>
					<th> CATEGORY ID</th>
					<th> CATEGORY NAME</th>
					
					<th>ACTION </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${pcCategory}" var="pcCategory">
					<c:url value="updateCategory" var="updateURL">
						<c:param value="${pcCategory.categoryId}" name="categoryId"></c:param>
						<c:param value="${pcCategory.categoryName}" name="categoryName"></c:param>
						
						
					</c:url>

					<c:url value="deleteCategory" var="removeURL">
						<c:param value="${pcCategory.categoryId}" name="categoryId"></c:param>
					</c:url>

					<tr>
						<td>${pcCategory.categoryId}</td>
						<td>${pcCategory.categoryName}</td>
						
						<td><a href="${updateURL }">Update</a> | <a
							href="${removeURL }"
							onclick="if (!confirm('Are you sure you want to delete this record/student?')) return false">Delete</a>
						</td>
					</tr>

				</c:forEach>
			</tbody>

		</table>




	


</body>
</html>