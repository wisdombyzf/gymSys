﻿<%@ page language="java" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>

<script text="text/javascript">

    var flag = {{flag|safe}};
    var list = {{list|safe}};
	var PlayerID = list.PlayerID;
	var MatchID = list.MatchID;
    //var str = "";

	var score1="";
	var score2="";


	//主裁判信息示例,依次为：项目，运动员姓名，比赛号，运动员号，比赛状态，裁判一账号、所给分数、分数状态，裁判二---，裁判三---，裁判四---，裁判五---
	//flag=1;
    //list = {"Event":"单杠","PlayerName":"张三","MatchID":00,"PlayerID":00,"ScoreState": "Running","JudgeID1":"002","Score1":3,"ScoreAccept1":0,"JudgeID2":"003","Score2":4,"ScoreAccept2":1,"JudgeID3":"004","Score3":5,"ScoreAccept3":2,"JudgeID4":"005","JudgeID5":"006","Score4":"-1","ScoreAccept4":0,"Score5":"-1","ScoreAccept5":0,}
;


	//分裁判信息示例
	//flag=2;
    //list = {"Event":"单杠","PlayerName":"张三","MatchID":00,"PlayerID":00,"Score": -1,"ScoreAccept":0};
	//ScoreAccept默认为0,1表示被拒绝，2表示被接受
	//flag=0;


	function idle(){
		if (flag == 0)
		{
			idle0();
		}
		else if (flag==2)
		{
			idle2(list);
		}
		else if (flag==1)
		{
			idle1(list);
		}
	}
	function idle0()
	{
		var str = "You are free now!";
	    document.getElementById("mainOfJudge").innerHTML=str;
	}
	function idle2(list)
	{
		var str = "";
	    str+="</br></br>";

	    //开始打分
	    if (list.Score==-1)
	    {
		    str+="<div class='box box-info'>";
		    str+="<div class='box-header with-border'><h3 class='box-title'>比赛信息</h3></div>";
		    str+="<form method='post' action='submitScore' class='form-horizontal' id='partjudge'>";
            /////****************************************/////
		    str+="<div class='box-body'>";
		    str+="<div class='form-group'>";
		    str+="<label class='col-sm-4 control-label' style='font-size:15px;'>比赛项目</label>";
		    str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.Event+"</label></div>";
		    str+="</div>";
		    str+="<div class='form-group'>";
		    str+="<label class='col-sm-4 control-label' style='font-size:15px;'>比赛编号</label>";
		    str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.MatchID+"</label></div>";
		    str+="</div>";
		    str+="<div class='form-group'>";
		    str+="<label class='col-sm-4 control-label' style='font-size:15px;'>选手编号</label>";
		    str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.PlayerID+"</label></div>";
		    str+="</div>";
		    str+="<div class='form-group'>";
		    str+="<label class='col-sm-4 control-label' style='font-size:15px;'>选手姓名</label>";
		    str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.PlayerName+"</label></div>";
		    str+="</div>";
			str+="<div class='form-group'>";
		    str+="<label class='col-sm-4 control-label' style='font-size:15px;'>分  数</label>";
		    str+="<div class='col-sm-4'><input class='form-control' name='SScore' type='text' style='font-size:15px; width:180px;' placeholder='请评分'></div>";
		    str+="</div>";
		    str+="</div>";
		    str+="<div class='box-footer'>";
		    str+="<button name='sub' class='btn btn-info  pull-right' type='submit' onclick='submit(this)'>提交</button>";
		    str+="</div></form></div>";
		    str+="";
	    }
		//分数已提交，等待总裁判审核
		else if (list.Score!=-1&&list.ScoreAccept==0)
		{
			str+="<div class='box box-info'>";
		    str+="<div class='box-header with-border'><h3 class='box-title'>比赛信息</h3></div>";
		    str+="<form method='post' action='submitScore' class='form-horizontal' id='partjudge'>";
			/////****************************************/////
		    str+="<div class='box-body'>";
		    str+="<div class='form-group'>";
		    str+="<label class='col-sm-4 control-label' style='font-size:15px;'>比赛项目</label>";
		    str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.Event+"</label></div>";
		    str+="</div>";
		        str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>比赛编号</label>";
		        str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.MatchID+"</label></div>";
		        str+="</div>";
		        str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>选手编号</label>";
		        str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.PlayerID+"</label></div>";
		        str+="</div>";
		        str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>选手姓名</label>";
		        str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.PlayerName+"</label></div>";
		        str+="</div>";
				str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>分  数</label>";
		        str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.Score+"</label></div>";
		        str+="</div>";
		        str+="</div>";
		        str+="<div class='box-footer'>";
		        str+="<button class='btn btn-info pull-right' disabled='true'>等待审核</button>";
		        str+="</div></form></div>";
		        str+="";
		}
		//分数已提交，但是被拒绝
		else if (list.Score!=-1&&list.ScoreAccept==1)
		{
				alert("您的评分被总裁判拒绝，请重新评分！");
				str+="<div class='box box-info'>";
		        str+="<div class='box-header with-border'><h3 class='box-title'>比赛信息</h3></div>";
		        str+="<form method='post' action='submitScore' class='form-horizontal' id='partjudge'>";
				/////****************************************/////
		        str+="<div class='box-body'>";
		        str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>比赛项目</label>";
		        str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.Event+"</label></div>";
		        str+="</div>";
		        str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>比赛编号</label>";
		        str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.MatchID+"</label></div>";
		        str+="</div>";
		        str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>选手编号</label>";
		        str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.PlayerID+"</label></div>";
		        str+="</div>";
		        str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>选手姓名</label>";
		        str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.PlayerName+"</label></div>";
		        str+="</div>";
				str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>分  数</label>";
		        str+="<div class='col-sm-4'><input class='form-control' name='SScore' type='text' style='font-size:15px; width:180px;' placeholder='请重新评分'></div>";
		        str+="</div>";
		        str+="</div>";
		        str+="<div class='box-footer'>";
		        str+="<button class='btn btn-info pull-right' onclick='submit(this)'>提交</button>";
		        str+="</div></form></div>";
		        str+="";
		}
		else
		{
			alert("您的评分已被总裁判同意！");
		}
        document.getElementById("partOfJudge").innerHTML=str;
	}

    function idle1()
    {
		    var str = "";
			str+="</br></br>";
	        if (list.ScoreState!="Running")
	        {
		        str+="您已经对当前运动员评分，请稍后！";
	        }
	        else
	        {
				str+="<div class='box box-info'>";
		        str+="<div class='box-header with-border'><h3 class='box-title'>比赛信息</h3></div>";
		        str+="<form class='form-horizontal' name='ChiefJudge' method='POST'>";
				/////****************************************/////
		        str+="<div class='box-body'>";
		        str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>比赛项目</label>";
		        str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.Event+"</label></div>";
		        str+="</div>";
		        str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>比赛编号</label>";
		        str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.MatchID+"</label></div>";
		        str+="</div>";
		        str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>选手编号</label>";
		        str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.PlayerID+"</label></div>";
		        str+="</div>";
		        str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>选手姓名</label>";
		        str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.PlayerName+"</label></div>";
		        str+="</div>";


				//裁判一
				str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>裁判"+list.JudgeID1+"</label>";
				if (list.Score1==-1)    //未打分
				{
					str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>评判中</label></div>";
				}
				else if (list.Score1!=-1 && list.ScoreAccept1==0)   //有了分数，选择是否接受
				{
					str+="<div id='judge1' class='col-sm-4'>";
					str+="<label id='label1' class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.Score1+"</label>";
					str+="<input type='button' value='接受' class='btn btn-info' onclick='xaccept(this)'>";
					str+="<input type='button' value='拒绝' class='btn btn-danger' onclick='xreject(this)'>";
					str+="</div>";
				}
				else if (list.Score1!=-1 && list.ScoreAccept1==1)  //分数被拒绝
				{
					str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>重新评判中</label></div>";
				}
				else   //分数被接受
				{
					str+="<div id='judge1' class='col-sm-4'>";
					str+="<label id='label1' class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.Score1+"</label>";
					str+="<input type='button' value='已接受' class='btn btn-info' disabled='true'>";
					str+="</div>";
				}
		        str+="</div>";





				//裁判二
				str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>裁判"+list.JudgeID2+"</label>";
				if (list.Score2==-1)    //未打分
				{
					str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>评判中</label></div>";
				}
				else if (list.Score2!=-1 && list.ScoreAccept2==0)   //有了分数，选择是否接受
				{
					str+="<div id='judge2' class='col-sm-4'>";
					str+="<label id='label2' class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.Score2+"</label>";
					str+="<input type='button' value='接受' class='btn btn-info' onclick='xaccept2(this)'>";
					str+="<input type='button' value='拒绝' class='btn btn-danger' onclick='xreject2(this)'>";
					str+="</div>";
				}
				else if (list.Score2!=-1 && list.ScoreAccept2==1)  //分数被拒绝
				{
					str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>重新评判中</label></div>";
				}
				else   //分数被接受
				{
					str+="<div id='judge2' class='col-sm-4'>";
					str+="<label id='label2' class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.Score2+"</label>";
					str+="<input type='button' value='已接受' class='btn btn-info' disabled='true'>";
					str+="</div>";
				}
		        str+="</div>";

				//裁判三
				str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>裁判"+list.JudgeID3+"</label>";
				if (list.Score3==-1)    //未打分
				{
					str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>评判中</label></div>";
				}
				else if (list.Score3!=-1 && list.ScoreAccept3==0)   //有了分数，选择是否接受
				{
					str+="<div id='judge3' class='col-sm-4'>";
					str+="<label id='label3' class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.Score3+"</label>";
					str+="<input type='button' value='接受' class='btn btn-info' onclick='xaccept3(this)'>";
					str+="<input type='button' value='拒绝' class='btn btn-danger' onclick='xreject3(this)'>";
					str+="</div>";
				}
				else if (list.Score3!=-1 && list.ScoreAccept3==1)  //分数被拒绝
				{
					str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>重新评判中</label></div>";
				}
				else   //分数被接受
				{
					str+="<div id='judge3' class='col-sm-4'>";
					str+="<label id='label3' class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.Score3+"</label>";
					str+="<input type='button' value='已接受' class='btn btn-info' disabled='true'>";
					str+="</div>";
				}
		        str+="</div>";
				//裁判四
				str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>裁判"+list.JudgeID4+"</label>";
				if (list.Score4==-1)    //未打分
				{
					str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>评判中</label></div>";
				}
				else if (list.Score4!=-1 && list.ScoreAccept4==0)   //有了分数，选择是否接受
				{
					str+="<div id='judge4' class='col-sm-4'>";
					str+="<label id='label4' class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.Score4+"</label>";
					str+="<input type='button' value='接受' class='btn btn-info' onclick='xaccept4(this)'>";
					str+="<input type='button' value='拒绝' class='btn btn-danger' onclick='xreject4(this)'>";
					str+="</div>";
				}
				else if (list.Score4!=-1 && list.ScoreAccept4==1)  //分数被拒绝
				{
					str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>重新评判中</label></div>";
				}
				else   //分数被接受
				{
					str+="<div id='judge4' class='col-sm-4'>";
					str+="<label id='label4' class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.Score3+"</label>";
					str+="<input type='button' value='已接受' class='btn btn-info' disabled='true'>";
					str+="</div>";
				}
		        str+="</div>";
                //裁判五
				str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>裁判"+list.JudgeID5+"</label>";
				if (list.Score5==-1)    //未打分
				{
					str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>评判中</label></div>";
				}
				else if (list.Score5!=-1 && list.ScoreAccept5==0)   //有了分数，选择是否接受
				{
					str+="<div id='judge5' class='col-sm-4'>";
					str+="<label id='label5' class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.Score5+"</label>";
					str+="<input type='button' value='接受' class='btn btn-info' onclick='xaccept5(this)'>";
					str+="<input type='button' value='拒绝' class='btn btn-danger' onclick='xreject5(this)'>";
					str+="</div>";
				}
				else if (list.Score5!=-1 && list.ScoreAccept5==1)  //分数被拒绝
				{
					str+="<div class='col-sm-4'><label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>重新评判中</label></div>";
				}
				else   //分数被接受
				{
					str+="<div id='judge5' class='col-sm-4'>";
					str+="<label id='label5' class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+list.Score5+"</label>";
					str+="<input type='button' value='已接受' class='btn btn-info' disabled='true'>";
					str+="</div>";
				}
		        str+="</div>";

				str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>奖励分</label>";
		        str+="<div class='col-sm-4'><input class='form-control' name='PScore' type='text' style='font-size:15px; width:180px;' placeholder='奖励分'></div>";
		        str+="</div>";

				str+="<div class='form-group'>";
		        str+="<label class='col-sm-4 control-label' style='font-size:15px;'>惩罚分</label>";
		        str+="<div class='col-sm-4'><input class='form-control' name='DScore' type='text' style='font-size:15px; width:180px;' placeholder='惩罚分'></div>";
		        str+="</div>";
		        str+="</div>";
		        str+="<div class='box-footer'>";
		        str+="<input type='button' value='提交' class='btn btn-info  pull-right' onclick='submitPD(this)'>";
		        str+="</div></form></div>";
		        str+="";

	        }
            document.getElementById("mainOfJudge").innerHTML=str;
    }





	//设置cookies
    function setCookie(c_name, value, expiredays) {
        var exdate = new Date();
        exdate.setDate(exdate.getDate() + expiredays);
        document.cookie = c_name + "=" + escape(value) + ((expiredays == null) ? "" : ";expires=" + exdate.toGMTString());
    }
	//分裁判提交自己的分数
    function submits(obj){
	    alert("您的分数已送达至主裁判，请耐心等待主裁判审核！");
	    obj.disabled=true;

    }

	function submitPD(obj){
		 obj.value="提交中。";
		 score1=ChiefJudge.PScore.value;
		 score2=ChiefJudge.DScore.value;
		 setCookie('MatchID',MatchID,1);
		 setCookie('PlayerID',PlayerID,1);
		 setCookie('PScore',score1,1);
		 setCookie('DScore',score2,1);
		 document.ChiefJudge.action="xsubmitPD";
         document.ChiefJudge.submit();
		 obj.disabled=true;

	}

	function xaccept(obj){
		//obj.disabled=true;
		//$("#rej1").attr("disabled","true");
		var Score1 =document.getElementById("label1").innerHTML;
		var JudgeID1 = list.JudgeID1;
		var ss ="<label id='label1' class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+Score1+"</label>";
		ss += "<button name='acc1' disabled='true' class='btn btn-info' type='submit'>已接受</button>";

        setCookie('MatchID',MatchID,1);
		setCookie('PlayerID',PlayerID,1);
		setCookie('JudgeID1',JudgeID1,1);
		setCookie('Score1',Score1,1);
		setCookie('ScoreAccept1',2,1);


		document.getElementById("judge1").innerHTML=ss;
		document.ChiefJudge.action="Accept";
        document.ChiefJudge.submit();
	}
	function xreject(obj){
		var Score1 =document.getElementById("label1").innerHTML;
		var JudgeID1 = list.JudgeID1;
		var ss="<label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>重新评判中</label>";
		document.getElementById("judge1").innerHTML=ss;

		setCookie('MatchID',MatchID,1);
		setCookie('PlayerID',PlayerID,1);
		setCookie('JudgeID1',JudgeID1,1);
		setCookie('Score1',Score1,1);
		setCookie('ScoreAccept1',1,1);
		document.ChiefJudge.action="Reject";
        document.ChiefJudge.submit();
	}
	//裁判二
	function xaccept2(obj){
		var Score2 =document.getElementById("label2").innerHTML;
		var JudgeID2 = list.JudgeID2;
		var ss ="<label id='label2' class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+Score2+"</label>";
		ss += "<button name='acc2' disabled='true' class='btn btn-info' type='submit'>已接受</button>";

        setCookie('MatchID',MatchID,1);
		setCookie('PlayerID',PlayerID,1);
		setCookie('JudgeID2',JudgeID2,1);
		setCookie('Score2',Score2,1);
		setCookie('ScoreAccept2',2,1);


		document.getElementById("judge2").innerHTML=ss;
		document.ChiefJudge.action="Accept2";
        document.ChiefJudge.submit();
	}
	function xreject2(obj){
		var Score2 =document.getElementById("label2").innerHTML;
		var JudgeID2 = list.JudgeID2;
		var ss="<label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>重新评判中</label>";
		document.getElementById("judge2").innerHTML=ss;

		setCookie('MatchID',MatchID,1);
		setCookie('PlayerID',PlayerID,1);
		setCookie('JudgeID2',JudgeID2,1);
		setCookie('Score2',Score2,1);
		setCookie('ScoreAccept2',2,1);
		document.ChiefJudge.action="Reject2";
        document.ChiefJudge.submit();
	}
	//裁判三
	function xaccept3(obj){
		var Score3 =document.getElementById("label3").innerHTML;
		var JudgeID3 = list.JudgeID3;
		var ss ="<label id='label3' class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+Score3+"</label>";
		ss += "<button name='acc3' disabled='true' class='btn btn-info' type='submit'>已接受</button>";

        setCookie('MatchID',MatchID,1);
		setCookie('PlayerID',PlayerID,1);
		setCookie('JudgeID3',JudgeID3,1);
		setCookie('Score3',Score3,1);
		setCookie('ScoreAccept3',2,1);


		document.getElementById("judge3").innerHTML=ss;
		document.ChiefJudge.action="Accept3";
        document.ChiefJudge.submit();
	}
	function xreject3(obj){
		var Score3 =document.getElementById("label3").innerHTML;
		var JudgeID3 = list.JudgeID3;
		var ss="<label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>重新评判中</label>";
		document.getElementById("judge3").innerHTML=ss;

		setCookie('MatchID',MatchID,1);
		setCookie('PlayerID',PlayerID,1);
		setCookie('JudgeID3',JudgeID3,1);
		setCookie('Score3',Score3,1);
		setCookie('ScoreAccept3',2,1);
		document.ChiefJudge.action="Reject3";
        document.ChiefJudge.submit();
	}
	//裁判四
	function xaccept4(obj){
		var Score4 =document.getElementById("label4").innerHTML;
		var JudgeID4 = list.JudgeID4;
		var ss ="<label id='label4' class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+Score4+"</label>";
		ss += "<button name='acc4' disabled='true' class='btn btn-info' type='submit'>已接受</button>";

        setCookie('MatchID',MatchID,1);
		setCookie('PlayerID',PlayerID,1);
		setCookie('JudgeID4',JudgeID4,1);
		setCookie('Score4',Score4,1);
		setCookie('ScoreAccept4',2,1);


		document.getElementById("judge4").innerHTML=ss;
		document.ChiefJudge.action="Accept4";
        document.ChiefJudge.submit();
	}
	function xreject4(obj){
		var Score4 =document.getElementById("label4").innerHTML;
		var JudgeID4 = list.JudgeID4;
		var ss="<label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>重新评判中</label>";
		document.getElementById("judge4").innerHTML=ss;

		setCookie('MatchID',MatchID,1);
		setCookie('PlayerID',PlayerID,1);
		setCookie('JudgeID4',JudgeID4,1);
		setCookie('Score4',Score4,1);
		setCookie('ScoreAccept4',2,1);
		document.ChiefJudge.action="Reject4";
        document.ChiefJudge.submit();
	}
	function xaccept5(obj){
		var Score5 =document.getElementById("label5").innerHTML;
		var JudgeID5 = list.JudgeID5;
		var ss ="<label id='label5' class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>"+Score5+"</label>";
		ss += "<button name='acc5' disabled='true' class='btn btn-info' type='submit'>已接受</button>";

        setCookie('MatchID',MatchID,1);
		setCookie('PlayerID',PlayerID,1);
		setCookie('JudgeID5',JudgeID5,1);
		setCookie('Score5',Score5,1);
		setCookie('ScoreAccept5',2,1);


		document.getElementById("judge5").innerHTML=ss;
		document.ChiefJudge.action="Accept5";
        document.ChiefJudge.submit();
	}
	function xreject5(obj){
		var Score5 =document.getElementById("label5").innerHTML;
		var JudgeID5 = list.JudgeID5;
		var ss="<label class='col-sm-4 control-label' style='font-size:15px;' for='inputEmail3'>重新评判中</label>";
		document.getElementById("judge5").innerHTML=ss;

		setCookie('MatchID',MatchID,1);
		setCookie('PlayerID',PlayerID,1);
		setCookie('JudgeID5',JudgeID5,1);
		setCookie('Score5',Score5,1);
		setCookie('ScoreAccept5',2,1);
		document.ChiefJudge.action="Reject5";
        document.ChiefJudge.submit();
	}


