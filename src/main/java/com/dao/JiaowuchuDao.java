package com.dao;

import com.entity.JiaowuchuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaowuchuVO;
import com.entity.view.JiaowuchuView;


/**
 * 教务处
 * 
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface JiaowuchuDao extends BaseMapper<JiaowuchuEntity> {
	
	List<JiaowuchuVO> selectListVO(@Param("ew") Wrapper<JiaowuchuEntity> wrapper);
	
	JiaowuchuVO selectVO(@Param("ew") Wrapper<JiaowuchuEntity> wrapper);
	
	List<JiaowuchuView> selectListView(@Param("ew") Wrapper<JiaowuchuEntity> wrapper);

	List<JiaowuchuView> selectListView(Pagination page,@Param("ew") Wrapper<JiaowuchuEntity> wrapper);
	
	JiaowuchuView selectView(@Param("ew") Wrapper<JiaowuchuEntity> wrapper);
	

}
