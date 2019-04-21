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
	
	<table id="pindg" class="easyui-datagrid" style="height: 470px;"
		url="purchasingin/findAll.do" toolbar="#toolbar" pagination="true"
		rownumbers="true" fitColumns="true" singleSelect="true"
		data-options="fit:false,border:false,pageSize:10,pageList:[10,20,30,40]">
		<thead>
			<tr>
				<th field="pno" width="50">采购编号</th>
				<th field="goodsno" width="50">商品编号</th>
				<th field="quantityin" width="50">数量</th>
				<th field="pricein" width="50">价格</th>
				<th field="datein" width="50">时间</th>
				<th field="handler" width="50">操作者</th>	
				<th field="premark" width="50">标记</th>
				<th field="storageno" width="50">仓库编号</th>			
			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="newPurchasingin()">新增</a> 
			
			<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-edit" plain="true" onclick="editPurchasingin()">编辑</a> 
			
			<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyPurchasingin()">删除</a>
	</div>

<!-- 对话框 -->
	<div id="pindlg" class="easyui-dialog" style="padding: 10px 20px"
		closed="true" buttons="#pindlg-buttons">
		<div class="ftitle">详细信息</div>
		<form id="pinfm" method="post" novalidate>
			<div class="fitem">
				<label>商品编号:</label> <input name="goodsno" class="easyui-textbox"
					required="true">
			</div>
			<div class="fitem">
				<label>数量:</label> <input name="quantityin" class="easyui-textbox">
			</div>
			
			<div class="fitem">
				<label>价格:</label> <input name="pricein" class="easyui-textbox"
					required="true">
			</div>
			<div class="fitem">
				<label>时间:</label> <input name="datein" class="easyui-datebox" vaildType="date">
			</div>
			<div class="fitem">
				<label>操作者:</label> <input name="handler" class="easyui-textbox"
					required="true">
			</div>
			<div class="fitem">
				<label>标记:</label> <input name="premark" class="easyui-textbox">
			</div>						
			
			<div class="fitem">
				<label>仓库编号:</label> <input name="storageno" class="easyui-textbox">
			</div>			
				
		</form>
	</div>
	
	
	
	<div id="pindlg-buttons">
	
		<a href="javascript:void(0)" class="easyui-linkbutton c6"
			iconCls="icon-ok" onclick="savePurchasingin()" style="width: 90px">保存</a> 
				
			
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-cancel"
			onclick="javascript:$('#pindlg').dialog('close')"
			style="width: 90px">取消</a>
	</div>
	
	
	<script type="text/javascript">
		var url;	
	
		//重新设置easy UI的时间格式
	     $.fn.datebox.defaults.formatter = function(date){
			var y = date.getFullYear();
			var m = date.getMonth()+1;
			var d = date.getDate();
			return y+'/'+m+'/'+d;
		}
	
		$.fn.datebox.defaults.parser = function(date){
			if(date){
				return  new Date(date)
			}else{
				return new Date();
			}
		} 				
		
		
		function newPurchasingin() {
			$('#pindlg').dialog('open').dialog('setTitle', '新增');
			$('#pinfm').form('clear');//清除表单数据
			url = 'purchasingin/addPurchasingin.do';//从这里调用“Action”里的方法
		}
		
		
		
		function editPurchasingin() {
			var row = $('#pindg').datagrid('getSelected');
			if (row) {
				$('#pindlg').dialog('open').dialog('setTitle', '编辑');
				$('#pinfm').form('clear');//清除表单数据
                $('#pinfm').form('load',row);//重新加载编辑数据
				url = 'purchasingin/updatePurchasingin.do?pno=' + row.pno;//这里传ID
			}
		}
		
		
		
		function savePurchasingin() {
			$('#pinfm').form('submit', {
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
						$('#pindlg').dialog('close'); // close the dialog
						$('#pindg').datagrid('reload'); // reload the user data
					}
				}
			});
		}
		
		
		
		function destroyPurchasingin() {
			var row = $('#pindg').datagrid('getSelected');
			if (row) {
				$.messager.confirm('Confirm', '确定要删除吗?', function(r) {
					if (r) {
						//ajax调用
						$.post('purchasingin/deletePurchasingin.do', {
							pno : row.pno
						}, function(result) {
							if (result.success) {
								$('#pindg').datagrid('reload'); // reload the user data
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