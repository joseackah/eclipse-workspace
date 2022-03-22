<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>Ward Schedule Form</title>
</head>
<body>


    <!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Ward Schedule</a> -->
    <div class="mo fad" id="modal-id">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Ward Schedule</h4>
                    <button type="button" class="close" data-dismiss="mo" aria-hidden="true">&times;</button>

                </div>
                <form action="${pageContext.request.contextPath}/scheduleFront/saveSchedule">
                <div class="modal-body">
                    
                        <div class="row">
                            <div class="col">
                                <div class="form-group">
                                    <label for="ward_name">Ward Name</label>
                                    <!-- <input type="text" class="form-control" name="ward_name" id=""> -->
                                    
                                       <select name="ward_name" id="" class="form-control">
                                       <option value="">select</option>
                                      <c:forEach items="${wardD}" var="wardD">
                                      
                                           
                                            <option value="${wardD.ward_name}">${wardD.ward_name}</option>
                                            </c:forEach>
                                    </select>
                                    
                                </div>
                            </div>
                            <div class="col">
                                <div class="form-group">
                                    <label for="Staff_id">Staff Id</label>
                                   <!--  <input type="text" class="form-control" name="" id="" required> -->
                                    
                                     <select name="staff_id" id="" class="form-control">
                                       <option value="">select</option>
                                      <c:forEach items="${nurse}" var="nurse">
                                      
                                           
                                            <option value="${nurse.staff_id}">${nurse.staff_id}</option>
                                            </c:forEach>
                                    </select>
                                    
                                    
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col">
                                <div class="form-group">
                                    <label for="nurse_cate">Nurse Category</label>
                                    <select name="nurse_cate" id="" class="form-control">
                                            <option value="">select</option>
                                            <option value="RGN">RGN</option>
                                            <option value="MIDWIFE">MIDWIFE</option>
                                            <option value="NAP">NAP</option>
                                            <option value="NAC">NAC</option>
                                           
                                    </select>

                                </div>
                            </div>
                            
                            <div class="col">
								<div class="form-group">
									<label for="effective_date">Effective Date</label> <input type="date"
										class="form-control" name="effective_date" id="" required>
								</div>
							</div>
                        </div>



                        <div class="row">
                            <div class="col">
                                <div class="form-group">
                                    <label for="wardIncharge">Ward Incharge</label>
                                    <input type="text" class="form-control" name="" id="myInput" hidden>

                                </div>
                            </div>


                            <div class="col">
                                <div class="form-group">
                                    <label for=""></label>
                                    <input type="date" class="form-control" name="" id="" hidden>
                                </div>
                            </div>
                        </div>



                        <div class="row">
                            <div class="col">
                                <div class="form-group">
                                    <label for=""></label>
                                    <input type="text" class="form-control" name="" id="" hidden>

                                </div>
                            </div>
                        </div>

                    
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" onclick="history.back()">Close</button>
                    <button type="submit" class="btn btn-primary">Save</button>
                </div>
                </form>
            </div>
        </div>
    </div>





</body>
</html>