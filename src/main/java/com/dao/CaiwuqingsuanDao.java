package com.dao;

import com.entity.CaiwuqingsuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaiwuqingsuanVO;
import com.entity.view.CaiwuqingsuanView;


/**
 * 财务清算
 * 
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface CaiwuqingsuanDao extends BaseMapper<CaiwuqingsuanEntity> {
	
	List<CaiwuqingsuanVO> selectListVO(@Param("ew") Wrapper<CaiwuqingsuanEntity> wrapper);
	
	CaiwuqingsuanVO selectVO(@Param("ew") Wrapper<CaiwuqingsuanEntity> wrapper);
	
	List<CaiwuqingsuanView> selectListView(@Param("ew") Wrapper<CaiwuqingsuanEntity> wrapper);

	List<CaiwuqingsuanView> selectListView(Pagination page,@Param("ew") Wrapper<CaiwuqingsuanEntity> wrapper);
	
	CaiwuqingsuanView selectView(@Param("ew") Wrapper<CaiwuqingsuanEntity> wrapper);
	

}
