<%--
  Created by IntelliJ IDEA.
  User: manhhung
  Date: 03/07/2023
  Time: 01:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Profile</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css"
          integrity="sha512-NmLkDIU1C/C88wi324HBc+S2kLhi08PN5GDeUVVVC/BVt/9Izdsc9SVeVfA1UZbY3sHUlDSyRXhCzHfr6hmPPw=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link rel="stylesheet" href=" https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700;900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../asset/font/themify-icons/themify-icons.css">
    <link rel="stylesheet" href="../asset/css/base.css">
    <link rel="stylesheet" href="../asset/css/responsiveNew.css">
    <link rel="stylesheet" href="../asset/css/home.css">
    <link rel="stylesheet" href="../asset/css/User">
    <link rel="icon" href="../asset/img/favicon.png">

</head>
<body>
<div class="main">
    <header class="header">
        <nav class="header__navbar">
            <div class="header__navbar-logo">
                <a href="/home?id=${user.id}" class="header__navbar-logo__link">
                    <div class="header__navbar-logo-img">
                        <img src="../asset/img/logo.png" alt="">
                    </div>
                </a>
            </div>
            <form method="post" action="">
                <div class="header__navbar-search">
                    <div class="header__navbar-search-container">
                        <input class="search_input" type="text" placeholder="Search">
                        <button type="submit"><i class="ti-search"></i></button>
                    </div>

                    <div class="search_iput__btn">
                        <div class="search_btn">
                            <span class="search_btn-icon">
                                <i class="ti-search"></i>
                            </span>
                            <span class="search_btn-text">Search</span>
                        </div>
                    </div>
                </div>
            </form>

            <ul class="header__navbar-list">
                <li class="header__navbar-item">
                    <a href="/home?id=${user.id}" class="header__nabar-link">
                        <svg aria-label="Home" class="_8-yf5 outHome " color="#262626" fill="#262626" height="22"
                             role="img" viewBox="0 0 48 48" width="22">
                            <path d="M45.3 48H30c-.8 0-1.5-.7-1.5-1.5V34.2c0-2.6-2-4.6-4.6-4.6s-4.6 2-4.6 4.6v12.3c0 .8-.7 1.5-1.5 1.5H2.5c-.8 0-1.5-.7-1.5-1.5V23c0-.4.2-.8.4-1.1L22.9.4c.6-.6 1.5-.6 2.1 0l21.5 21.5c.4.4.6 1.1.3 1.6 0 .1-.1.1-.1.2v22.8c.1.8-.6 1.5-1.4 1.5zm-13.8-3h12.3V23.4L24 3.6l-20 20V45h12.3V34.2c0-4.3 3.3-7.6 7.6-7.6s7.6 3.3 7.6 7.6V45z"></path>
                        </svg>
                    </a>
                </li>
                <li class="header__navbar-item">
                    <a href="#" class="header__nabar-link">
                        <img class="img-svg-search" src="../asset/img/icons8-search.svg" alt="">
                    </a>
                </li>
                <li class="header__navbar-item">
                    <a href="#" class="header__nabar-link">
                        <img class="img-svg-video" src="../asset/img/icons8-instagram-reels.svg" alt="">
                    </a>
                </li>
                <li class="header__navbar-item isnone">
                    <a href="#" class="header__nabar-link dot-notify">
                        <svg aria-label="Messenger" class="_8-yf5 " color="#262626" fill="#262626" height="22"
                             role="img" viewBox="0 0 48 48" width="22">
                            <path d="M36.2 16.7L29 22.2c-.5.4-1.2.4-1.7 0l-5.4-4c-1.6-1.2-3.9-.8-5 .9l-6.8 10.7c-.7 1 .6 2.2 1.6 1.5l7.3-5.5c.5-.4 1.2-.4 1.7 0l5.4 4c1.6 1.2 3.9.8 5-.9l6.8-10.7c.6-1.1-.7-2.2-1.7-1.5zM24 1C11 1 1 10.5 1 23.3 1 30 3.7 35.8 8.2 39.8c.4.3.6.8.6 1.3l.2 4.1c0 1 .9 1.8 1.8 1.8.2 0 .5 0 .7-.2l4.6-2c.2-.1.5-.2.7-.2.2 0 .3 0 .5.1 2.1.6 4.3.9 6.7.9 13 0 23-9.5 23-22.3S37 1 24 1zm0 41.6c-2 0-4-.3-5.9-.8-.4-.1-.8-.2-1.3-.2-.7 0-1.3.1-2 .4l-3 1.3V41c0-1.3-.6-2.5-1.6-3.4C6.2 34 4 28.9 4 23.3 4 12.3 12.6 4 24 4s20 8.3 20 19.3-8.6 19.3-20 19.3z"></path>
                        </svg>
                    </a>
                </li>
                <li class="header__navbar-item isnone">
                    <a href="#" class="header__nabar-link">
                        <input type="checkbox" hidden class="newpost-on-off" id="newpost-on-off-id">
                        <label for="newpost-on-off-id" class="newpost-off">
                            <svg aria-label="New Post" class="_8-yf5 " color="#262626" fill="#262626" height="22"
                                 role="img" viewBox="0 0 48 48" width="22">
                                <path d="M31.8 48H16.2c-6.6 0-9.6-1.6-12.1-4C1.6 41.4 0 38.4 0 31.8V16.2C0 9.6 1.6 6.6 4 4.1 6.6 1.6 9.6 0 16.2 0h15.6c6.6 0 9.6 1.6 12.1 4C46.4 6.6 48 9.6 48 16.2v15.6c0 6.6-1.6 9.6-4 12.1-2.6 2.5-5.6 4.1-12.2 4.1zM16.2 3C10 3 7.8 4.6 6.1 6.2 4.6 7.8 3 10 3 16.2v15.6c0 6.2 1.6 8.4 3.2 10.1 1.6 1.6 3.8 3.1 10 3.1h15.6c6.2 0 8.4-1.6 10.1-3.2 1.6-1.6 3.1-3.8 3.1-10V16.2c0-6.2-1.6-8.4-3.2-10.1C40.2 4.6 38 3 31.8 3H16.2z"></path>
                                <path d="M36.3 25.5H11.7c-.8 0-1.5-.7-1.5-1.5s.7-1.5 1.5-1.5h24.6c.8 0 1.5.7 1.5 1.5s-.7 1.5-1.5 1.5z"></path>
                                <path d="M24 37.8c-.8 0-1.5-.7-1.5-1.5V11.7c0-.8.7-1.5 1.5-1.5s1.5.7 1.5 1.5v24.6c0 .8-.7 1.5-1.5 1.5z"></path>
                            </svg>
                        </label>
                        <label for="newpost-on-off-id" class="newpost-on">
                            <svg aria-label="New Post" class="_8-yf5 " color="#262626" fill="#262626" height="22"
                                 role="img" viewBox="0 0 48 48" width="22">
                                <path d="M43.9 4c-2.5-2.4-5.5-4-12.2-4H16.2C9.6 0 6.6 1.6 4 4.1 1.6 6.6 0 9.6 0 16.2v15.5c0 6.6 1.6 9.7 4.1 12.2 2.5 2.4 5.5 4 12.2 4h15.5c6.6 0 9.7-1.6 12.2-4.1 2.4-2.5 4-5.5 4-12.2V16.2c0-6.6-1.6-9.6-4.1-12.2zm-7.6 21.5H25.5v10.8c0 .8-.7 1.5-1.5 1.5s-1.5-.7-1.5-1.5V25.5H11.7c-.8 0-1.5-.7-1.5-1.5s.7-1.5 1.5-1.5h10.8V11.7c0-.8.7-1.5 1.5-1.5s1.5.7 1.5 1.5v10.8h10.8c.8 0 1.5.7 1.5 1.5s-.7 1.5-1.5 1.5z"></path>
                            </svg>
                        </label>
                        <label for="newpost-on-off-id" class="createnew-wrapper">
                            <!-- làm tiếp đoạn này -->
                            <div class="createnew-inner">
                                <!-- làm tiếp đoạn này là để Create -->
                            </div>
                        </label>
                    </a>
                </li>
                <li class="header__navbar-item isnone">
                    <a href="#" class="header__nabar-link">
                        <svg aria-label="Find People" class="_8-yf5 " color="#262626" fill="#262626" height="22"
                             role="img" viewBox="0 0 48 48" width="22">
                            <path clip-rule="evenodd"
                                  d="M24 0C10.8 0 0 10.8 0 24s10.8 24 24 24 24-10.8 24-24S37.2 0 24 0zm0 45C12.4 45 3 35.6 3 24S12.4 3 24 3s21 9.4 21 21-9.4 21-21 21zm10.2-33.2l-14.8 7c-.3.1-.6.4-.7.7l-7 14.8c-.3.6-.2 1.3.3 1.7.3.3.7.4 1.1.4.2 0 .4 0 .6-.1l14.8-7c.3-.1.6-.4.7-.7l7-14.8c.3-.6.2-1.3-.3-1.7-.4-.5-1.1-.6-1.7-.3zm-7.4 15l-5.5-5.5 10.5-5-5 10.5z"
                                  fill-rule="evenodd"></path>
                        </svg>
                    </a>
                </li>
                <li class="header__navbar-item">
                    <a href="#" class="header__nabar-link">
                        <input type="checkbox" class="notifies-on-off" id="notifies-on-off-id">
                        <label for="notifies-on-off-id" class="notifies-off">
                            <svg aria-label="Activity Feed" class="_8-yf5 " color="#262626" fill="#262626" height="22"
                                 role="img" viewBox="0 0 48 48" width="22">
                                <path d="M34.6 6.1c5.7 0 10.4 5.2 10.4 11.5 0 6.8-5.9 11-11.5 16S25 41.3 24 41.9c-1.1-.7-4.7-4-9.5-8.3-5.7-5-11.5-9.2-11.5-16C3 11.3 7.7 6.1 13.4 6.1c4.2 0 6.5 2 8.1 4.3 1.9 2.6 2.2 3.9 2.5 3.9.3 0 .6-1.3 2.5-3.9 1.6-2.3 3.9-4.3 8.1-4.3m0-3c-4.5 0-7.9 1.8-10.6 5.6-2.7-3.7-6.1-5.5-10.6-5.5C6 3.1 0 9.6 0 17.6c0 7.3 5.4 12 10.6 16.5.6.5 1.3 1.1 1.9 1.7l2.3 2c4.4 3.9 6.6 5.9 7.6 6.5.5.3 1.1.5 1.6.5.6 0 1.1-.2 1.6-.5 1-.6 2.8-2.2 7.8-6.8l2-1.8c.7-.6 1.3-1.2 2-1.7C42.7 29.6 48 25 48 17.6c0-8-6-14.5-13.4-14.5z"></path>
                            </svg>
                        </label>
                        <label for="notifies-on-off-id" class="notifies-on">
                            <svg aria-label="Activity Feed" class="_8-yf5 " color="#262626" fill="#262626" height="22"
                                 role="img" viewBox="0 0 48 48" width="22">
                                <path d="M34.6 3.1c-4.5 0-7.9 1.8-10.6 5.6-2.7-3.7-6.1-5.5-10.6-5.5C6 3.1 0 9.6 0 17.6c0 7.3 5.4 12 10.6 16.5.6.5 1.3 1.1 1.9 1.7l2.3 2c4.4 3.9 6.6 5.9 7.6 6.5.5.3 1.1.5 1.6.5s1.1-.2 1.6-.5c1-.6 2.8-2.2 7.8-6.8l2-1.8c.7-.6 1.3-1.2 2-1.7C42.7 29.6 48 25 48 17.6c0-8-6-14.5-13.4-14.5z"></path>
                            </svg>
                        </label>
                        <!-- ---thông báo hiện tại có -->
                        <div class="notifies-wrapper-location">
                            <div class="notifies-wrapper">
                                <div class="notifies-inner-o">
                                    <div class="notifies-inner-o__ava">
                                            <span class="notifies-inner-o__ava-1" style="height: 32px; width: 32px;">
                                                <img src="../asset/img/ava.jpg" alt=""
                                                     style="height: 100%; width: 100%;">
                                            </span>
                                        <span class="notifies-inner-o__ava-2" style="height: 32px; width: 32px;">
                                                <img src="../asset/img/ava.jpg" alt=""
                                                     style="height: 100%; width: 100%;">
                                            </span>
                                    </div>
                                    <div class="notifies-inner-o__about">
                                        <h4>Follow Requests</h4>
                                        <span>thainguyenn__ + 135 others</span>
                                    </div>
                                    <div class="notifies-inner-o__icon">
                                        <div class="notifies-inner-o__icon-point">
                                            <div style="height:8px; width:8px; background-color:#0095f6;"></div>
                                        </div>
                                        <div class="notifies-inner-o__icon-link">
                                            <i class="fas fa-chevron-right"
                                               style="font-size: 1.6rem; line-height: 3.6rem;"></i>
                                        </div>
                                    </div>
                                </div>
                                <div class="notifies-inner-u">
                                    <div class="notifies-inner-u__event">
                                        <div class="notifies-inner-u__event-time">Earlier</div>
                                        <div class="notifies-inner-u__event-about">
                                            <div class="notifies-inner-u__event-about__ava"
                                                 style="width: 44px; height: 44px; overflow: hidden;">
                                                <img src="../asset/img/ava.jpg" alt=""
                                                     style="height: 100%; width: 100%;">
                                            </div>
                                            <div class="notifies-inner-u__event-about__name">
                                                <div class="notifies-inner-u__event-about__name-acc">
                                                    <span class="">
                                                            thainguyenn__
                                                        </span>
                                                    <span class="notifies-inner-u__event-about__name-active">
                                                            started following you.
                                                        </span>
                                                </div>
                                                <span>6w</span>
                                            </div>
                                            <div class="btn notifies-inner-u__event-about__btn">Following</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </a>
                </li>


                <%--------------------------------Ở ĐÂY LÀ XỬ LÝ PHẦN AVATAR--------------------------------------------------------------%>

                <li class="header__navbar-item accountfolder-shows">
                    <a href="#" class="header__nabar-link">
                        <div class="border-img">
                                <span class="header__navbar-ava">
                                    <img class="ava-img" src="${user.avatar}" >
                                </span>
                        </div>
                    </a>

                    <!-- account folder/ thư mục tài khoản -->
                    <div class="accountfolder">
                        <div class="accountfolder-wraper">
                            <div class="accountfolder-inner">
                                <div class="accountfolder-about btn">
                                    <div class="accountfolder-about__icon">
                                        <svg aria-label="Profile" class="_8-yf5 " color="#262626" fill="#262626"
                                             height="16" role="img" viewBox="0 0 32 32" width="16">
                                            <path d="M16 0C7.2 0 0 7.1 0 16c0 4.8 2.1 9.1 5.5 12l.3.3C8.5 30.6 12.1 32 16 32s7.5-1.4 10.2-3.7l.3-.3c3.4-3 5.5-7.2 5.5-12 0-8.9-7.2-16-16-16zm0 29c-2.8 0-5.3-.9-7.5-2.4.5-.9.9-1.3 1.4-1.8.7-.5 1.5-.8 2.4-.8h7.2c.9 0 1.7.3 2.4.8.5.4.9.8 1.4 1.8-2 1.5-4.5 2.4-7.3 2.4zm9.7-4.4c-.5-.9-1.1-1.5-1.9-2.1-1.2-.9-2.7-1.4-4.2-1.4h-7.2c-1.5 0-3 .5-4.2 1.4-.8.6-1.4 1.2-1.9 2.1C4.2 22.3 3 19.3 3 16 3 8.8 8.8 3 16 3s13 5.8 13 13c0 3.3-1.2 6.3-3.3 8.6zM16 5.7c-3.9 0-7 3.1-7 7s3.1 7 7 7 7-3.1 7-7-3.1-7-7-7zm0 11c-2.2 0-4-1.8-4-4s1.8-4 4-4 4 1.8 4 4-1.8 4-4 4z"></path>
                                        </svg>
                                    </div>
                                    <div class="accountfolder-about-content">
                                        <div class="accountfolder-about-content__Profile">
                                            <a style="text-decoration: none;color: #262626"
                                               href="/user?action=information&id=${user.id}">Profile</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="accountfolder-about btn">
                                    <div class="accountfolder-about__icon">
                                        <svg aria-label="Saved" class="_8-yf5 " color="#262626" fill="#262626"
                                             height="16" role="img" viewBox="0 0 32 32" width="16">
                                            <path d="M28.7 32c-.4 0-.8-.2-1.1-.4L16 19.9 4.4 31.6c-.4.4-1.1.6-1.6.3-.6-.2-.9-.8-.9-1.4v-29C1.8.7 2.5 0 3.3 0h25.4c.8 0 1.5.7 1.5 1.5v29c0 .6-.4 1.2-.9 1.4-.2.1-.4.1-.6.1zM4.8 3v23.9l9.4-9.4c.9-.9 2.6-.9 3.5 0l9.4 9.4V3H4.8z"></path>
                                        </svg>
                                    </div>
                                    <div class="accountfolder-about-content">
                                        <div class="accountfolder-about-content__Saved">Saved</div>
                                    </div>
                                </div>
                                <div class="accountfolder-about btn">
                                    <div class="accountfolder-about__icon">
                                        <svg aria-label="Settings" class="_8-yf5 " color="#262626" fill="#262626"
                                             height="16" role="img" viewBox="0 0 32 32" width="16">
                                            <path d="M31.2 13.4l-1.4-.7c-.1 0-.2-.1-.2-.2v-.2c-.3-1.1-.7-2.1-1.3-3.1v-.1l-.2-.1v-.3l.5-1.5c.2-.5 0-1.1-.4-1.5l-1.9-1.9c-.4-.4-1-.5-1.5-.4l-1.5.5H23l-.1-.1h-.1c-1-.5-2-1-3.1-1.3h-.2c-.1 0-.1-.1-.2-.2L18.6.9c-.2-.5-.7-.9-1.2-.9h-2.7c-.5 0-1 .3-1.3.8l-.7 1.4c0 .1-.1.2-.2.2h-.2c-1.1.3-2.1.7-3.1 1.3h-.1l-.1.2h-.3l-1.5-.5c-.5-.2-1.1 0-1.5.4L3.8 5.7c-.4.4-.5 1-.4 1.5l.5 1.5v.5c-.5 1-1 2-1.3 3.1v.2c0 .1-.1.1-.2.2l-1.4.7c-.6.2-1 .7-1 1.2v2.7c0 .5.3 1 .8 1.3l1.4.7c.1 0 .2.1.2.2v.2c.3 1.1.7 2.1 1.3 3.1v.1l.2.1v.3l-.5 1.5c-.2.5 0 1.1.4 1.5l1.9 1.9c.3.3.6.4 1 .4.2 0 .3 0 .5-.1l1.5-.5H9l.1.1h.1c1 .5 2 1 3.1 1.3h.2c.1 0 .1.1.2.2l.7 1.4c.2.5.7.8 1.3.8h2.7c.5 0 1-.3 1.3-.8l.7-1.4c0-.1.1-.2.2-.2h.2c1.1-.3 2.1-.7 3.1-1.3h.1l.1-.1h.3l1.5.5c.1 0 .3.1.5.1.4 0 .7-.1 1-.4l1.9-1.9c.4-.4.5-1 .4-1.5l-.5-1.5V23l.1-.1v-.1c.5-1 1-2 1.3-3.1v-.2c0-.1.1-.1.2-.2l1.4-.7c.5-.2.8-.7.8-1.3v-2.7c0-.5-.4-1-.8-1.2zM16 27.1c-6.1 0-11.1-5-11.1-11.1S9.9 4.9 16 4.9s11.1 5 11.1 11.1-5 11.1-11.1 11.1z"></path>
                                        </svg>
                                    </div>
                                    <div class="accountfolder-about-content">
                                        <div class="accountfolder-about-content__Settings">Settings</div>
                                    </div>
                                </div>
                                <div class="accountfolder-about btn">
                                    <div class="accountfolder-about__icon">
                                        <svg aria-label="Switch Accounts" class="_8-yf5 " color="#262626" fill="#262626"
                                             height="16" role="img" viewBox="0 0 32 32" width="16">
                                            <path d="M10.3 10.7c0-.8-.7-1.5-1.5-1.5H4.9C7.2 5.4 11.4 3 16 3c3.6 0 7 1.5 9.5 4.1.5.6 1.5.6 2.1.1.6-.6.6-1.5.1-2.1-3-3.2-7.3-5-11.7-5C10.7 0 6 2.5 3 6.7V3.5C3 2.7 2.3 2 1.5 2S0 2.7 0 3.5v7.2c0 .8.7 1.5 1.5 1.5h7.3c.8 0 1.5-.6 1.5-1.5zm20.2 9.1h-7.2c-.8 0-1.5.7-1.5 1.5s.7 1.5 1.5 1.5h3.8C24.8 26.6 20.6 29 16 29c-3.6 0-7-1.5-9.5-4.1-.5-.6-1.5-.6-2.1-.1-.6.6-.6 1.5-.1 2.1 3 3.2 7.3 5 11.7 5 5.3 0 10-2.5 13-6.7v3.2c0 .8.7 1.5 1.5 1.5s1.5-.7 1.5-1.5v-7.2c0-.8-.7-1.4-1.5-1.4z"></path>
                                        </svg>
                                    </div>
                                    <div class="accountfolder-about-content">
                                        <div class="accountfolder-about-content__SwitchAcc">Switch Accounts</div>
                                    </div>
                                </div>
                                <div class="accountfolder-about btn mb-4">

                                    <%-----------------------------------Ở ĐÂY XỬ LÝ PẦN LOG-OUT---------------------------------------------------------%>

                                    <div class="accountfolder-about__logOut">
                                        <div class="accountfolder-about__logOut-inner">
                                            <form action="/login?action=logOut" method="post">
                                                <button type="submit" style="color: #8c4343;border: none;background-color: white;">
                                                    Log Out
                                                </button>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </li>
            </ul>
        </nav>
    </header>
    <!-- content -->
    <div class="content-mess-wrapper grid">
        <div class="content-mess grid-row">
            <div class="content-mess__left">
                <div class="content-mess__left-tp">
                    <a href="" class="content-mess__left-tp__back-mobile">
                        <i class="fas fa-arrow-left"></i>
                    </a>
                    <div class="content-mess__left-tp__heading">
                        <div class="content-mess__left-tp-name">
                            <span>Your Profile</span>
                            <a class="content-mss-idown" href="">
                                <svg aria-label="Down Chevron Icon" class="_8-yf5 " color="#262626" fill="#262626"
                                     height="20" role="img" viewBox="0 0 48 48" width="20">
                                    <path d="M40 33.5c-.4 0-.8-.1-1.1-.4L24 18.1l-14.9 15c-.6.6-1.5.6-2.1 0s-.6-1.5 0-2.1l16-16c.6-.6 1.5-.6 2.1 0l16 16c.6.6.6 1.5 0 2.1-.3.3-.7.4-1.1.4z"></path>
                                </svg>
                            </a>
                        </div>
                    </div>
                    <a href="#" class="content-mess__left-tp__video-mobile">
                        <i class="fas fa-video"></i>
                    </a>
                    <div class="content-mess__left-tp-setting">
                        <a class="content-mss-isetting" href="/user?action=update&id=${user.id}">
                            <svg aria-label="New Message" class="_8-yf5 " color="#262626" fill="#262626" height="24"
                                 role="img" viewBox="0 0 44 44" width="24">
                                <path d="M33.7 44.12H8.5a8.41 8.41 0 01-8.5-8.5v-25.2a8.41 8.41 0 018.5-8.5H23a1.5 1.5 0 010 3H8.5a5.45 5.45 0 00-5.5 5.5v25.2a5.45 5.45 0 005.5 5.5h25.2a5.45 5.45 0 005.5-5.5v-14.5a1.5 1.5 0 013 0v14.5a8.41 8.41 0 01-8.5 8.5z"></path>
                                <path d="M17.5 34.82h-6.7a1.5 1.5 0 01-1.5-1.5v-6.7a1.5 1.5 0 01.44-1.06L34.1 1.26a4.45 4.45 0 016.22 0l2.5 2.5a4.45 4.45 0 010 6.22l-24.3 24.4a1.5 1.5 0 01-1.02.44zm-5.2-3h4.58l23.86-24a1.45 1.45 0 000-2l-2.5-2.5a1.45 1.45 0 00-2 0l-24 23.86z"></path>
                                <path d="M38.2 14.02a1.51 1.51 0 01-1.1-.44l-6.56-6.56a1.5 1.5 0 012.12-2.12l6.6 6.6a1.49 1.49 0 010 2.12 1.51 1.51 0 01-1.06.4z"></path>
                            </svg>
                        </a>
                    </div>
                </div>

                <div class="content-mess__left-bt">
                    <div class="content-mess__left-bt-a">
                        <div class="content-mess__left-bt-a1">
                            <img src="${user.avatar}">
                        </div>
                    </div>


                    <div class="content-mess__left-bt-a margin-top">
                        <div class="content-mess__left-bt-a2">
                            <p>User-name: </p>  ${user.username}
                        </div>
                    </div>


                    <div class="content-mess__left-bt-a">
                        <div class="content-mess__left-bt-a2">
                            <p>Full-name: </p> ${user.fullName}
                        </div>
                    </div>


                    <div class="content-mess__left-bt-a">
                        <div class="content-mess__left-bt-a2">
                            <p>Number Phone: </p> ${user.numberPhone}
                        </div>
                    </div>


                    <div class="content-mess__left-bt-a">
                        <div class="content-mess__left-bt-a2">
                            <p>Date Of Birth: </p>  ${user.dateOfBirth}
                        </div>
                    </div>


                    <div class="content-mess__left-bt-a">
                        <div class="content-mess__left-bt-a2">
                            <p>Favorite: </p> ${user.favorite}
                        </div>
                    </div>


                    <div class="content-mess__left-bt-a">
                        <div class="content-mess__left-bt-a2">
                            <p>Address: </p>  ${user.address}
                        </div>
                    </div>
                </div>
            </div>


            <div class="content-mess__right">
                <div class="header__inner__form">
                    <div class="header__inner__form-login">
                        <div class="header__inner__form-login-logo"
                             style="    margin-bottom: 0; margin-top: 30px;">
                            Your Profile
                        </div>


                        <div class="header__inner__form-inner">


                        </div>


                    </div>
                    <div class="header__inner__form-register" style="height: 20px">
                        <p>Go to <a href="/home?id=${user.id}"> Home </a></p>
                    </div>
                    <div class="img-user">
                        <img src="../asset/img/userNope.jpg">
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>