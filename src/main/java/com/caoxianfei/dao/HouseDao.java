/**
 * 
 */
package com.caoxianfei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.caoxianfei.domian.House_DingDan;
import com.caoxianfei.domian.Vo;

/**
 * @author (caoxianfei) email:(948315767@qq.com)
 * @version v1.0
 * @date 
 *	  创建于:2020年5月6日上午9:10:10
 */
public interface HouseDao {

	int addHouse(@Param("h")House_DingDan  h);         //添加一条  开房记录
	
	List<House_DingDan> list(Vo v);			//查询方法 
}
