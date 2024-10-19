package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaiwugoutongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaiwugoutongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaiwugoutongView;


/**
 * 财务沟通
 *
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface CaiwugoutongService extends IService<CaiwugoutongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaiwugoutongVO> selectListVO(Wrapper<CaiwugoutongEntity> wrapper);
   	
   	CaiwugoutongVO selectVO(@Param("ew") Wrapper<CaiwugoutongEntity> wrapper);
   	
   	List<CaiwugoutongView> selectListView(Wrapper<CaiwugoutongEntity> wrapper);
   	
   	CaiwugoutongView selectView(@Param("ew") Wrapper<CaiwugoutongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaiwugoutongEntity> wrapper);
   	

}

