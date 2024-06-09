<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>超市进销存管理系统</title>

    <!-- Bootstrap -->
    <link href="<%= request.getContextPath() %>/statics/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="<%= request.getContextPath() %>/statics/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="<%= request.getContextPath() %>/statics/css/nprogress.css" rel="stylesheet">
    <!-- Animate.css -->
    <link href="<%= request.getContextPath() %>/statics/css/animate.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="<%= request.getContextPath() %>/statics/css/custom.min.css" rel="stylesheet">

    <style>
        body {
            background-image: url('<%= request.getContextPath() %>/statics/images/backgroud_img.jpg') !important;
            background-size: cover !important;
            background-repeat: no-repeat !important;
            background-attachment: fixed !important;
        }
        .login_wrapper {
            width: 20%;
            height: auto;
            background-color: rgba(0, 0, 0, 0.5); /* 调整透明度为0.5 */
            margin: auto;
            margin-top: 10%;
            text-align: center;
            border-radius: 10px;
            padding: 50px 50px;
        }
        .login_wrapper h1 {
            color: #ffffff90;
            margin-top: 5%;
            text-align: center;
            margin-bottom: 30px;
            font-size: 24px;
            font-weight: bold;
        }
        .login_wrapper .btn {
            display: block;
            width: 100%;
            margin-bottom: 15px;
            background-image: linear-gradient(to right, #30cfd0, #330867);
            border: none !important;
            color: white !important;
            text-align: center;
            font-size: 15px;
            border-radius: 10px;
            padding: 10px;
            text-decoration: none;
            position: relative;
            overflow: hidden;
            z-index: 1; /* 确保按钮文字在最上层 */
        }
        .login_wrapper .btn::before {
            content: "";
            position: absolute;
            top: 0;
            left: -100%;
            width: 100%;
            height: 100%;
            background-image: linear-gradient(to right, #330867, #30cfd0);
            transition: left 1s; /* 调整过渡时间 */
            z-index: -1; /* 确保伪元素在按钮文字下层 */
        }
        .login_wrapper .btn:hover::before {
            left: 0;
        }
    </style>
</head>

<body>
<div class="login_wrapper">
    <h1>超市进销存管理系统</h1>
    <div>
        <a href="manage/login" class="btn">管理员入口</a>
    </div>
    <div>
        <a href="staff/login" class="btn">普通员工入口</a>
    </div>
</div>
</body>
</html>
