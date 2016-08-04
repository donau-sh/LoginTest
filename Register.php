<?php
	//$con = mysqli_connect("my_host", "my_user", "my_password", "my_db");
	$con = mysqli_connect("mysql1.000webhost.com", "a4125921_user", "gmw_123", "a4125921_data01");

	$name = $_POST["name"];
	$age = $_POST["age"];
	$username = $_POST["username"];
	$password = $_POST["password"];

	$statement = mysqli_prepare($con, "INSERT INTO user (name, age, username, password) VALUES (?, ?, ?, ?)");
	mysqli_stmt_bind_param($statement, "siss", $name, $age, $username, $password);
	mysqli_stmt_execute($statement);

	$response = array();
	$response["success"] = true;

	echo json_encode($response); 
?>