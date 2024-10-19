package com.dao;

import com.entity.QianshuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QianshuxinxiVO;
import com.entity.view.QianshuxinxiView;


/**
 * 欠书信息
 * 
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface QianshuxinxiDao extends BaseMapper<QianshuxinxiEntity> {
	
	List<QianshuxinxiVO> selectListVO(@Param("ew") Wrapper<QianshuxinxiEntity> wrapper);
	
	QianshuxinxiVO selectVO(@Param("ew") Wrapper<QianshuxinxiEntity> wrapper);
	
	List<QianshuxinxiView> selectListView(@Param("ew") Wrapper<QianshuxinxiEntity> wrapper);

	List<QianshuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QianshuxinxiEntity> wrapper);
	
	QianshuxinxiView selectView(@Param("ew") Wrapper<QianshuxinxiEntity> wrapper);
	

}
