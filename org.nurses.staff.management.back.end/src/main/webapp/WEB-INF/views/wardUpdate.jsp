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
<title>Ward Update Form</title>
</head>
<body>


    <!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Ward form</a> -->
    <div class="mod fa" id="modal-id">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Ward Update Form</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>

                </div>
                <form action="${pageContext.request.contextPath}/wardFront/wardUpdate">
                <div class="modal-body">
                    
                        <div class="row">
                            <div class="col">
                                <div class="form-group">
                                    <label for="id">Ward Id</label>
                                    <input type="text" class="form-control" value="${ids.id}" name="id" id="">
                                </div>
                            </div>
                            <div class="col">
                                <div class="form-group">
                                    <label for="ward_name">Ward Name</label>
                                    <input type="text" class="form-control" value="${ids.ward_name }" name="ward_name" id="">
                                </div>
                            </div>
                        </div>

                        <div class="row">
                        
                         <div class="col">
                                <div class="form-group">
                                    <label for="total_Staff">Total Staff</label>
                                    <input type="text" class="form-control" value="${ids.total_staff}" name="total_staff" id="">
                                </div>
                            </div>
                        
                        
                            <div class="col">
                                <div class="form-group">
                                    <label for="bed_capacity">Bed Capacity</label>
                                    <select name="bed_capacity" id="" class="form-control">
                                            <option value="${ids.bed_capacity }">${ids.bed_capacity }</option>
                                            <option value="5">5</option>
                                            <option value="10">10</option>
                                            <option value="20">20</option>
                                            <option value="22">22</option>
                                            <option value="23">23</option>
                                            <option value="24">24</option>
                                            <option value="25">25</option>
                                    </select>

                                </div>
                            </div>
                        </div>



                        <div class="row">
                            <div class="col">
                                <div class="form-group">
                                    <label for="ward_incharge">Ward Incharge</label>
                                    <input type="text" class="form-control" value="${ids.ward_incharge}" name="ward_incharge" id="myInput" >

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
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Save</button>
                </div> 
                </form>
            </div>
        </div>
    </div>



</body>
</html>