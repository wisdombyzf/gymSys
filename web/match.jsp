<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>赛事安排页面</title>
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
     <link rel="stylesheet" href="/master/bower_components/bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css" >
  <!-- Theme style -->
     <link rel="stylesheet" href="/master/dist/css/AdminLTE.min.css" >
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
     <link rel="stylesheet" href="/master/dist/css/skins/skin-blue.css" >
     <link rel="stylesheet" href="/master/bower_components/bootstrap-select/dist/css/bootstrap-select.min.css" >

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

  <!-- Google Font -->
  <!--<link rel="stylesheet"
        href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">-->
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <header class="main-header">
    <!-- Logo -->
    <a href="." class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>及讯</b></span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>及讯</b><small>赛事管理系统</small></span>
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
                  <a href="LogoutAdmin" class="btn btn-default btn-flat">登出</a>
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
          <img src="/master/dist/img/user2-160x160.jpg"   class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>CodeofJackie</p>
          <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
        </div>
      </div>
      <!-- 侧边栏菜单: : style can be found in sidebar.less -->
      <ul class="sidebar-menu" data-widget="tree">
        <li class="header">主菜单</li>

        <li class="treeview">
          <a href="#">
            <i class="fa fa-user"></i> <span>人员表</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
		      </a>
          <ul class="treeview-menu">
              <li><a href="player.jsp"><i class="fa fa-circle-o"></i>运动员表</a></li>
              <li><a href="teamjudge.jsp"><i class="fa fa-circle-o"></i>裁判表</a></li>
              <li><a href="teammedic.jsp"><i class="fa fa-circle-o"></i>队医表</a></li>
              <li><a href="teamcoach.jsp"><i class="fa fa-circle-o"></i>教练表</a></li>
              <li><a href="teamleader.jsp"><i class="fa fa-circle-o"></i>领队表</a></li>
          </ul>
        </li>
          <li class="active treeview">
              <a href="Match">
                  <i class="fa fa-flag"></i> <span>参赛队伍</span>
                  <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
            </span>
              </a>
              <ul class="treeview-menu">
                  <li><a href="team.jsp"><i class="fa fa-circle-o"></i>参赛队伍表</a></li>
              </ul>
          </li>


        <li class="active treeview">
          <a href="#">
            <i class="fa fa-table"></i> <span>赛事安排</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="#match"><i class="fa fa-circle-o"></i> 赛事表</a></li>
            <li><a href="#title-score"><i class="fa fa-circle-o"></i> 打分表</a></li>
            <li><a href="#title-matchjudge"><i class="fa fa-circle-o"></i> 裁判表</a></li>
            <li><a href="#title-playmatch"><i class="fa fa-circle-o"></i> 得分表</a></li>
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
        赛事
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-table"></i>赛事表</a></li>
        <li class="active">赛事表</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">

          <div class="box box-danger">
            <div class="box-body">
              <h4>规则</h4>
                  <table id="rule" class="table table-bordered table-striped">
                  </table>
                </br>
              <form  action="Set" method="post">
                <div class="row">
                  <div class="col-sm-3 col-lg-3">
                    <div class="input-group">
                        <span class="input-group-addon" style="border-radius:3px 0px 0px 3px">TeamPlayerPerGroup</span>
                        <input type="text" class="form-control" name="TeamPlayerPerGroup">
                    </div>
                  </div>
                  <div class="col-sm-3 col-lg-3" >
                    <div class="input-group">
                        <span class="input-group-addon" style="border-radius:3px 0px 0px 3px">PlayerPerMatch</span>
                        <input type="text" class="form-control" name="PlayerPerMatch">
                    </div>
                  </div>
                  <div class="col-sm-3 col-lg-3">
                    <div class="input-group">
                        <span class="input-group-addon" style="border-radius:3px 0px 0px 3px">PlayerCountInGroupScore</span>
                        <input type="text" class="form-control" name="PlayerCountInGroupScore">
                    </div>
                  </div>
                  <div class="form-group" style="display:none">
                      <input required type="text" class="form-control input-md" name="Type" value="Add"/>
                      <input required type="text" class="form-control input-md" name="Table" value="GlobeMatchRule"/>
                      <input required type="text" class="form-control input-md" name="id" value="1"/>
                  </div>
                  <div class="col-sm-3 col-lg-3"><input type="submit" class="btn btn-primary" value="提交"/></div>
                </div>
              </form>
              </br>
            </div>
          </div>

          <div class="box box-primary">
              <div class="box-body">    
              <h4>赛事表</h4>
              <br/>
              <div id="toolbar">
                  <%--<button id="delete" class="btn btn-danger">删除</button>--%>
                  <%--<button id="create" class="btn btn-default" data-toggle="modal" data-target="#Modal-Match">--%>
                  <%--添加--%>
                  <%--</button>--%>
                  <%--<button id="startgame" class="btn btn-primary">开始比赛</button>--%>
                  <%--<button id="details" class="btn btn-info">详细</button>--%>
                  <%--<button id="generatefinal" class="btn btn-danger">安排决赛</button>--%>
              </div>
              <table id="match" class="table table-bordered table-striped">
              </table>
              </div>
            </div>

          <%--<div class="box box-info">--%>
              <%--<div class="box-body"> --%>
                <%--<div class="col-xs-6">--%>
                  <%--<h4 id="title-score">打分表</h4>--%>
                <%--<table id="score" class="table table-bordered table-striped">--%>
                <%--</table>--%>
                <%--</div>--%>
            <%----%>
                <%--<div class="col-xs-6">--%>
                    <%--<h4 id="title-matchjudge">裁判表</h4>--%>
                  <%--<table id="matchjudge" class="table table-bordered table-striped">--%>
                  <%--</table>--%>
                <%--</div>--%>
              <%--</div>--%>
          <%--</div>--%>
          <%----%>
          <%--<div class="box box-info">--%>
            <%--<div class="box-body"> --%>
              <%--<div class="col-xs-12">--%>
                  <%--<h4 id="title-playmatch">得分表</h4>--%>
                  <%--<div id="toolbar-playmatch"><button class="btn btn-danger" id="start-score">开始打分</button></div>--%>
                  <%--<table id="playmatch" class="table table-bordered table-striped">--%>
                  <%--</table>--%>
              <%--</div>--%>
            <%--</div>--%>
            <%--<!-- /.box-body -->--%>
          <%--</div>--%>
          <!-- /.box -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->
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

