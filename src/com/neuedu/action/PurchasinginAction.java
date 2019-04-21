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
import com.neuedu.model.Purchasingin;
import com.neuedu.service.*;

@Controller
@RequestMapping(value = "/purchasingin")
public class PurchasinginAction {

	@Autowired
	private PurchasinginService ss;	
	
	//查询所有
	@RequestMapping(value = "/findAll")
	public void findAll(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		int page=Integer.parseInt(request.getParameter("page"));
		int rows=Integer.parseInt(request.getParameter("rows"));
		
		Map<String, Object> map=new HashMap<String, Object>();
		Map<String, Object> pageMap=new HashMap<String, Object>();
		
		pageMap.put("startPage", (page-1)*rows);
		pageMap.put("endPage", rows);
		
		List<Purchasingin> u= ss.getAll(pageMap);
		int total=ss.countPurchasingin();
		map.put("rows", u);
		map.put("total", total);
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);
	}	
	
	
	//添加
	@RequestMapping(value="addPurchasingin")
	public void addPurchasingin(Purchasingin pcs,HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		
		int res = ss.addPurchasingin(pcs);
		System.out.println(res);
		
		Map<String, Object> map = new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "Add Purchasingin fail !!!");
		}		
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);		
		
		
	}		
	
	
	
	//修改
	@RequestMapping(value="updatePurchasingin")
	public void updatePurchasingin(Purchasingin pcs,HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		int res = ss.updatePurchasingin(pcs);
		System.out.println(res);
		Map<String, Object> map=new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "update Purchasingin fail !!!");
		}
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);		
		
	}	
	
	
	/*删除*/
	@RequestMapping(value="deletePurchasingin")
	public void deletePurchasingin(HttpServletRequest request,HttpServletResponse response) throws Exception{

		int idno=Integer.parseInt(request.getParameter("pno"));
		System.out.println(idno);
		
		int res = ss.deletePurchasingin(idno);
		
		Map<String, Object> map=new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "delete Purchasingin fail !!!");
		}
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);
		
	}		
	
	
	
	
	
	
}
