<%@ page language="java" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>裁判员主界面</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.7 -->

    <link rel="stylesheet" href="/master/bower_components/bootstrap/dist/css/bootstrap.min.css" >
    <!-- Font Awesome -->

    <link rel="stylesheet" href="/master/bower_components/font-awesome/css/font-awesome.min.css" >
    <!-- Ionicons -->

    <link rel="stylesheet" href="/master/bower_components/Ionicons/css/ionicons.min.css" >
    <!-- BootstrapTables -->

    <link rel="stylesheet" href="/master/bower_components/bootstrap-table-master/dist/bootstrap-table.css" >

    <link rel="stylesheet" href="/master/bower_components/bootstrap-table-click-edit-row/bootstrap-table-click-edit-row.css" >
    <!-- Theme style -->

    <link rel="stylesheet" href="/master/dist/css/AdminLTE.min.css" >
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->

    <link rel="stylesheet" href="/master/dist/css/skins/skin-blue.css" >

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!-- Google Font -->
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">

</head>

<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <header class="main-header">
        <!-- Logo -->
        <a href="." class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b></b></span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>zf</b><small>赛事管理系统</small></span>
        </a>
        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>

            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- User Account: style can be found in dropdown.less -->
                    <li class="dropdown user user-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img src="/master/dist/img/user2-160x160.jpg"   class="user-image" alt="User Image">
                            <span class="hidden-xs">CodeofJackie</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- User image -->
                            <li class="user-header">
                                <img src="/master/dist/img/user2-160x160.jpg"   class="img-circle" alt="User Image">

                                <p>
                                    CodeofJackie - Web Developer
                                    <small>Member since Nov. 2012</small>
                                </p>
                            </li>
                            <!-- Menu Footer-->
                            <li class="user-footer">
                                <div class="pull-left">
                                    <a href="#" class="btn btn-default btn-flat">用户</a>
                                </div>
                                <div class="pull-right">
                                    <a href="#" class="btn btn-default btn-flat">登出</a>
                                </div>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
    </header>

    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- 侧边栏 用户 面板 -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="/master/dist/img/user2-160x160.jpg"  class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p>CodeofJackie</p>
                    <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
                </div>
            </div>

            <!-- 侧边栏菜单: : style can be found in sidebar.less -->
            <ul class="sidebar-menu" data-widget="tree">
                <li class="header">主菜单</li>

                <li class="treeview active">
                    <a href="#">
                        <i class="fa fa-edit"></i> <span>报名</span>
                        <span class="pull-right-container">
                                <i class="fa fa-angle-left pull-right"></i>
                            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li class="active"><a href="#"><i class="fa fa-circle-o"></i> 填写报名表</a></li>
                        <li><a href="#" onclick="disp_alert()"><i class="fa fa-circle-o"></i>查看报名信息</a></li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-table"></i> <span>赛事安排</span>
                        <span class="pull-right-container">
                                <i class="fa fa-angle-left pull-right"></i>
                            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="#" onclick="disp()"> 赛事表</a></li>
                    </ul>
                </li>
            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>

                <small>哈哈哈</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="firstJudgerIndex.jsp"><i class="fa fa-dashboard"></i> 总裁判界面 </a></li>
                <li><a href="judgerIndex.jsp"><i class="fa fa-dashboard"></i> 分裁判界面 </a></li>

                <li class="active">填写报名表</li>
            </ol>
        </section>

        <!-- Main content -->

    </div>
    </section>
    <!-- /.content -->
</div>
<!-- /.content-wrapper -->
<footer class="main-footer">
    <div class="pull-right hidden-xs">
        <b>Version</b> 1.0.0
    </div>
    <strong>Copyright &copy; 2017 codeofjackie.</strong> All rights
    reserved.Support by <a href="https://adminlte.io">Almsaeed Studio</a>
</footer>
<!-- ./wrapper -->
<!--Enroll.js-->
<script src="/master/dist/js/Enroll.js"  ></script>
<!-- jQuery 3 -->
<script src="/master/bower_components/jquery/dist/jquery.min.js" ></script>
<!-- Bootstrap 3.3.7 -->
<script src="/master/bower_components/bootstrap/dist/js/bootstrap.min.js" ></script>
<!-- BootstrapTables -->
<script src="/master/bower_components/bootstrap-table-master/dist/bootstrap-table.js" ></script>
<script src="/master/bower_components/bootstrap-table-master/dist/locale/bootstrap-table-zh-CN.js" ></script>
<script src="/master/bower_components/bootstrap-table-click-edit-row/bootstrap-table-click-edit-row.js" ></script>
<script src="/master/bower_components/bootstrap-table-toolbar/bootstrap-table-toolbar.js" ></script>
<!-- SlimScroll -->
<script src="/master/bower_components/jquery-slimscroll/jquery.slimscroll.min.js" ></script>
<!-- FastClick -->
<script src="/master/bower_components/fastclick/lib/fastclick.js" ></script>
<!-- AdminLTE App -->
<script src="/master/dist/js/adminlte.min.js" ></script>
<!-- AdminLTE for demo purposes -->
<script src="/master/dist/js/demo.js" ></script>
<!-- page script -->
<!-------表单验证---------------------------->

<script src="/master/dist/js/bootstrap/jquery-1.10.2.min.js" ></script>

<script src="/master/dist/js/bootstrap/bootstrap.min.js" ></script>

<script src="/master/dist/js/bootstrap/bootstrapValidator.js" ></script>

</body>
</html>