<!-- jQuery 3 -->
<script src="/master/bower_components/jquery/dist/jquery.min.js" ></script>
<!-- Bootstrap 3.3.7 -->
<script src="/master/bower_components/bootstrap/dist/js/bootstrap.min.js" ></script>
<script src="/master/bower_components/jquery-validate/jquery-validate.min.js" ></script>
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
<script src="/master/bower_components/fastclick/lib/fastclick.js" ></script>
<script src="master/bower_components/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js" ></script>
<script src="master/bower_components/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js" ></script>

<script src="/master/bower_components/bootstrap-select/dist/js/bootstrap-select.min.js" ></script>
<script src="/master/bower_components/bootstrap-select/dist/js/i18n/defaults-zh_CN.min.js" ></script>
<!-- page script -->
<script>
  
  //初始化表格
  var $table = $('#match');
  $(function () {
      $('#rule').bootstrapTable({
        url: "http://"+window.location.hostname+":8080/get_rules",
        uniqueId:"GlobeMatchRule",
        columns: [ {
          field: 'teamPlayerPerGroup',
          title: 'TeamPlayerPerGroup'
        }, {
          field: 'playerPerMatch',
          title: 'PlayerPerMatch'
        }, {
          field: 'playerCountInGroupScore',
          title: 'PlayerCountInGroupScore'
        }],
        responseHandler: function (res) {
          return res;
        }
    });

    $('#match').bootstrapTable({
      url: "http://"+window.location.hostname+":8080/get_match",
      clickEdit: true,
      pagination:true,
      search:true,
      showRefresh:true,
      showToggle:true,
      showColumns:true,
      advancedSearch:true,
      uniqueId:"Match",
      toolbar:"#toolbar",
      sortable:true,
      idTable:"advancedTable",
      columns: [{
          field: 'state',
          checkbox:true,
      }, 
        {
          field: 'matchId',
          title: '比赛号'
      }, {
          field: 'playerGroup',
          title: '比赛年龄组',
          sortable: true
      }, {
          field: 'event',
          title: '项目',
          sortable: true
      }, {
          field: 'chiefId',
          title: '主裁判身份证',
          sortable: true,
          editable:"input"
      }, {
          field: 'satrtTime',
          title: '预期开始时间',
          sortable: true,
          editable:"input"
      }, {
          field: 'endTime',
          title: '预期结束时间',
          sortable: true,
          editable:"input"
      }, {
          field: 'matchType',
          title: '比赛类型',
          sortable: true
      }, {
          field: 'matchStatus',
          title: '比赛状态'
      },{
          field: 'subGroup',
          title: '子组'
      }],
      responseHandler: function (res) {
          return res;
      }
    });

    $('#score').bootstrapTable({
      url: "http://"+window.location.hostname+"/GameAdmin/GetJSON?Table=Score&MatchID=1",
      clickEdit: true,
      showRefresh:true,
      toolbar:"#title-score",
      uniqueId:"Score",
      sortable:true,
      columns: [{
          field: 'state',
          checkbox:true,
      }, {
          field: 'fields.MatchID',
          title: '比赛号',
          sortable:true
      }, {
          field: 'fields.ID',
          title: '裁判身份证',
          sortable:true
      }, {
          field: 'fields.PlayerID',
          title: '运动员号',
          sortable:true
      },{
          field: 'fields.Score',
          title: '成绩',
          editable:"input",
          sortable:true
      }],
      responseHandler: function (res) {
          return res;
      }
    });
    $('#matchjudge').bootstrapTable({
      url: "http://"+window.location.hostname+"/GameAdmin/GetJSON?Table=MatchJudge&MatchID=1",
      clickEdit: true,
      showRefresh:true,
      uniqueId:"MatchJudge",
      toolbar:"#title-matchjudge",
      sortable:true,
      columns: [{
          field: 'state',
          checkbox:true
      }, {
          field: 'fields.MatchID',
          title: '比赛号',
          sortable:true
      }, {
          field: 'fields.ID',
          title: '裁判身份证',
          sortable:true
      }, {
          field: 'fields.IsChief',
          title: '是否为主裁判',
          editable:"input"
      }],
      responseHandler: function (res) {
          return res;
      }
    });
    $('#playmatch').bootstrapTable({
      url:"http://"+window.location.hostname+"/GameAdmin/GetJSON?Table=PlayMatch",
      clickEdit: true,
      showRefresh:true,
      sortable:true,
      toolbar:"#toolbar-playmatch",
      uniqueId:"PlayMatch",
      columns: [{
          field: 'state',
          checkbox:true,
      }, {
          field: 'fields.MatchID',
          title: '比赛号',
          sortable:true
      },{
          field: 'fields.PlayerID',
          title: '运动员号',
          sortable:true
      },{
          field: 'fields.DScore',
          title: 'D分',
          editable:"input",
          sortable:true
      },{
          field: 'fields.PScore',
          title: 'P分',
          editable:"input",
          sortable:true,
      },{
          field: 'fields.AllScore',
          title: '总分',
          sortable:true
      },{
          field: 'fields.ScoreState',
          title: '打分状态'
      }],
      responseHandler: function (res) {
          return res;
      }
    });
  })

  //Match表删除操作
  $(function () {
      $('#delete').click(function () {
          var pk = $.map($("#match").bootstrapTable('getSelections'), function (row) {
              return row.pk;
          });
          $.post("Set",{
            Type:"Delete",
            Table:"Match",
            pk:pk[0]
          },
          $("#match").bootstrapTable('refresh')
          )
          //并且执行向服务器的提交过程
      });
  });

  //通知比赛开始
  $(function () {
    $('#startgame').click(function () {
      var pk = $.map($("#match").bootstrapTable('getSelections'), function (row) {
            return row.pk;
        });
      //用于通知比赛开始
      $.post("Set",{
          Type:"Upgrade",
          Table:"Match",
          MatchID:pk[0],
          MatchStatus:"Running"
      },
      $("#match").bootstrapTable('refresh')
      );
    });
  });

  //通知开始打分
  $(function () {
    $('#start-score').click(function () {
      var pk = $.map($("#playmatch").bootstrapTable('getSelections'), function (row) {
            return [row.fields.MatchID,row.fields.PlayerID];
        });
      //用于通知打分开始
      $.post("Set",{
          Type:"Upgrade",
          Table:"PlayMatch",
          MatchID:pk[0],
          PlayerID:pk[1],
          ScoreState:1
      },
      $("#playmatch").bootstrapTable('refresh')
      );
    });
  });
  //安排决赛
  $('#generatefinal').click(function(){
    $.post("http://"+window.location.hostname+"/GameAdmin/GenerateFinal");
  });
