/**
 * 
 */
package com.caoxianfei.service;

import java.util.List;

import com.caoxianfei.domian.House_DingDan;
import com.caoxianfei.domian.Vo;

/**
 * @author (caoxianfei) email:(948315767@qq.com)
 * @version v1.0
 * @date 
 *	  创建于:2020年5月6日上午9:45:11
 */
public interface HouseService {

	int addHouse(House_DingDan  h);
	
	List<House_DingDan> list(Vo v);
	
	
}
