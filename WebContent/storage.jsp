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
	
	<table id="dg" class="easyui-datagrid" style="height: 470px;"
		url="storage/findAll.do" toolbar="#toolbar" pagination="true"
		rownumbers="true" fitColumns="true" singleSelect="true"
		data-options="fit:false,border:false,pageSize:10,pageList:[10,20,30,40]">
		<thead>
			<tr>

				<th field="storageno" width="50">编号</th>
				<th field="storagename" width="50">仓库名</th>
				<th field="storageaddress" width="50">地址</th>
				<th field="capacity" width="50">容量</th>
				<th field="cordon" width="50">最低量</th>
				<th field="currentstorage" width="50">现存量</th>
				
			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="newStorage()">新增</a> 
			
			<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-edit" plain="true" onclick="editStorage()">编辑</a> 
			
			<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyStorage()">删除</a>
	</div>

<!-- 对话框 -->
	<div id="dlg" class="easyui-dialog" style="padding: 10px 20px"
		closed="true" buttons="#dlg-buttons">
		<div class="ftitle">详细信息</div>
		<form id="fm" method="post" novalidate>
			<div class="fitem">
				<label>仓库名:</label> <input name="storagename" class="easyui-textbox"
					required="true">
			</div>
			<div class="fitem">
				<label>地址:</label> <input name="storageaddress" class="easyui-textbox">
			</div>
			<div class="fitem">
				<label>容量:</label> <input name="capacity" class="easyui-textbox"
					>
			</div>
			<div class="fitem">
				<label>最低量:</label> <input name="cordon" class="easyui-textbox">
			</div>
			<div class="fitem">
				<label>现存量:</label> <input name="currentstorage" class="easyui-textbox">
			</div>			
		</form>
	</div>
	
	
	
	<div id="dlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton c6"
			iconCls="icon-ok" onclick="saveStorage()" style="width: 90px">保存</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-cancel"
			onclick="javascript:$('#dlg').dialog('close')"
			style="width: 90px">取消</a>
	</div>
	
	<!-- url = 'usermessage/addUserMessage.do';——从这里调用“Action”里的方法 -->
	
	
	<script type="text/javascript">
		var url;	
		
		function newStorage() {
			$('#dlg').dialog('open').dialog('setTitle', '新增');
			$('#fm').form('clear');//清除表单数据
			url = 'storage/addStorage.do';//从这里调用“Action”里的方法
		}
		
		
		
		function editStorage() {
			var row = $('#dg').datagrid('getSelected');
			if (row) {
				$('#dlg').dialog('open').dialog('setTitle', '编辑');
				$('#fm').form('clear');//清除表单数据
                $('#fm').form('load',row);//重新加载编辑数据
				url = 'storage/updateStorage.do?storageno=' + row.storageno;//这里传ID
				/*
				*userNo=' + row.userNo
				*userNo：这个对应的是java里传值的对象
				*row.userNo：这个对应的是上方table中的<th field="userNo" width="50">编号</th>
				*/
			}
		}
		
		
		
		function saveStorage() {
			$('#fm').form('submit', {
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
						$('#dlg').dialog('close'); // close the dialog
						$('#dg').datagrid('reload'); // reload the user data
					}
				}
			});
		}
		
		
		
		function destroyStorage() {
			var row = $('#dg').datagrid('getSelected');
			if (row) {
				$.messager.confirm('Confirm', '确定要删除吗?', function(r) {
					if (r) {
						//ajax调用
						$.post('storage/deleteStorage.do', {
							storageno : row.storageno
						}, function(result) {
							if (result.success) {
								$('#dg').datagrid('reload'); // reload the user data
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
		
		/*
		*userNo : row.userNo
		*userNo：这个对应的是java里传值的对象
		*row.userNo：这个对应的是上方table中的<th field="userNo" width="50">编号</th>
		*/
	</script>

</body>
</html>