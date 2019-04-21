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
	
	<table id="podg" class="easyui-datagrid" style="height: 470px;"
		url="purchasingout/findAll.do" toolbar="#potoolbar" pagination="true"
		rownumbers="true" fitColumns="true" singleSelect="true"
		data-options="fit:false,border:false,pageSize:10,pageList:[10,20,30,40]">
		<thead>
			<tr>

				<th field="prno" width="50">编号</th>
				<th field="goodsno" width="50">商品编号</th>
				<th field="prquantity" width="50">数量</th>
				<th field="prprice" width="50">价格</th>
				<th field="prdate" width="50">日期</th>
				<th field="handler" width="50">操作者</th>
				<th field="prremark" width="50">标记</th>
				<th field="storageno" width="50">仓库编号</th>				
			</tr>
		</thead>
	</table>
	<div id="potoolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="newPurchasingout()">新增</a> 
			
			<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-edit" plain="true" onclick="editPurchasingout()">编辑</a> 
			
			<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyPurchasingout()">删除</a>
	</div>

<!-- 对话框 -->
	<div id="podlg" class="easyui-dialog" style="padding: 10px 20px"
		closed="true" buttons="#podlg-buttons">
		<div class="ftitle">详细信息</div>
		<form id="pofm" method="post" novalidate>
			<div class="fitem">
				<label>商品编号:</label> <input name="goodsno" class="easyui-textbox"
					required="true">
			</div>
			<div class="fitem">
				<label>数量:</label> <input name="prquantity" class="easyui-textbox">
			</div>
			
			<div class="fitem">
				<label>价格:</label> <input name="prprice" class="easyui-textbox"
					required="true">
			</div>
			<div class="fitem">
				<label>日期:</label> <input name="prdate" class="easyui-datebox" vaildType="date">
			</div>
			<div class="fitem">
				<label>操作者:</label> <input name="handler" class="easyui-textbox"
					required="true">
			</div>
			<div class="fitem">
				<label>标记:</label> <input name="prremark" class="easyui-textbox">
			</div>						
			
			<div class="fitem">
				<label>仓库编号:</label> <input name="storageno" class="easyui-textbox">
			</div>				
		</form>
	</div>
	
	
	
	<div id="podlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton c6"
			iconCls="icon-ok" onclick="savePurchasingout()" style="width: 90px">保存</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-cancel"
			onclick="javascript:$('#podlg').dialog('close')"
			style="width: 90px">取消</a>
	</div>
	
	
	
	<script type="text/javascript">
		var url;	
		
		function newPurchasingout() {
			$('#podlg').dialog('open').dialog('setTitle', '新增');
			$('#pofm').form('clear');//清除表单数据
			url = 'purchasingout/addPurchasingout.do';//从这里调用“Action”里的方法
		}
		
		
		
		function editPurchasingout() {
			var row = $('#podg').datagrid('getSelected');
			if (row) {
				$('#podlg').dialog('open').dialog('setTitle', '编辑');
				$('#pofm').form('clear');//清除表单数据
                $('#pofm').form('load',row);//重新加载编辑数据
				url = 'purchasingout/updatePurchasingout.do?prno=' + row.prno;//这里传ID
			}
		}
		
		
		
		function savePurchasingout() {
			$('#pofm').form('submit', {
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
						$('#podlg').dialog('close'); // close the dialog
						$('#podg').datagrid('reload'); // reload the user data
					}
				}
			});
		}
		
		
		
		function destroyPurchasingout() {
			var row = $('#podg').datagrid('getSelected');
			if (row) {
				$.messager.confirm('Confirm', '确定要删除吗?', function(r) {
					if (r) {
						//ajax调用
						$.post('purchasingout/deletePurchasingout.do', {
							prno : row.prno
						}, function(result) {
							if (result.success) {
								$('#podg').datagrid('reload'); // reload the user data
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