package com.dao;

import com.entity.TushuguangoutongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TushuguangoutongVO;
import com.entity.view.TushuguangoutongView;


/**
 * 图书馆沟通
 * 
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface TushuguangoutongDao extends BaseMapper<TushuguangoutongEntity> {
	
	List<TushuguangoutongVO> selectListVO(@Param("ew") Wrapper<TushuguangoutongEntity> wrapper);
	
	TushuguangoutongVO selectVO(@Param("ew") Wrapper<TushuguangoutongEntity> wrapper);
	
	List<TushuguangoutongView> selectListView(@Param("ew") Wrapper<TushuguangoutongEntity> wrapper);

	List<TushuguangoutongView> selectListView(Pagination page,@Param("ew") Wrapper<TushuguangoutongEntity> wrapper);
	
	TushuguangoutongView selectView(@Param("ew") Wrapper<TushuguangoutongEntity> wrapper);
	

}
