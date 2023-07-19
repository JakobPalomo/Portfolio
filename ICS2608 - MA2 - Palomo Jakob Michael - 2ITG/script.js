function validateForm() {
  var x = document.forms["enrollmentForm"]["fname"].value;
  var lname=document.forms["enrollmentForm"]["lname"].value;
  var addr=document.forms["enrollmentForm"]["addr"].value;
  var city=document.forms["enrollmentForm"]["city"].value;
  var state=document.forms["enrollmentForm"]["state"].value;
  var zip=document.forms["enrollmentForm"]["zip"].value;
  var stid=document.forms["enrollmentForm"]["stid"].value;
  var prog=document.forms["enrollmentForm"]["prog"].value;
  var numb=document.forms["enrollmentForm"]["numb"].value;

  if (x == ""
  || lname == ""
  || addr == ""
  || city == ""
  || state == ""
  || zip == ""
  || stid == ""
  || prog == ""
  || numb == ""
  ) 
  {
    alert("All text fields must be filled out");
    return false;
  } else {
    if (numb.length==11){ 
      if(isNaN(numb))
        alert("Invalid Input. Your number format is wrong");
    } else
      alert("Invalid Input. Incomplete phone number");

      alert("Successful submission of form");

  }
}
