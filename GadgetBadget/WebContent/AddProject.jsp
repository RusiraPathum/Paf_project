<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Project</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
	integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
	crossorigin="anonymous">

<style type="text/css">
html {
	position: relative;
	min-height: 100%;
}

body {
	padding-top: 4.5rem;
	margin-bottom: 4.5rem;
}

.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 3.5rem;
	line-height: 3.5rem;
	background-color: #ccc;
}

.nav-link:hover {
	transition: all 0.4s;
}

.nav-link-collapse:after {
	float: right;
	content: '\f067';
	font-family: 'FontAwesome';
}

.nav-link-show:after {
	float: right;
	content: '\f068';
	font-family: 'FontAwesome';
}

.nav-item ul.nav-second-level {
	padding-left: 0;
}

.nav-item ul.nav-second-level>.nav-item {
	padding-left: 20px;
}

@media ( min-width : 992px) {
	.sidenav {
		position: absolute;
		top: 0;
		left: 0;
		width: 230px;
		height: calc(100vh - 3.5rem);
		margin-top: 3.5rem;
		background: #343a40;
		box-sizing: border-box;
		border-top: 1px solid rgba(0, 0, 0, 0.3);
	}
	.navbar-expand-lg .sidenav {
		flex-direction: column;
	}
	.content-wrapper {
		margin-left: 230px;
	}
	.footer {
		width: calc(100% - 230px);
		margin-left: 230px;
	}
}
</style>

