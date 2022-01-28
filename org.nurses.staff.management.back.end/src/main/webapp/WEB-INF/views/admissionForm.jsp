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
<title>Insert title here</title>
</head>
<body>

<!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Trigger modal</a> -->
    <div class="mo fad" id="modal-id">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Admission/Discharge Form</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>

                </div>

                <form action="${pageContext.request.contextPath}/admissionFront/saveAdmission_Discharge">
                    <div class="modal-body">



                        <div class="firstContainer">

                            <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="patien_number">Folder Number</label>
                                        <input type="text" class="form-control" name="patient_number" id="">
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="form-group">
                                        <label for="patient_name">Patient Name</label>
                                        <input type="text" class="form-control" name="" id="">
                                    </div>
                                </div>
                            </div>


                            <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="sex">Sex/Gender</label>
                                        <select name="sex" class="form-control" id="">
                                        <option value="select">select</option>
                                        <option value="Male">Male</option>
                                        <option value="Female">Female</option>
                                        

                                    </select>
                                    </div>
                                </div>
                                
                                <div class="col" id="">

                                    <div class="form-group" id="dis">
                                        <label for="age">Age</label>
                                        <input type="number" name="age" class="form-control" min="0" onKeyPress="if(this.value.length==10) return false;">
                                    </div>
                                </div>
                                
                                
                            </div>

                        </div>


                        <div class="secondContainer">
                            <div class="row">
                            <div class="col">
                                    <div class="form-group">
                                        <label for="address">Address</label>
                                        <input type="text" class="form-control" name="address" id="">
                                    </div>
                                </div>
                            
                                <div class="col">
                                    <div class="form-group">
                                        <label for="phone_number">Phone Number</label>
                                        <input type="number" class="form-control" name="phone_number" placeholder="" id="" min="0" onKeyPress="if(this.value.length==10) return false;">
                                    </div>
                                </div>


                                
                            </div>



                            <div class="row">
                            
                            <div class="col">
                                    <div class="form-group">
                                        <label for="date_admitted">Date Admitted</label>
                                        <input type="date" class="form-control" name="date_admitted" id="" ma>
                                    </div>
                                </div>
                            
                                <div class="col">
                                    <div class="form-group">
                                        <label for="createdBy">Provisional Diagnosis</label>
                                        <input type="text" class="form-control" name="diagnosis" id="">

                                    </div>
                                </div>

                                
                            </div>

                        </div>



                        <div class="thirdContainer">
                            <div class="row">
                            
                            <div class="col">
                                    <div class="form-group">
                                        <label for="outcome_of_admission">Outcome of Admission</label>

                                        <select name="outcome_of_admission" class="form-control" id="">
                                            <option value="">select</option>
                                            <option value="Discharge">Discharge</option>
                                            <option value="Referred">Referred</option>
                                            <option value="Trans-out">Trans-out</option>
                                            <option value="Absconded">Absconded</option>
                                            <option value="Death">Death</option>
                                        </select>
                                    </div>


                                </div>
                            
                                <div class="col">
                                    <div class="form-group">
                                        <label for="final_diagnosis">Final Diagnosis</label>
                                        <input type="text" class="form-control" name="final_diagnosis" id="">
                                    </div>
                                </div>
                                
                            </div>

                            <div class="row">
                            
                            <div class="col">
                                    <div class="form-group">
                                        <label for="next_of_kin">Next of Kin</label>
                                        <input type="text" class="form-control" name="next_of_kin" id="">
                                    </div>
                                </div>
                            
                                <div class="col">
                                    <div class="form-group">
                                        <label for="next_of_kin_number">Next of Kin Number</label>
                                        <input type="text" class="form-control" name="next_of_kin_number" id="">
                                    </div>
                                </div>
                                
                            </div>

                            <div class="row">
                            
                            <div class="col">
                                    <div class="form-group">
                                        <label for="insured">Insured</label>
                                        <select name="insured" class="form-control" id="lets" onclick="myDisplay()">
                                                <option value="">Select</option>
                                                <option value="Yes" id="yes" >Yes</option>
                                                <option value="No" id="no" >No</option>
                                        </select>
                                    </div>
                                </div>

                                <div class="col" id="insurance_number">

                                    <div class="form-group" id="dis">
                                        <label for="insurance_number">Insurance Number</label>
                                        <input type="number" name="insurance_number" class="form-control" min="0" onKeyPress="if(this.value.length==10) return false;">
                                    </div>
                                </div>
                            </div>
                            
                             <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="date_discharge">Date Discharge</label>
                                        <input type="date" class="form-control" name="ward_name" id="">
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="form-group">
                                        <label for="ward_name">ward Name</label>
                                        <input type="text" name="ward_name" class="form-control">
                                        <!-- <select name="ward_name" class="form-control" id="" >
                                                <option value="">Select</option>
                                                <option value="Male Medical" >Male Medical</option>
                                                <option value="Female Medical" >Female Medical</option>
                                                <option value="Female Surgical" >Female Surgical</option>
                                                <option value="Male Surgical" >Male Surgical</option>
                                                <option value="Childrens Ward" >Children's Ward</option>
                                                <option value="Maternity" >Maternity</option>
                                                <option value="General Ward" >General Ward</option>
                                                <option value="NICU" >NICU</option>
                                                <option value="Religious Ward" >Religious Ward</option>
                                                <option value="Accident/Emergency" >Accident/Emergency</option>
                                        </select> -->
                                    </div>
                                </div>
                            </div>

                        </div>


                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Save Record</button>
                    </div>
                </form>
            </div>
        </div>
    </div>



    <!-- <script>
        function myDisplay() {
            var x = document.getElementById("yes");
            var y = document.getElementById("");

            if (x == "Yes") {
                y.style.display = "block";

            } else if (x == "No") {
                y.style.display = "none";

            } else {
                y.style.display = "none";
            }
        }
    </script> -->

</body>
</html>