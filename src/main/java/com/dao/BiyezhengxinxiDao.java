package com.dao;

import com.entity.BiyezhengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BiyezhengxinxiVO;
import com.entity.view.BiyezhengxinxiView;


/**
 * 毕业证信息
 * 
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface BiyezhengxinxiDao extends BaseMapper<BiyezhengxinxiEntity> {
	
	List<BiyezhengxinxiVO> selectListVO(@Param("ew") Wrapper<BiyezhengxinxiEntity> wrapper);
	
	BiyezhengxinxiVO selectVO(@Param("ew") Wrapper<BiyezhengxinxiEntity> wrapper);
	
	List<BiyezhengxinxiView> selectListView(@Param("ew") Wrapper<BiyezhengxinxiEntity> wrapper);

	List<BiyezhengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BiyezhengxinxiEntity> wrapper);
	
	BiyezhengxinxiView selectView(@Param("ew") Wrapper<BiyezhengxinxiEntity> wrapper);
	

}
