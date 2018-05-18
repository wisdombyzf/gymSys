<%@ page language="java" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>管理员主页</title>
  <jsp:include page="Common_css_js.jsp"></jsp:include>
</head>
<body class="hold-transition skin-blue sidebar-mini">
  <div class="wrapper">
      <jsp:include page="teamSider.jsp"></jsp:include>
      <!-- Left side column. contains the logo and sidebar -->
      <jsp:include page="teamSider.jsp"></jsp:include>
      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
              比赛
              <small>概览</small>
            </h1>
            <ol class="breadcrumb">
              <li><a href="#"><i class="fa fa-dashboard"></i> 比赛信息概览</a></li>
            </ol>
          </section>

        <!-- Main content -->
        <section class="content">
          <!-- Small boxes (Stat box) -->
          <div class="row">
            <div class="col-lg-3 col-xs-6">
              <!-- small box -->
              <div class="small-box bg-light-blue">
                <div class="inner">
                  <h3 id="PlayerCount"></h3>
                  <p>参赛人数</p>
                </div>
                <div class="icon">
                  <i class="ion ion-person"></i>
                </div>
                <a href="/GameAdmin/Player" class="small-box-footer">更多信息 <i class="fa fa-arrow-circle-right"></i></a>
              </div>
            </div>
            <!-- ./col -->
            <div class="col-lg-3 col-xs-6">
              <!-- small box -->
              <div class="small-box bg-yellow">
                <div class="inner">
                  <h3 id="TeamJoined"></h3>
                  <p>参赛队伍</p>
                </div>
                <div class="icon">
                  <i class="ion ion-flag"></i>
                </div>
                <a href="/GameAdmin/Match" class="small-box-footer">更多信息 <i class="fa fa-arrow-circle-right"></i></a>
              </div>
            </div>
            <!-- ./col -->
            <div class="col-lg-3 col-xs-6">
                <!-- small box -->
                <div class="small-box bg-red">
                  <div class="inner">
                    <h3 id="MatchRank">?</h3>
                    <p>比赛结果</p>
                  </div>
                  <div class="icon">
                    <i class="ion ion-trophy"></i>
                  </div>
                  <a href="/GameAdmin/ShowScore" class="small-box-footer">更多信息 <i class="fa fa-arrow-circle-right"></i></a>
                </div>
              </div>
              <!-- ./col -->
          </div>
          <!-- /.row -->
          <!-- Main row -->
          <div class="row">
            <!-- right col (We are only adding the ID to make the widgets sortable)-->
            <section class="col-lg-12 connectedSortable">
              <!-- Calendar -->
              <div class="box box-solid bg-green-gradient">
                <div class="box-header">
                  <i class="fa fa-calendar"></i>

                  <h3 class="box-title">日历</h3>
                  <!-- tools box -->
                  <div class="pull-right box-tools">
                    <!-- button with a dropdown -->
                    <button type="button" class="btn btn-success btn-sm" data-widget="collapse"><i class="fa fa-minus"></i>
                    </button>
                  </div>
                  <!-- /. tools -->
                </div>
                <!-- /.box-header -->
                <div class="box-body no-padding">
                  <!--The calendar -->
                  <div id="calendar" style="width: 100%"></div>
                </div>
                <!-- /.box-body -->
              </div>
              <!-- /.box -->

            </section>
            <!-- right col -->
          </div>
          <!-- /.row (main row) -->

        </section>
        <!-- /.content -->
      </div>
      <!-- /.content-wrapper -->
      <footer class="main-footer">
        <div class="pull-right hidden-xs">
          <b>Version</b> 2.0.0
        </div>
        <strong>Copyright &copy; 2017 codeofjackie.</strong> All rights
        reserved.Support by <a href="https://adminlte.io">Almsaeed Studio</a>
      </footer>
</div>
<!-- ./wrapper -->

<script>  
  //试着给界面上的参赛人数提供功能
  $.getJSON("http://"+window.location.hostname+"/GameAdmin/GetJSON?Table=Player",function(data){
    $('#PlayerCount').append(data.length);
  });
  $.getJSON("http://"+window.location.hostname+"/GameAdmin/GetJSON?Table=Team",function(data){
    $('#TeamJoined').append(data.length);
  });
  
</script>
</body>
</html>





