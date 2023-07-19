<!DOCTYPE html>
<head>
<title>Scholarship Form</title>
<meta http-equiv="content-type" content="text/html"; charset=iso-8859-1 />
</head>
<body>
<p>
<?php
$firstName = $_POST['fName'];
$lastName = $_POST['lName'];
echo "Thank you for filling out the scholarship form, ".$firstName." ".$lastName. ".";
?>
</p>
</body>
</html>