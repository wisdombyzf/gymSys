<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>比赛规则设置页面</title>
    <jsp:include page="Common_css_js.jsp"></jsp:include>
</head>

<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <jsp:include page="teamHeader.jsp"></jsp:include>
    <!-- Left side column. contains the logo and sidebar -->
    <jsp:include page="teamSider.jsp"></jsp:include>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                赛事
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-table"></i>赛事表</a></li>
                <li class="active">赛事表</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">

            <div class="login-box-body">

                <form action="set_rules.action" method="post">
                    <div class="form-group has-feedback">
                        <input type="text" name="teamPlayerPerGroup" class="form-control" placeholder="每组最大人数">
                        <span class="glyphicon glyphicon-user form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="text" name="playerPerMatch" class="form-control" placeholder="每场比赛上场人数">
                        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                    </div>

                    <div class="form-group has-feedback">
                        <input type="text" name="playerCountInGroupScore" class="form-control" placeholder="计入团体成绩的最小人数">
                        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                    </div>
                    <div class="row">
                        <div class="col-xs-12">
                            <input type="submit" value="确认报添加比赛规则" class="btn btn-primary btn-block btn-flat"/>
                        </div>
                        <!-- /.col -->
                    </div>
                </form>
            </div>
            <!-- /.login-box-body -->
            <!-- /.row -->
        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->


</div>
<!-- ./wrapper -->


</body>
</html>
