<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>JQuery easyui demo</title>

<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.4.1/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.4.1/themes/icon.css">
<script type="text/javascript" src="jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
	function open_menu(titleName, menuUrl) {
		if ($("#tt").tabs("exists", titleName)) {
			$("#tt").tabs("select", titleName);
		} else {
			$('#tt').tabs('add', {
				title : titleName,
				href : menuUrl,
				closable : true
			});
		}
	}
</script>
</head>

<body class="easyui-layout">
	<div id="cc" class="easyui-layout" style="width: 100%;heith:100%; min-height: 600px;">
		<div data-options="region:'north',border:false" style="height: 100px;">
			<img alt="logo" src="images/logo.png" style="padding: 20px 0 0 20px;">
			<!-- 记录是谁登录 -->
			<div style="float:right;"><h1>欢迎使用进销存系统：${LOGIN_USER.userName}</h1></div>
		</div>
		<div data-options="region:'west',title:'菜单',split:true"
			style="width: 200px;">
			<div id="aa" class="easyui-accordion"
				data-options="fit:true,border:false">



				<!-- 基本资料管理 -->
				<div title="基本资料管理" data-options="iconCls:'icon-reload'"
					style="padding: 10px;">
					<a id="btn" href="javascript:void(0);" class="easyui-linkbutton"
						data-options="plain:true" onclick="open_menu('商品管理','goods.jsp')">商品管理</a><br>					
					
					<a id="btn" href="javascript:void(0);" class="easyui-linkbutton"
						data-options="plain:true" onclick="open_menu('商品类别管理','goodsType.jsp')">商品类别管理</a><br>

					<a id="btn" href="javascript:void(0);" class="easyui-linkbutton"
						data-options="plain:true" onclick="open_menu('供应商管理','provider.jsp')">供应商管理管理</a><br>	
	
					<a id="btn" href="javascript:void(0);" class="easyui-linkbutton"
						data-options="plain:true" onclick="open_menu('客户管理','client.jsp')">客户管理</a><br>	
						
					<a id="btn" href="javascript:void(0);" class="easyui-linkbutton"
						data-options="plain:true" onclick="open_menu('仓库管理','storage.jsp')">仓库管理</a><br>								
				</div>
				
				
				
				
				<!-- 采购管理 -->
				<div title="采购管理" data-options="iconCls:'icon-reload'"
					style="padding: 10px;">
					<a id="btn" href="javascript:void(0);" class="easyui-linkbutton"
						data-options="plain:true" onclick="open_menu('采购进货管理','purchasingin.jsp')">采购进货管理</a><br>					
					
					<a id="btn" href="javascript:void(0);" class="easyui-linkbutton"
						data-options="plain:true" onclick="open_menu('采购退货管理','purchasingout.jsp')">采购退货管理</a><br>
							
				</div>



				<!-- 销售管理 -->
				<div title="销售管理" data-options="iconCls:'icon-reload'"
					style="padding: 10px;">
					<a id="btn" href="javascript:void(0);" class="easyui-linkbutton"
						data-options="plain:true" onclick="open_menu('销售出货管理','salesgoo.jsp')">销售出货管理</a><br>					
					
					<a id="btn" href="javascript:void(0);" class="easyui-linkbutton"
						data-options="plain:true" onclick="open_menu('销售进货管理','salesout.jsp')">销售进货管理</a><br>
							
				</div>




				<!-- 库存管理 -->
				<div title="库存管理" data-options="iconCls:'icon-reload'"
					style="padding: 10px;">
					<a id="btn" href="javascript:void(0);" class="easyui-linkbutton"
						data-options="plain:true" onclick="open_menu('入库管理','stockin.jsp')">入库管理</a><br>					
					
					<a id="btn" href="javascript:void(0);" class="easyui-linkbutton"
						data-options="plain:true" onclick="open_menu('出库管理','stockout.jsp')">出库管理</a><br>
							
				</div>






				<!-- 系统管理 -->
				<div title="系统管理" data-options="iconCls:'icon-reload'"
					style="padding: 10px;">
					
					<a id="btn" href="javascript:void(0);" class="easyui-linkbutton"
						data-options="plain:true" onclick="open_menu('用户管理','sysusers.jsp')">用户管理</a><br>	
					
					<a href="<%=basePath %>/usermessage/logout.do" class="easyui-linkbutton" 
						data-options="plain:true">安全退出</a>
					
				</div>
						
			</div>
		</div>


		<div data-options="region:'center',border:false,plain:true">
			<div id="tt" class="easyui-tabs" fit=true>
				<div title="首页" style="text-align: center; font-size: 24px;">
					<p>欢迎来到NETBOY后台管理系统</p>
				</div>
			</div>
		</div>
	</div>
	<div style="height: 80px; text-align: center; font-size: 12px;">
		<p>版权所有,&copy;2016-2018</p>
	</div>
</body>
</html>