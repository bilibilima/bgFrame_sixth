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
@RequestMapping(value = "/purchasingout")
public class PurchasingoutAction {

	@Autowired
	private PurchasingoutService ss;	

	
	//查询所有
	@RequestMapping(value = "/findAll")
	public void findAll(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		int page=Integer.parseInt(request.getParameter("page"));
		int rows=Integer.parseInt(request.getParameter("rows"));
		
		Map<String, Object> map=new HashMap<String, Object>();
		Map<String, Object> pageMap=new HashMap<String, Object>();
		
		pageMap.put("startPage", (page-1)*rows);
		pageMap.put("endPage", rows);
		
		List<Purchasingout> u= ss.getAll(pageMap);
		int total=ss.countPurchasingout();
		map.put("rows", u);
		map.put("total", total);
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);
	}		
	
	//添加
	@RequestMapping(value="addPurchasingout")
	public void addStorage(Purchasingout pcs,HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		
		int res = ss.addPurchasingout(pcs);
		System.out.println(res);
		
		Map<String, Object> map = new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "Add Purchasingout fail !!!");
		}		
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);		
		
		
	}			
	
	
	//修改
	@RequestMapping(value="updatePurchasingout")
	public void updateStorage(Purchasingout pcs,HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		int res = ss.updatePurchasingout(pcs);
		System.out.println(res);
		Map<String, Object> map=new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "update Purchasingout fail !!!");
		}
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);		
		
	}		
	
	/*删除*/
	@RequestMapping(value="deletePurchasingout")
	public void deletePurchasingin(HttpServletRequest request,HttpServletResponse response) throws Exception{

		int idno=Integer.parseInt(request.getParameter("prno"));
		System.out.println(idno);
		
		int res = ss.deletePurchasingout(idno);
		
		Map<String, Object> map=new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "delete Purchasingout fail !!!");
		}
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);
		
	}		
	
	
	
	
	
	
	
}