</script>


  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta http-equiv="refresh" content="10">
  <title>裁判员主页</title>
  </head>
  <jsp:include page="Common_css_js.jsp"></jsp:include>

<body class="hold-transition skin-blue sidebar-mini" onload="idle()">
<div class="wrapper">

  <jsp:include page="teamHeader.jsp"></jsp:include>
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
          <p>裁判</p>
          <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
        </div>
      </div>

      <!-- 侧边栏菜单: : style can be found in sidebar.less -->
      <ul class="sidebar-menu" data-widget="tree">
        <li class="header">主菜单</li>
        <li class="active treeview">
          <a href="admin.jsp">
            <i class="fa fa-dashboard"></i> <span>当前信息</span>
          </a>
        </li>

      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->


    <!-- Main content -->
    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">

          <div class="box">
            <div class="box-body">




			  </br>


			  <div id="mainOfJudge">
              <!--根据后台传回来的数据进行显示-->
			  </div>
			  <div id="partOfJudge">
              <!--根据后台传回来的数据进行显示-->
			  </div>




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
      <b>Version</b> 0.1.0
    </div>
    <strong>Copyright &copy; 2017 codeofjackie,supported by <a href="https://adminlte.io">Almsaeed Studio</a>.</strong> All rights

  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Create the tabs -->
    <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
      <li><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
      <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
    </ul>
    <!-- Tab panes -->
    <div class="tab-content">
      <!-- Home tab content -->
      <div class="tab-pane" id="control-sidebar-home-tab">
        <h3 class="control-sidebar-heading">Recent Activity</h3>
        <ul class="control-sidebar-menu">
          <li>
            <a href="javascript:void(0)">
              <i class="menu-icon fa fa-birthday-cake bg-red"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Langdon's Birthday</h4>

                <p>Will be 23 on April 24th</p>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <i class="menu-icon fa fa-user bg-yellow"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Frodo Updated His Profile</h4>

                <p>New phone +1(800)555-1234</p>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <i class="menu-icon fa fa-envelope-o bg-light-blue"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Nora Joined Mailing List</h4>

                <p>nora@example.com</p>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <i class="menu-icon fa fa-file-code-o bg-green"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Cron Job 254 Executed</h4>

                <p>Execution time 5 seconds</p>
              </div>
            </a>
          </li>
        </ul>
        <!-- /.control-sidebar-menu -->

        <h3 class="control-sidebar-heading">Tasks Progress</h3>
        <ul class="control-sidebar-menu">
          <li>
            <a href="javascript:void(0)">
              <h4 class="control-sidebar-subheading">
                Custom Template Design
                <span class="label label-danger pull-right">70%</span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-danger" style="width: 70%"></div>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <h4 class="control-sidebar-subheading">
                Update Resume
                <span class="label label-success pull-right">95%</span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-success" style="width: 95%"></div>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <h4 class="control-sidebar-subheading">
                Laravel Integration
                <span class="label label-warning pull-right">50%</span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-warning" style="width: 50%"></div>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <h4 class="control-sidebar-subheading">
                Back End Framework
                <span class="label label-primary pull-right">68%</span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-primary" style="width: 68%"></div>
              </div>
            </a>
          </li>
        </ul>
        <!-- /.control-sidebar-menu -->

      </div>
      <!-- /.tab-pane -->
      <!-- Stats tab content -->
      <div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab Content</div>
      <!-- /.tab-pane -->
      <!-- Settings tab content -->
      <div class="tab-pane" id="control-sidebar-settings-tab">
        <form method="post">
          <h3 class="control-sidebar-heading">General Settings</h3>

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Report panel usage
              <input type="checkbox" class="pull-right" checked>
            </label>

            <p>
              Some information about this general settings option
            </p>
          </div>
          <!-- /.form-group -->

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Allow mail redirect
              <input type="checkbox" class="pull-right" checked>
            </label>

            <p>
              Other sets of options are available
            </p>
          </div>
          <!-- /.form-group -->

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Expose author name in posts
              <input type="checkbox" class="pull-right" checked>
            </label>

            <p>
              Allow the user to show his name in blog posts
            </p>
          </div>
          <!-- /.form-group -->

          <h3 class="control-sidebar-heading">Chat Settings</h3>

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Show me as online
              <input type="checkbox" class="pull-right" checked>
            </label>
          </div>
          <!-- /.form-group -->

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Turn off notifications
              <input type="checkbox" class="pull-right">
            </label>
          </div>
          <!-- /.form-group -->

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Delete chat history
              <a href="javascript:void(0)" class="text-red pull-right"><i class="fa fa-trash-o"></i></a>
            </label>
          </div>
          <!-- /.form-group -->
        </form>
      </div>
      <!-- /.tab-pane -->
    </div>
  </aside>
  <!-- /.control-sidebar -->
  <!-- Add the sidebar's background. This div must be placed
       immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<!-- jQuery 3 -->
   <script src="/master/bower_components/jquery/dist/jquery.min.js" ></script>
