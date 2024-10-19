package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SuguangoutongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SuguangoutongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SuguangoutongView;


/**
 * 宿管沟通
 *
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface SuguangoutongService extends IService<SuguangoutongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SuguangoutongVO> selectListVO(Wrapper<SuguangoutongEntity> wrapper);
   	
   	SuguangoutongVO selectVO(@Param("ew") Wrapper<SuguangoutongEntity> wrapper);
   	
   	List<SuguangoutongView> selectListView(Wrapper<SuguangoutongEntity> wrapper);
   	
   	SuguangoutongView selectView(@Param("ew") Wrapper<SuguangoutongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SuguangoutongEntity> wrapper);
   	

}

