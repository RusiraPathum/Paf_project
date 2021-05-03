$(document).ready(function() {

	if ($("#alertSuccess").text().trim() == "") {
		$("#alertSuccess").hide();
	}
	$("#alertError").hide();

});

$("#save_project").click(function() {

	$("#alertSuccess").text("");
	$("#alertSuccess").hide();
	$("#alertError").text("");
	$("#alertError").hide();

	var status = validateItemForm();

	if (status != true) {
		$("#alertError").text(status);
		$("#alertError").show();
		return;
	} else {
		$("#alertSuccess").text("Succsessfully Added the Project Details");
		$("#alertSuccess").show();

		$('#myForm')[0].reset();

		$("#alertSuccess").fadeTo(2000, 500).slideUp(500, function() {
			$("#alertSuccess").slideUp(500);
		});
		
	}


})

function validateItemForm() {

	if ($("#project_category").val().trim() == "Select Project Category") {
		return "Select Project Category.";
	}

	if ($("#project_name").val().trim() == "") {
		return "Enter Project name.";
	}

	if ($("#short_des").val().trim() == "") {
		return "Enter Short Description.";
	}

	if ($("#price").val().trim() == "") {
		return "Enter Price.";
	}

	if ($("#date").val().trim() == "") {
		return "Enter Date.";
	}

	if ($("#long_des").val() == "") {
		return "Enter Long Description.";
	}

	if ($("#project_goal").val().trim() == "") {
		return "Enter Project Goal.";
	}
	return true;
}