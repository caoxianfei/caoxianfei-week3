/**
 * 
 */
package com.caoxianfei.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import com.caoxianfei.domian.House_DingDan;
import com.caoxianfei.service.HouseService;
import com.caoxianfei.utils.DateUtil;
import com.caoxianfei.utils.NumberUtil;
import com.caoxianfei.utils.RandomUtil;
import com.caoxianfei.utils.StringUtil;

/**
 * @author (caoxianfei) email:(948315767@qq.com)
 * @version v1.0
 * @date 
 *	  创建于:2020年5月6日上午9:14:13
 */

public class TestHouse {

	/*
	 * @Autowired private HouseService service;
	 */
	
	@Test
	public void test1() throws ParseException {
		
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
			/* service.addHouse(h); */
		}
		
	}
	
}
