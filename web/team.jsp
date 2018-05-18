<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>添加队伍信息页面</title>
  <jsp:include page="Common_css_js.jsp"></jsp:include>

</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">


  <!-- 头部 -->
  <jsp:include page="teamHeader.jsp"></jsp:include>
  <!-- 左侧菜单 -->
  <jsp:include page="teamSider.jsp"></jsp:include>



  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        参赛队伍
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-flag"></i>队伍表</a></li>
        <li class="active">队伍表</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">

          <div class="box">
            <div class="box-body">
              <div id="toolbar">


                <button id="delete"
                        class="btn btn-default"
                        data-toggle="modal"
                        data-target="#exampleModa2">
                  删除
                </button>

                  <button id="create" 
                  class="btn btn-default"
                  data-toggle="modal" 
                  data-target="#exampleModal">
                  添加
                  </button>
                </div>
              <table id="team" class="table table-bordered table-striped">
              </table>
            </div>
            <!-- /.box-body -->
          </div>
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


<!-- page script -->
<script>
  $(function () {
    $('#team').bootstrapTable({
      url: "http://"+window.location.hostname+":8080/get_team",
      clickEdit: true,
      pagination:true,
      search:true,
      showRefresh:true,
      showToggle:true,
      showColumns:true,
      advancedSearch:true,
      uniqueId:"Team",
      toolbar:"#toolbar",
      sortable:true,
      idTable:"advancedTable",
      columns: [{
          field: 'state',
          checkbox:true,
      },{
          field: 'teamName',
          title: '小队姓名'
      }, {
          field: 'teamAccount',
          title: '账号',
          sortable: true,
          editable:"input"
      }, {
          field: 'password',
          title: '密码',
          sortable: true,
          editable:"input"
      }],
      responseHandler: function (res) {
          return res;
      }
    });
  })

  $(function () {
      $('#delete').click(function () {
          var pk = $.map($("#team").bootstrapTable('getSelections'), function (row) {
              return row.pk;
          });
          $.post("Set",{
            Type:"Delete",
            Table:"Team",
            pk:pk[0]
          },
          $("#team").bootstrapTable('refresh')
          )
          //并且执行向服务器的提交过程
      });
    });
</script>
</body>


<!-- 添加队伍记录 -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="exampleModalLabel">添加记录</h4>
      </div>
      <div class="modal-body">
        <div class="container-fluid" style="padding-right: 0px;padding-left: 0px;">
        <form class="form-horizontal" method="post" action="add_team.action">
          <div class="form-group" style="display:none">
            <label for="Type" class="control-label col-sm-4">操作类型</label>
            <div class="col-sm-6"><input required type="text" class="form-control input-md" id="Type" name="Type" value="Add"></div>
          </div>
          <div class="form-group" style="display:none">
              <label for="Table" class="control-label col-sm-4">操作表</label>
              <div class="col-sm-6"><input required type="text" class="form-control input-md" id="Table" name="Table" value="Team"></div>
          </div>
          <div class="form-group">
            <label for="TeamName" class="control-label col-sm-4">小队名称</label>
            <div class="col-sm-6"><input required type="text" class="form-control input-md" id="teamName" name="TeamName"></div>
          </div>
          <div class="form-group">
            <label for="TeamAccount" class="control-label col-sm-4">账号</label>
            <div class="col-sm-6"><input required type="text" class="form-control input-md" id="TeamAccount" name="TeamAccount"></div>
          </div>
          <div class="form-group">
              <label for="Password" class="control-label col-sm-4">密码</label>
              <div class="col-sm-6"><input required type="text" class="form-control input-md" id="Password" name="Password"></div>
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

<!-- 删除队伍记录 -->
<div class="modal fade" id="exampleModa2" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="exampleModalLabel">添加记录</h4>
      </div>
      <div class="modal-body">
        <div class="container-fluid" style="padding-right: 0px;padding-left: 0px;">
          <form class="form-horizontal" method="post" action="delete_team.action">
            <div>
              <label for="TeamName" class="control-label col-sm-4">将要删除的小队名称</label>
              <div class="col-sm-6"><input required type="text" class="form-control input-md" id="teamName" name="teamName"></div>
            </div>

            <div class="form-group">
              <div class="col-xs-6"><button type="submit" class="btn btn-primary pull-right">确认删除</div>
              <div class="col-xs-6"><button type="button" class="btn btn-default" data-dismiss="modal">取消</button></div>
            </div>
          </form>




        </div>
      </div>
    </div>
  </div>
</div>

</html>
