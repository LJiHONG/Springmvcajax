<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title></title>
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript">
    	$().ready(function(){
    	
    		$("#but01").click(function(){
    			var userNum=$("#userNum").val();
    			if(userNum.length==0){
    				alert('请输入账号');
    			}else{
    				$.post("ajaxUser.do",{userNum:userNum},function(data){
    					alert(data);
    				});
    			}
    		});
    		
    		$("#but02").click(function(){
    			var userId=$("#userId").val();
    			
    				$.post("ajaxUser2.do",{userId:userId},function(data){
    					alert(data.userID+"---"+data.userName+"---"+data.userSex);
    			},"json");
    		});
    		
    	});
    </script>
	
  </head>
  
  <body>
    <hr>
    	账号:<input type="text" id="userNum" name="userNum"/>
    	<input type="button" id="but01" value="验证">
    <hr/>
    
    <hr>
    	编号:<input type="text" id="userId" name="userId"/>
    	<input type="button" id="but02" value="查询">
    <hr/>
  </body>
</html>
