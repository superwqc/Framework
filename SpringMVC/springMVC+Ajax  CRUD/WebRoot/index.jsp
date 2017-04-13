<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<script>
	window.onload=function(){
			var btn=document.getElementById("btn");
			
			
			btn.onclick=function(){
				var ff=document.getElementById("ff");
				var name=ff.name.value;
				var birthday=ff.birthday.value;
				var money=ff.money.value;


				var req=new XMLHttpRequest();
				req.open("post","/ajax_crud/save.do");
				req.send();
			};
		};
</script>


<form id="ff">
	name:<input name="name"/><br/>
	birthday:<input name="birthday"/><br/>
	money:<input name="money"/><br/>
	<button id="btn" type="button">GO</button>
</form>