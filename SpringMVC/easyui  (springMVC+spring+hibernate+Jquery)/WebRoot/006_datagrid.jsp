<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script src="/easyui/jquery-easyui-1.5.1/jquery.min.js"></script>
<script src="/easyui/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
<script src="/easyui/jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>

<link rel="stylesheet" href="/easyui/jquery-easyui-1.5.1/themes/default/easyui.css"/>
<link rel="stylesheet" href="/easyui/jquery-easyui-1.5.1/themes/icon.css"/>

<script>
	$(function() {
		$("#dg").datagrid({
			"url":"/easyui/user/f1.do",
			fitColumns:true,
			striped:true,
			singleSelect:true,
			columns:[[    
			          {field:'id',title:'编号',width:100},    
			          {field:'name',title:'姓名',width:100},
			          {field:'birthday',title:'生日',width:100},
			          {field:'money',title:'存款',width:100},    
			]],
			rowStyler:function(index,row) {
				if(row.money==600) {
					return "background:#8ab42e";
				}
			},
			toolbar:[
						{
							text:"添加",
							iconCls:"icon-add",
							handler:function() {
								$("#d1").window("open");
							}
						},
						{
							text:"删除",
							iconCls:"icon-remove",
							handler:function() {
								alert(456);
							}
						},
						{
							text:"修改",
							iconCls:"icon-edit",
							handler:function() {
								alert(789);
							}
						}
			]
		});


		$("#d1").window({
			title:"添加用户",
			width:300,
			height:200,
			closed:true,
			modal:true
		});

		$("#btn").click(function(){
			
			$.ajax({
				"type":"post",
				"url":"/easyui/user/save.do",
				"data":$("#ff").serialize(),
				"success":function() {
					document.getElementById("ff").reset();
					$("#d1").window('close');
				}
			});
			
			
		});
		
	});
</script>

<table id="dg">
</table>



<div id="d1">
	<form id="ff">
		name: <input name="name" /><br/>
		birthday: <input name="birthday" /><br/>
		money: <input name="money" /><br/>
		<button id="btn" type="button">go</button>
	</form>
</div>

