<%--
  Created by IntelliJ IDEA.
  User: LOL
  Date: 7/1/2023
  Time: 7:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>OTP</title>
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.11.2/css/all.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

  <!--    Google Fonts Roboto-->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&display=swap">
  <style>
    .mt-custom {
      margin-top: 120px;
    }
    .gradient-custom {
      /* fallback for old browsers */
      background: #6a11cb;

      /* Chrome 10-25, Safari 5.1-6 */
      background: -webkit-linear-gradient(to right, rgba(106, 17, 203, 1), rgba(37, 117, 252, 1));

      /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
      background: linear-gradient(to right, rgba(106, 17, 203, 1), rgba(37, 117, 252, 1))
    }
  </style>
</head>
<body class="gradient-custom">
<div class="container">
  <div class="row d-flex justify-content-center mt-custom">
    <div class="col-md-5 col-md-offset-7 mt-custom">
      <div class="card bg-dark text-white" style="border-radius: 2rem;">
        <div class="panel panel-default">
          <div class="panel-body">
            <div class="text-center mb-2">
              <h3>
                <i class="fa fa-lock fa-4x"></i>
              </h3>
              <h2 class="text-center">Enter OTP</h2>
              <%
                if (request.getAttribute("message") != null) {
                  out.print("<p class='text-danger ml-1'>" + request.getAttribute("message") + "</p>");
                }
              %>
              <div class="panel-body">
                <form id="register-form" autocomplete="off"
                      class="form" method="post">
                  <div class="form-group mb-4">
                    <div class="list-unstyled">
											<span class="input-group-addon"><i
                                                    class="glyphicon glyphicon-envelope color-blue"></i></span>
                      <label for="opt">
                        <input id="opt" name="otp" placeholder="Enter OTP"
                               class="form-control" type="text" required="required">
                      </label>
                    </div>
                  </div>
                  <div class="form-group">
                    <button class="btn btn-outline-light btn-lg px-5" type="submit">Register</button>
                  </div>
                  <input type="hidden" class="hide" name="token" id="token"
                         value="">
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
</body>
</html>

