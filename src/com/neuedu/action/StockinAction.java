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
@RequestMapping(value = "/stockin")
public class StockinAction {

	//调用服务层
	@Autowired
	private StockinService ps;
	
	//查询所有
	@RequestMapping(value = "/findAll")
	public void findAll(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		int page=Integer.parseInt(request.getParameter("page"));
		int rows=Integer.parseInt(request.getParameter("rows"));
		
		Map<String, Object> map=new HashMap<String, Object>();
		Map<String, Object> pageMap=new HashMap<String, Object>();
		
		pageMap.put("startPage", (page-1)*rows);
		pageMap.put("endPage", rows);
		
		List<Stockin> u= ps.getAll(pageMap);
		int total=ps.countStockin();
		map.put("rows", u);
		map.put("total", total);
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);
	}	
		
	//添加
	@RequestMapping(value="addStockin")
	public void addStockin(Stockin pd,HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		
		int res = ps.addStockin(pd);
		System.out.println(res);
		
		Map<String, Object> map = new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "Add Stockin fail !!!");
		}		
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);		
		
		
	}						
	
	
	//修改
	@RequestMapping(value="updateStockin")
	public void updateStockin(Stockin pd,HttpServletRequest request,HttpServletResponse response) throws Exception{

		int res = ps.updateStockin(pd);
		System.out.println(res);
		Map<String, Object> map=new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "update Stockin fail !!!");
		}
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);	
		
	}		
	
	/*删除*/
	@RequestMapping(value="deleteStockin")
	public void deleteStockin(HttpServletRequest request,HttpServletResponse response) throws Exception{

		int noid=Integer.parseInt(request.getParameter("stockinno"));
		
		System.out.println(noid);
		
		int res = ps.deleteStockin(noid);
		
		Map<String, Object> map=new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "delete Stockin fail !!!");
		}
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);
		
	}	
	
	
	
	
	
	
	
	
	
	
}
