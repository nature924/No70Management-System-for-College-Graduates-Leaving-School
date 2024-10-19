package com.dao;

import com.entity.FudaoyuangoutongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FudaoyuangoutongVO;
import com.entity.view.FudaoyuangoutongView;


/**
 * 辅导员沟通
 * 
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface FudaoyuangoutongDao extends BaseMapper<FudaoyuangoutongEntity> {
	
	List<FudaoyuangoutongVO> selectListVO(@Param("ew") Wrapper<FudaoyuangoutongEntity> wrapper);
	
	FudaoyuangoutongVO selectVO(@Param("ew") Wrapper<FudaoyuangoutongEntity> wrapper);
	
	List<FudaoyuangoutongView> selectListView(@Param("ew") Wrapper<FudaoyuangoutongEntity> wrapper);

	List<FudaoyuangoutongView> selectListView(Pagination page,@Param("ew") Wrapper<FudaoyuangoutongEntity> wrapper);
	
	FudaoyuangoutongView selectView(@Param("ew") Wrapper<FudaoyuangoutongEntity> wrapper);
	

}
