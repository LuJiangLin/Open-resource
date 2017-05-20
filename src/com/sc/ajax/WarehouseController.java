package com.sc.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
/**
 * 搜索框智能提示
 * @author lu
 * olala项目
 */
/*@Controller
@RequestMapping("/warehouseController")*/
public class WarehouseController {
	/*@Resource
	private CommonServiceImple<Warehouse> warehouseCom;
	*//**
	 * 智能搜索提示
	 * 查询仓库名称
	 *//*
	@RequestMapping("/ajaxFind")	
	public void getData(String keyword,HttpServletRequest request,HttpServletResponse response,HttpSession session){
		//定义�?��容器,存放模拟数据
		List<String> datas = new ArrayList<String>();
        String keyword1 = Escape.unescape(keyword);       
		try {
			Integer fuserId=(Integer)session.getAttribute("userId");
			String searchContent = request.getParameter("searchContent");
			PrintWriter out = response.getWriter();
			List<String> list = new ArrayList<String>();
			System.out.println("keyword:"+keyword);
			System.out.println("keyword1:"+keyword1);
			
			List<Warehouse> listwarehouse = warehouseCom.find(WarehouseSQL.warehouseFindName(fuserId, searchContent), Warehouse.class, null);
			if(listwarehouse.size()!=0){
				for (Warehouse warehouse : listwarehouse) {
					datas.add(warehouse.getName());
				}
				System.out.println("datas:"+datas.toString());
				Integer i=0;//限制提示框条数为i�?
				for (String data : datas) {
					if(i<5){
						if(data.contains(keyword1)){
							list.add(data);
							i++;
						}
					}
				}
			}else{
				list.add(null);
			}
			JSONArray listData= JSONArray.fromObject(list);
			out.print(listData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
	
	
}