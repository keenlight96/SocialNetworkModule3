<%--
  Created by IntelliJ IDEA.
  User: LOL
  Date: 6/30/2023
  Time: 4:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta http-equiv="x-ua-compatible" content="ie=edge"/>
    <title>Material Design for Bootstrap</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
    />
    <link
            rel="stylesheet"
            href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap"
    />
    <link rel="stylesheet" type="text/css"
          href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.8.1/slick.min.css">
    <link rel="stylesheet" type="text/css"
          href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.8.1/slick-theme.min.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.8.1/slick.min.js"></script>
    <link rel="stylesheet" href="mdb.min.css"/>
    <style>
        .nav-link i {
            margin-right: 10px;
        }

        .nav-link svg {
            margin-right: 7px;
        }

        .nav-link img {
            margin-right: 6px;
        }

        #story {
            background-color: #ffffff;
            margin: auto;
            /*border: 1px solid ;*/
            height: 110px;
            border-radius: 5px;
            overflow: hidden;
            position: relative;
        }

        .story {
            border-radius: 50%;
        }

        .story-container {
            list-style-type: none;
            display: flex;
            overflow-y: auto;
            padding: 15px;
        }

        .story-container ul li {
            padding: 0 10px;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        }

        .story-container ul li .story {
            padding: 0;
            background: linear-gradient(
                    45deg,
                    #f09433,
                    #e6683c,
                    #dc2743,
                    #cc2366,
                    #bc1888
            );
        }

        body {
            font-family: "Calibri Light", "Engravers MT", 'sans-serif';
        }

        .far {
            outline: white;
            padding: 1px;
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-2 bg-dark fixed-top" style="height: 100vh;">
            <h3 style="margin-top: 50px; margin-left: 30px;font-size: 32px;color: white;
           font-family:Vivaldi,sans-serif">Vivu Chat</h3>
            <ul class="nav flex-column ml-3 mt-4" style="font-size: 20px">
                <li class="nav-item mb-2">
                    <a class="nav-link text-white" href="#"><i class="fas fa-home"></i> Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white mb-2" href="#"> <i class="fas fa-search"></i> Search</a>
                </li>
                <li class="nav-item mb-2">
                    <a class="nav-link text-white" href="#">
                        <svg fill="rgb(245, 245, 245)" height="24" role="img"
                             viewBox="0 0 24 24" width="24">
                            <path d="m13.173 13.164 1.491-3.829-3.83 1.49ZM12.001.5a11.5 11.5 0 1 0 11.5 11.5A11.513 11.513 0 0 0 12.001.5Zm5.35 7.443-2.478 6.369a1 1 0 0 1-.57.569l-6.36 2.47a1 1 0 0 1-1.294-1.294l2.48-6.369a1 1 0 0 1 .57-.569l6.359-2.47a1 1 0 0 1 1.294 1.294Z"></path>
                        </svg>
                        Explore</a>
                </li>
                <li class="nav-item mb-2">
                    <a class="nav-link text-white" href="#"><i class="fas fa-clapperboard"></i> Reals</a>
                </li>
                <li class="nav-item mb-2">
                    <a class="nav-link text-white" href="#"><i class="far fa-paper-plane"></i> Messenger</a>
                </li>
                <li class="nav-item mb-2">
                    <a class="nav-link text-white" href="#"><i class="fas fa-heart"></i> Notifications</a>
                </li>
                <li class="nav-item mb-2">
                    <a class="nav-link text-white" href="#"><i class="far fa-square-plus"></i> Create</a>
                </li>
                <li class="nav-item mb-2">
                    <a class="nav-link text-white" href="#"><img
                            src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                            class="rounded-circle" height="30"
                            alt="Avatar"> Profile</a>
                </li>
            </ul>
            <div class="btn-group dropup" style="position: absolute; left: 20px; bottom: 50px; width:25%;">
                <button type="button" class="btn btn-black dropdown-toggle" data-mdb-toggle="dropdown"
                        aria-expanded="false">
                    <i class="fas fa-bars float-lg-start" style="font-size: 20px"></i>
                </button>
                <ul class="dropdown-menu" style="width: 100%;">
                    <li>
                        <hr class="dropdown-divider"/>
                    </li>
                    <li><a class="dropdown-item" href="#">Log out</a></li>
                </ul>
            </div>
        </div>
        <div class="col-md-7" style="border: 1px solid;background:black;margin-left: auto">
            <div class="col-md-8" style="margin-left: 140px">
                <!-- Phần nội dung -->
                <div class="story-container bg-black mt-3" id="story">
                    <ul>
                        <li>
                            <div class="story">
                                <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                     class="rounded-circle" height="40" alt="Avatar">
                            </div>
                            <span>holy</span>
                        </li>
                    </ul>
                    <ul>
                        <li>
                            <div class="story">
                                <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                     class="rounded-circle" height="40" alt="Avatar">
                            </div>
                            <span>holy</span>
                        </li>
                    </ul>
                    <ul>
                        <li>
                            <div class="story">
                                <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                     class="rounded-circle" height="40" alt="Avatar">
                            </div>
                            <span>holy</span>
                        </li>
                    </ul>
                    <ul>
                        <li>
                            <div class="story">
                                <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                     class="rounded-circle" height="40" alt="Avatar">
                            </div>
                            <span>holy</span>
                        </li>
                    </ul>
                    <ul>
                        <li>
                            <div class="story">
                                <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                     class="rounded-circle" height="40" alt="Avatar">
                            </div>
                            <span>holy</span>
                        </li>
                    </ul>
                    <ul>
                        <li>
                            <div class="story">
                                <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                     class="rounded-circle" height="40" alt="Avatar">
                            </div>
                            <span>holy</span>
                        </li>
                    </ul>
                    <ul>
                        <li>
                            <div class="story">
                                <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                     class="rounded-circle" height="40" alt="Avatar">
                            </div>
                            <span>holy</span>
                        </li>
                    </ul>
                    <ul>
                        <li>
                            <div class="story">
                                <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                     class="rounded-circle" height="40" alt="Avatar">
                            </div>
                            <span>holy</span>
                        </li>
                    </ul>
                    <ul>
                        <li>
                            <div class="story">
                                <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                     class="rounded-circle" height="40" alt="Avatar">
                            </div>
                            <span>holy</span>
                        </li>
                    </ul>
                    <ul>
                        <li>
                            <div class="story">
                                <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                     class="rounded-circle" height="40" alt="Avatar">
                            </div>
                            <span>holy</span>
                        </li>
                    </ul>
                    <ul>
                        <li>
                            <div class="story">
                                <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                     class="rounded-circle" height="40" alt="Avatar">
                            </div>
                            <span>holy</span>
                        </li>
                    </ul>
                    <ul>
                        <li>
                            <div class="story">
                                <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                     class="rounded-circle" height="40" alt="Avatar">
                            </div>
                            <span>holy</span>
                        </li>
                    </ul>
                    <ul>
                        <li>
                            <div class="story">
                                <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                     class="rounded-circle" height="40" alt="Avatar">
                            </div>
                            <span>holy</span>
                        </li>
                    </ul>
                    <ul>
                        <li>
                            <div class="story">
                                <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                     class="rounded-circle" height="40" alt="Avatar">
                            </div>
                            <span>holy</span>
                        </li>
                    </ul>
                    <ul>
                        <li>
                            <div class="story">
                                <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                     class="rounded-circle" height="40" alt="Avatar">
                            </div>
                            <span>holy</span>
                        </li>
                    </ul>
                    <ul>
                        <li>
                            <div class="story">
                                <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                     class="rounded-circle" height="40" alt="Avatar">
                            </div>
                            <span>holy</span>
                        </li>
                    </ul>
                    <ul>
                        <li>
                            <div class="story">
                                <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                     class="rounded-circle" height="40" alt="Avatar">
                            </div>
                            <span>holy</span>
                        </li>
                    </ul>
                    <ul>
                        <li>
                            <div class="story">
                                <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                     class="rounded-circle" height="40" alt="Avatar">
                            </div>
                            <span>holy</span>
                        </li>
                    </ul>
                </div>
                <!--                Port-->
                <div class="newsfeed my-2">
                    <div class="post">
                        <div class="card">
                            <!--                            Tiêu đề bài Port-->
                            <div class="card-body" style="padding: 8px">
                                <div class="container">
                                    <div class=" row">
                                        <div class="col-md-8">
                                            <div class="story">
                                                <div class="d-flex story">
                                                    <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                                         class="rounded-circle" height="50"
                                                         alt="Avatar">
                                                    <div class="mt-2">
                                                        <a href="" class="text-dark"></a>
                                                        <strong class="mt-5 m-lg-2">Holy</strong>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <i class="fas fa-ellipsis-h fa-lf mt-2 float-lg-end"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div
                                class="bg-image hover-overlay ripple shadow-1-strong rounded-0"
                                data-color="light">
                            <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                 alt=""
                                 class="w-100 rounded-3">
                            <a href="#">
                                <div class="mask" style="background-color: rgba(251,251,251,0.2)">
                                </div>
                            </a>
                        </div>
                        <div class="card-body">
                            <div class="container" style="color: white">
                                <div class="row mt-2">
                                    <div class="col-md-8">
                                        <i class="far fa-heart fa-lg m-lg-1" style="color: white" href="#"></i>
                                        <i class="far fa-comment fa-lg mx-2" style="color: white" href="#"></i>
                                        <i class=" far fa-paper-plane fa-lg" style="color: white" href="#"></i>
                                    </div>
                                    <div class="col-md-4 text-end">
                                        <i class=" far fa-bookmark fa-lg" style="color: white"></i>
                                    </div>
                                </div>
                                <div class="row mt-1">
                                    <div class="col-md-8 mt-1">
                                        <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                             class="rounded-circle" alt="Avatar" style="width: 20px">
                                        <small>Like by
                                            <strong>janet_t</strong> and<strong> 500,678</strong></small>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class=" col-md-12 mt-1">
                                        <p>
                                            <strong class="text-dark">julat.org</strong> I LOVE YOU
                                            <small>more</small>
                                        </p>
                                    </div>
                                </div>
                                <div class="row">
                                    <small class="my-0">View all 2137 comment</small>
                                    <p class="mb-0">
                                        <strong class="text-dark">alex_123</strong> Lorn,input
                                    </p>
                                </div>
                                <div class="row mt-2">
                                    <div class="col-md-11">
                                        <div class="form-outline">
                                                <textarea class="form-control"
                                                          style="border: none;padding: 0;background-color: transparent;resize: none;outline: none"
                                                          aria-label="Add a comment"
                                                          placeholder="Add a comment" rows="1"></textarea>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <hr style="color: white">
                </div>
                <div class="newsfeed my-2">
                    <div class="post">
                        <div class="card">
                            <div class="card-body" style="padding: 8px">
                                <div class="container">
                                    <div class=" row">
                                        <div class="col-md-8">
                                            <div class="story">
                                                <div class="d-flex story">
                                                    <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                                         class="rounded-circle" height="50"
                                                         alt="Avatar">
                                                    <div class="mt-2">
                                                        <a href="" class="text-dark"></a>
                                                        <strong class="mt-5 m-lg-2">Holy</strong>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <i class="fas fa-ellipsis-h fa-lf mt-2 float-lg-end"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div
                                class="bg-image hover-overlay ripple shadow-1-strong rounded-0"
                                data-color="light">
                            <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                 alt=""
                                 class="w-100 rounded-3">
                            <a href="#">
                                <div class="mask" style="background-color: rgba(251,251,251,0.2)">
                                </div>
                            </a>
                        </div>
                        <div class="card-body">
                            <div class="container" style="color: white">
                                <div class="row mt-2">
                                    <div class="col-md-8">
                                        <i class="far fa-heart fa-lg m-lg-1" style="color: white"></i>
                                        <i class="far fa-comment fa-lg mx-2" style="color: white"></i>
                                        <i class=" far fa-paper-plane fa-lg" style="color: white"></i>
                                    </div>
                                    <div class="col-md-4 text-end">
                                        <i class=" far fa-bookmark fa-lg" style="color: white"></i>
                                    </div>
                                </div>
                                <div class="row mt-1">
                                    <div class="col-md-8 mt-1">
                                        <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                             class="rounded-circle" alt="Avatar" style="width: 20px">
                                        <small>Like by
                                            <strong>janet_t</strong> and<strong> 500,678</strong></small>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class=" col-md-12 mt-1">
                                        <p>
                                            <strong class="text-dark">julat.org</strong> I LOVE YOU
                                            <small>more</small>
                                        </p>
                                    </div>
                                </div>
                                <div class="row">
                                    <small class="my-0">View all 2137 comment</small>
                                    <p class="mb-0">
                                        <strong class="text-dark">alex_123</strong> Lorn,input
                                    </p>
                                </div>
                                <div class="row mt-2">
                                    <div class="col-md-11">
                                        <div class="form-outline">
                                                <textarea class="form-control"
                                                          style="border: none;padding: 0;background-color: transparent;resize: none;outline: none"
                                                          aria-label="Add a comment"
                                                          placeholder="Add a comment" rows="1"></textarea>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <hr style="color: white">
                </div>
                <div class="newsfeed my-2">
                    <div class="post">
                        <div class="card">
                            <div class="card-body" style="padding: 8px">
                                <div class="container">
                                    <div class=" row">
                                        <div class="col-md-8">
                                            <div class="story">
                                                <div class="d-flex story">
                                                    <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                                         class="rounded-circle" height="50"
                                                         alt="Avatar">
                                                    <div class="mt-2">
                                                        <a href="" class="text-dark"></a>
                                                        <strong class="mt-5 m-lg-2">Holy</strong>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <i class="fas fa-ellipsis-h fa-lf mt-2 float-lg-end"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div
                                class="bg-image hover-overlay ripple shadow-1-strong rounded-0"
                                data-color="light">
                            <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                 alt=""
                                 class="w-100 rounded-3">
                            <a href="#">
                                <div class="mask" style="background-color: rgba(251,251,251,0.2)">
                                </div>
                            </a>
                        </div>
                        <div class="card-body">
                            <div class="container" style="color: white">
                                <div class="row mt-2">
                                    <div class="col-md-8">
                                        <i class="far fa-heart fa-lg m-lg-1" style="color: white"></i>
                                        <i class="far fa-comment fa-lg mx-2" style="color: white"></i>
                                        <i class=" far fa-paper-plane fa-lg" style="color: white"></i>
                                    </div>
                                    <div class="col-md-4 text-end">
                                        <i class=" far fa-bookmark fa-lg" style="color: white"></i>
                                    </div>
                                </div>
                                <div class="row mt-1">
                                    <div class="col-md-8 mt-1">
                                        <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                             class="rounded-circle" alt="Avatar" style="width: 20px">
                                        <small>Like by
                                            <strong>janet_t</strong> and<strong> 500,678</strong></small>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class=" col-md-12 mt-1">
                                        <p>
                                            <strong class="text-dark">julat.org</strong> I LOVE YOU
                                            <small>more</small>
                                        </p>
                                    </div>
                                </div>
                                <div class="row">
                                    <small class="my-0">View all 2137 comment</small>
                                    <p class="mb-0">
                                        <strong class="text-dark">alex_123</strong> Lorn,input
                                    </p>
                                </div>
                                <div class="row mt-2">
                                    <div class="col-md-11">
                                        <div class="form-outline">
                                                <textarea class="form-control"
                                                          style="border: none;padding: 0;background-color: transparent;resize: none;outline: none"
                                                          aria-label="Add a comment"
                                                          placeholder="Add a comment" rows="1"></textarea>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <hr style="color: white">
                </div>
                <div class="newsfeed my-2">
                    <div class="post">
                        <div class="card">
                            <div class="card-body" style="padding: 8px">
                                <div class="container">
                                    <div class=" row">
                                        <div class="col-md-8">
                                            <div class="story">
                                                <div class="d-flex story">
                                                    <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                                         class="rounded-circle" height="50"
                                                         alt="Avatar">
                                                    <div class="mt-2">
                                                        <a href="" class="text-dark"></a>
                                                        <strong class="mt-5 m-lg-2">Holy</strong>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <i class="fas fa-ellipsis-h fa-lf mt-2 float-lg-end"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div
                                class="bg-image hover-overlay ripple shadow-1-strong rounded-0"
                                data-color="light">
                            <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                 alt=""
                                 class="w-100 rounded-3">
                            <a href="#">
                                <div class="mask" style="background-color: rgba(251,251,251,0.2)">
                                </div>
                            </a>
                        </div>
                        <div class="card-body">
                            <div class="container" style="color: white">
                                <div class="row mt-2">
                                    <div class="col-md-8">
                                        <i class="far fa-heart fa-lg m-lg-1" style="color: white"></i>
                                        <i class="far fa-comment fa-lg mx-2" style="color: white"></i>
                                        <i class=" far fa-paper-plane fa-lg" style="color: white"></i>
                                    </div>
                                    <div class="col-md-4 text-end">
                                        <i class=" far fa-bookmark fa-lg" style="color: white"></i>
                                    </div>
                                </div>
                                <div class="row mt-1">
                                    <div class="col-md-8 mt-1">
                                        <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                             class="rounded-circle" alt="Avatar" style="width: 20px">
                                        <small>Like by
                                            <strong>janet_t</strong> and<strong> 500,678</strong></small>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class=" col-md-12 mt-1">
                                        <p>
                                            <strong class="text-dark">julat.org</strong> I LOVE YOU
                                            <small>more</small>
                                        </p>
                                    </div>
                                </div>
                                <div class="row">
                                    <small class="my-0">View all 2137 comment</small>
                                    <p class="mb-0">
                                        <strong class="text-dark">alex_123</strong> Lorn,input
                                    </p>
                                </div>
                                <div class="row mt-2">
                                    <div class="col-md-11">
                                        <div class="form-outline">
                                                <textarea class="form-control"
                                                          style="border: none;padding: 0;background-color: transparent;resize: none;outline: none"
                                                          aria-label="Add a comment"
                                                          placeholder="Add a comment" rows="1"></textarea>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <hr style="color: white">
                </div>
                <div class="newsfeed my-2">
                    <div class="post">
                        <div class="card">
                            <div class="card-body" style="padding: 8px">
                                <div class="container">
                                    <div class=" row">
                                        <div class="col-md-8">
                                            <div class="story">
                                                <div class="d-flex story">
                                                    <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                                         class="rounded-circle" height="50"
                                                         alt="Avatar">
                                                    <div class="mt-2">
                                                        <a href="" class="text-dark"></a>
                                                        <strong class="mt-5 m-lg-2">Holy</strong>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <i class="fas fa-ellipsis-h fa-lf mt-2 float-lg-end"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div
                                class="bg-image hover-overlay ripple shadow-1-strong rounded-0"
                                data-color="light">
                            <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                 alt=""
                                 class="w-100 rounded-3">
                            <a href="#">
                                <div class="mask" style="background-color: rgba(251,251,251,0.2)">
                                </div>
                            </a>
                        </div>
                        <div class="card-body">
                            <div class="container" style="color: white">
                                <div class="row mt-2">
                                    <div class="col-md-8">
                                        <i class="far fa-heart fa-lg m-lg-1" style="color: white"></i>
                                        <i class="far fa-comment fa-lg mx-2" style="color: white"></i>
                                        <i class=" far fa-paper-plane fa-lg" style="color: white"></i>
                                    </div>
                                    <div class="col-md-4 text-end">
                                        <i class=" far fa-bookmark fa-lg" style="color: white"></i>
                                    </div>
                                </div>
                                <div class="row mt-1">
                                    <div class="col-md-8 mt-1">
                                        <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                             class="rounded-circle" alt="Avatar" style="width: 20px">
                                        <small>Like by
                                            <strong>janet_t</strong> and<strong> 500,678</strong></small>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class=" col-md-12 mt-1">
                                        <p>
                                            <strong class="text-dark">julat.org</strong> I LOVE YOU
                                            <small>more</small>
                                        </p>
                                    </div>
                                </div>
                                <div class="row">
                                    <small class="my-0">View all 2137 comment</small>
                                    <p class="mb-0">
                                        <strong class="text-dark">alex_123</strong> Lorn,input
                                    </p>
                                </div>
                                <div class="row mt-2">
                                    <div class="col-md-11">
                                        <div class="form-outline">
                                                <textarea class="form-control"
                                                          style="border: none;padding: 0;background-color: transparent;resize: none;outline: none"
                                                          aria-label="Add a comment"
                                                          placeholder="Add a comment" rows="1"></textarea>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <hr style="color: white">
                </div>
                <div class="newsfeed my-2">
                    <div class="post">
                        <div class="card">
                            <div class="card-body" style="padding: 8px">
                                <div class="container">
                                    <div class=" row">
                                        <div class="col-md-8">
                                            <div class="story">
                                                <div class="d-flex story">
                                                    <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                                         class="rounded-circle" height="50"
                                                         alt="Avatar">
                                                    <div class="mt-2">
                                                        <a href="" class="text-dark"></a>
                                                        <strong class="mt-5 m-lg-2">Holy</strong>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <i class="fas fa-ellipsis-h fa-lf mt-2 float-lg-end"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div
                                class="bg-image hover-overlay ripple shadow-1-strong rounded-0"
                                data-color="light">
                            <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                 alt=""
                                 class="w-100 rounded-3">
                            <a href="#">
                                <div class="mask" style="background-color: rgba(251,251,251,0.2)">
                                </div>
                            </a>
                        </div>
                        <div class="card-body">
                            <div class="container" style="color: white">
                                <div class="row mt-2">
                                    <div class="col-md-8">
                                        <i class="far fa-heart fa-lg m-lg-1" style="color: white"></i>
                                        <i class="far fa-comment fa-lg mx-2" style="color: white"></i>
                                        <i class=" far fa-paper-plane fa-lg" style="color: white"></i>
                                    </div>
                                    <div class="col-md-4 text-end">
                                        <i class=" far fa-bookmark fa-lg" style="color: white"></i>
                                    </div>
                                </div>
                                <div class="row mt-1">
                                    <div class="col-md-8 mt-1">
                                        <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                             class="rounded-circle" alt="Avatar" style="width: 20px">
                                        <small>Like by
                                            <strong>janet_t</strong> and<strong> 500,678</strong></small>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class=" col-md-12 mt-1">
                                        <p>
                                            <strong class="text-dark">julat.org</strong> I LOVE YOU
                                            <small>more</small>
                                        </p>
                                    </div>
                                </div>
                                <div class="row">
                                    <small class="my-0">View all 2137 comment</small>
                                    <p class="mb-0">
                                        <strong class="text-dark">alex_123</strong> Lorn,input
                                    </p>
                                </div>
                                <div class="row mt-2">
                                    <div class="col-md-11">
                                        <div class="form-outline">
                                                <textarea class="form-control"
                                                          style="border: none;padding: 0;background-color: transparent;resize: none;outline: none"
                                                          aria-label="Add a comment"
                                                          placeholder="Add a comment" rows="1"></textarea>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <hr style="color: white">
                </div>
                <div class="newsfeed my-2">
                    <div class="post">
                        <div class="card">
                            <div class="card-body" style="padding: 8px">
                                <div class="container">
                                    <div class=" row">
                                        <div class="col-md-8">
                                            <div class="story">
                                                <div class="d-flex story">
                                                    <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                                         class="rounded-circle" height="50"
                                                         alt="Avatar">
                                                    <div class="mt-2">
                                                        <a href="" class="text-dark"></a>
                                                        <strong class="mt-5 m-lg-2">Holy</strong>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <i class="fas fa-ellipsis-h fa-lf mt-2 float-lg-end"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div
                                class="bg-image hover-overlay ripple shadow-1-strong rounded-0"
                                data-color="light">
                            <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                 alt=""
                                 class="w-100 rounded-3">
                            <a href="#">
                                <div class="mask" style="background-color: rgba(251,251,251,0.2)">
                                </div>
                            </a>
                        </div>
                        <div class="card-body">
                            <div class="container" style="color: white">
                                <div class="row mt-2">
                                    <div class="col-md-8">
                                        <i class="far fa-heart fa-lg m-lg-1" style="color: white"></i>
                                        <i class="far fa-comment fa-lg mx-2" style="color: white"></i>
                                        <i class=" far fa-paper-plane fa-lg" style="color: white"></i>
                                    </div>
                                    <div class="col-md-4 text-end">
                                        <i class=" far fa-bookmark fa-lg" style="color: white"></i>
                                    </div>
                                </div>
                                <div class="row mt-1">
                                    <div class="col-md-8 mt-1">
                                        <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                                             class="rounded-circle" alt="Avatar" style="width: 20px">
                                        <small>Like by
                                            <strong>janet_t</strong> and<strong> 500,678</strong></small>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class=" col-md-12 mt-1">
                                        <p>
                                            <strong class="text-dark">julat.org</strong> I LOVE YOU
                                            <small>more</small>
                                        </p>
                                    </div>
                                </div>
                                <div class="row">
                                    <small class="my-0">View all 2137 comment</small>
                                    <p class="mb-0">
                                        <strong class="text-dark">alex_123</strong> Lorn,input
                                    </p>
                                </div>
                                <div class="row mt-2">
                                    <div class="col-md-11">
                                        <div class="form-outline">
                                                <textarea class="form-control"
                                                          style="border: none;padding: 0;background-color: transparent;resize: none;outline: none"
                                                          aria-label="Add a comment"
                                                          placeholder="Add a comment" rows="1"></textarea>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <hr style="color: white">
                </div>
            </div>
        </div>
        <!--        Thanh điều hương bên trái-->
        <div class="col-md-3 bg-black">
            <section class="mt-4 ml-3">
                <!--                Profile-->
                <div class="row">
                    <div class="col-md-2" style="margin-right: 10px">
                        <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                             class="rounded-circle" height="50"
                             alt="Avatar">
                    </div>
                    <div class="col-md-8"><a href="#" style="color: white">Holy.com.org</a>
                        <div><small>Bach Ho Ly</small></div>
                    </div>
                </div>
                <div class="mt-4" style="color: white">
                    <div class="row">
                        <div class="col-md-9">
                            <p>Suggested for you</p>
                        </div>
                        <div class="col-md-3">
                            <p href="#">See All</p>
                        </div>
                    </div>
                </div>
                <!--                List bạn bè-->
                <div class="row mt-3">
                    <div class="col-md-1" style="margin-right: 20px">
                        <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                             class="rounded-circle" height="35"
                             alt="Avatar">
                    </div>
                    <div class="col-md-8"><a href="#" style="color: white">Holy.com.org</a>
                        <div><small>Bach Ho Ly</small></div>
                    </div>
                    <div class="col-md-2 float-end" style="color: white">
                        <a href="#" type="button">Follow</a>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-1" style="margin-right: 20px">
                        <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                             class="rounded-circle" height="35"
                             alt="Avatar">
                    </div>
                    <div class="col-md-8"><a href="#" style="color: white">Holy.com.org</a>
                        <div><small>Bach Ho Ly</small></div>
                    </div>
                    <div class="col-md-2 float-end" style="color: white">
                        <a href="#" type="button">Follow</a>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-1" style="margin-right: 20px">
                        <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                             class="rounded-circle" height="35"
                             alt="Avatar">
                    </div>
                    <div class="col-md-8"><a href="#" style="color: white">Holy.com.org</a>
                        <div><small>Bach Ho Ly</small></div>
                    </div>
                    <div class="col-md-2 float-end" style="color: white">
                        <a href="#" type="button">Follow</a>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-1" style="margin-right: 20px">
                        <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                             class="rounded-circle" height="35"
                             alt="Avatar">
                    </div>
                    <div class="col-md-8"><a href="#" style="color: white">Holy.com.org</a>
                        <div><small>Bach Ho Ly</small></div>
                    </div>
                    <div class="col-md-2 float-end" style="color: white">
                        <a href="#" type="button">Follow</a>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-1" style="margin-right: 20px">
                        <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                             class="rounded-circle" height="35"
                             alt="Avatar">
                    </div>
                    <div class="col-md-8"><a href="#" style="color: white">Holy.com.org</a>
                        <div><small>Bach Ho Ly</small></div>
                    </div>
                    <div class="col-md-2 float-end" style="color: white">
                        <a href="#" type="button">Follow</a>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-1" style="margin-right: 20px">
                        <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                             class="rounded-circle" height="35"
                             alt="Avatar">
                    </div>
                    <div class="col-md-8"><a href="#" style="color: white">Holy.com.org</a>
                        <div><small>Bach Ho Ly</small></div>
                    </div>
                    <div class="col-md-2 float-end" style="color: white">
                        <a href="#" type="button">Follow</a>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-1" style="margin-right: 20px">
                        <img src="https://vaithuhayho.com/wp-content/uploads/2022/09/anh-gai-xinh-cute-12.jpg"
                             class="rounded-circle" height="35"
                             alt="Avatar">
                    </div>
                    <div class="col-md-8"><a href="#" style="color: white">Holy.com.org</a>
                        <div><small>Bach Ho Ly</small></div>
                    </div>
                    <div class="col-md-2 float-end" style="color: white">
                        <a href="#" type="button">Follow</a>
                    </div>
                </div>
            </section>
            <div class="mt-5 ml-3">
                <a href="#"> About</a>
                <a href="#"> Help</a>
                <a href="#"> Press</a>
                <a href="#"> API</a>
                <a href="#"> Jobs</a>
                <a href="#"> Privacy</a>
                <a href="#"> Terms</a>
                <a href="#"> Locations</a>
                <a href="#"> Language</a>
            </div>
            <div class="mt-3 ml-3">
                <a>© 2023 INSTAGRAM FROM META</a>
            </div>
        </div>
        <!--        Thanh điều hương bên trái-->
    </div>
</div>
</body>
</html>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
        crossorigin="anonymous"></script>
<script src="mdb.min.js"></script>
<script type="text/javascript"></script>
<script>
    $(document).ready(function () {
        $('.story-container').slick({
            slidesToShow: 6,
            arrows: true
        });
    });
    is
</script>