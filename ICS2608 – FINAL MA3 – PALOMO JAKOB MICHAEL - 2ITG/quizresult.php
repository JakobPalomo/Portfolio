<?php session_start(); /* Starts the session */

if(!isset($_SESSION['UserData']['Username'])){
        header("location:log.php");
        exit;
}
?>
<!DOCTYPE html>
<html>
    <head>
        <title>Quiz</title>
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
            <legend><center> <img src ="bandw.png" alt = "logo" width="100" height="100" id="logo"></center> </legend>
            <center><h3>Quizlee Questionnaires</br>ICS2608 Quiz</h3></center></br>
            <div id="quiz"></br>
            
            1. Javascript was created by</br>
            <input type="radio"name="q1">Steve Jobs </br>
            <input type="radio"name="q1" id="correct1">Brendan Eich </br>
            <input type="radio"name="q1">Bill Gates</br>

            </br>2. A way of placing JavaScript code</br>
            <input type="radio"name="q2">Outside </br>
            <input type="radio"name="q2">Sideways</br>
            <input type="radio"name="q2"id="correct2">Embedded</br>

            </br>3. Javascript makes webpages more dynamic and interactive</br>
            <input type="radio"name="q3"id="correct3">True</br>
            <input type="radio"name="q3">False</br>
            
            </br>4. Javascript and Java are the same language</br>
            <input type="radio"name="q4">True</br>
            <input type="radio"name="q4" id="correct4">False</br>

          <form name="myForm">

          </br>5. Characteristic that can modify a page without posting back to the server (no caps)</br>
            <input type="text" name="q5"></br>

            </br>6. Embedded Javascript refers to the practive of placing JavaScript code within ___ element</br>
            <input type="text" name="q6"></br>
            </br>
          </form>
          </br></br><center><input type="submit" name="submit" value="Submit Quiz" onclick="result()"></center>
          </div>
            
            <h2 id="out" style="color: red"></h2></br>
            
            <script type="text/javascript">
                function result(){
                  var score=0;
                  const outt = document.getElementById('out');
                  const qui = document.getElementById('quiz');
                  
                  if (document.getElementById('correct1').checked){
                    score++;
                  }
                  if (document.getElementById('correct2').checked){
                    score++;
                  }
                  if (document.getElementById('correct3').checked){
                    score++;
                  }
                  if (document.getElementById('correct4').checked){
                    score++;
                  }
                  score+=myfun();
                  if (score>3) {
                    outt.innerHTML = "Total items: 6 <br/>Your score is "+ score + "/6<br/>Percentage is: "+(score/6)*100+"%<br/>Remark: Pass";
                    qui.innerHTML = "";
                  } else{
                    outt.innerHTML = "Total items: 6 <br/>Your score is "+ score + "/6<br/>Percentage is: "+(score/6)*100+"%<br/>Remark: Fail";
                    qui.innerHTML = "";
                  }
                    
                  
                  
                }
                function myfun(){
                  var score=0;
                  var v1=document.myForm.q5.value;
                  var v2=document.myForm.q6.value;

                  if (v1=="usability") {
                    score++;
                  }
                  if (v2=="<script>") {
                    score++;
                  }
                  return score;
                }

            </script>
            </br></br>
                    <center><a class="navbar-brand" href="homepage.html" ><button type="button">Back home</button></a></br></br></center>
                  </div>     
                  </div>  

    </body>


</html>
