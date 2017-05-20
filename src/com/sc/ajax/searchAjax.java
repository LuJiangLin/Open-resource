package com.sc.ajax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

/**
 * 搜索智能提示框
 * @author ludashi
 * 2017.05.03
 *
 */
@SuppressWarnings("serial")
public class searchAjax extends HttpServlet{

	//定义一个容器,存放模拟数据
	static List<String> datas = new ArrayList<String>();
	static{
		datas.add("ajax");
		datas.add("ajax提交form表单");
		datas.add("ajax教程");
		datas.add("ajax教程123");
		datas.add("ajax教程123");
		datas.add("ajax教程123");
		datas.add("ajax教程123");
		datas.add("ajax教程123");
		datas.add("ajax教程123");
		datas.add("ajax教程123");
		datas.add("ajax教程123");
		datas.add("baidu");
		datas.add("bt");
		datas.add("byte");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//设置字符编码格式
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		//首先获得客户端发送来的数据(keyword)
		String keyword1 = req.getParameter("keyword");
		String keyword = Escape.unescape(keyword1);
		//获得关键字之后进行处理，得到关联数据
		List<String> listData = getData(keyword);
		
//		System.out.println(JSONArray.fromObject(listData));
//		JSONArray.fromObject(listData);
		//返回json格式
		resp.getWriter().write(JSONArray.fromObject(listData).toString());
	}
	//获得关联数据的方法
	public List<String> getData(String keyword){
		List<String> list = new ArrayList<String>();
		Integer i=0;//限制提示框条数为i条
		for (String data : datas) {
			if(i<5){
				if(data.contains(keyword)){
					list.add(data);
					i++;
				}
			}
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
}
