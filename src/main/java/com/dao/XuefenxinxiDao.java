package com.dao;

import com.entity.XuefenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuefenxinxiVO;
import com.entity.view.XuefenxinxiView;


/**
 * 学分信息
 * 
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface XuefenxinxiDao extends BaseMapper<XuefenxinxiEntity> {
	
	List<XuefenxinxiVO> selectListVO(@Param("ew") Wrapper<XuefenxinxiEntity> wrapper);
	
	XuefenxinxiVO selectVO(@Param("ew") Wrapper<XuefenxinxiEntity> wrapper);
	
	List<XuefenxinxiView> selectListView(@Param("ew") Wrapper<XuefenxinxiEntity> wrapper);

	List<XuefenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XuefenxinxiEntity> wrapper);
	
	XuefenxinxiView selectView(@Param("ew") Wrapper<XuefenxinxiEntity> wrapper);
	

}
