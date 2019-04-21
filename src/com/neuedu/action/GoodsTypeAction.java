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
import com.neuedu.model.GoodsType;
import com.neuedu.model.Storage;
import com.neuedu.service.GoodsTypeService;

@Controller
@RequestMapping(value = "/goodsType")
public class GoodsTypeAction {
	
	@Autowired
	private GoodsTypeService gts;
	
	//查询所有
	@RequestMapping(value = "/findAll")
	public void findAll(HttpServletRequest request,HttpServletResponse response)throws Exception{
		System.out.println("--------------------------------");
		
		int page=Integer.parseInt(request.getParameter("page"));
		int rows=Integer.parseInt(request.getParameter("rows"));
		
		Map<String, Object> map=new HashMap<String, Object>();
		Map<String, Object> pageMap=new HashMap<String, Object>();
		
		pageMap.put("startPage", (page-1)*rows);
		pageMap.put("endPage", rows);
		
		List<GoodsType> u= gts.getAll(pageMap);
		int total=gts.countGoodsType();
		map.put("rows", u);
		map.put("total", total);
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);
	}		

	
	@RequestMapping(value="addGoodsType")
	public void addGoodsType(GoodsType gt,HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		
		int res = gts.addGoodsType(gt);
		System.out.println(res);
		
		Map<String, Object> map = new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "Add GoodsType fail !!!");
		}		
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);		
		
		
	}	
	
	//修改
	@RequestMapping(value="updateGoodsType")
	public void updateGoodsType(GoodsType gt,HttpServletRequest request,HttpServletResponse response) throws Exception{

		int res = gts.updateGoodsType(gt);
		System.out.println(res);
		Map<String, Object> map=new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "update GoodsType fail !!!");
		}
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);	
		
	}		
	
	
	
	
	/*删除*/
	@RequestMapping(value="deleteGoodsType")
	public void deleteGoodsType(HttpServletRequest request,HttpServletResponse response) throws Exception{

		int typeno=Integer.parseInt(request.getParameter("typeno"));
		
		System.out.println(typeno);
		
		int res = gts.deleteGoodsType(typeno);
		
		Map<String, Object> map=new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "delete GoodsType fail !!!");
		}
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);
		
	}	
	
	
	@RequestMapping(value = "/findList")
	public void findList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<GoodsType> list = gts.findList();
		
		String str = JSONObject.toJSONString(list);
		response.getWriter().write(str);
	}
	
	
	
	

}
