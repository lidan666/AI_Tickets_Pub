<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

	<head>
	
		<!-- Basic -->
    	<meta charset="UTF-8" />

		<title>Login</title>
	
		<!-- Mobile Metas -->
	    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
	    	
		<!-- Vendor CSS-->
		<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
		<link href="vendor/skycons/css/skycons.css" rel="stylesheet" />
		<link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" />
				
		<!-- Theme CSS -->
		<link href="css/jquery.mmenu.css" rel="stylesheet" />
		
		<!-- Page CSS -->		
		<link href="css/style.css" rel="stylesheet" />
		<link href="css/add-ons.min.css" rel="stylesheet" />
		
		<style>
			footer {
				display: none;
			}
			html,body{
			    width:100%;
			    height:100%
			}
			body{

			  background:url("img/ai666.jpg") no-repeat;
			  background-size: 100%;
			  background-position: center center;
			  background-attachment: fixed;

				/* 让背景图基于容器大小伸缩 */
			  background-size: cover;
			}
						 
		</style>
		
		<!-- end: CSS file-->	
	    	
		<base href="${pageContext.request.contextPath }/" />
	</head>

	<body>
		<!-- Start: Content -->
		 <div style="text-align:center;height:30%; font-size:40px;text-shadow: 0 0 2px white;padding-top:40px;">
		 <p style="color: white;">AI</p>
		 <p style="color: white;">电子行程单信息查询工具</p>
</div>
		<div class="container-fluid content">
		
			<div class="row">
				<!-- Main Page -->
				<div id="content" class="col-sm-12 full">
					<div class="row">
						<div class="login-box">
							<div class="panel" style=" margin-top:0;">
								<div class="panel-body">								
									<div class="header bk-margin-bottom-20 text-center" >


									</div>		
									<form class="form-horizontal login" modelAttribute="User" action="${pageContext.request.contextPath }/login/index" method="post">
										<div class="bk-padding-left-20 bk-padding-right-20">
											<div class="form-group">
												<label>Username</label>
												<div class="input-group input-group-icon">
													<input type="text" class="form-control bk-radius" name="userName" id="userName"/>
													<span class="input-group-addon">
														<span class="icon">
															<i class="fa fa-user"></i>
														</span>
													</span>
												</div>
											</div>											
											<div class="form-group">
												<label>Password</label>
												<div class="input-group input-group-icon">
													<input type="password" class="form-control bk-radius" id="password" placeholder="Password"/>
													<span class="input-group-addon">
														<span class="icon">
															<i class="fa fa-key"></i>
														</span>
													</span>
												</div>
											</div>
											<div class="row bk-margin-top-20 bk-margin-bottom-10">
												<div class="col-sm-8">
													<div class="checkbox-custom checkbox-default">
														<input id="RememberMe" name="rememberme" type="checkbox" />
														<label for="RememberMe">Remember Me</label>
													</div>
												</div>
												<div class="col-sm-4 text-right">
													<button type="submit" class="btn btn-primary hidden-xs">Log In</button>
												</div>
											</div>
											<div class="text-with-hr">
												<span>or</span>
											</div>
											<p class="text-center">Don't have an account yet? <a href="${pageContext.request.contextPath }/login/register">Register</a></p>
										</div>
									</form>
								</div>
								</div>
						</div>
					</div>			
				</div>
				<!-- End Main Page -->
			</div>
		</div><!--/container-->
		
		<!-- start: JavaScript-->
		
		<!-- Vendor JS-->				
		<script src="vendor/js/jquery.min.js"></script>
		<script src="vendor/js/jquery-2.1.1.min.js"></script>
		<script src="vendor/js/jquery-migrate-1.2.1.min.js"></script>
		<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
		<script src="vendor/skycons/js/skycons.js"></script>
		
		<!-- Pages JS -->
		<script src="js/page-login.js"></script>
<%--		<script src="js/pages/page-login.js"></script>--%>
		<!-- end: JavaScript-->
		
	</body>
	
</html>