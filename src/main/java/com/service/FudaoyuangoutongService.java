package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FudaoyuangoutongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FudaoyuangoutongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FudaoyuangoutongView;


/**
 * 辅导员沟通
 *
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface FudaoyuangoutongService extends IService<FudaoyuangoutongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FudaoyuangoutongVO> selectListVO(Wrapper<FudaoyuangoutongEntity> wrapper);
   	
   	FudaoyuangoutongVO selectVO(@Param("ew") Wrapper<FudaoyuangoutongEntity> wrapper);
   	
   	List<FudaoyuangoutongView> selectListView(Wrapper<FudaoyuangoutongEntity> wrapper);
   	
   	FudaoyuangoutongView selectView(@Param("ew") Wrapper<FudaoyuangoutongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FudaoyuangoutongEntity> wrapper);
   	

}

