package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshigoutongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshigoutongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshigoutongView;


/**
 * 教师沟通
 *
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface JiaoshigoutongService extends IService<JiaoshigoutongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshigoutongVO> selectListVO(Wrapper<JiaoshigoutongEntity> wrapper);
   	
   	JiaoshigoutongVO selectVO(@Param("ew") Wrapper<JiaoshigoutongEntity> wrapper);
   	
   	List<JiaoshigoutongView> selectListView(Wrapper<JiaoshigoutongEntity> wrapper);
   	
   	JiaoshigoutongView selectView(@Param("ew") Wrapper<JiaoshigoutongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshigoutongEntity> wrapper);
   	

}

