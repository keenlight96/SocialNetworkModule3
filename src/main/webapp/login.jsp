<%--
  Created by IntelliJ IDEA.
  User: LOL
  Date: 6/28/2023
  Time: 3:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
    .gradient-custom {
        /* fallback for old browsers */
        background: #6a11cb;

        /* Chrome 10-25, Safari 5.1-6 */
        background: -webkit-linear-gradient(to right, rgba(106, 17, 203, 1), rgba(37, 117, 252, 1));

        /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
        background: linear-gradient(to right, rgba(106, 17, 203, 1), rgba(37, 117, 252, 1))
    }
</style>
<html>
<head>
    <title>Login</title>
</head>
<body>
<section class="vh-100 gradient-custom">
    <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                <div class="card bg-dark text-white" style="border-radius: 1rem;">
                    <div class="card-body p-5 text-center">
                        <div class="mb-md-5 mt-md-4 pb-5">
                            <form action="/login" method="post" class="requires-validation" novalidate>
                                <h2 class="fw-bold mb-2 text-uppercase">Login</h2>
                                <p class="text-white-50 mb-5">Please enter your login and password!</p>
                                <div class="form-outline form-white mb-4">
                                    <label for="typeEmail_UsernameX"></label><input type="text" id="typeEmail_UsernameX"
                                                                                    class="form-control form-control-lg"
                                                                                    placeholder="Email/Username"
                                                                                    name="email_username"
                                                                                    value="${email_username}" required/>
                                    <div class="invalid-feedback">
                                        Please provide a valid email or username.
                                    </div>
                                </div>
                                <div class="form-outline form-white mb-4">
                                    <label for="typePasswordX"></label><input type="password" id="typePasswordX"
                                                                              class="form-control form-control-lg"
                                                                              placeholder="PassWord"
                                                                              name="password" required/>
                                    <div class="invalid-feedback">
                                        Please provide a password.
                                    </div>
                                </div>
                                <p class="small mb-5 pb-lg-2"><a class="text-white-50" href="#!">Forgot password?</a>
                                </p>

                                <button class="btn btn-outline-light btn-lg px-5" type="submit">Login</button>
                            </form>
                        </div>
                        <div>
                            <p class="mb-0">Don't have an account? <a href="/register" class="text-white-50 fw-bold">Sign
                                Up</a>
                            </p>
                        </div>
                        <% if (request.getAttribute("usernameExist") != null && (boolean) request.getAttribute("usernameExist")) { %>
                        <div class="alert alert-danger" role="alert">
                            Tên đăng nhập đã tồn tại. Vui lòng chọn tên đăng nhập khác.
                        </div>
                        <% } %>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>

