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
import com.neuedu.model.Storage;
import com.neuedu.model.UserMessage;
import com.neuedu.service.StorageService;

@Controller
@RequestMapping(value = "/storage")
public class StorageAction {

	@Autowired
	private StorageService ss;
	
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
		
		List<Storage> u= ss.getAll(pageMap);
		int total=ss.countStorage();
		map.put("rows", u);
		map.put("total", total);
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);
	}	


	
	//添加
	@RequestMapping(value="addStorage")
	public void addStorage(Storage storage,HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		
		int res = ss.addStorage(storage);
		System.out.println(res);
		
		Map<String, Object> map = new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "Add Storage fail !!!");
		}		
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);		
		
		
	}		
	
	
	//修改
	@RequestMapping(value="updateStorage")
	public void updateStorage(Storage storage,HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		int res = ss.updateStorage(storage);
		System.out.println(res);
		Map<String, Object> map=new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "update Storage fail !!!");
		}
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);		
		
	}	
	
	
	/*删除*/
	@RequestMapping(value="deleteStorage")
	public void deleteStorage(HttpServletRequest request,HttpServletResponse response) throws Exception{

		int storageno=Integer.parseInt(request.getParameter("storageno"));
		System.out.println(storageno);
		
		int res = ss.deleteStorage(storageno);
		
		Map<String, Object> map=new HashMap<String, Object>();
		if(res>0){
			map.put("success", true);
		}else{
			map.put("success", false);
			map.put("errorMsg", "delete storage fail !!!");
		}
		String str=JSONObject.toJSONString(map);
		response.getWriter().write(str);
		
	}	
	
	
}
