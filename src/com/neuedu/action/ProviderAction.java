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
import com.neuedu.model.*;
import com.neuedu.service.*;

@Controller
@RequestMapping(value = "/provider")
public class ProviderAction {
	
	//调用服务层
	@Autowired
	private ProviderService ps;	
	
	//查询所有
	@RequestMapping(value = "/findAll")
	public void findAll(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		int page=Integer.parseInt(request.getParameter("page"));
		int rows=Integer.parseInt(request.getParameter("rows"));
		
		Map<String, Object> map=new HashMap<String, Object>();
		Map<String, Object> pageMap=new HashMap<String, Object>();
		
		pageMap.put("startPage", (page-1)*rows);
		pageMap.put("endPage", rows);
		
		List<Provider> u= ps.getAll(pageMap);
		int total=ps.countProvider();
		map.put("rows", u);
		map.put("total", total);
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);
	}			
	
	
	//添加
	@RequestMapping(value="addProvider")
	public void addProvider(Provider pd,HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		
		int res = ps.addProvider(pd);
		System.out.println(res);
		
		Map<String, Object> map = new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "Add Provider fail !!!");
		}		
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);		
		
		
	}			
	
	//修改
	@RequestMapping(value="updateProvider")
	public void updateProvider(Provider pd,HttpServletRequest request,HttpServletResponse response) throws Exception{

		int res = ps.updateProvider(pd);
		System.out.println(res);
		Map<String, Object> map=new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "update Provider fail !!!");
		}
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);	
		
	}			
	
	/*删除*/
	@RequestMapping(value="deleteProvider")
	public void deleteProvider(HttpServletRequest request,HttpServletResponse response) throws Exception{

		int noid=Integer.parseInt(request.getParameter("providerno"));
		
		System.out.println(noid);
		
		int res = ps.deleteProvider(noid);
		
		Map<String, Object> map=new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "delete Provider fail !!!");
		}
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);
		
	}		
	
	@RequestMapping(value = "/findList")
	public void findList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Provider> list = ps.findList();
		
		String str = JSONObject.toJSONString(list);
		response.getWriter().write(str);
	}
	
	

}
