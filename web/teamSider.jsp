<%@ page language="java" pageEncoding="utf-8"%>


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

        <li class="treeview">
            <a href="#">
                <i class="fa fa-table"></i> <span>赛事安排</span>
                <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
            </a>
            <ul class="treeview-menu">
                <li><a href="match.jsp"><i class="fa fa-circle-o"></i> 比赛</a></li>
                <li><a href="endEnroll.jsp"><i class="fa fa-circle-o"></i> 结束报名阶段 </a></li>
                <li><a href="ruleSet.jsp"><i class="fa fa-circle-o"></i> 比赛规则设置 </a></li>

            </ul>
        </li>

    </ul>
</section>
    <!-- /.sidebar -->
</aside>