/**
 * 
 */
package com.caoxianfei.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.caoxianfei.domian.House_DingDan;
import com.caoxianfei.domian.Vo;
import com.caoxianfei.service.HouseService;
import com.caoxianfei.service.impl.HouseServiceImpl;
import com.caoxianfei.utils.RandomUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author (caoxianfei) email:(948315767@qq.com)
 * @version v1.0
 * @date 
 *	  创建于:2020年5月6日上午10:00:16
 */
@Controller
public class DemoController {

	@Autowired
	private HouseService service;
	
	@RequestMapping("list.do")
	public String list(@RequestParam(defaultValue = "1") int pageNum,HttpServletRequest request,String hname,String phone,String name,String f1,String f2,String t1,String t2) {
		Vo v = new Vo(hname, phone, name, f1, f2, t1, t2);
		PageHelper.startPage(pageNum, 10);
		List<House_DingDan> list = service.list(v);             //模糊查询 以及条件查询  分页  方法
		PageInfo<House_DingDan> info = new PageInfo<House_DingDan>(list);
		request.setAttribute("list", list);
		request.setAttribute("info", info);
		request.setAttribute("v", v);
		return "list";
	}
	
	@RequestMapping("adds.do")
	public String adds() throws ParseException {  //因测试注解忘记 所以 改用 controller 方法 循环一百次 生成数据
		for (int i = 0; i < 100; i++) {  
			
			House_DingDan h = new House_DingDan();
			int nextInt = RandomUtil.nextInt(1,6);
			String time = "2020-05-0" + nextInt;
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(time);
			String[] name1 = RandomUtil.generateChinesePersonName().split("-");
			String name = name1[1];
			String phone = "158";
			for (int j = 0; j < 8; j++) {
				int nextString = RandomUtil.nextInt(9);
				phone +=nextString;
			}
			int id = RandomUtil.nextInt(1,3);
			int nextInt2 = RandomUtil.nextInt(10);
			String scope = RandomUtil.nextSimplifiedChineseString(nextInt2);
			
			h.setHname(name);
			h.setHtime(date);
			h.setId(id);
			h.setPhone(phone);
			h.setScope(scope);
			service.addHouse(h);
			System.out.println(h);
		}
		return "redirect:list.do";
	}
	
	
	@RequestMapping("add.do")
	public String add() {    //跳转到 添加页面
		return "add";
	}
	
	@RequestMapping("addhouse")
	public String addDoing(String htime,String hname,String phone,Integer id,String scope) throws ParseException {
		System.out.println("------------------");
		House_DingDan h = new House_DingDan();
		h.setHtime(new SimpleDateFormat("yyyy-MM-dd").parse(htime));
		h.setHname(hname);
		h.setPhone(phone);
		h.setId(id);                        //单独添加一条开房记录
		h.setScope(scope);
		service.addHouse(h);
		return "redirect:list.do";
	}
}
