<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Meta, title, CSS, favicons, etc. -->
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title>超市进销存管理系统</title>

  <!-- Bootstrap -->
  <link href="${pageContext.request.contextPath }/statics/css/bootstrap.min.css" rel="stylesheet">
  <!-- Font Awesome -->
  <link href="${pageContext.request.contextPath }/statics/css/font-awesome.min.css" rel="stylesheet">
  <!-- NProgress -->
  <link href="${pageContext.request.contextPath }/statics/css/nprogress.css" rel="stylesheet">
  <!-- Animate.css -->
  <link href="${pageContext.request.contextPath }/statics/css/animate.min.css" rel="stylesheet">

  <!-- Custom Theme Style -->
  <link href="${pageContext.request.contextPath }/statics/css/custom.min.css" rel="stylesheet">

  <style>
    body.login {
      background-image: url('${pageContext.request.contextPath}/statics/images/backgroud_img.jpg') !important;
      background-size: cover !important;
      background-repeat: no-repeat !important;
      background-attachment: fixed !important;
    }
    .login_wrapper {
      max-width: 400px !important;
      margin: 0 auto !important;
      padding: 40px !important;
      /*background: rgba(255, 255, 255, 0.2) !important;*/
      /*backdrop-filter: blur(10px) !important; !* 添加毛玻璃效果 *!*/
      /*box-shadow: 100px 100px 300px rgba(0, 0, 0, 0.5) !important; !* 增加阴影的扩展范围 *!*/
      border-radius: 10px !important;
      margin-top: 10% !important;
    }

    .login_wrapper h1, .login_wrapper h2 {
      text-align: center;
      margin-bottom: 20px;
      color: #ffffff;
      text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.7); /* 调整阴影 */
    }
    .login_wrapper h1 {
      font-size: 26px !important;
      font-weight: bold !important;
    }
    .login_wrapper h2 {
      font-size: 20px;
      font-weight: normal;
      text-shadow: 1px 1px 3px rgba(0, 0, 0, 0.5); /* 调整阴影位置 */
    }
    .login_wrapper .form-control {
      background: rgba(255, 255, 255, 0.2) !important;
      border: 1px solid rgba(255, 255, 255, 0.3) !important;
      color: #fff !important;
      border-radius: 5px !important;
      padding: 10px !important;
      font-size: 15px !important;
      transition: background 0.3s, border-color 0.3s !important;
    }
    .login_wrapper .form-control::placeholder {
      color: #ffffff90 !important;
    }
    .login_wrapper .form-control:focus {
      background: rgba(255, 255, 255, 0.3) !important;
      border-color: #30cfd0 !important;
      outline: none !important;
      box-shadow: 0 0 5px rgba(48, 207, 208, 0.5) !important;
    }
    .login_wrapper .btn {
      display: block !important;
      width: 100% !important;
      margin-bottom: 15px !important;
      background-image: linear-gradient(to right, #30cfd0, #330867) !important;
      border: none !important;
      color: white !important;
      text-align: center !important;
      font-size: 15px !important;
      border-radius: 10px !important;
      padding: 10px !important;
      text-decoration: none !important;
      position: relative !important;
      overflow: hidden !important;
      z-index: 1 !important; /* 确保按钮文字在最上层 */
      transition: background-color 0.3s, border-color 0.3s !important; /* 添加过渡效果 */
    }
    .login_wrapper .btn::before {
      content: "" !important;
      position: absolute !important;
      top: 0 !important;
      left: -100% !important;
      width: 100% !important;
      height: 100% !important;
      background-image: linear-gradient(to right, #330867, #30cfd0) !important;
      transition: left 1s !important; /* 调整过渡时间 */
      z-index: -1 !important; /* 确保伪元素在按钮文字下层 */
    }
    .login_wrapper .btn:hover::before {
      left: 0 !important;
    }
    .login_wrapper .btn-default {
      display: block !important;
      width: 100% !important;
      margin-bottom: 15px !important;
      background-image: linear-gradient(to left, #30cfd0, #330867) !important;
      border: none !important;
      color: white !important;
      text-align: center !important;
      font-size: 15px !important;
      border-radius: 10px !important;
      padding: 10px !important;
      text-decoration: none !important;
      position: relative !important;
      overflow: hidden !important;
      z-index: 1 !important; /* 确保按钮文字在最上层 */
      transition: background-color 0.3s, border-color 0.3s !important; /* 添加过渡效果 */
    }
    .login_wrapper .btn-default::before {
      content: "" !important;
      position: absolute !important;
      top: 0 !important;
      left: -100% !important;
      width: 100% !important;
      height: 100% !important;
      background-image: linear-gradient(to left, #330867, #30cfd0) !important;
      transition: left 1s !important; /* 调整过渡时间 */
      z-index: -1 !important; /* 确保伪元素在按钮文字下层 */
    }
    .login_wrapper .separator {
      text-align: center !important;
      margin-top: 20px !important;
      color: #ffffff90 !important;
    }
    .login_wrapper .separator p {
      margin: 0 !important;
    }
  </style>
</head>

<body class="login">
<div>
  <a class="hiddenanchor" id="signup"></a>
  <a class="hiddenanchor" id="signin"></a>

  <div class="login_wrapper">
    <div class="animate form login_form">
      <section class="login_content">
        <form action="dologin" method="post">
          <h1>超市进销存管理系统</h1>
          <h2>管理员登录</h2>
          <div>
            <input type="text" class="form-control" name="managerid" placeholder="请输入用户名" required="" />
          </div>
          <div>
            <input type="password" class="form-control" name="pwd" placeholder="请输入密码" required="" />
          </div>
          <span>${error}</span>
          <div>
            <button type="submit" class="btn btn-success">登     录</button>
            <button type="reset" class="btn btn-default">重　填</button>
          </div>

          <div class="clearfix"></div>

          <div class="separator">
            <div>
              <p>@2018 Binvor </p>
            </div>
          </div>
        </form>
      </section>
    </div>
  </div>
</div>
</body>
</html>
