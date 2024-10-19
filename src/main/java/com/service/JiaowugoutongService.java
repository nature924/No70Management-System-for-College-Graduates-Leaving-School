package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaowugoutongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaowugoutongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaowugoutongView;


/**
 * 教务沟通
 *
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface JiaowugoutongService extends IService<JiaowugoutongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaowugoutongVO> selectListVO(Wrapper<JiaowugoutongEntity> wrapper);
   	
   	JiaowugoutongVO selectVO(@Param("ew") Wrapper<JiaowugoutongEntity> wrapper);
   	
   	List<JiaowugoutongView> selectListView(Wrapper<JiaowugoutongEntity> wrapper);
   	
   	JiaowugoutongView selectView(@Param("ew") Wrapper<JiaowugoutongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaowugoutongEntity> wrapper);
   	

}

