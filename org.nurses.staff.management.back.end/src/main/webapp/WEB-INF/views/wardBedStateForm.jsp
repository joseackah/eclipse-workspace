<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

 <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Trigger modal</a>
    <div class="mo fad" id="modal-id">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Ward/Bed State Form</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>

                </div>

                <form action="">
                    <div class="modal-body">



                        <div class="firstContainer">

                            <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="date">Date</label>
                                        <input type="date" class="form-control" name="date" id="">
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="form-group">
                                        <label for="ward_name">Ward Name</label>
                                        <input type="text" class="form-control" name="ward_name" id="">
                                    </div>
                                </div>
                            </div>


                            <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="total_admission">Total Admission</label>
                                        <input type="number" name="total_admission" id="">

                                    </div>
                                </div>
                                <div class="col">
                                    <div class="form-group">
                                        <label for="total_discharge">Total Discharge</label>
                                        <input type="number" class="form-control" name="total_discharge" id="">
                                    </div>
                                </div>
                            </div>

                        </div>


                        <div class="secondContainer">
                            <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="total_trans_in">Total Trans In</label>
                                        <input type="number" class="form-control" name="total_trans_in" placeholder="" id="" min="0" onKeyPress="if(this.value.length==10) return false;">
                                    </div>
                                </div>


                                <div class="col">
                                    <div class="form-group">
                                        <label for="total_trans_out">Total Trans Out</label>
                                        <input type="number" class="form-control" name="total_trans_out" id="" ma>
                                    </div>
                                </div>
                            </div>



                            <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="total_death">Total Death</label>
                                        <input type="number" class="form-control" name="total_death" id="">

                                    </div>
                                </div>

                                <div class="col">
                                    <div class="form-group">
                                        <label for="total_critical_ill">Critical Ill</label>

                                        <input type="number" class="form-control" name="total_critical_ill" id="">
                                    </div>


                                </div>
                            </div>

                        </div>



                        <div class="thirdContainer">
                            <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="total_floor_patient">Floor Patients</label>
                                        <input type="number" class="form-control" name="total_floor_patient" id="">
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="form-group">
                                        <label for="total_absconded">Abscond</label>
                                        <input type="number" class="form-control" name="total_absconded" id="">
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <label for="total_insured">Total Insured</label>
                                        <input type="number" class="form-control" name="total_insured" id="">
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="form-group">
                                        <label for="total_non_insured">Total Non-Insured</label>
                                        <input type="number" class="form-control" name="total_non_insured" id="">
                                    </div>
                                </div>
                            </div>

                            <div class="row">

                                <div class="col" id="insurance_number">

                                    <div class="form-group" id="dis">
                                        <label for="total_remained_at_midnight">Total Remained At Midnight</label>
                                        <input type="number" name="total_remained_at_midnight" class="form-control" min="0" onKeyPress="if(this.value.length==10) return false;">
                                    </div>
                                </div>

                                <div class="col" id="">

                                    <div class="form-group" id="">
                                        <label for="nurse_incharge">Nurse Incharge(shift)</label>
                                        <input type="text" name="nurse_incharge" class="form-control" min="0" onKeyPress="if(this.value.length==10) return false;">
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



    <script>
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
    </script>
</body>
</html>