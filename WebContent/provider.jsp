<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
	
	<table id="prdg" class="easyui-datagrid" style="height: 470px;"
		url="provider/findAll.do" toolbar="#prtoolbar" pagination="true"
		rownumbers="true" fitColumns="true" singleSelect="true"
		data-options="fit:false,border:false,pageSize:10,pageList:[10,20,30,40]">
		<thead>
			<tr>

				<th field="providerno" width="50">供应商编号</th>
				<th field="provider" width="50">供应商姓名</th>
				<th field="paddress" width="50">供应商地址</th>
				<th field="plinkman" width="50">供应商联系人</th>
				<th field="pemail" width="50">供应商邮箱</th>
				<th field="pphone" width="50">供应商电话</th>

				
			</tr>
		</thead>
	</table>
	<div id="prtoolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="newProvider()">新增</a> 
			
			<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-edit" plain="true" onclick="editProvider()">编辑</a> 
			
			<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyProvider()">删除</a>
	</div>

<!-- 对话框 -->
	<div id="prdlg" class="easyui-dialog" style="padding: 10px 20px"
		closed="true" buttons="#prdlg-buttons">
		<div class="ftitle">详细信息</div>
		<form id="prfm" method="post" novalidate>
			<div class="fitem">
				<label>供应商姓名:</label> <input name="provider" class="easyui-textbox"
					required="true">
			</div>
			<div class="fitem">
				<label>供应商地址:</label> <input name="paddress" class="easyui-textbox">
			</div>
			<div class="fitem">
				<label>供应商联系人:</label> <input name="plinkman" class="easyui-textbox">
			</div>			
			<div class="fitem">
				<label>供应商邮箱:</label> <input name="pemail" class="easyui-textbox"
					>
			</div>
			<div class="fitem">
				<label>供应商电话:</label> <input name="pphone" class="easyui-textbox">
			</div>
		
		</form>
	</div>
	
	
	
	<div id="prdlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton c6"
			iconCls="icon-ok" onclick="saveProvider()" style="width: 90px">保存</a>
			
			 <a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width: 90px">取消</a>
	</div>	
	
	<script type="text/javascript">
		var url;	
		
		function newProvider(){
			$('#prdlg').dialog('open').dialog('setTitle', '新增');
			$('#prfm').form('clear');//清除表单数据
			url = 'provider/addProvider.do';//从这里调用“Action”里的方法
		}
		
		
		
		function editProvider() {
			var row = $('#prdg').datagrid('getSelected');
			if (row) {
				$('#prdlg').dialog('open').dialog('setTitle', '编辑');
				$('#prfm').form('clear');//清除表单数据
                $('#prfm').form('load',row);//重新加载编辑数据
				url = 'provider/updateProvider.do?providerno=' + row.providerno;//这里传ID
			}
		}
		
		
		
		function saveProvider() {
			$('#prfm').form('submit', {
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
						$('#prdlg').dialog('close'); // close the dialog
						$('#prdg').datagrid('reload'); // reload the user data
					}
				}
			});
		}
		
		
		
		function destroyProvider() {
			var row = $('#prdg').datagrid('getSelected');
			if (row) {
				$.messager.confirm('Confirm', '确定要删除吗?', function(r) {
					if (r) {
						//ajax调用
						$.post('provider/deleteProvider.do', {
							providerno : row.providerno
						}, function(result) {
							if (result.success) {
								$('#prdg').datagrid('reload'); // reload the user data
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