package com.dao;

import com.entity.SusheguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SusheguanliVO;
import com.entity.view.SusheguanliView;


/**
 * 宿舍管理
 * 
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface SusheguanliDao extends BaseMapper<SusheguanliEntity> {
	
	List<SusheguanliVO> selectListVO(@Param("ew") Wrapper<SusheguanliEntity> wrapper);
	
	SusheguanliVO selectVO(@Param("ew") Wrapper<SusheguanliEntity> wrapper);
	
	List<SusheguanliView> selectListView(@Param("ew") Wrapper<SusheguanliEntity> wrapper);

	List<SusheguanliView> selectListView(Pagination page,@Param("ew") Wrapper<SusheguanliEntity> wrapper);
	
	SusheguanliView selectView(@Param("ew") Wrapper<SusheguanliEntity> wrapper);
	

}
