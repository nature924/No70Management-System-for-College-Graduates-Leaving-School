package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LixiaoshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LixiaoshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LixiaoshenqingView;


/**
 * 离校申请
 *
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface LixiaoshenqingService extends IService<LixiaoshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LixiaoshenqingVO> selectListVO(Wrapper<LixiaoshenqingEntity> wrapper);
   	
   	LixiaoshenqingVO selectVO(@Param("ew") Wrapper<LixiaoshenqingEntity> wrapper);
   	
   	List<LixiaoshenqingView> selectListView(Wrapper<LixiaoshenqingEntity> wrapper);
   	
   	LixiaoshenqingView selectView(@Param("ew") Wrapper<LixiaoshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LixiaoshenqingEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<LixiaoshenqingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<LixiaoshenqingEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<LixiaoshenqingEntity> wrapper);
}

