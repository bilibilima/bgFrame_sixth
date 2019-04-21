<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JQuery easyui demo</title>
<style type="text/css">
#goodsfm {
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
	<table id="goodsdg" class="easyui-datagrid" style="height: 470px;"
		url="goods/findAll.do" toolbar="#goodstoolbar" pagination="true"
		rownumbers="true" fitColumns="true" singleSelect="true"
		data-options="fit:false,border:false,pageSize:20,pageList:[20,25,30,35,40,45,50]">
		<thead>
			<tr>
				<th field="goodsno" width="50">商品编号</th>
				<th field="goodsname" width="50">商品名称</th>
				<th field="typeno" formatter="goodsFormat" width="50">商品类型</th>
				<th field="providerno" formatter="providerFormat" width="50">供应商</th>
				<th field="specification" width="50">规格</th>
				<th field="gremark" width="50">说明</th>
			</tr>
		</thead>
	</table>


	<div id="goodstoolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="newGoods()">新增</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-edit" plain="true" onclick="editGoods()">编辑</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyGoods()">删除</a>
	</div>


	<div id="goodsdlg" class="easyui-dialog" style="padding: 10px 20px"
		closed="true" buttons="#goodsdlg-buttons">
		<div class="ftitle">详细信息</div>
		<form id="goodsfm" method="post" novalidate>
			<div class="fitem">
				<label>商品名称:</label> <input name="goodsname" class="easyui-textbox"
					required="true">
			</div>

			<!-- 下拉列框根据数据库查询的数据显示数据 -->
			<div class="fitem">
				<label>商品类型:</label> <input id="id_goodsType" name="goodsType.typeno"
					class="easyui-combobox" url="goodsType/findList.do"
					valueField="typeno" textField="type" required="true"
					editable="false">

			<div class="fitem">
				<label>供应商:</label> <input id="id_provider"  name="provider.providerno"
					url="provider/findList.do" valueField="providerno"
					textField="provider" required="true" editable="false"
					class="easyui-combobox">
					
					
			<div class="fitem">
				<label>规格:</label> <input name="specification" class="easyui-textbox">
			</div>
			<div class="fitem">
				<label>说明:</label> <input name="gremark" class="easyui-textbox">
			</div>
		</form>
	</div>


	<div id="goodsdlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton c6"
			iconCls="icon-ok" onclick="saveGoods()" style="width: 90px">保存</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-cancel"
			onclick="javascript:$('#goodsdlg').dialog('close')"
			style="width: 90px">取消</a>
	</div>


	<script type="text/javascript">
	//使用格式化显示数据，根据每条数据对应的外键字段显示对应的数据，即下拉框要显示的数据
	function goodsFormat(value, row, rowindex) {
		//用参数 row 来获取 goodsType对象,再调用里面的type属性
		return row.goodsType.type;
	}

	function providerFormat(value, row, rowindex) {
		return row.provider.provider;
	}	
	
	
	
	
		function newGoods() {
			$('#goodsdlg').dialog('open').dialog('setTitle', '新增');
			$('#goodsfm').form('clear');
			url = 'goods/addGoods.do';//从这里调用“Action”里的方法
			
			
			//从已经加载的datagride中所选择的行（row）中获取key值,修改下拉框的选中值  
			var providerdata = $('#id_provider').combobox('getData');
		    if(providerdata.length>0){
		    	//新增窗口默认显示第一条数据
			  $('#id_provider').combobox('select',providerdata[0].providerno);
		    }; 
		    
		    var goodsTypedata = $('#id_goodsType').combobox('getData');
		    if(goodsTypedata.length>0){
			  $('#id_goodsType').combobox('select',goodsTypedata[0].typeno);
		    }; 
		}

		function editGoods() {
			
			
			var row = $('#goodsdg').datagrid('getSelected');
			if (row) {
				$('#goodsdlg').dialog('open').dialog('setTitle', '编辑');
				$('#goodsfm').form('load', row);
				url = 'goods/updateGoods.do?goodsno=' + row.goodsno;//这里传ID
				
				//console.log(row.provider.providerNo);
				//从已经加载的datagride中所选择的行（row）中获取key值,修改下拉框的选中值  
				var providerdata = $('#id_provider').combobox('getData');
			    if(providerdata.length>0){
			    	//编辑窗口默认选中正在编辑的数据
				  $('#id_provider').combobox('select',row.provider.providerno);
			    }; 
			    
			    var goodsTypedata = $('#id_goodsType').combobox('getData');
			    if(goodsTypedata.length>0){
				  $('#id_goodsType').combobox('select',row.goodsType.typeno);
			    }; 

				
				
			}
		}

		function saveGoods() {
			$('#goodsfm').form('submit', {
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
						$('#goodsdlg').dialog('close'); // close the dialog
						$('#goodsdg').datagrid('reload'); // reload the user data
					}
				}
			});
		}

		function destroyGoods() {
			var row = $('#goodsdg').datagrid('getSelected');
			if (row) {
				$.messager.confirm('Confirm', '确定要删除吗?', function(r) {
					if (r) {
						//ajax调用
						$.post('goods/deleteGoods.do', {
							goodsno : row.goodsno
						}, function(result) {
							if (result.success) {
								$('#goodsdg').datagrid('reload'); // reload the user data
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