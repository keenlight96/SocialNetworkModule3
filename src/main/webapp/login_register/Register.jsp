<%--
  Created by IntelliJ IDEA.
  User: LOL
  Date: 6/30/2023
  Time: 7:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html lang="en">
<head>
    <title>Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link href="mdb.min.css">
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
</head>
<body>
<section class="vh-100 gradient-custom">
    <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                <div class="card bg-dark text-white" style="border-radius: 1rem;">
                    <form>
                        <div class="card-body text-center">
                            <div class="mb-md-3 mt-md-2 pb-5">
                                <h2 class="fw-bold text-uppercase">Register</h2>
                                <p>Please enter your information to register</p>
                                <div class="row mb-3">
                                    <div class="col">
                                        <div class="form-outline form-white">
                                            <label for="first_name"></label>
                                            <input type="text" class="form-control" id="first_name" placeholder="First Name"/>
                                        </div>
                                    </div>
                                    <div class="col">
                                        <div class="form-outline form-white">
                                            <label for="last_name"></label>
                                            <input type="text" class="form-control" id="last_name" placeholder="Last Name"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="row mb-3">
                                    <div class="col">
                                        <label for="birthday"></label>
                                        <input type="date" class="form-control" id="birthday" placeholder="Birth Day"/>

                                    </div>
                                    <div class="col">
                                        <label for="gender"></label><select class="form-select" id="gender" name="gender">
                                            <option selected>Select an option</option>
                                            <option value="option1">Male</option>
                                            <option value="option2">Female</option>
                                            <option value="option3">Other</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-outline text-white mb-3">
                                    <label for="email"></label> <input type="email" class="form-control" id="email" placeholder="Email"/>
                                </div>
                                <div class="row mb-3">
                                    <div class="col">
                                        <label for="password"></label><input type="password" class="form-control" id="password" placeholder="Password"/>
                                    </div>
                                    <div class="col">
                                        <label for="checkpassword"></label><input type="password" class="form-control" id="checkpassword" placeholder="Confirm"/>
                                    </div>
                                </div>
                                <div class="row mb-5">
                                    <div class="col">
                                        <label for="Phone"></label><input type="tel" class="form-control" id="phone" placeholder="Phone Number"/>
                                    </div>
                                    <div class="col">
                                        <label for="address"></label><input type="text" class="form-control" id="address" placeholder="Address"/>
                                    </div>
                                </div>
                                <button class="btn btn-outline-light btn-lg px-5" type="submit">Register</button>
                            </div>
                            <div>
                                <p class="mb-0">Already have an account? <a href="#!" class="text-white-50 fw-bold">Login</a></p>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>