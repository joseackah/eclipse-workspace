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
<title>Nurse Staff Form</title>
</head>
<body>


    <!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Nurse Staff</a> -->
    <div class="mod fa" id="modal-id">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Nurse Staff</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>

                </div>
                <div class="modal-body">
                    <form action="#">
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
                                    <label for="address">Address</label>
                                    <input type="text" class="form-control" name="address" id="">

                                </div>
                            </div>
                        </div>



                        <div class="row">
                            <div class="col">
                                <div class="form-group">
                                    <label for="ssnit_number">SSNIT Number</label>
                                    <input type="text" class="form-control" name="ssnit_number" id="">
                                </div>
                            </div>


                            <div class="col">
                                <div class="form-group">
                                    <label for="date_of_birth">Date of Birth</label>
                                    <input type="text" class="form-control" name="date_of_birth" id="">
                                </div>
                            </div>
                        </div>



                        <div class="row">
                            <div class="col">
                                <div class="form-group">
                                    <label for="sex">Sex</label>
                                    <select name="sex" class="form-control" id="">
                                        <option value="male">Male</option>
                                        <option value="female">Female</option>
                                    </select>

                                </div>
                            </div>

                            <div class="col">
                                <div class="form-group">
                                    <label for="assumption_date">Assumption of Duty</label>
                                    <input type="text" class="form-control" name="" id="">

                                </div>


                            </div>
                        </div>
                        <div class="row">
                            <div class="col">
								<div class="form-group">
									<label for="category">Category</label> <select name="category"
										class="form-control" id="" onchange="current(this.value)">
										<option value="">select</option>
										<option value="Reg. Gen. Nurse">Reg. Gen.
											Nurse</option>
										<!-- <option value="Reg. Gen. Nurse(Degree)">Reg. Gen.
											Nurse</option> -->
										<option value="Reg. Midwife">Reg.
											Midwife</option>
										<!-- <option value="Reg. Midwife(Degree)">Reg.
											Midwife</option> -->
										<option value="NAC">NAC</option>
										<option value="NAP">NAP</option>
										<option value="Ancillary">Ancillary</option>

									</select>
								</div>
							</div>

							<div class="col" id="">
								<div class="form-group">
									<label for="grade">Current Grade/Position</label> 
									<select class="form-control" name="grade" id="" style="display:;">
									<option value="">Select</option>
								
									<optgroup label="General Nurse" id="rgn" style="display: none;">
									<option value="SN">SN</option>
									<option value="SSN">SSN</option>
									<option value="NO">NO</option>
									<option value="SNO">SNO</option>
									<option value="PNO">PNO</option>
									<option value="DDNS">DDNS</option>
									<option value="DNS">DNS</option>
									</optgroup>
									
									<optgroup label="Midwife" id="mid" style="display: none;">
									<option value="SM">SM</option>
									<option value="SSM">SSM</option>
									<option value="MO">MO</option>
									<option value="SMO">SMO</option>
									<option value="PMO">PMO</option>
									<option value="DDMS">DDMS</option>
									<option value="DMS">DMS</option>
									</optgroup>
									
									<optgroup label="Nurse Assistant (Preventive)" id="nap" style="display: none;">
									<option value="CHN">CHN</option>
									<option value="SCHN">SCHN</option>
									<option value="PCHN">PCHNN</option>
									<option value="SuCHN">SuCHN</option>
									<!-- <option value="PNO">PNO</option>
									<option value="DDNS">DDNS</option>
									<option value="DNS">DNS</option> -->
									</optgroup>
									
									<optgroup label="Nurse Assistant (Curative)" id="nac" style="display: none;">
									<option value="EN">EN</option>
									<option value="SEN">SEN</option>
									<option value="PEN">PEN</option>
									<option value="SuEN">SuEN</option>
									<!-- <option value="PMO">PMO</option>
									<option value="DDMS">DDMS</option>
									<option value="DMS">DMS</option> -->
									</optgroup>
									
									
									</select>
								</div>
							</div>
                            
                        </div>
                        <div class="row">
						
						<div class="col">
								<div class="form-group">
									<label for="basic_qualification">Basic Qualification</label> <select
										name="basic_qualification" class="form-control" id="">
										<option value="select">select</option>
										<option value="Diploma">Diploma</option>
										<option value="Degree">Degree</option>
										<option value="Certificate">Certificate</option>

										<option value="Others">Others</option>

									</select>




								</div>
							</div>
						
						
							<div class="col">
								<div class="form-group">
									<label for="status">Status</label> 
									<select class="form-control" name="status" id="">
									<option value="">Select</option>
									<option value="at post">At Post</option>
									<!-- <option value="on study leave with pay">On study Leave with pay</option>
									<option value="on study leave without pay">On study Leave without pay</option>
									<option value="on transfer">On Transfer</option> -->
									
									
									
									</select>

								</div>
							</div>
							
							
						</div>
                      <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save</button>
                </div>  
                    </form>
                </div>
                
            </div>
        </div>
    </div>

<script>


		function current(val) {
			
			
			var rgn = document.getElementById("rgn");
			var mid = document.getElementById("mid");
			var nap = document.getElementById("nap");
			var nac = document.getElementById("nac");
			
			if(val == ""){
					rgn.style.display = "none";
					mid.style.display = "none";
					nap.style.display = "none";
					nac.style.display = "none";
			}else if(val == "Reg. Gen. Nurse"){
					rgn.style.display = "block";
					mid.style.display = "none";
					nap.style.display = "none";
					nac.style.display = "none";
			}else if(val == "Reg. Midwife"){
					mid.style.display = "block";
					rgn.style.display = "none";
					nap.style.display = "none";
					nac.style.display = "none";
			}else if (val == "NAC"){
					nac.style.display = "block";
					mid.style.display = "none";
					nap.style.display = "none";
					rgn.style.display = "none";
			}else if(val == "NAP"){
					nap.style.display = "block";
					mid.style.display = "none"
					rgn.style.display = "none"
					nac.style.display = "none"
			}else{
					mid.style.display = "none";
					nap.style.display = "none";
					nac.style.display = "none";
					rgn.style.display = "none"; 
					window.alert("check your input");
			}

			
		}
		
		
	</script>
</body>
</html>