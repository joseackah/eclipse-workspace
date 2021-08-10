<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/index.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Search Category</title>
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
<h2>Category Details</h2>
<!-- 
<form action="updateProduct" method="post">
<table>
<thead> 
<tr> 
<th> </th>
</tr>
</thead>
Product Id: <input type="text" name="id" value="${ecProduct.id }"/> 
Product Name: <input type="text" name="name" value="${ecProduct.name }" />
Product description: <input type="text" name="desc" value="${ecProduct.desc }" />
Price Price: <input type="text" name="price" value="${ecProduct.price }" />
<input type="submit" value="update" />

</table>
</form>
 -->
<form:form action="updateCategory" modelAttribute="pCategory"
		method="post">
		<table>
			<tr>
				<td><label>Category Id</label></td>
				<td><form:input path="id" value="${pCategory.categoryId}" readonly="true" /></td>
			</tr>
			<tr>
				<td><label>Category Name</label></td>
				<td><form:input path="name" value="${pCategory.categoryName }"/></td>
			</tr>
			
			<tr>
				<td><label></label></td>
				<td>
					<button>Update Product</button>
				</td>
			</tr>
		</table>

	</form:form>
	
	${ecommerceProduct}

</body>
</html>