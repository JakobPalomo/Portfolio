<style>
  .user-img{
      position: absolute;
      height: 27px;
      width: 27px;
      object-fit: cover;
      left: -7%;
      top: -12%;
  }
  .user-dd:hover{
    color:#fff !important
  }
</style>
<nav class="navbar navbar-light navbar-expand-lg navigation-clean-button" style="color: rgb(51, 51, 51);background: #37577c;">
            <!--<div class="container px-4 px-lg-5 ">-->
            <div class="container"><a class="navbar-brand" href="#" style="color: rgb(255,255,255);font-family: Blinker, sans-serif;font-size: 24px;"><img src="../univ/uploads/logo.png" style="height: 60px;">
                <button class="navbar-toggler btn btn-sm" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <a class="navbar-brand text-white" style="color: var(--bs-white);font-family: Blinker, sans-serif;font-size: 30px;" href="./">
               
                <?php echo $_settings->info('short_name') ?>
                </a>
                
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
                        <li class="nav-item"><a class="nav-link text-white" aria-current="page" style="color: var(--bs-white);font-family: Blinker, sans-serif;font-size: 18px;" href="./">Home</a></li>
                        <li class="nav-item"><a class="nav-link text-white" aria-current="page"style="color: var(--bs-white);font-family: Blinker, sans-serif;font-size: 18px;" href="./?p=categories">Topic Categories</a></li>
                        <li class="nav-item"><a class="nav-link text-white" style="color: var(--bs-white);font-family: Blinker, sans-serif;font-size: 18px;" href="./?p=about">About</a></li>
                        <?php if($_settings->userdata('id') != '' && $_settings->userdata('type') == 2): ?>
                        <li class="nav-item"><a class="nav-link text-white" aria-current="page" style="color: var(--bs-white);font-family: Blinker, sans-serif;font-size: 18px;" href="./?p=posts">My Posts</a></li>
                        <li class="nav-item"><a class="nav-link text-white" aria-current="page" style="color: var(--bs-white);font-family: Blinker, sans-serif;font-size: 18px;" href="./?p=posts/manage_post"><i class="far fa-plus-square"></i> Create Post</a></li>
                        <?php endif; ?>
                    </ul>
                    <div class="d-flex align-items-center">
                        <?php if($_settings->userdata('id') > 0 && $_settings->userdata('type') == 2): ?>
                          <div class="btn-group">
                            <button type="button" class="btn btn-rounded badge badge-light dropdown-toggle dropdown-icon user-dd" data-toggle="dropdown">
                              <span class="ml-3" style="color: var(--bs-white);font-family: Blinker, sans-serif;font-size: 20px;" ><?php echo ($_settings->userdata('username')) ?></span>
                              <span class="sr-only">Toggle Dropdown</span>
                            </button>
                            <div class="dropdown-menu" role="menu">
                              <a class="dropdown-item" href="<?php echo base_url.'./?p=user' ?>"><span class="fa fa-user"></span> My Account</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="<?php echo base_url.'/classes/Login.php?f=logout_user' ?>"><span class="fas fa-sign-out-alt"></span> Logout</a>
                            </div>
                        </div>
                        <?php else: ?>
                        <a class="font-weight-bolder text-light pr-3 mx-2 text-decoration-none border-right" href="./login.php">Login</a>
                        <a class="font-weight-bolder text-light pr-3 mx-2 text-decoration-none " href="./register.php">Register</a>
                     
                        <?php endif; ?>
                    </div>
                </div>
            </div>
        </nav>
<script>
  $(function(){
    $('#login-btn').click(function(){
      uni_modal("","login.php")
    })
    $('#navbarResponsive').on('show.bs.collapse', function () {
        $('#mainNav').addClass('navbar-shrink')
    })
    $('#navbarResponsive').on('hidden.bs.collapse', function () {
        if($('body').offset.top == 0)
          $('#mainNav').removeClass('navbar-shrink')
    })
  })

  $('#search-form').submit(function(e){
    e.preventDefault()
     var sTxt = $('[name="search"]').val()
     if(sTxt != '')
      location.href = './?p=products&search='+sTxt;
  })
</script>