</script>

  <div class="modal fade" id="Modal-Match" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <h4 class="modal-title" id="exampleModalLabel">添加记录</h4>
        </div>
        <div class="modal-body">
          <div class="container-fluid" style="padding-right: 0px;padding-left: 0px;">
          <form id ="AddMatch"class="form-horizontal" method="post" action="Set">
            <div class="form-group" style="display:none">
              <label for="Type" class="control-label col-sm-4">操作类型</label>
              <div class="col-sm-6"><input type="text" class="form-control input-md" id="Type" name="Type" value="Add"></div>
            </div>
            <div class="form-group" style="display:none">
                <label for="Table" class="control-label col-sm-4">操作表</label>
                <div class="col-sm-6"><input type="text" class="form-control input-md" id="Table" name="Table" value="Match"></div>
            </div>
            <div class="form-group" style="display:none">
                <label for="MatchStatus" class="control-label col-sm-4">操作表</label>
                <div class="col-sm-6"><input type="text" class="form-control input-md" id="Table" name="MatchStatus" value="Waiting"></div>
            </div>
            <div class="form-group">
              <label for="MatchID" class="control-label col-sm-4">比赛号</label>
              <div class="col-sm-6"><input type="text" class="form-control input-md" id="MatchID" name="MatchID" required></div>
            </div>
            <div class="form-group">
                <label for="Group" class="control-label col-sm-4">比赛年龄组</label>
                <div class="col-sm-6">
                  <select class="form-control selectpicker show-tick" id="Group" name="Group" required>
                    <option value="Male1">Male1</option>
                    <option value="Male2">Male2</option>
                    <option value="Male3">Male3</option>
                    <option value="FeMale1">FeMale1</option>
                    <option value="FeMale2">FeMale2</option>
                    <option value="FeMale3">FeMale3</option>
                  </select>
                </div>
            </div>
            <div class="form-group">
                <label for="Event" class="control-label col-sm-4">项目</label>
                <div class="col-sm-6">
                    <select class="form-control selectpicker show-tick" id="Event" name="Event" required>
                      <option value="DG">单杠（DG）</option>
                      <option value="SG">双杠(SG)</option>
                      <option value="DH">吊环(DH)</option>
                      <option value="TM">跳马(TM)</option>
                      <option value="TC">体操(TC)</option>
                      <option value="AM">鞍马(AM)</option>
                      <option value="BC">蹦床(BC)</option>
                      <option value="GD">高低杠(GD)</option>
                      <option value="PH">平衡木(PH)</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label for="ChiefID" class="control-label col-sm-4">主裁判身份证</label>
                <div class="col-sm-6">
                  <select class="form-control selectpicker show-tick" id="ChiefID" name="ChiefID_id" required>
                  </select>
                </div>
            </div>
            <div class="form-group">
                <label for="StartTime" class="control-label col-sm-4">预期开始时间</label>
                <div class="col-sm-6"><input type="text" class="form-control input-md" id="StartTime" name="StartTime" required data-date-format="yyyy-mm-dd hh:ii"></div>
            </div>
            <div class="form-group">
                <label for="EndTime" class="control-label col-sm-4">预期结束时间</label>
                <div class="col-sm-6"><input type="text" class="form-control input-md" id="EndTime" name="EndTime" required data-date-format="yyyy-mm-dd hh:ii"></div>
            </div>
            <div class="form-group">
                <label for="MatchType" class="control-label col-sm-4">比赛类型</label>
                <div class="col-sm-6">
                <select class="form-control selectpicker show-tick" id="MatchType" name="MatchType" required>
                  <option value="1">1. 初赛</option>
                </select>
                </div>
            </div>
            <div class="form-group">
                <label for="SubGroup" class="control-label col-sm-4">子组</label>
                <div class="col-sm-6"><input type="number" min="1" class="form-control input-md" id="SubGroup" name="SubGroup" required></div>
            </div>
            <div class="form-group">
                <label for="ParticipatePlayer" class="control-label col-sm-4">参赛选手</label>
                <div class="col-sm-6">
                  <select class="form-control selectpicker show-tick" required multiple id="ParticipatePlayer" name="ParticipatePlayer">
                  </select>
                </div>
            </div>
            <div class="form-group">
              <label for="ParticipateJudge" class="control-label col-sm-4">裁判</label>
              <div class="col-sm-6">
                <select class="form-control selectpicker show-tick" required multiple data-max-options="5" id="ParticipateJudge" name="ParticipateJudge">
                </select>
              </div>
            </div>		  
            <div class="form-group">
              <div class="col-xs-6"><button type="submit" class="btn btn-primary pull-right">确认</div>
              <div class="col-xs-6"><button type="button" class="btn btn-default" data-dismiss="modal">取消</button></div>
            </div>
          </form>
          </div>
        </div>
      </div>
    </div>
  </div>

  <script>
    $('#StartTime').datetimepicker();
    $('#EndTime').datetimepicker();

    //显示单场比赛详细信息
    $(function () {
      $('#details').click(function () {
        var pk = $.map($("#match").bootstrapTable('getSelections'), function (row) {
              return row.pk;
        });
        $("#playmatch").bootstrapTable('refresh',{url:"http://"+window.location.hostname+"/GameAdmin/GetJSON?Table=PlayMatch&MatchID="+pk[0]});
        $("#score").bootstrapTable('refresh',{url:"http://"+window.location.hostname+"/GameAdmin/GetJSON?Table=Score&MatchID="+pk[0]});
        $("#matchjudge").bootstrapTable('refresh',{url:"http://"+window.location.hostname+"/GameAdmin/GetJSON?Table=MatchJudge&MatchID="+pk[0]});
      });
    });

    //参赛选手选项
    var playerSelect = function(){
      $.ajax({  
        // // get请求地址  
        // url: 'http://'+window.location.hostname+'/GameAdmin/GetJSON?Table=Match',
        // dataType: "json",  
        // success: function (data) {
        //   data.forEach(element => {
        //     if (
        //       element.fields.Event==$("#Event").val()&&
        //       element.fields.Group==$("#Group").val()&&
        //       element.fields.SubGroup==$("#SubGroup").val()&&
        //       element.fields.MatchType==$("#MatchType").val()
        //     ) {
        //       var matchid = element.fields.MatchID;
        //       $.ajax({  
        //         // get请求地址  
                url: 'http://'+window.location.hostname+'/GameAdmin/GetJSON?Table=Player',
                dataType: "json",
                success: function (data) {
                  // var canDisplay = function (player) {
                  //   if((player.MatchID==$('#MatchID').val()))
                  //       return false;//如果该运动员已经被安排到某个项目的某个子组下，就不能重复添加。
                  //   else return true;
                  // }
                  $('#ParticipatePlayer').empty();
                  for (var i = 0; i < data.length; i++) {
                    // var player = data[i];
                    // // if (canDisplay(player)) {
                      $('#ParticipatePlayer').append('<option value="' + data[i].pk + '">'+
                      data[i].fields.Name +'</option>');
                    // }
                  }
                  // 缺一不可  
                  $('#ParticipatePlayer').selectpicker('refresh');  
                  $('#ParticipatePlayer').selectpicker('render');
                }
        //       });
        //     }
        //   });
        // }
      });
    }
    
    playerSelect();
    $("#Group").change(function () {
      playerSelect();
    });
    $("#Event").change(function () {
      playerSelect();
    });
    $("#SubGroup").change(function () {
      playerSelect();
    });
    $("#MatchType").change(function () {
      playerSelect();
    });

    //主裁判选项
    $.ajax({  
        // get请求地址  
        url: 'http://'+window.location.hostname+'/GameAdmin/GetJSON?Table=Judge',  
        dataType: "json",  
        success: function (data) {  
        var optArr = [];  
        for (var i = 0; i < data.length; i++) {
          $('#ChiefID').append('<option value="' + data[i].pk + '">'+
          data[i].pk +'</option>');
        }
        // 缺一不可  
        $('#ChiefID').selectpicker('refresh');  
        $('#ChiefID').selectpicker('render');
        }
    });
    //其他裁判选项
    var otherjudgeitem = {  
        // get请求地址  
        url: 'http://'+window.location.hostname+'/GameAdmin/GetJSON?Table=Judge',  
        dataType: "json",  
        success: function (data) {  
          for (var i = 0; i < data.length; i++) {
            if($('#ChiefID').val()!=data[i].pk){
                $('#ParticipateJudge').append('<option value="' + data[i].pk + '">'+
                data[i].pk +'</option>');
            }
          }
          // 刷新下拉选框，缺一不可  
          $('#ParticipateJudge').selectpicker('refresh');  
          $('#ParticipateJudge').selectpicker('render');
        },
        error:function(res){$.ajax(otherjudgeitem);}
    };
    //初始化分裁判下拉选框
    $.ajax(otherjudgeitem);
    //当主裁判改变时，
    $("#ChiefID").change(function () {
      $('#ParticipateJudge').empty();
      $.ajax(otherjudgeitem);
      // 缺一不可  
      $('#ParticipateJudge').selectpicker('refresh');  
      $('#ParticipateJudge').selectpicker('render');
    });
  </script>

</body>
</html>
