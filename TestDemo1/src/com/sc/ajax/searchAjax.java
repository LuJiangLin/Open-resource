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
 * ����������ʾ��
 * @author ludashi
 * 2017.05.03
 *
 */
@SuppressWarnings("serial")
public class searchAjax extends HttpServlet{

	//����һ������,���ģ������
	static List<String> datas = new ArrayList<String>();
	static{
		datas.add("ajax");
		datas.add("ajax�ύform��");
		datas.add("ajax�̳�");
		datas.add("ajax�̳�123");
		datas.add("ajax�̳�123");
		datas.add("ajax�̳�123");
		datas.add("ajax�̳�123");
		datas.add("ajax�̳�123");
		datas.add("ajax�̳�123");
		datas.add("ajax�̳�123");
		datas.add("ajax�̳�123");
		datas.add("baidu");
		datas.add("bt");
		datas.add("byte");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//�����ַ������ʽ
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		//���Ȼ�ÿͻ��˷�����������(keyword)
		String keyword1 = req.getParameter("keyword");
		String keyword = Escape.unescape(keyword1);
		//��ùؼ���֮����д����õ���������
		List<String> listData = getData(keyword);
		
//		System.out.println(JSONArray.fromObject(listData));
//		JSONArray.fromObject(listData);
		//����json��ʽ
		resp.getWriter().write(JSONArray.fromObject(listData).toString());
	}
	//��ù������ݵķ���
	public List<String> getData(String keyword){
		List<String> list = new ArrayList<String>();
		Integer i=0;//������ʾ������Ϊi��
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
