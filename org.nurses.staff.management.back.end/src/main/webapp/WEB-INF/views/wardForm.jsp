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
<title>Ward Form</title>
</head>
<body>


    <a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Ward form</a>
    <div class="modal fade" id="modal-id">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Ward Enrollment</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>

                </div>
                <div class="modal-body">
                    <form action="">
                        <div class="row">
                            <div class="col">
                                <div class="form-group">
                                    <label for="wardName">Ward Name</label>
                                    <input type="text" class="form-control" ame="" id="">
                                </div>
                            </div>
                            <div class="col">
                                <div class="form-group">
                                    <label for="totalStaff">Total Staff</label>
                                    <input type="text" class="form-control" name="" id="">
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col">
                                <div class="form-group">
                                    <label for="userType">Bed Capacity</label>
                                    <select name="" id="" class="form-control">
                                            <option value="">select</option>
                                            <option value="">5</option>
                                            <option value="">10</option>
                                            <option value="">20</option>
                                            <option value="">22</option>
                                            <option value="">23</option>
                                            <option value="">24</option>
                                            <option value="">25</option>
                                    </select>

                                </div>
                            </div>
                        </div>



                        <div class="row">
                            <div class="col">
                                <div class="form-group">
                                    <label for="wardIncharge">Ward Incharge</label>
                                    <input type="text" class="form-control" name="" id="myInput">

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

                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save</button>
                </div>
            </div>
        </div>
    </div>



</body>
</html>