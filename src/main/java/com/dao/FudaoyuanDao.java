package com.dao;

import com.entity.FudaoyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FudaoyuanVO;
import com.entity.view.FudaoyuanView;


/**
 * 辅导员
 * 
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface FudaoyuanDao extends BaseMapper<FudaoyuanEntity> {
	
	List<FudaoyuanVO> selectListVO(@Param("ew") Wrapper<FudaoyuanEntity> wrapper);
	
	FudaoyuanVO selectVO(@Param("ew") Wrapper<FudaoyuanEntity> wrapper);
	
	List<FudaoyuanView> selectListView(@Param("ew") Wrapper<FudaoyuanEntity> wrapper);

	List<FudaoyuanView> selectListView(Pagination page,@Param("ew") Wrapper<FudaoyuanEntity> wrapper);
	
	FudaoyuanView selectView(@Param("ew") Wrapper<FudaoyuanEntity> wrapper);
	

}
