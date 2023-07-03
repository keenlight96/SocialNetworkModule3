<%--
  Created by IntelliJ IDEA.
  User: LOL
  Date: 6/28/2023
  Time: 3:35 PM
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
    <title>Register</title>
</head>
<body>
<section class="vh-100 gradient-custom">
    <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                <div class="card bg-dark text-white" style="border-radius: 1rem;">
                    <div class="card-body p-5 text-center">
                        <div class="mb-md-1 mt-md-1 pb-2">
                            <form action="/register" method="post">
                                <h2 class="fw-bold mb-1 text-uppercase">Register</h2>
                                <% if (request.getAttribute("usernameExist") != null && (boolean) request.getAttribute("usernameExist")) { %>
                                <div class="alert alert-danger" role="alert">
                                    Tên đăng nhập đã tồn tại. Vui lòng chọn tên đăng nhập khác.
                                </div>
                                <% } %>
                                <div class="form-outline form-white mb-4">
                                    <label for="typeUsernameX"></label><input name="username" type="text"
                                                                              id="typeUsernameX"
                                                                              class="form-control form-control-lg"
                                                                              placeholder="Username"
                                                                              value="${username}"/>
                                </div>
                                <div class="form-outline form-white mb-4">
                                    <div class="row">
                                        <div class="col">
                                            <label for="typePasswordX"></label><input name="password" type="password"
                                                                                      id="typePasswordX"
                                                                                      class="form-control form-control-lg"
                                                                                      placeholder="Password"/>
                                        </div>
                                        <div class="col">
                                            <label for="typeConfirmPasswordX"></label><input name="confirmPassword"
                                                                                             type="password"
                                                                                             id="typeConfirmPasswordX"
                                                                                             class="form-control form-control-lg"
                                                                                             placeholder="Confirm password"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-outline form-white mb-4">
                                    <div class="row">
                                        <div class="col">
                                            <label for="typeFirstNameX"></label><input name="firstName" type="text"
                                                                                       id="typeFirstNameX"
                                                                                       class="form-control form-control-lg"
                                                                                       placeholder="First name"
                                                                                       value="${firstName}"/>
                                        </div>
                                        <div class="col">
                                            <label for="typeLastNameX"></label><input name="lastName" type="text"
                                                                                      id="typeLastNameX"
                                                                                      class="form-control form-control-lg"
                                                                                      placeholder="Last name"
                                                                                      value="${lastName}"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-outline form-white mb-4">
                                    <label for="typeEmailX"></label><input name="email" type="email" id="typeEmailX"
                                                                           class="form-control form-control-lg"
                                                                           placeholder="Email"
                                                                           value="${email}"/>
                                </div>
                                <div class="form-outline form-white mb-4">
                                    <div class="row">
                                        <div class="col">
                                            <select name="dayOfBirth" class="text-dark form-select"
                                                    id="selectDayOfBirthdayX" aria-label="Birthday">
                                                <option class="text-black-50" selected value="1">1</option>
                                                <c:forEach var="day" begin="2" end="31">
                                                    <option value="${day}">${day}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                        <div class="col">
                                            <select name="monthOfBirth" class="text-dark form-select"
                                                    id="selectMonthOfBirthdayX" aria-label="Birthday">
                                                <option class="text-black-50" selected value="1">January</option>
                                                <option value="2">February</option>
                                                <option value="3">March</option>
                                                <option value="4">April</option>
                                                <option value="5">May</option>
                                                <option value="6">June</option>
                                                <option value="7">July</option>
                                                <option value="8">August</option>
                                                <option value="9">September</option>
                                                <option value="10">October</option>
                                                <option value="11">November</option>
                                                <option value="12">December</option>
                                            </select>
                                        </div>
                                        <div class="col">
                                            <select name="yearOfBirth" class="text-dark form-select"
                                                    id="selectYearOfBirthdayX" aria-label="Birthday">
                                                <c:forEach var="year" begin="1900" end="2022">
                                                    <option value="${year}">${year}</option>
                                                </c:forEach>
                                                <option selected value="2023">2023</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <%--                                <div class="form-outline form-white mb-4">--%>
                                <%--                                    <div class="row">--%>
                                <%--                                        <div class="col">--%>
                                <%--                                            <div class="form-check">--%>
                                <%--                                                <input class="form-check-input" type="radio" name="gender"--%>
                                <%--                                                       id="genderMale">--%>
                                <%--                                                <label class="form-check-label" for="genderMale">--%>
                                <%--                                                    Male--%>
                                <%--                                                </label>--%>
                                <%--                                            </div>--%>
                                <%--                                        </div>--%>
                                <%--                                        <div class="col">--%>
                                <%--                                            <div class="form-check">--%>
                                <%--                                                <input class="form-check-input" type="radio" name="gender"--%>
                                <%--                                                       id="genderFemale">--%>
                                <%--                                                <label class="form-check-label" for="genderFemale">--%>
                                <%--                                                    Female--%>
                                <%--                                                </label>--%>
                                <%--                                            </div>--%>
                                <%--                                        </div>--%>
                                <%--                                        <div class="col">--%>
                                <%--                                            <div class="form-check">--%>
                                <%--                                                <input class="form-check-input" type="radio" name="gender"--%>
                                <%--                                                       id="genderNonbinary">--%>
                                <%--                                                <label class="form-check-label" for="genderNonbinary">--%>
                                <%--                                                    Nonbinary--%>
                                <%--                                                </label>--%>
                                <%--                                            </div>--%>
                                <%--                                        </div>--%>
                                <%--                                    </div>--%>
                                <%--                                </div>--%>
                                <div class="form-outline form-white mb-4">
                                    <div class="row">
                                        <div class="col">
                                            <input type="radio" class="btn-check" name="gender" id="male"
                                                   autocomplete="off" value="male" required>
                                            <label class="btn btn-sm btn-outline-light" style="width: 125px" for="male">Male</label>
                                        </div>
                                        <div class="col">
                                            <input type="radio" class="btn-check" name="gender" id="female"
                                                   autocomplete="off" value="female" required>
                                            <label class="btn btn-sm btn-outline-light" style="width: 125px"
                                                   for="female">Female</label>
                                        </div>
                                        <div class="col">
                                            <input type="radio" class="btn-check" name="gender" id="nonbinary"
                                                   autocomplete="off" value="nonbinary" required>
                                            <label class="btn btn-sm btn-outline-light" style="width: 125px"
                                                   for="nonbinary">Nonbinary</label>
                                        </div>

                                    </div>
                                </div>
                                <button class="btn btn-outline-light btn-lg px-5" type="submit">Register</button>
                            </form>
                        </div>
                        <div>
                            <p class="mb-0">Already had an account? <a href="/login"
                                                                       class="text-white-50 fw-bold">Login</a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
<script>
    (function () {
        'use strict'
        const forms = document.querySelectorAll('.requires-validation')
        Array.from(forms)
            .forEach(function (form) {
                form.addEventListener('submit', function (event) {
                    if (!form.checkValidity()) {
                        event.preventDefault()
                        event.stopPropagation()
                    }

                    form.classList.add('was-validated')
                }, false)
            })
    })()
</script>
</html>