</head>
<body style="background-color: #f0f0f0">

	<!-- Navbar-->
	<nav class="navbar navbar-expand-lg navbar-dark fixed-top bg-dark">
		<a class="navbar-brand" href="#">GadgetBadget</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarCollapse" aria-controls="navbarCollapse"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarCollapse">
			<ul class="navbar-nav mr-auto sidenav" id="navAccordion">
				<li class="nav-item ml-3"><a class="nav-link"
					href="AdminPanel.jsp">Home </a></li>
				<!-- 				<li class="nav-item"><a class="nav-link" href="#">Item 1</a></li> -->
				<li class="nav-item ml-3"><a class="nav-link nav-link-collapse"
					href="#" id="hasSubItems" data-toggle="collapse"
					data-target="#collapseSubItems2" aria-controls="collapseSubItems2"
					aria-expanded="false">User Details</a>
					<ul class="nav-second-level collapse" id="collapseSubItems2"
						data-parent="#navAccordion">
						<li style="list-style-type: none;" class="nav-item"><a
							class="nav-link" href="#"> <span class="nav-link-text">Add
									User</span>
						</a></li>
						<li style="list-style-type: none;" class="nav-item"><a
							class="nav-link" href="#"> <span class="nav-link-text">Item
									2.2</span>
						</a></li>
					</ul></li>
				<li class="nav-item active ml-3"><a
					class="nav-link nav-link-collapse" href="#" id="hasSubItems"
					data-toggle="collapse" data-target="#collapseSubItems3"
					aria-controls="collapseSubItems3" aria-expanded="false">Project
						Details<span class="sr-only">(current)</span>
				</a>
					<ul class="nav-second-level collapse" id="collapseSubItems3"
						data-parent="#navAccordion">
						<li style="list-style-type: none;" class="nav-item"><a
							class="nav-link" href="AddProject.jsp"> <span
								class="nav-link-text">Add Project</span>
						</a></li>
					</ul></li>
				<li class="nav-item ml-3"><a class="nav-link" href="#">Item
						3</a></li>
				<li class="nav-item ml-3"><a class="nav-link nav-link-collapse"
					href="#" id="hasSubItems" data-toggle="collapse"
					data-target="#collapseSubItems4" aria-controls="collapseSubItems4"
					aria-expanded="false">Item 4</a>
					<ul class="nav-second-level collapse" id="collapseSubItems4"
						data-parent="#navAccordion">
						<li style="list-style-type: none;" class="nav-item"><a
							class="nav-link" href="#"> <span class="nav-link-text">Item
									4.1</span>
						</a></li>
						<li style="list-style-type: none;" class="nav-item ml-3"><a
							class="nav-link" href="#"> <span class="nav-link-text">Item
									4.2</span>
						</a></li>
						<li style="list-style-type: none;" class="nav-item ml-3"><a
							class="nav-link" href="#"> <span class="nav-link-text">Item
									4.2</span>
						</a></li>
					</ul></li>
				<li class="nav-item ml-3"><a class="nav-link" href="#">Item
						5</a></li>
			</ul>
			<form class="form-inline ml-auto mt-2 mt-md-0">
				<li class="mr-3" style="list-style-type: none;"><a
					style="text-decoration: none; color: white" data-toggle="modal"
					data-target="#exampleModal" class="nav-lin" href=""></span> Sign Up</a></li>
				<li style="list-style-type: none;"><a
					style="text-decoration: none; color: white" class="nav-lin" href=""></span>
						Login</a></li>
			</form>
		</div>
	</nav>

	<main class="content-wrapper">
		<div class="container-fluid">
			<section class="mt-3">
				<div class="container">
					<h2 class="mb-3">Add Project Details</h2>
					<form class="row g-3 needs-validation" novalidate>
						<div class="col-md-12 mb-3">
							<label for="validationCustom03" class="form-label">Select
								Project Category</label> <select class="form-select form-control"
								id="project_category" name="project_category"
								aria-label="Default select example">
								<option selected>Select Project Category</option>
								<option value="1">Art</option>
								<option value="2">Technology</option>
								<option value="3">Design And Tech</option>
								<option value="3">Game</option>
								<option value="3">Music</option>
								<option value="3">Food</option>
								<option value="3">Films</option>
							</select>
						</div>
						<div class="col-md-6 mb-3">
							<label for="validationCustom01" class="form-label">Project
								Name</label> <input type="text" class="form-control" id="project_name"
								name="project_name" placeholder="Project Name">
						</div>
						<div class="col-md-6 mb-3">
							<label for="validationCustom02" class="form-label">Short
								Description</label> <input type="text" class="form-control"
								id="short_des" name="short_des" placeholder="Short Description">
						</div>
						<div class="col-md-6 mb-3">
							<label for="validationCustomUsername" class="form-label">Date</label>
							<input type="date" class="form-control"
								id="date" name="date"
								aria-describedby="inputGroupPrepend">
						</div>
						<div class="col-md-6 mb-3">
							<label for="validationCustom03" class="form-label">Project Goal</label> <input
								type="text" class="form-control" id="project_goal" name="project_goal" placeholder="Project Goal">
						</div>
						<!-- <div class="col-md-6 mb-3">
							<label for="validationCustom03" class="form-label">Select</label>
							<select class="form-select form-control"
								aria-label="Default select example">
								<option selected>Open this select menu</option>
								<option value="1">One</option>
								<option value="2">Two</option>
								<option value="3">Three</option>
							</select>
						</div> -->

						<div class="col-md-6">
							<label for="validationCustom05" class="form-label">Long Description</label>
								<textarea id="form10" id="long_des" name="long_des" class="md-textarea form-control" rows="5" placeholder="Long Description"></textarea>
						</div>

						<div class="col-12 mt-5">
							<button class="btn btn-primary" type="button">Save
								Project</button>
						</div>
					</form>
					
					
				</div>
			</section>
		</div>
	</main>

	<footer class="footer">
		<div class="container">
			<div class="text-center">
				<span>Team  <a href="#">SI-Dev</a>,
					2021
				</span>
			</div>
		</div>
	</footer>
	<!-- Navbar -->

	<!-- login modal -->

	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Sign Up</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">...</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>


	<script type="text/javascript">
		$(document).ready(function() {
			$('.nav-link-collapse').on('click', function() {
				$('.nav-link-collapse').not(this).removeClass('nav-link-show');
				$(this).toggleClass('nav-link-show');
			});
		});
	</script>

</body>
</html>