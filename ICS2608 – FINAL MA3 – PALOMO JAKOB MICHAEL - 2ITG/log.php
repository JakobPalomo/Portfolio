<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Blinker&display=swap" rel="stylesheet">
        
        <!-- Bootstrap -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        
        
    </head>

    <body>
      <link href="design.css" rel="stylesheet">
        <!-- As a link -->
        <nav class="navbar navbar-expand-lg">
            <div class="container-fluid">
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <!-- Navbar -->
              <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                  <h1 class="display-4"><img src="bandw.png" alt="logo" width="100" height="100" id="logo"> Quizlee Questionnaires</h1>
                  
                 
                </div>
                
              </div>
            </div>
            <a class="nav-link active; w3-bar-item w3-button" aria-current="page" href="homepage.html" style ="color:white"><h3>Back to Home</h3> </a>
          </nav>
          <br>
        <div class="row">

            <div class="col-sm-3"></div>
            <div class="col-lg-6">
                <form name="enrollmentForm" id="enform" onsubmit="return validateForm()" method="post" required>
                    <fieldset id="Contact">
                        <!--Contact Information-->
                    </br>
                        <legend><center> <img src ="bandw.png" alt = "logo" width="100" height="100" id="logo"></center> </legend>
                        <center><h3>Quizlee Questionnaires</br>Login</h3></center>
                        
                        </br>
                        <div class="input-group mb-3">
                            <input type="text" class="form-control" placeholder="Username" aria-label="Uername" aria-describedby="basic-addon1" name="Username" required>
                        </div>

                        <div class="input-group" id="show_hide_password">
                            <input class="form-control" type="password" placeholder ="Password" name="Password" required>
                          
                          </div>
                          <br>
                          <button type="submit" input name="Submit" type="submit" value="Login" class="btn btn-warning"><h1>Login</h1></button>
                          

                        
                        
                    </fieldset>
                  </form>

                    
                  
                  <center>(Only up to 3 times)</center>
                  
                </div>
                       
                </div> 

    </body>
  
</html>

<?php session_start(); 

if(!isset($_POST['Submit'])){
  $_SESSION['login_attempts']=0;
}
else {
  if($_SESSION['login_attempts']<3){
    if(isset($_POST['Submit'])){
      /* Define username and password in array */
      $logins = array('ICS2608' => 'correct');
  
      /* check assigned variables*/
      $Username = isset($_POST['Username']) ? $_POST['Username'] : '';
      $Password = isset($_POST['Password']) ? $_POST['Password'] : '';
      
      /* Check Username and Password existence in defined array */            
      if (isset($logins[$Username]) && $logins[$Username] == $Password){
              /* Success, set session variables and redirect to quiz  */
              $_SESSION['UserData']['Username']=$logins[$Username];
              header("location:quizresult.php");
              exit;
      } else { 
              /*error message */
              $_SESSION['login_attempts']++;
              echo '<script>alert("error wrong credentials");</script>';
      } 
      if ($_SESSION['login_attempts']>=3){

        echo '<script>
          alert("Max Attempts Reached!");
        window.location.href="homepage.html";
          </script>';
        //echo '<script>alert("Max Attempts Reached!");</script>';
        //header("location:homepage.html");
      }
  
    
  }
  }
  
}      
    
?>
