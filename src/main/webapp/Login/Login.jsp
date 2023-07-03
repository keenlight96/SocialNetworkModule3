<%--
  Created by IntelliJ IDEA.
  User: manhhung
  Date: 03/07/2023
  Time: 01:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html >
<head>
  <meta charset="UTF-8">
  <title>Login</title>
  <link rel="stylesheet" href=" https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css">
  <link rel="icon" href="../asset/img/favicon.png">
  <link rel="stylesheet" href="Login.css">

</head>
<body>
<div class="main">
  <div class="header">
    <div class="header__inner">
      <div class="header__inner__img">
        <div class="header__inner__img_inner">
          <img src="../asset/img/Screenshot%202023-06-03%20125133.png"
               style=" width: 430px; height: 580px;">
        </div>
      </div>
      <div class="header__inner__form">
        <div class="header__inner__form-login">
          <div class="header__inner__form-login-logo">
            <img src="../asset/img/logo.png"
                 style=" width: 170px; height: 50px;">
          </div>
          <div class="header__inner__form-inner">
            <form action="/login?action=login" method="post">
              <div class="form-inner">
                <div class="form-inner-1">
                  <input type="text" placeholder="Enter your account here" id="userName" name="userName">
                </div>
              </div>

              <div class="form-inner">
                <div class="form-inner-1">
                  <input type="password" placeholder="Enter your password here" id="passWord" name="passWord">
                </div>
              </div>

              <div class="form-inner">
                <button class="btn_login" type="submit"> Login here</button>
              </div>
              <div class="form-inner">
                <div class="form-inner-other"> ----- Other by -----</div>
              </div>
              <div class="form-inner">
                <div class="form-inner-other-login">
                  <div class="form-inner-other-login-icon">
                    <i class="fa-brands fa-square-facebook"
                       style="color: #1554c1; width: 20px; height: 16px; font-size: 20px"></i>
                  </div>
                  <div class="form-inner-other-login-text">
                    Login with Facebook
                  </div>
                </div>
              </div>
              <div class="form-inner">
                <div class="form-inner-other-login-forgot">
                  Forgot password ?
                </div>
              </div>
            </form>
          </div>
        </div>
        <div class="header__inner__form-register">
          <p>You don't have an account yet? <a href="/user?action=create"> Register here</a></p>
        </div>
        <div class="header__inner__form-pr">
          <div class="form-pr-text">Get the app.</div>
          <div class="form-pr-img">
            <img src="../asset/img/Screenshot%202023-06-03%20142005.png" style="width: 250px;height: 65px">
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="footer">
    <div>
      <img src="../asset/img/footer.png">
    </div>
  </div>
</div>


</body>
</html>

