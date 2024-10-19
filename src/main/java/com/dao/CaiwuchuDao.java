package com.dao;

import com.entity.CaiwuchuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaiwuchuVO;
import com.entity.view.CaiwuchuView;


/**
 * 财务处
 * 
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface CaiwuchuDao extends BaseMapper<CaiwuchuEntity> {
	
	List<CaiwuchuVO> selectListVO(@Param("ew") Wrapper<CaiwuchuEntity> wrapper);
	
	CaiwuchuVO selectVO(@Param("ew") Wrapper<CaiwuchuEntity> wrapper);
	
	List<CaiwuchuView> selectListView(@Param("ew") Wrapper<CaiwuchuEntity> wrapper);

	List<CaiwuchuView> selectListView(Pagination page,@Param("ew") Wrapper<CaiwuchuEntity> wrapper);
	
	CaiwuchuView selectView(@Param("ew") Wrapper<CaiwuchuEntity> wrapper);
	

}
