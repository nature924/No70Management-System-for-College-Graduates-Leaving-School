package com.dao;

import com.entity.JiaoshigoutongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshigoutongVO;
import com.entity.view.JiaoshigoutongView;


/**
 * 教师沟通
 * 
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface JiaoshigoutongDao extends BaseMapper<JiaoshigoutongEntity> {
	
	List<JiaoshigoutongVO> selectListVO(@Param("ew") Wrapper<JiaoshigoutongEntity> wrapper);
	
	JiaoshigoutongVO selectVO(@Param("ew") Wrapper<JiaoshigoutongEntity> wrapper);
	
	List<JiaoshigoutongView> selectListView(@Param("ew") Wrapper<JiaoshigoutongEntity> wrapper);

	List<JiaoshigoutongView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshigoutongEntity> wrapper);
	
	JiaoshigoutongView selectView(@Param("ew") Wrapper<JiaoshigoutongEntity> wrapper);
	

}
