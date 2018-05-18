<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>裁判表页面</title>
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
        裁判 
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-user"></i>人员表</a></li>
        <li class="active">裁判表</li>
      </ol>
    </section>     

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">
          <div class="box">
            <div class="box-body">
              <div id="toolbar">
                  <%--<button id="delete" class="btn btn-danger">删除</button>--%>
                  <%--<button id="create" --%>
                    <%--class="btn btn-default"--%>
                    <%--data-toggle="modal" --%>
                    <%--data-target="#exampleModal">--%>
                    <%--添加--%>
                  <%--</button>--%>
              </div>
              <table id="judge" class="table table-bordered table-striped">
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

<!-- jQuery 3 -->
<script src="/master/bower_components/jquery/dist/jquery.min.js" ></script>
<!-- Bootstrap 3.3.7 -->
<script src="/master/bower_components/bootstrap/dist/js/bootstrap.min.js" ></script>
<script src="/master/bower_components/inputmask/dist/min/jquery.inputmask.bundle.min.js" ></script>
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

<!-- page script -->
<script>

  $(function () {
    $('#judge').bootstrapTable({
      url: "http://"+window.location.hostname+":8080/get_juger",
      clickEdit: true,
      pagination:true,
      search:true,
      showRefresh:true,
      showToggle:true,
      showColumns:true,
      advancedSearch:true,
      toolbar:"#toolbar",
      sortable:true,
      uniqueId:"Judge",
      idTable:"advancedTable",
      columns: [{
          field: 'state',
          checkbox:true,
      },{
          field: 'id',
          title: '身份证号'
      }, {
          field: 'judgeAccount',
          title: '裁判账号',
          sortable: true,
          editable:"input"
      }, {
          field: 'name',
          title: '姓名',
          sortable: true,
          editable:"input"
      }, {
          field: 'teamName',
          title: '小队名称',
          sortable: true
       }, {
          field: 'phoneNum',
          title: '电话',
          sortable: true,
          editable:"input"
      },{
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

  //删除操作
  $(function () {
      $('#delete').click(function () {
          var pk = $.map($("#judge").bootstrapTable('getSelections'), function (row) {
              return row.pk;
          });
          $.post("Set",{
            Type:"Delete",
            Table:"Judge",
            pk:pk[0]
          }),
          $("#judge").bootstrapTable('refresh')
          //并且执行向服务器的提交过程
      });
  });

</script>

<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="exampleModalLabel">添加记录</h4>
      </div>
      <div class="modal-body">
        <div class="container-fluid" style="padding-right: 0px;padding-left: 0px;">
        <form class="form-horizontal" method="post" action="Set">
          <div class="form-group" style="display:none">
            <label for="Type" class="control-label col-sm-4">操作类型</label>
            <div class="col-sm-6"><input required type="text" class="form-control input-md" id="Type" name="Type" value="Add"></div>
          </div>
          <div class="form-group" style="display:none">
              <label for="Table" class="control-label col-sm-4">操作表</label>
              <div class="col-sm-6"><input required type="text" class="form-control input-md" id="Table" name="Table" value="Judge"></div>
          </div>
          <div class="form-group">
            <label for="ID" class="control-label col-sm-4">身份证号</label>
            <div class="col-sm-6"><input required type="text" class="form-control input-md" id="ID" name="ID"></div>
          </div>
          <div class="form-group">
            <label for="JudgeAccount" class="control-label col-sm-4">裁判账号</label>
            <div class="col-sm-6"><input required type="text" class="form-control input-md" id="JudgeAccount" name="JudgeAccount"></div>
          </div>
          <div class="form-group">
              <label for="Name" class="control-label col-sm-4">姓名</label>
              <div class="col-sm-6"><input required type="text" class="form-control input-md" id="Name" name="Name"></div>
          </div>
          <div class="form-group">
              <label for="PhoneNum" class="control-label col-sm-4">电话</label>
              <div class="col-sm-6"><input required type="text" class="form-control input-md" id="PhoneNum" name="PhoneNum"></div>
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

</body>
</html>
