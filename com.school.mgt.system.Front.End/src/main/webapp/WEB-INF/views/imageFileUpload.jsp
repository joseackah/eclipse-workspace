<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="file:///C:/Users/solabi/Desktop/bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css">
<script type="text/javascript"
	src="file:///C:/Users/solabi/Desktop/bootstrap/bootstrap-5.0.1-dist/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>save image</title>
</head>
<body>
	<div class="container">
		<button type="button" class="btn btn-info float-left"
			data-toggle="modal" data-target="#myModal">Register</button>

		<div class="modal fade" id="myModal" role="dialog">
			<div class="modal-dialog">
				<div class="modal-content">

					<div class="modal-header">

						<h4 class="modal-title text-primary">REGISTER</h4>
						<button type="button" class="close" data-dismiss="modal">&times;</button>
					</div>
					<h2 style="text-align: center;">
						<span style="color: blue;">BI</span>PS
					</h2>
					<div class="modal-body">
						<form action="imageUpload" enctype="multipart/form-data">
							<div class="row">
								<div class="col">
									<div class="form-group">
										<input type="text" name="username" placeholder="username">
										<br>
									</div>
									<div class="form-group">
										<input type="text" name="password" placeholder="password"><br>
									</div>
									<div class="form-group">
										<input type="text" name="email" placeholder="email"> <br>
									</div>
									<div class="form-group">
										<input type="file" name="file" accept="image/jpg"> <br>
									</div>
								</div>
							</div>
							<!-- <input type="submit" value="submit"> -->
							<div class="modal-footer">
								<button type="submit" class="btn btn-primary"
									onclick="return validate()" id="alert">Register</button>
								<button type="button" class="btn btn-secondary"
									data-dismiss="modal">Close</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>