<!-- jQuery UI 1.11.4 -->
   <script src="/master/bower_components/jquery-ui/jquery-ui.min.js" ></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
  $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.7 -->
   <script src="/master/bower_components/bootstrap/dist/js/bootstrap.min.js" ></script>
<!-- Morris.js charts -->
   <script src="/master/bower_components/raphael/raphael.min.js" ></script>
   <script src="/master/bower_components/morris.js/morris.min.js" ></script>
<!-- Sparkline -->
   <script src="/master/bower_components/jquery-sparkline/dist/jquery.sparkline.min.js" ></script>
<!-- jvectormap -->
   <script src="/master/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js" ></script>
   <script src="/master/plugins/jvectormap/jquery-jvectormap-world-mill-en.js" ></script>
<!-- jQuery Knob Chart -->
   <script src="/master/bower_components/jquery-knob/dist/jquery.knob.min.js" ></script>
<!-- daterangepicker -->
   <script src="/master/bower_components/moment/min/moment.min.js" ></script>
   <script src="/master/bower_components/bootstrap-daterangepicker/daterangepicker.js" ></script>
<!-- datepicker -->
   <script src="/master/bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js" ></script>
<!-- Bootstrap WYSIHTML5 -->
   <script src="/master/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js" ></script>
<!-- Slimscroll -->
   <script src="/master/bower_components/jquery-slimscroll/jquery.slimscroll.min.js" ></script>
<!-- FastClick -->
   <script src="/master/bower_components/fastclick/lib/fastclick.js" ></script>
<!-- AdminLTE App -->
   <script src="/master/dist/js/adminlte.min.js" ></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
   <script src="/master/dist/js/pages/dashboard.js" ></script>
<!-- AdminLTE for demo purposes -->
   <script src="/master/dist/js/demo.js" ></script>



<script type="text/javascript">
alert("末尾");
    var getting = {
		url:'http://'+window.location.hostname+'/GameAdmin/JudgeIndex$',
		//url:'http://'+window.location.hostname+'/GameAdmin/LoginJudge',
		dataType:'json',
		success:function(list){
			if (list.flag==0)
			{
				idle0(list);
			}
			else if (list.flag == 2)
			{
				idle2(list);
			}
			esle if (list.flag == 1)
			{
				idle1(list);
			}
			$.ajax(getting);
		}
		error:function(list){
			$.ajax(getting);
		}
	};
	alert("刷新");
	$.ajax(getting);
	//window.setInterval(function(){$.ajax(getting)},1000);
</script>

</body>
</html>
