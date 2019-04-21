<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JQuery easyui demo</title>
<style type="text/css">
#sotfm {
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
<table id="sotdg" class="easyui-datagrid" style="height: 470px;"
		url="salesout/findAll.do" toolbar="#sotoolbar" pagination="true"
		rownumbers="true" fitColumns="true" singleSelect="true"
		data-options="fit:false,border:false,pageSize:20,pageList:[20,25,30,35,40,45,50]">
		<thead>
			<tr>
				<th field="sno" width="50">编号</th>
				<th field="goodsno" width="50">商品编号</th>
				<th field="srquantity" width="50">数量</th>
				<th field="srprice" width="50">价格</th>
				<th field="srdate" width="50">日期</th>
				<th field="handler" width="50">操作者</th>
				<th field="clientno" width="50">客户编号</th>
				<th field="sremark" width="50">备注</th>
				<th field="storageno" width="50">仓库编号</th>
			</tr>
		</thead>
	</table>
	
	
	<div id="sotoolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="newSalesout()">新增</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-edit" plain="true" onclick="editSalesout()">编辑</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroySalesout()">删除</a>
	</div>
	
	
	<div id="sotdlg" class="easyui-dialog" style="padding: 10px 20px"
		closed="true" buttons="#sotdlg-buttons">
		<div class="ftitle">详细信息</div>
		<form id="sotfm" method="post" novalidate>
			<div class="fitem">
				<label>商品编号:</label> <input name="goodsno" class="easyui-textbox"
					required="true">
			</div>
			<div class="fitem">
				<label>数量:</label> <input name="srquantity" class="easyui-textbox"
					required="true">
			</div>
			<div class="fitem">
				<label>价格:</label> <input name="srprice" class="easyui-textbox">
			</div>
			<div class="fitem">
				<label>日期:</label> <input name="srdate" class="easyui-datebox" vlidType="date" >
			</div>
			<div class="fitem">
				<label>操作者:</label> <input name="handler" class="easyui-textbox"
					>
			</div>
			<div class="fitem">
				<label>客户编号:</label> <input name="clientno" class="easyui-textbox"
					>
			</div>
			<div class="fitem">
				<label>备注:</label> <input name="sremark" class="easyui-textbox"
					>
			</div>
			<div class="fitem">
				<label>仓库编号:</label> <input name="storageno" class="easyui-textbox"
					>
			</div>
		</form>
	</div>
	
	
	<div id="sotdlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton c6"
			iconCls="icon-ok" onclick="saveSalesout()" style="width: 90px">保存</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-cancel"
			onclick="javascript:$('#sotdlg').dialog('close')"
			style="width: 90px">取消</a>
	</div>
	
	
	<script type="text/javascript">
	function newSalesout() {
			$('#sotdlg').dialog('open').dialog('setTitle', '新增');
			$('#sotfm').form('clear');
			url = 'salesout/addSalesout.do';//从这里调用“Action”里的方法
		}
		
		
		
		function editSalesout() {
			var row = $('#sotdg').datagrid('getSelected');
			if (row) {
				$('#sotdlg').dialog('open').dialog('setTitle', '编辑');
				$('#sotfm').form('load', row);
				url = 'salesout/updateSalesout.do?sno=' + row.sno;//这里传ID

			}
		}
		
		
		
		function saveSalesout() {
			$('#sotfm').form('submit', {
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
						$('#sotdlg').dialog('close'); // close the dialog
						$('#sotdg').datagrid('reload'); // reload the user data
					}
				}
			});
		}
		
		
		
		function destroySalesout() {
			var row = $('#sotdg').datagrid('getSelected');
			if (row) {
				$.messager.confirm('Confirm', '确定要删除吗?', function(r) {
					if (r) {
						//ajax调用
						$.post('salesout/deleteSalesout.do', {
							sno : row.sno
						}, function(result) {
							if (result.success) {
								$('#sotdg').datagrid('reload'); // reload the user data
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