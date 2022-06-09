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
<title>PIN/AIN Update Form</title>
</head>
<body>





    <!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id'>PIN/AIN </a> -->
    <div class="mod fa" id="modal-id">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                   <h4 class="modal-title">PIN/AIN UPDATE</h4> 
                   <button onclick="history.back()" type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    
                </div>
                
                
                 <form action="${pageContext.request.contextPath}/pinFront/updateP">
                <div class="modal-body">


                   

					 <input type="text" class="form-control" value="${ain.id}" name="id" id="" hidden=true>	
                        <div class="row">
                            <div class="col">
                                <div class="form-group">
                                    <label for="staff_id">Staff Id</label>
                                    <input type="text" class="form-control" value="${ain.staff_id}" name="staff_id" id="">
                                </div>
                            </div>
                            <div class="col">
                                <div class="form-group">
                                    <label for="pin_ain_number">PIN/AIN Number</label>
                                    <input type="text" class="form-control" value="${ain.pin_ain_number}" name="pin_ain_number" id="">
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col">
                                <div class="form-group">
                                    <label for="type">Card Type</label>

                                    <select name="type" class="form-control" id="">
                                        <option value="${ain.type}">${ain.type}</option>
                                        <option value="PIN">PIN</option>
                                        <option value="AIN">AIN</option>



                                    </select>
                                </div>
                            </div>
                            <div class="col">
                                <div class="form-group">
                                    <label for="date_issue">Date Issue</label>
                                    <input type="date" class="form-control" value="${ain.date_issue}" name="date_issue" id="">
                                </div>
                            </div>
                        </div>




                        <div class="row">
                            <div class="col">
                                <div class="form-group">
                                    <label for="renewal_date">Renewal Date</label>
                                    <input type="date" class="form-control" value="${ain.renewal_date}" name="renewal_date" id="">
                                </div>
                            </div>
                            <div class="col">
                                <div class="form-group">
                                    <label for="expire_date">Expire Date</label>
                                    <input type="date" class="form-control" value="${ain.expire_date}" name="expire_date" id="">
                                </div>
                            </div>
                        </div>


                   






                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Update Pin</button>
                </div>
                 </form>
            </div>
        </div>
    </div>



</body>
</html>