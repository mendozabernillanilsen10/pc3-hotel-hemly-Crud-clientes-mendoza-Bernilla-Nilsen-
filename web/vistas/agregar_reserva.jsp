
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Habitacion"%>
<%@page import="java.util.List"%>
<%@page import="DAO.HabitacionDAO"%>
<%@page import="Modelo.CodigoRandom"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>Hotel Emely</title>

    <link rel="shortcut icon" type="image/x-icon" href="assets/img/.png">

    <link rel="stylesheet" href="assets/css/bootstrap.min.css">

    <link rel="stylesheet" href="assets/plugins/fontawesome/css/all.min.css">
    <link rel="stylesheet" href="assets/plugins/fontawesome/css/fontawesome.min.css">

    <link rel="stylesheet" href="assets/css/feathericon.min.css">
    <link rel="stylesheet" href="assets/plugins/morris/morris.css">
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap-datetimepicker.min.css">

    <link rel="stylesheet" href="assets/css/style.css">
</head>

<body>
    <div class="main-wrapper">
        <div class="header">
            <div class="header-left">
                <a href="#" class="logo"> <img src="assets/img/.png" width="50" height="70" alt="logo"> <span class="logoclass">HOTEL HEMELY</span> </a>
                <a href="index.html" class="logo logo-small"> <img src="assets/img/.png" alt="Logo" width="30" height="30"> </a>
            </div>
            <a href="javascript:void(0);" id="toggle_btn"> <i class="fe fe-text-align-left"></i> </a>
            <a class="mobile_btn" id="mobile_btn"> <i class="fas fa-bars"></i> </a>
            <ul class="nav user-menu">



                <li class="nav-item dropdown noti-dropdown">
                    <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown"> <i class="fe fe-bell"></i> <span class="badge badge-pill">2</span> </a>
                    <div class="dropdown-menu notifications">


                        <div class="topnav-dropdown-header"> <span class="notification-title">Notificaciones</span> <a href="javascript:void(0)" class="clear-noti"> Limpiar todo </a> </div>
                        <div class="noti-content">

                            <ul class="notification-list">

                                <li class="notification-message">
                                    <a href="#">
                                        <div class="media"> <span class="avatar avatar-sm">
											<img class="avatar-img rounded-circle" alt="User Image" src="assets/img/profiles/avatar-02.jpg">
											</span>
                                            <div class="media-body">
                                                <p class="noti-details">
                                                    <span class="noti-title">Carlson Tech</span> has approved <span class="noti-title">your estimate</span></p>
                                                <p class="noti-time"><span class="notification-time">4 mins ago</span> </p>
                                            </div>
                                        </div>
                                    </a>
                                </li>

                                <li class="notification-message">

                            </ul>
                        </div>
                        <div class="topnav-dropdown-footer"> <a href="#">Ver Notificaciones</a> </div>
                    </div>



                    </li>





                    <li class="nav-item dropdown has-arrow">
                        <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown">
                            <span class="user-img">
                                                <img class="rounded-circle" src="assets/img/profiles/avatar-01.jpg" width="31" alt="Soeng Souy">
                                            </span> </a>
                        <div class="dropdown-menu">
                            <div class="user-header">
                                <div class="avatar avatar-sm">
                                    <img src="assets/img/profiles/avatar-01.jpg" alt="User Image" class="avatar-img rounded-circle">
                                </div>
                                <div class="user-text">

                                    <h6> hola ${usuario.getUsuario()} </h6>
                                    <p class="text-muted mb-0">Administrator</p>
                                </div>
                            </div> <a class="dropdown-item" href="profile.html">Mi Perfil</a>
                            <a class="dropdown-item" href="settings">Configuraciones de la cuenta</a>


                            <form action="Valida" method="POST">
                                <button name="accion" value="salir" class="dropdown-item" href="">salir</button>
                            </form>
                        </div>



                    </li>
            </ul>




        </div>
       
                                    
       
                                    
                                    
           <div class="sidebar" id="sidebar">
            <div class="sidebar-inner slimscroll">
                <div id="sidebar-menu" class="sidebar-menu">
                    <ul>
                        <li class="active"> <a href="Controlador?menu=Principal"><i class="fas fa-tachometer-alt"></i> <span>Dashboard</span></a> </li>
                        <li class="list-divider"></li>
                        <li class="submenu"> <a href="#"><i class="fas fa-suitcase"></i> <span> Reserva </span> <span class="menu-arrow"></span></a>

                            <ul class="submenu_class" style="display: none;">
                                <li><a href="Controlador?menu=l_reserva1&accion=listar"> Todas Las Reservas </a></li>
                                <li><a href="add-booking.html"> Añadir Reservas</a></li>
                            </ul>



                        </li>
                        <li class="submenu"> <a href="#"><i class="fas fa-user"></i> <span> Clientela </span> <span class="menu-arrow"></span></a>
                            <ul class="submenu_class" style="display: none;">
                                <li><a href="Controlador?menu=Cliente&accion=listar_cliente"> Todos Los Clientes </a></li>
                                <li><a href="add-customer.html"> Agregar clientes </a></li>
                            </ul>
                        </li>
                        <li class="submenu"> <a href="#"><i class="fas fa-key"></i> <span> Local </span> <span class="menu-arrow"></span></a>
                            <ul class="submenu_class" style="display: none;">
                                <li><a href="all-rooms.html">Todas las habitaciones </a></li>
                                <li><a href="edit-room.html"> Editar salas </a></li>
                                <li><a href="add-room.html"> Añadir habitaciones</a></li>
                            </ul>
                        </li>


                        <li class="submenu"> <a href="#"><i class="fas fa-user"></i> <span> Personal </span> <span class="menu-arrow"></span></a>
                            <ul class="submenu_class" style="display: none;">
                                <li><a href="all-staff.html">Todo el personal </a></li>
                                <li><a href="edit-staff.html"> Editar personal </a></li>
                                <li><a href="add-staff.html"> Añadir personal </a></li>
                            </ul>
                        </li>



                        <li class="submenu"> <a href="#"><i class="fas fa-user"></i> <span> Empleados </span> <span class="menu-arrow"></span></a>
                            <ul class="submenu_class" style="display: none;">
                                <li><a href="employees.html">Lista de Empleados </a></li>
                                <li><a href="leaves.html">Hojas </a></li>
                                <li><a href="holidays.html">Vacaciones </a></li>
                                <li><a href="attendance.html">Asistencia </a></li>
                            </ul>
                        </li>

                        <li class="submenu"> <a href="#"><i class="fas fa-user"></i> <span> Area </span> <span class="menu-arrow"></span></a>
                            <ul class="submenu_class" style="display: none;">
                                <li><a href="employees.html">Todas de Area </a></li>
                                <li><a href="leaves.html">Editar Areas </a></li>
                                <li><a href="holidays.html">Añadir Areas </a></li>

                            </ul>
                        </li>



                        <li> <a href="pricing.html"><i class="far fa-money-bill-alt"></i> <span>Precio</span></a> </li>


                        <li class="submenu"> <a href="#"><i class="fas fa-share-alt"></i> <span> Apps </span> <span class="menu-arrow"></span></a>
                            <ul class="submenu_class" style="display: none;">
                                <li><a href="chat.html"><i class="fas fa-comments"></i><span> Chat </span></a></li>
                                <li class="submenu"> <a href="#"><i class="fas fa-video camera"></i> <span> Calls </span> <span class="menu-arrow"></span></a>
                                    <ul class="submenu_class" style="display: none;">
                                        <li><a href="voice-call.html"> Voice Call </a></li>
                                        <li><a href="video-call.html"> Video Call </a></li>
                                        <li><a href="incoming-call.html"> Incoming Call </a></li>
                                    </ul>
                                </li>
                                <li class="submenu"> <a href="#"><i class="fas fa-envelope"></i>
                                                                        <span> Email </span> <span class="menu-arrow"></span></a>
                                    <ul class="submenu_class" style="display: none;">
                                        <li><a href="compose.html">Compose Mail </a></li>
                                        <li><a href="inbox.html"> Inbox </a></li>
                                        <li><a href="mail-veiw.html"> Mail Veiw </a></li>
                                    </ul>
                                </li>
                            </ul>
                        </li>

                        <li class="submenu"> <a href="#"><i class="far fa-money-bill-alt"></i> <span> Cuenta </span> <span class="menu-arrow"></span></a>
                            <ul class="submenu_class" style="display: none;">
                                <li><a href="invoices.html">Facturas </a></li>
                                <li><a href="payments.html">Pagos </a></li>
                                <li><a href="expenses.html">Expensas </a></li>
                                <li><a href="taxes.html">Impuestos </a></li>
                                <li><a href="provident-fund.html">Fondo de Previsión</a></li>
                            </ul>
                        </li>


                        <li> <a href="calendar.html"><i class="fas fa-calendar-alt"></i> <span>Calendar</span></a> </li>
                    </ul>
                </div>
            </div>
        </div>



            
            <div class="page-wrapper">
			<div class="content container-fluid">
				<div class="page-header">
					<div class="row align-items-center">
						<div class="col">
							<h3 class="page-title mt-5">AGREAGAR NUEVA RESERVA</h3> </div>
					</div>
				</div>
				<div class="row">
					<div class="col-lg-12">
						<form action="controladorHabitacion" method="POST">
                                               
							<div class="row formtype">
								<div class="col-md-4">
									<div class="form-group">
										<label>ID DE RESERVA </label>
                                                                             
                                                                                <%
                                                                                    CodigoRandom m =new  CodigoRandom();
                                                                                    String codigog = m.codigoIdTablas();
                                                                                    %>
                                                                                
                                                                                    <input class="form-control" type="text" value="<%=codigog%>" readonly> </div>
								</div>
								
                                                               <div class="col-md-2">
									<div class="form-group ">
										<label>FECHA DE RESERVA</label>
										<div class="cal-icon">
											<input type="text" name="fecha de reserva " class="form-control "> </div>
									</div>
								</div>
                                       
                                                             <div class="col-md-6">
									<div class="form-group">
										<label>VALIDA DATOS DEL CLIENTE </label>
										
                                                                                <div class="form-group d-flex">
                                                                                    
                                                                                    <input type="text" name="dni_cliente" class="form-control" placeholder="DNI DEL CLIENTE "  >
                                                                                    <input type="submit" name ="accion" value="Buscar" class="btn btn-info">
                                                                                    <input type="text" name="cleente" class="form-control" placeholder="datos del cliente"readonly >
                                                                                  
                                                                                </div>
                                                                                
									</div>
							     </div>
                                                            
                                                            
                                                            
								<div class="col-md-4">
									<div class="form-group">
										<label>HABITACION</label>
										
                                                                                
                                                                                
                                                                                
                                                                                
                                                                                <select class="form-control" id="sel2" name="sellist1">
                                                                                <%
                                                                                    HabitacionDAO dao2=new HabitacionDAO();
                                                                                    List<Habitacion>list2=dao2.Listar();
                                                                                    Iterator<Habitacion>iter2=list2.iterator();
                                                                                    Habitacion per2=null;
                                                                                    while(iter2.hasNext()){
                                                                                        per2=iter2.next();
                                                                                   %>     
                                                                                   <option><%= per2.getNumero()%></option>
                                                                                      <%}%>
                                                                                     </select>

									</div>
								</div>
                                                            
                                                            
								
							</div>
                                                    
                                                    
                                                    
                                                    
                                                    
						</form>
					</div>
				</div>
				<button type="button" class="btn btn-primary buttonedit1">Agregar</button>
			</div>
		</div>
	</div>
	<script src="assets/js/jquery-3.5.1.min.js"></script>
	<script src="assets/js/popper.min.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>
	<script src="assets/js/moment.min.js"></script>
	<script src="assets/js/bootstrap-datetimepicker.min.js"></script>
	<script src="assets/plugins/slimscroll/jquery.slimscroll.min.js"></script>
	<script src="assets/plugins/raphael/raphael.min.js"></script>
	<script src="assets/js/script.js"></script>
	<script>
	$(function() {
		$('#datetimepicker3').datetimepicker({
			format: 'LT'
		});
	});
	</script>
</body>

</html>