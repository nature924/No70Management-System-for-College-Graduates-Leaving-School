package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TushuguangoutongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TushuguangoutongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TushuguangoutongView;


/**
 * 图书馆沟通
 *
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface TushuguangoutongService extends IService<TushuguangoutongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TushuguangoutongVO> selectListVO(Wrapper<TushuguangoutongEntity> wrapper);
   	
   	TushuguangoutongVO selectVO(@Param("ew") Wrapper<TushuguangoutongEntity> wrapper);
   	
   	List<TushuguangoutongView> selectListView(Wrapper<TushuguangoutongEntity> wrapper);
   	
   	TushuguangoutongView selectView(@Param("ew") Wrapper<TushuguangoutongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TushuguangoutongEntity> wrapper);
   	

}

