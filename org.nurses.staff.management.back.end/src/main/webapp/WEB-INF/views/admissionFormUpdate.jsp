<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    
    <link
	href="${pageContext.request.contextPath}/resources/css/projectCss.css"
	rel="stylesheet">
    
<meta charset="ISO-8859-1">
<title>Admission Update Form</title>
</head>
<body class="body1">

<!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Trigger modal</a> -->
    <div class="mod fad" id="modal-id">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header btn-primary">
                    <h4 class="modal-title">Admission/Discharge Form</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true" onclick="history.back()">&times;</button>

                </div>

                <form action="${pageContext.request.contextPath}/admissionFront/updateDischarge" >
                    <div class="modal-body table-warning">



                        <div class="firstContainer">
 						<input type="text" class="form-control" name="id" id="" value="${admission.id }" hidden="true">
                            <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="patien_number">Folder Number</label>
                                        <input type="text" class="form-control" name="patient_number" id="" value="${admission.patient_number }">
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="form-group">
                                        <label for="patient_name">Patient Name</label>
                                        <input type="text" class="form-control" name="patient_name" id="" value="${admission.patient_name}">
                                    </div>
                                </div>
                            </div>


                            <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="sex">Sex/Gender</label>
                                        <input type="text" name="sex" class="form-control" value="${admission.sex}">
                                    </div>
                                </div>
                                <div class="col" style="display:none;">
                                    <div class="form-group">
                                        <label for="address">Address</label>
                                        <input type="text" class="form-control" name="address" id="" value="${admission.address}">
                                    </div>
                                </div>
                            </div>

                        </div>


                        <div class="secondContainer">
                            <div class="row">
                                <div class="col" style="display:none;">
                                    <div class="form-group">
                                        <label for="phone_number">Phone Number</label>
                                        <input type="number" class="form-control" value="${admission.phone_number }" name="phone_number" placeholder="" id="" min="0" onKeyPress="if(this.value.length==10) return false;">
                                    </div>
                                </div>


                                <div class="col">
                                    <div class="form-group">
                                        <label for="date_admitted">Date Admitted</label>
                                        <input type="date" class="form-control" name="date_admitted" id="" value="${admission.date_admitted}">
                                    </div>
                                </div>
                            </div>



                            <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="diagnosis">Provisional Diagnosis</label>
                                        <input type="text" class="form-control" name="diagnosis" id="" value="${admission.diagnosis}">

                                    </div>
                                </div>

                                <div class="col">
                                    <div class="form-group">
                                        <label for="outcome_of_admission">Outcome of Admission</label>

                                        <select name="outcome_of_admission" class="form-control" id="" 
                                        onchange="myDisplay(this.value)">
                                            <option value="">select</option>
                                            <option value="Discharge">Discharge</option>
                                            <option value="Referred">Referred</option>
                                            <option value="Trans-out">Trans-out</option>
                                            <option value="Absconded">Absconded</option>
                                            <option value="Death">Death</option>
                                        </select>
                                    </div>


                                </div>
                            </div>

                        </div>



                        <div class="thirdContainer">
                            <div class="row">
                                <div class="col" id="finalDiagnosis" style="display:none;">
                                
                                    <div class="form-group">
                                        <label for="final_diagnosis">Final Diagnosis</label>
                                        <input type="text" class="form-control" name="final_diagnosis" id="">
                                    </div>
                                </div>
                                <div class="col" style="display:none;">
                                    <div class="form-group" >
                                        <label for="next_of_kin">Next of Kin</label>
                                        <input type="text" class="form-control" name="next_of_kin" id="" value="${admission.next_of_kin}">
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col" style="display:none;">
                                    <div class="form-group">
                                        <label for="next_of_kin_number">Next of Kin Number</label>
                                        <input type="number" class="form-control" name="next_of_kin_number" id="" value="${admission.next_of_kin_number}">
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="form-group">
                                        <label for="insured">Insured</label>
                                        <input type="text" class="form-control" name="insured" value="${admission.insured }">
                                    </div>
                                </div>
                            </div>

                            <div class="row">

                                <div class="col" id="insurance_number">

                                    <div class="form-group" id="dis">
                                        <label for="insurance_number">Insurance Number</label>
                                        <input type="number" value="${admission.insurance_number }" name="insurance_number" class="form-control" min="0" onKeyPress="if(this.value.length==10) return false;">
                                    </div>
                                </div>
                            </div>
                            
                             <div class="row">
                                <div class="col" id="dateDischarge" style="display:none;">
                                    <div class="form-group">
                                        <label for="date_discharge">Date Discharge</label>
                                        <input type="date" class="form-control" name="date_discharge" id="">
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="form-group">
                                        <label for="ward_name">ward Name</label>
                                       <input type="text" name="ward_name" class="form-control" value="${admission.ward_name}">
                                    </div>
                                </div>
                            </div>

                        </div>


                    </div>
                    <div class="modal-footer btn-danger">
                        <button type="button" class="btn btn-default" onclick="history.back()">Close</button>
                        <button type="submit" class="btn btn-primary">Save Record</button>
                    </div>
                </form>
            </div>
        </div>
    </div>



    <script>
        function myDisplay(val) {
            var x = document.getElementById("finalDiagnosis");
            var y = document.getElementById("dateDischarge");

            if (val == "") {
                y.style.display = "none";
                x.style.display = "none";

            } else if (val == "Discharge" || "Death" || "Trans-out" || "Referred" || "Absconded") {
                y.style.display = "block";
                x.style.display = "block"

            } else {
            	x.style.display = "none";
                y.style.display = "none";
            }
        }
        
        
        function displayH(val) {
            var hd = document.getElementById("hid");

            if (val == "") {
                hd.style.display = "none"
            } else if (val == "Yes") {
                hid.style.display = "block"
            } else {
                hd.style.display = "none"
            }
        }

        function hidden() {
            document.getElementById("hid").style.display = "none";
        }
    </script>

</body>
</html>