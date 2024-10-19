package com.dao;

import com.entity.LixiaoshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LixiaoshenqingVO;
import com.entity.view.LixiaoshenqingView;


/**
 * 离校申请
 * 
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface LixiaoshenqingDao extends BaseMapper<LixiaoshenqingEntity> {
	
	List<LixiaoshenqingVO> selectListVO(@Param("ew") Wrapper<LixiaoshenqingEntity> wrapper);
	
	LixiaoshenqingVO selectVO(@Param("ew") Wrapper<LixiaoshenqingEntity> wrapper);
	
	List<LixiaoshenqingView> selectListView(@Param("ew") Wrapper<LixiaoshenqingEntity> wrapper);

	List<LixiaoshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<LixiaoshenqingEntity> wrapper);
	
	LixiaoshenqingView selectView(@Param("ew") Wrapper<LixiaoshenqingEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LixiaoshenqingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LixiaoshenqingEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LixiaoshenqingEntity> wrapper);
}
