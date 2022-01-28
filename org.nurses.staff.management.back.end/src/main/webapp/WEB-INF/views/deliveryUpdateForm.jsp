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
<title>Leave Application Form</title>
</head>
<body>
 	<a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Leave Application</a>
    <div class="modal fade" id="modal-id">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Leave Application</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>

                </div>
                <div class="modal-body">
                    <form action="">


                        <div class="firstContainer">

                            <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="staff_id">Staff Id</label>
                                        <input type="text" class="form-control" name="staff_id" id="">
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="form-group">
                                        <label for="name">Name</label>
                                        <input type="text" class="form-control" name="name" id="">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
								<div class="col">
									<div class="form-group">
										<label for="ward_name">Ward Name</label> 
										<select
											name="ward_name" class="form-control" id="lets"
											onclick="myDisplay()">
											<option value="">Select</option>
											<option value="Male Medical">Male Medical</option>
											<option value="Female Medical">Female Medical</option>
											<option value="Female Surgical">Female Surgical</option>
											<option value="Male Surgical">Male Surgical</option>
											<option value="Childrens Ward">Children's Ward</option>
											<option value="Maternity">Maternity</option>
											<option value="General Ward">General Ward</option>
											<option value="NICU">NICU</option>
											<option value="Religious Ward">Religious Ward</option>
											<option value="Accident/Emergency">Accident/Emergency</option>
										</select>
									</div>

								</div>
								
							</div>

<div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="">Leave Type</label>
                                       <select name="leave_type" class="form-control" id="">
                                        <option value="select">select</option>
                                        <option value="annual leave">Annual Leave</option>
                                        <option value="maternity leave">Maternity Leave</option>
                                        <option value="casual leave"> Casual Leave</option>
                                        <option value="paternity leave">Paternity Leave</option>
                                        <option value="sick leave">Sick Leave</option>
                                        <option value="bereavement leave">Bereavement Leave</option>
                                        
                                        </select>
                                    </div>
                                </div>
                               <div class="col">
                                    <div class="form-group">
                                        <label for="staff_cate">Staff Category</label>
                                        <select name="staff_cate" class="form-control" id="">
                                        <option value="select">select</option>
                                        <option value="RGN">Reg. Gen. Nurse</option>
                                        <option value="midwife">Reg. Midwife</option>
                                        <option value="NAC"> NAC</option>
                                        <option value="NAP">NAP</option>
                                        <option value="ANXILLARY">Anxillary</option>

                                    </select>
                                    </div>
                                </div>
                            </div>


                            <div class="row">
                              <!--   <div class="col">
                                    <div class="form-group">
                                        <label for="staff_cate">Staff Category</label>
                                        <select name="staff_cate" class="form-control" id="">
                                        <option value="select">select</option>
                                        <option value="RGN">Reg. Gen. Nurse</option>
                                        <option value="midwife">Reg. Midwife</option>
                                        <option value="NAC"> NAC</option>
                                        <option value="NAP">NAP</option>
                                        <option value="ANXILLARY">Anxillary</option>

                                    </select>
                                    </div>
                                </div> -->
                                <div class="col">
                                    <div class="form-group">
                                        <label for="leave_day_earn">Leave Days Earn</label>
                                        <input type="number" class="form-control" name="leave_day_earn" id="">
                                    </div>
                                </div>
                                
                                 <div class="col">
                                    <div class="form-group">
                                        <label for="leave_days_apply">Leave Days Apply</label>
                                        <input type="number" class="form-control" name="leave_days_apply" id="">
                                    </div>
                                </div>
                                
                                
                            </div>
                            
                            
                            

                        </div>


                        <div class="secondContainer">
                            <div class="row">
                               <!--  <div class="col">
                                    <div class="form-group">
                                        <label for="leave_days_apply">Leave Days Apply</label>
                                        <input type="number" class="form-control" name="leave_days_apply" id="">
                                    </div>
                                </div> -->


                                <div class="col">
                                    <div class="form-group">
                                        <label for="leave_date">Leave Date</label>
                                        <input type="date" class="form-control" name="leave_date" id="">
                                    </div>
                                </div>
                                
                                
                                 <div class="col">
                                    <div class="form-group">
                                        <label for="incharge_recom">Incharge Recommendation</label>
                                       <select name="incharge_recom" class="form-control" id="">
                                        <option value="select">select</option>
                                        <option value="annual leave">Yes</option>
                                        <option value="maternity leave">No</option>
                                      
                                        
                                        </select>
                                    </div>
                                </div>
                                
                            </div>


 <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="incharge_name">Incharge Name</label>
                                       <input type="text" class="form-control" name="incharge_name">
                                    </div>
                                </div>
                                <!-- <div class="col">
                                    <div class="form-group">
                                        <label for="">Name</label>
                                        <input type="text" class="form-control" name="name" id="">
                                    </div>
                                </div> -->
                            </div>
 




                            <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="leave_end_date">Leave End Date</label>
                                        <input type="date" class="form-control" name="leave_end_date" id="" disabled>

                                    </div>
                                </div>

                                <div class="col">
                                    <div class="form-group">
                                        <label for="resumption_date">Resumption Date</label>
                                        <input type="date" class="form-control" name="resumption_date" id="" disabled>

                                    </div>


                                </div>
                            </div>

                        </div>



                        <div class="thirdContainer">
                            <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="approved_by">Approved By</label>
                                        <input type="text" class="form-control" name="approved_by" id="" disabled>
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="form-group">
                                        <label for="date_approved">Date Approved</label>
                                        <input type="date" class="form-control" name="date_approved" id="" disabled>
                                    </div>
                                </div>
                            </div>

                        </div>

                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Apply</button>
                </div>
            </div>
        </div>
    </div>
</body>
</html>