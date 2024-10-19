package com.dao;

import com.entity.SuguangoutongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SuguangoutongVO;
import com.entity.view.SuguangoutongView;


/**
 * 宿管沟通
 * 
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface SuguangoutongDao extends BaseMapper<SuguangoutongEntity> {
	
	List<SuguangoutongVO> selectListVO(@Param("ew") Wrapper<SuguangoutongEntity> wrapper);
	
	SuguangoutongVO selectVO(@Param("ew") Wrapper<SuguangoutongEntity> wrapper);
	
	List<SuguangoutongView> selectListView(@Param("ew") Wrapper<SuguangoutongEntity> wrapper);

	List<SuguangoutongView> selectListView(Pagination page,@Param("ew") Wrapper<SuguangoutongEntity> wrapper);
	
	SuguangoutongView selectView(@Param("ew") Wrapper<SuguangoutongEntity> wrapper);
	

}
