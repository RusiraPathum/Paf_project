<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Project Details</title>

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

</head>
<body>

	<!-- Navbar-->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid justify-content-between">
			<!-- Left elements -->
			<div class="d-flex">
				<!-- Brand -->
				<a class="navbar-brand me-2 mb-1 d-flex align-items-center" href="#">
					<!-- <img
					src="https://mdbootstrap.com/img/logo/mdb-transaprent-noshadows.png"
					height="20" alt="" loading="lazy" style="margin-top: 2px;" /> --> <span
					style="font-weight: 750">GadgetBadget</span>
				</a>

				<!-- Search form -->
			</div>
			<!-- Left elements -->

			<!-- Center elements -->
			<ul class="navbar-nav flex-row d-none d-md-flex">
				<li class="nav-item me-3 me-lg-1 active"><a class="nav-link"
					href="#">Home</a></li>

				<li class="dropdown navbar-nav flex-row d-none d-md-flex"><a
					class="nav-link" href="#" role="button" id="dropdownMenuLink"
					data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						Catogery</a>

					<ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
						<a class="dropdown-item" href="#">Project</a>
						<a class="dropdown-item" href="#">Product</a>
						<a class="dropdown-item" href="#">Something else here</a>
					</ul></li>

			</ul>
			<!-- Center elements -->

			<!-- Right elements -->
			<ul class="navbar-nav flex-row">
				<!-- <li class="nav-item me-3 me-lg-1"><a
					class="nav-link d-sm-flex align-items-sm-center" href="#"> <img
						src="https://mdbootstrap.com/img/new/avatars/1.jpg"
						class="rounded-circle" height="22" alt="" loading="lazy" /> <strong
						class="d-none d-sm-block ms-1">John</strong>
				</a></li> -->
				<li><a data-toggle="modal" data-target="#exampleModal"
					class="nav-link"
					href=""></span> Sign Up</a></li>
				<li><a class="nav-link"
					href=""></span> Login</a></li>
			</ul>
			<!-- Right elements -->
		</div>
	</nav>
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


	<div class="container">
		<h1>Welcome to GadgetBadget</h1>
	</div>

	<!-- Footer -->
	<footer class="bg-dark text-center text-white mt-5">
		<!-- Grid container -->
		<div class="container p-4">
			<!-- Section: Social media -->
			<section class="mb-4">
				<!-- Facebook -->
				<a class="btn btn-outline-light btn-floating m-1" href="#!"
					role="button"><i class="fab fa-facebook-f"></i></a>

				<!-- Twitter -->
				<a class="btn btn-outline-light btn-floating m-1" href="#!"
					role="button"><i class="fab fa-twitter"></i></a>

				<!-- Google -->
				<a class="btn btn-outline-light btn-floating m-1" href="#!"
					role="button"><i class="fab fa-google"></i></a>

				<!-- Instagram -->
				<a class="btn btn-outline-light btn-floating m-1" href="#!"
					role="button"><i class="fab fa-instagram"></i></a>

				<!-- Linkedin -->
				<a class="btn btn-outline-light btn-floating m-1" href="#!"
					role="button"><i class="fab fa-linkedin-in"></i></a>

				<!-- Github -->
				<a class="btn btn-outline-light btn-floating m-1" href="#!"
					role="button"><i class="fab fa-github"></i></a>
			</section>
			<!-- Section: Social media -->

			<!-- Section: Form -->
			<section class="">
				<form action="">
					<!--Grid row-->
					<div class="row d-flex justify-content-center">
						<!--Grid column-->
						<div class="col-auto">
							<p class="pt-2">
								<strong>Sign up for our newsletter</strong>
							</p>
						</div>
						<!--Grid column-->

						<!--Grid column-->
						<div class="col-md-5 col-12">
							<!-- Email input -->
							<div class="form-outline form-white mb-4">
								<input type="email" id="form5Example2" class="form-control" />
								<label class="form-label" for="form5Example2">Email
									address</label>
							</div>
						</div>
						<!--Grid column-->

						<!--Grid column-->
						<div class="col-auto">
							<!-- Submit button -->
							<button type="submit" class="btn btn-outline-light mb-4">
								Subscribe</button>
						</div>
						<!--Grid column-->
					</div>
					<!--Grid row-->
				</form>
			</section>
			<!-- Section: Form -->

			<!-- Section: Text -->
			<section class="mb-4">
				<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Sunt
					distinctio earum repellat quaerat voluptatibus placeat nam, commodi
					optio pariatur est quia magnam eum harum corrupti dicta, aliquam
					sequi voluptate quas.</p>
			</section>
			<!-- Section: Text -->

			<!-- Section: Links -->
			<section class="">
				<!--Grid row-->
				<div class="row">
					<!--Grid column-->
					<div class="col-lg-3 col-md-6 mb-4 mb-md-0">
						<h5 class="text-uppercase">Links</h5>

						<ul class="list-unstyled mb-0">
							<li><a href="#!" class="text-white">Link 1</a></li>
							<li><a href="#!" class="text-white">Link 2</a></li>
							<li><a href="#!" class="text-white">Link 3</a></li>
							<li><a href="#!" class="text-white">Link 4</a></li>
						</ul>
					</div>
					<!--Grid column-->

					<!--Grid column-->
					<div class="col-lg-3 col-md-6 mb-4 mb-md-0">
						<h5 class="text-uppercase">Links</h5>

						<ul class="list-unstyled mb-0">
							<li><a href="#!" class="text-white">Link 1</a></li>
							<li><a href="#!" class="text-white">Link 2</a></li>
							<li><a href="#!" class="text-white">Link 3</a></li>
							<li><a href="#!" class="text-white">Link 4</a></li>
						</ul>
					</div>
					<!--Grid column-->

					<!--Grid column-->
					<div class="col-lg-3 col-md-6 mb-4 mb-md-0">
						<h5 class="text-uppercase">Links</h5>

						<ul class="list-unstyled mb-0">
							<li><a href="#!" class="text-white">Link 1</a></li>
							<li><a href="#!" class="text-white">Link 2</a></li>
							<li><a href="#!" class="text-white">Link 3</a></li>
							<li><a href="#!" class="text-white">Link 4</a></li>
						</ul>
					</div>
					<!--Grid column-->

					<!--Grid column-->
					<div class="col-lg-3 col-md-6 mb-4 mb-md-0">
						<h5 class="text-uppercase">Links</h5>

						<ul class="list-unstyled mb-0">
							<li><a href="#!" class="text-white">Link 1</a></li>
							<li><a href="#!" class="text-white">Link 2</a></li>
							<li><a href="#!" class="text-white">Link 3</a></li>
							<li><a href="#!" class="text-white">Link 4</a></li>
						</ul>
					</div>
					<!--Grid column-->
				</div>
				<!--Grid row-->
			</section>
			<!-- Section: Links -->
		</div>
		<!-- Grid container -->

		<!-- Copyright -->
		<div class="text-center p-3"
			style="background-color: rgba(0, 0, 0, 0.2);">
			© 2020 Copyright: <a class="text-white"
				href="https://mdbootstrap.com/">MDBootstrap.com</a>
		</div>
		<!-- Copyright -->
	</footer>
	<!-- Footer -->

</body>
</html>