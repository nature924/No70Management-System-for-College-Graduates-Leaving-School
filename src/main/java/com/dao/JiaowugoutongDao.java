package com.dao;

import com.entity.JiaowugoutongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaowugoutongVO;
import com.entity.view.JiaowugoutongView;


/**
 * 教务沟通
 * 
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface JiaowugoutongDao extends BaseMapper<JiaowugoutongEntity> {
	
	List<JiaowugoutongVO> selectListVO(@Param("ew") Wrapper<JiaowugoutongEntity> wrapper);
	
	JiaowugoutongVO selectVO(@Param("ew") Wrapper<JiaowugoutongEntity> wrapper);
	
	List<JiaowugoutongView> selectListView(@Param("ew") Wrapper<JiaowugoutongEntity> wrapper);

	List<JiaowugoutongView> selectListView(Pagination page,@Param("ew") Wrapper<JiaowugoutongEntity> wrapper);
	
	JiaowugoutongView selectView(@Param("ew") Wrapper<JiaowugoutongEntity> wrapper);
	

}
