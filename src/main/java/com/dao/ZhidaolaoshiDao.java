package com.dao;

import com.entity.ZhidaolaoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhidaolaoshiVO;
import com.entity.view.ZhidaolaoshiView;


/**
 * 指导老师
 * 
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface ZhidaolaoshiDao extends BaseMapper<ZhidaolaoshiEntity> {
	
	List<ZhidaolaoshiVO> selectListVO(@Param("ew") Wrapper<ZhidaolaoshiEntity> wrapper);
	
	ZhidaolaoshiVO selectVO(@Param("ew") Wrapper<ZhidaolaoshiEntity> wrapper);
	
	List<ZhidaolaoshiView> selectListView(@Param("ew") Wrapper<ZhidaolaoshiEntity> wrapper);

	List<ZhidaolaoshiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhidaolaoshiEntity> wrapper);
	
	ZhidaolaoshiView selectView(@Param("ew") Wrapper<ZhidaolaoshiEntity> wrapper);
	

}
