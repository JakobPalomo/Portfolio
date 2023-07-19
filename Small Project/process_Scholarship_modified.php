<!DOCTYPE html>
<head>
<title>Scholarship Form</title>
<meta http-equiv="content-type" content="text/html"; charset=iso-8859-1 />
</head>
<body>
<p>
<?php
function redisplayForm($firstName, $lastName)
{
?>
<h2 style = "text-align:center">Scholarship Form<p></h2>
<form name="scholarship" action="process_Scholarship_modify.php" method="post">
<p>First Name: <input type = "text" name="fName"
value="<?php echo $firstName; ?>"/> </p>
<p>Last Name: <input type = "text" name="lName"
value="<?php echo $lastName; ?>"/> </p>
<p> <input type="reset" value="Clear Form" /> &nbsp; &nbsp; <input type="submit"
value="Send Form" />
</form>
<?php
}
function displayRequired($fieldame)
{
echo "The field \"$fieldName\" is required<br/>\n";
}
function validateInput($data, $fieldName)
{
global $errorCount;
if (empty($data))
{
displayRequired($fieldName);
++$errorCount;
$retval = "";
}
else
{
$retval = trim($data);
$retval = stripslashes($retval);
}
return ($retval);
}
$errorCount = 0;
$firstName = validateInput($_POST['fName'], "First name");
$lastName = validateInput($_POST['lName'], "Last name");
if ($errorCount > 0)
{
echo "Please re-enter the information below.<br/>\n" ;
redisplayForm($firstName, $lastName);
}
else
{
echo "Thank you for filling out the scholarship form, ".$firstName." ".$lastName. ".";
}
?>
</p>
</body>
</html>