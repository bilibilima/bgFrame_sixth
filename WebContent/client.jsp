<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>JQuery easyui demo</title>

<style type="text/css">
#user_fm {
	margin: 0;
	padding: 10px 30px;
}

.ftitle {
	font-size: 14px;
	font-weight: bold;
	padding: 5px 0;
	margin-bottom: 10px;
	border-bottom: 1px solid #ccc;
}

.fitem {
	margin-bottom: 5px;
}

.fitem label {
	display: inline-block;
	width: 80px;
}

.fitem input {
	width: 160px;
}
</style>


<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.4.1/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.4.1/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.4.1/themes/color.css">
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.4.1/demo/demo.css">
<script type="text/javascript" src="jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
</head>
<body>
	
	<table id="cldg" class="easyui-datagrid" style="height: 470px;"
		url="client/findAll.do" toolbar="#cltoolbar" pagination="true"
		rownumbers="true" fitColumns="true" singleSelect="true"
		data-options="fit:false,border:false,pageSize:10,pageList:[10,20,30,40]">
		<thead>
			<tr>

				<th field="clientno" width="50">编号</th>
				<th field="client" width="50">姓名</th>
				<th field="caddress" width="50">地址</th>
				<th field="cemail" width="50">邮箱</th>
				<th field="cphone" width="50">电话</th>

				
			</tr>
		</thead>
	</table>
	<div id="cltoolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="newClient()">新增</a> 
			
			<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-edit" plain="true" onclick="editClient()">编辑</a> 
			
			<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyClient()">删除</a>
	</div>

<!-- 对话框 -->
	<div id="cldlg" class="easyui-dialog" style="padding: 10px 20px"
		closed="true" buttons="#cldlg-buttons">
		<div class="ftitle">详细信息</div>
		<form id="clfm" method="post" novalidate>
			<div class="fitem">
				<label>姓名:</label> <input name="client" class="easyui-textbox"
					required="true">
			</div>
			<div class="fitem">
				<label>地址:</label> <input name="caddress" class="easyui-textbox">
			</div>
			<div class="fitem">
				<label>邮箱:</label> <input name="cemail" class="easyui-textbox"
					>
			</div>
			<div class="fitem">
				<label>电话:</label> <input name="cphone" class="easyui-textbox">
			</div>
		
		</form>
	</div>
	
	
	
	<div id="cldlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton c6"
			iconCls="icon-ok" onclick="saveClient()" style="width: 90px">保存</a>
			
			 <a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width: 90px">取消</a>
	</div>	
	
	<script type="text/javascript">
		var url;	
		
		function newClient() {
			$('#cldlg').dialog('open').dialog('setTitle', '新增');
			$('#clfm').form('clear');//清除表单数据
			url = 'client/addClient.do';//从这里调用“Action”里的方法
		}
		
		
		
		function editClient() {
			var row = $('#cldg').datagrid('getSelected');
			if (row) {
				$('#cldlg').dialog('open').dialog('setTitle', '编辑');
				$('#clfm').form('clear');//清除表单数据
                $('#clfm').form('load',row);//重新加载编辑数据
				url = 'client/updateClient.do?clientno=' + row.clientno;//这里传ID
			}
		}
		
		
		
		function saveClient() {
			$('#clfm').form('submit', {
				url : url,
				onSubmit : function() {
					return $(this).form('validate');
				},
				success : function(result) {
					var result = eval('(' + result + ')');
					if (result.errorMsg) {
						$.messager.show({
							title : 'Error',
							msg : result.errorMsg
						});
					} else {
						$('#cldlg').dialog('close'); // close the dialog
						$('#cldg').datagrid('reload'); // reload the user data
					}
				}
			});
		}
		
		
		
		function destroyClient() {
			var row = $('#cldg').datagrid('getSelected');
			if (row) {
				$.messager.confirm('Confirm', '确定要删除吗?', function(r) {
					if (r) {
						//ajax调用
						$.post('client/deleteClient.do', {
							clientno : row.clientno
						}, function(result) {
							if (result.success) {
								$('#cldg').datagrid('reload'); // reload the user data
							} else {
								$.messager.show({ // show error message
									title : 'Error',
									msg : result.errorMsg
								});
							}
						}, 'json');
					}//回调函数
				});
			}
		}
	</script>

</body>
</html>