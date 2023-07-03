<%--
  Created by IntelliJ IDEA.
  User: manhhung
  Date: 03/07/2023
  Time: 01:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
  <meta charset="UTF-8">
  <title>Register</title>
  <link rel="stylesheet" href="login.css">
  <link rel="stylesheet" href=" https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css">
  <link rel="icon" href="../asset/img/favicon.png">

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
          <div class="header__inner__form-login-logo"
               style="    margin-bottom: 0; margin-top: 30px;">
            <img src="../asset/img/logo.png"
                 style=" width: 170px; height: 50px;">
          </div>
          <div class="header__inner__form-inner">
            <form action="/user?action=create" method="post">
              <div class="form-inner">
                <div class="form-inner-1">
                  <input type="text" placeholder="Enter your account here"
                         id="userName" name="username">
                </div>
              </div>

              <div class="form-inner">
                <div class="form-inner-1">
                  <input type="password" placeholder="Enter your password here"
                         id="passWord" name="password">
                </div>
              </div>


              <div class="form-inner">
                <div class="form-inner-1">
                  <input type="password" placeholder="Confirm your password here"
                         id="passWordConfirm" name="passwordConfirm">
                </div>
              </div>


              <div class="form-inner">
                <div class="form-inner-1">
                  <input type="text" placeholder="Enter your full-name here"
                         id="fullName" name="fullName">
                </div>
              </div>

              <div class="form-inner">
                <div class="form-inner-1">
                  <input type="text" placeholder="Enter your number phone here"
                         id="numberPhone" name="numberPhone">
                </div>
              </div>

              <div class="form-inner">
                <div class="form-inner-1">
                  <input type="date" placeholder="Enter your date of birth"
                         id="dateOfBirth" name="dateOfBirth">
                </div>
              </div>

              <div class="form-inner">
                <div class="form-inner-1">
                  <input type="text" placeholder="Enter your address here"
                         id="address" name="address">
                </div>
              </div>

              <div class="form-inner">
                <button class="btn_login" type="submit"> Register</button>
              </div>

            </form>
          </div>
        </div>
        <div class="header__inner__form-register" style="height: 20px">
          <p>Go to <a href="login.jsp"> Login here</a></p>
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
