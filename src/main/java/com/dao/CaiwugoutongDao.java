package com.dao;

import com.entity.CaiwugoutongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaiwugoutongVO;
import com.entity.view.CaiwugoutongView;


/**
 * 财务沟通
 * 
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface CaiwugoutongDao extends BaseMapper<CaiwugoutongEntity> {
	
	List<CaiwugoutongVO> selectListVO(@Param("ew") Wrapper<CaiwugoutongEntity> wrapper);
	
	CaiwugoutongVO selectVO(@Param("ew") Wrapper<CaiwugoutongEntity> wrapper);
	
	List<CaiwugoutongView> selectListView(@Param("ew") Wrapper<CaiwugoutongEntity> wrapper);

	List<CaiwugoutongView> selectListView(Pagination page,@Param("ew") Wrapper<CaiwugoutongEntity> wrapper);
	
	CaiwugoutongView selectView(@Param("ew") Wrapper<CaiwugoutongEntity> wrapper);
	

}
