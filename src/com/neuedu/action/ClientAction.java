package com.neuedu.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.neuedu.model.Client;
import com.neuedu.model.GoodsType;
import com.neuedu.service.ClientService;
import com.neuedu.service.GoodsTypeService;


@Controller
@RequestMapping(value = "/client")
public class ClientAction {

	//调用服务层
	@Autowired
	private ClientService cs;	
	
	//查询所有
	@RequestMapping(value = "/findAll")
	public void findAll(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		int page=Integer.parseInt(request.getParameter("page"));
		int rows=Integer.parseInt(request.getParameter("rows"));
		
		Map<String, Object> map=new HashMap<String, Object>();
		Map<String, Object> pageMap=new HashMap<String, Object>();
		
		pageMap.put("startPage", (page-1)*rows);
		pageMap.put("endPage", rows);
		
		List<Client> u= cs.getAll(pageMap);
		int total=cs.countClient();
		map.put("rows", u);
		map.put("total", total);
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);
	}		
	
	
	//添加
	@RequestMapping(value="addClient")
	public void addGoodsType(Client ct,HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		
		int res = cs.addClient(ct);
		System.out.println(res);
		
		Map<String, Object> map = new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "Add Client fail !!!");
		}		
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);		
		
		
	}		
	
	//修改
	@RequestMapping(value="updateClient")
	public void updateClient(Client ct,HttpServletRequest request,HttpServletResponse response) throws Exception{

		int res = cs.updateClient(ct);
		System.out.println(res);
		Map<String, Object> map=new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "update Client fail !!!");
		}
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);	
		
	}			

	/*删除*/
	@RequestMapping(value="deleteClient")
	public void deleteClient(HttpServletRequest request,HttpServletResponse response) throws Exception{

		int noid=Integer.parseInt(request.getParameter("clientno"));
		
		System.out.println(noid);
		
		int res = cs.deleteClient(noid);
		
		Map<String, Object> map=new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "delete Client fail !!!");
		}
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);
		
	}	
		
	
	
	
	
	
}
