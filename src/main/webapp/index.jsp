<%-- 
    Document   : index
    Created on : 11 dic. 2022, 01:01:16
    Author     : cley
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Class.insert" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous">
    </script>
        <title>JSP Page</title>
    </head>
    <body>
    
<div class="container">
    <div class="row d-flex justify-content-center">
        <h3 class="text-center fw-normal pt-4 mb-3 ">Registro de persona </h3>
        <div class="col-md-6 ">
           <!-- <form class="shadow p-3" method="post" action="Api/v1/RegistroP/insert" id="formRegistroPro" enctype="multipart/form-data">
             -->
            <form class="shadow p-3" method="post" action="Registro" id="formRegistroPro" enctype="multipart/form-data">
                <div class="row row-cols-md-1 row-cols-1 ">
                    <!-- - La tabla a leer sea de persona con un campo ID,DNI,Nombre, Apellido, Nacionalidad -->
                    <div class="mb-3">
                        <label for="recipient-name" class="col-form-label">DNI:</label>
                        <input type="text" name="Rdni" id="nameP" class="form-control"
                            placeholder="Ingrese el dni" required />
                    </div>
                    <div class="mb-3">
                        <label for="recipient-name" class="col-form-label">Nombre:</label>
                        <input type="text" name="Rnombre" class="form-control" placeholder="Ingrese el nombre"
                            required />
                    </div>

                    <div class="mb-3">
                        <label for="recipient-name" class="col-form-label">Apellido:</label>
                        <input type="text" name="Rapellido" class="form-control" placeholder="Ingrese el apellido"
                            required />
                    </div>

                    <div class="mb-3">
                        <label for="recipient-name" class="col-form-label">Nacionalidad:</label>
                        <input type="text" name="Rnacionalidad" class="form-control" placeholder="Ingrese la nacionalidad"
                            required />
                    </div>

                </div>
                <div class="modal-footer">
                    <input type="submit" class="btn btn-primary" name="btnsave" id="btnSavei" value="Guardar" />
                    <button type="reset" class="btn btn-warning" id="d">Borrar</button>
                    <button type="button" class="btn btn-success" data-bs-dismiss="modal" aria-label="Close">
                        Salir
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>
        
  
    </body>
</html>

