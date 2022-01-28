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
<title>Newborn Update Form</title>
</head>
<body>

 	<!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Leave Application</a>
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
                                <div class="col">
                                    <div class="form-group">
                                        <label for="leave_days_apply">Leave Days Apply</label>
                                        <input type="number" class="form-control" name="leave_days_apply" id="">
                                    </div>
                                </div>


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
                                <div class="col">
                                    <div class="form-group">
                                        <label for="">Name</label>
                                        <input type="text" class="form-control" name="name" id="">
                                    </div>
                                </div>
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
     -->
    
    <!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Trigger modal</a> -->
    <div class="mod fad" id="modal-id4">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Newborn Update Form</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>

                </div>

                <form action="${pageContext.request.contextPath}/newbornFront/updateNewborn">
                    <div class="modal-body">



                        <div class="firstContainer">
                                        <input type="text" value="${newborn.newborn_id }" class="form-control" name="newborn_id" id="" hidden="true">

                            <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="delivery_id">Delivery Id(Mother Delivery Id)</label>
                                        <input type="text" value="${newborn.delivery_id }" class="form-control" name="delivery_id" id="">
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="form-group">
                                        <label for="baby_name">Baby Name(Mother Name)</label>
                                        <input type="text" class="form-control" value="${newborn.baby_name}" name="baby_name" id="">
                                    </div>
                                </div>
                            </div>


              <fieldset>
              <legend> apgar score</legend>
                            	<div class="row">
                            
                            
                                <div class="col">
                                    <div class="form-group">
                                        <label for="first_apgar_score">First Minute(1 minutes)</label>
                                        <input type="text" class="form-control" value="${newborn.first_apgar_score}" name="first_apgar_score" id="">
                                    </div>
                                </div>
                                
                                <div class="col" id="">

                                    <div class="form-group" id="dis">
                                        <label for="second_apgar_score">Fifth Minute(5 minute)</label>
                                        <input type="text" class="form-control" value="${newborn.second_apgar_score}" name="second_apgar_score" id="">
								</div>
                                </div>
                                
                                
                            </div>
                           

                        	</div> 
</fieldset>


                        <div class="secondContainer">
                            <div class="row">
                            <div class="col">
                                    <div class="form-group">
                                        <label for="outcome_of_delivery">Outcome of Delivery</label>
                                        <input type="text" class="form-control" value="${newborn.outcome_of_delivery}" name="outcome_of_delivery" id="">
                                    </div>
                                </div>
                            
                                <div class="col">
                                    <div class="form-group">
                                        <label for="cause_of_death">(If not alive) Cause of Death</label>
                                        <input type="text" value="${newborn.cause_of_death}" class="form-control" name="cause_of_death" placeholder="" id="" min="0" onKeyPress="if(this.value.length==10) return false;">
                                    </div>
                                </div>


                                
                            </div>



                            <div class="row">
                            
                            <div class="col">
                                    <div class="form-group">
                                        <label for="sex">Sex of Baby</label>
                                        <input type="text" value="${newborn.sex}" class="form-control" name="sex" id="">
                                    </div>
                                </div>
                            
                                <div class="col">
                                    <div class="form-group">
                                        <label for="number_of_baby">Number of Baby</label>
                                        <input type="number" value="${newborn.number_of_baby}" class="form-control" name="number_of_baby" id="">

                                    </div>
                                </div>

                                
                            </div>

                        </div>



                        <div class="thirdContainer">
                            <div class="row">
                            
                            <div class="col">
                                    <div class="form-group">
                                        <label for="resuscitation">Resuscitation</label>

                                        <input type="text" value="${newborn.resuscitation}" class="form-control" name="resuscitation" id="">
                                    </div>


                                </div>
                            
                                <div class="col">
                                    <div class="form-group">
                                        <label for="condition_of_baby">Condition of Baby</label>
                                        <input type="text" value="${newborn.condition_of_baby}" class="form-control" name="condition_of_baby" id="">
                                    </div>
                                </div>
                                
                            </div>

                            <div class="row">
                            
                            <div class="col">
                                    <div class="form-group">
                                        <label for="head_circumference">Head circumference</label>
                                        <input type="number" value="${newborn.head_circumference}" class="form-control" name="head_circumference" id="">
                                    </div>
                                </div>
                            
                                <div class="col">
                                    <div class="form-group">
                                        <label for="full_length">Full Length</label>
                                        <input type="number" value="${newborn.full_length}" class="form-control" name="full_length" id="">
                                    </div>
                                </div>
                                
                            </div>

                            <div class="row">
                            
                            <div class="col">
                                    <div class="form-group">
                                        <label for="congenital">Abnormality</label>
                                       <input type="text" value="${newborn.congenital}" class="form-control" name="congenital" id="">
                                    </div>
                                </div>

                                <div class="col" id="">

                                    <div class="form-group" id="dis">
                                        <label for="type_of_abnormality">Type of Abnormality</label>
                                        <input type="text" value="${newborn.type_of_abnormality}" name="type_of_abnormality" class="form-control" >
                                    </div>
                                </div>
                            </div>
                            
                             <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="complication">Complication</label>
                                        <input type="text" value="${newborn.complication}" class="form-control" name="complication" id="">
                                    </div>
                                </div>
                               <div class="col">
                                    <div class="form-group">
                                        <label for="date_of_delivery">Date of Delivery</label>
                                        <input type="date" value="${newborn.date_of_delivery}" name="date_of_delivery" class="form-control">
                                        
                                    </div>
                                </div>
                            </div>

                        </div>


                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Update</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
	
	
	<!-- newborn form ends here -->
    
    
</body>
</html>