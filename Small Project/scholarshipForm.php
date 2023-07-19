<!DOCTYPE html>
<head>
<title>Scholarship Form</title>
<meta http-equiv="content-type" content="text/html"; charset=iso-8859-1 />
</head>
<body>
<p>
<?php
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
    echo "Please use the \"Back\" button to re-enter the data.<br/>\n";
else
    echo "Thank you for filling out the scholarship form, ".$firstName." ".$lastName. ".";
?>
</p>
</body>
</html>