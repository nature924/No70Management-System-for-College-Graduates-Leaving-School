package com.dao;

import com.entity.LunwenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LunwenxinxiVO;
import com.entity.view.LunwenxinxiView;


/**
 * 论文信息
 * 
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface LunwenxinxiDao extends BaseMapper<LunwenxinxiEntity> {
	
	List<LunwenxinxiVO> selectListVO(@Param("ew") Wrapper<LunwenxinxiEntity> wrapper);
	
	LunwenxinxiVO selectVO(@Param("ew") Wrapper<LunwenxinxiEntity> wrapper);
	
	List<LunwenxinxiView> selectListView(@Param("ew") Wrapper<LunwenxinxiEntity> wrapper);

	List<LunwenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LunwenxinxiEntity> wrapper);
	
	LunwenxinxiView selectView(@Param("ew") Wrapper<LunwenxinxiEntity> wrapper);
	

}
