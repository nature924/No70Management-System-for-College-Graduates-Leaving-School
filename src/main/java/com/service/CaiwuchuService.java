package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaiwuchuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaiwuchuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaiwuchuView;


/**
 * 财务处
 *
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface CaiwuchuService extends IService<CaiwuchuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaiwuchuVO> selectListVO(Wrapper<CaiwuchuEntity> wrapper);
   	
   	CaiwuchuVO selectVO(@Param("ew") Wrapper<CaiwuchuEntity> wrapper);
   	
   	List<CaiwuchuView> selectListView(Wrapper<CaiwuchuEntity> wrapper);
   	
   	CaiwuchuView selectView(@Param("ew") Wrapper<CaiwuchuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaiwuchuEntity> wrapper);
   	

}

