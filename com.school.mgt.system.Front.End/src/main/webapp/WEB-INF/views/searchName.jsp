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
<title>Display Product</title>
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
					<th> PRODUCT ID</th>
					<th> PRODUCT NAME</th>
					<th> DESCRIPTION</th>
					<th>PRICE</th>
					<th>CATEGORY </th>
					<th>CATEGORY NAME </th>
					
					<th>ACTION </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ecommProduct}" var="ecomm">
					<c:url value="search1" var="updateURL">
						<c:param value="${ecomm.id}" name="id"></c:param>
						<c:param value="${ecomm.name}" name="name"></c:param>
						<c:param value="${ecomm.desc}" name="desc"></c:param>
						<c:param value="${ecomm.price}" name="price"></c:param>
						<c:param value="${ecomm.productCategory}" name="productCategory"></c:param>
						<c:param value="${ecomm.productCategory}" name="productCategory"></c:param>
						
					</c:url>

					<c:url value="remove" var="removeURL">
						<c:param value="${ecomm.id}" name="id"></c:param>
					</c:url>

					<tr>
						<td>${ecomm.id}</td>
						<td>${ecomm.name}</td>
						<td>${ecomm.desc}</td>
						<td>${ecomm.price}</td>
						<td>${ecomm.categoryId} </td>
						<td>${ecomm.categoryName} </td>
						<td><a href="${updateURL }">Update</a> | <a
							href="${removeURL }"
							onclick="if (!confirm('Are you sure you want to delete this record/student?')) return false">Delete</a>
						</td>
					</tr>

				</c:forEach>
			</tbody>

		</table>


${ecommerceProduct }
${ecommerce}

	


</body>
</html>