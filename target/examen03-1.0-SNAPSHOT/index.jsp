<%-- 
    Document   : index
    Created on : 15 jul. 2021, 11:00:54
    Author     : NITRO5
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link rel="stylesheet" href="recursos/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="recursos/css/producto.css"/>
    </head>
    <body>
        <div class="container">
		<div class="row">
		<div class=" col 08 card">
  <h5 class="card-header p-3 mb-2 bg-info text-white">Ecaluacion N°03 (Producto)</h5>
  <div class="card-body">
    <h5 class="card-title">Funcionalidades: Listar, Insertar, Actualizar, Eliminar</h5>
    <div class="container small" style="margin-bottom: 50px">
		<div class="form-group">
			<input type="text" class="form-control"	id="nombre"  placeholder="Producto"/> 
			<input type="hidden" class="form-control"	id="id" value="0" />
			<small class="form-text text-muted">Ingresar el Producto</small>
		</div>
		<div class="form-group">
			<input type="text" class="form-control"	id="telefono"  placeholder="Precio"/> 
			<small class="form-text text-muted">Ingresar el Precio</small>
		</div>
		<div class="form-group">
			<input type="text" class="form-control"	id="direccion"  placeholder="Stock"/> 
			<small class="form-text text-muted">stock</small>
			
		</div>
                <div class="form-group">
			<input type="text" class="form-control"	id="direccion"  placeholder="Tipo de Producto"/> 
			<small class="form-text text-muted">Ingresar el Tipo de Producto Reseado</small>
			
		</div>
		<button class="btn btn-success" id="boton2"></button>
	</div>
	<div class="container">
	<div class="col 06">
	</div>
		<table class="table table-dark" id="tablita">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">ID Producto</th>
					<th scope="col">Producto</th>
					<th scope="col">Precio</th>
					<th scope="col">Stock</th>
                                        <th scope="col">Tipo de Producto</th>
					<th scope="col" colspan="2">Accion</th>
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>
	</div>
  </div>
</div>
		</div>
	</div>
        <script src="recursos/js/jquery.js"></script>
        <script src="recursos/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="recursos/js/producto.js"></script>
    </body>
</html>
