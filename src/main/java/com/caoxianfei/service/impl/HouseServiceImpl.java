/**
 * 
 */
package com.caoxianfei.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caoxianfei.dao.HouseDao;
import com.caoxianfei.domian.House_DingDan;
import com.caoxianfei.domian.Vo;
import com.caoxianfei.service.HouseService;
import com.caoxianfei.utils.RandomUtil;

/**
 * @author (caoxianfei) email:(948315767@qq.com)
 * @version v1.0
 * @date 
 *	  创建于:2020年5月6日上午9:45:28
 */
@Transactional
@Service
public class HouseServiceImpl implements HouseService{

	@Autowired
	private HouseDao dao;
	
	@Override
	public int addHouse(House_DingDan h) {
		// TODO Auto-generated method stub
		return dao.addHouse(h);
	}
	
	

	@Override
	public List<House_DingDan> list(Vo v) {
		// TODO Auto-generated method stub
		return dao.list(v);
	}

}
