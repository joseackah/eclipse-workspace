<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
   
<meta charset="ISO-8859-1">
<title>Users Form</title>
</head>
<body>


   

    <!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Users</a> -->
    <div class="mo fad" id="modal-id">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">User Enrollment</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true" onclick="window.location.href='${pageContext.request.contextPath}/'">&times;</button>

                </div>
                <form action="${pageContext.request.contextPath}/userFront/saveUsers">
                <div class="modal-body">
                    
                        <div class="row">
                            <div class="col">
                                <div class="form-group">
                                    <label for="name">Name</label>
                                    <input type="text" class="form-control" name="name" id="">
                                </div>
                            </div>
                            <div class="col">
                                <div class="form-group">
                                    <label for="userId">User Id</label>
                                    <input type="text" class="form-control" name="userId" id="">
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col">
                                <div class="form-group">
                                    <label for="userType">User Type</label>
                                     <select name="userType"
										id="" class="form-control">
										<option value="">select</option>
										<option value="Incharge">Incharge</option>
										<option value="Manager">Manager</option>
										<option value="Staff">Staff</option>
										<option value="Admin Staff">Admin. Staff</option>
										<option value="Others">Others</option>
									</select>

                                </div>
                            </div>
                            
                            <div class="col">
								<div class="form-group">
								<label for="ward_name">Department</label>
								<select
											name="ward_name" class="form-control" id="lets"
											onclick="myDisplay()">
											<option value="">Select</option>
											<option value="Male Medical">Male Medical</option>
											<option value="Female Medical">Female Medical</option>
											<option value="Female Surgical">Female Surgical</option>
											<option value="Male Surgical">Male Surgical</option>
											<option value="Children's Ward">Children's Ward</option>
											<option value="Maternity">Maternity</option>
											<option value="General Ward">General Ward</option>
											<option value="NICU">NICU</option>
											<option value="Religious Ward">Religious Ward</option>
											<option value="Accident/Emergency">Accident/Emergency</option>
											<option value="Administration">Administration</option>
										</select>
								</div>
								</div> 
                        </div>



                        <div class="row">
                            <div class="col">
                                <div class="form-group">
                                    <label for="userPassword">Password</label>
                                    <input type="password" class="form-control" name="userPassword" id="myInput">
                                    <input type="checkbox" onclick="myFunction()"> <label>Show Password</label>
                                </div>
                            </div>


                            <div class="col">
                                <div class="form-group">
                                    <label for="image">Image</label>
                                    <input type="file" class="form-control" name="image" id="" disabled>
                                </div>
                            </div>
                        </div>



                        <div class="row">

                            <div class="col">
                                <div class="form-group">
                                    <label for="dateCreated">Date Created</label>
                                    <input type="date" class="form-control" name="dateCreated" id="">
                                </div>
                            </div>



                            <div class="col">
                                <div class="form-group">
                                    <label for="createdBy">Created By</label>
                                    <input type="text" class="form-control" name="createdBy" id="">

                                </div>
                            </div>
                        </div>

                   
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal" onclick="window.location.href='${pageContext.request.contextPath}/'">Close</button>
                    <button type="submit" class="btn btn-primary">Save</button>
                </div>
                </form>
            </div> 
        </div>
    </div>




    <script>
        function myFunction() {
            var x = document.getElementById("myInput");
            if (x.type === "password") {
                x.type = "text";
            } else {
                x.type = "password";
            }
        }
    </script>


   






</body>
</html>