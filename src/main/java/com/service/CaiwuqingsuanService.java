package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaiwuqingsuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaiwuqingsuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaiwuqingsuanView;


/**
 * 财务清算
 *
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface CaiwuqingsuanService extends IService<CaiwuqingsuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaiwuqingsuanVO> selectListVO(Wrapper<CaiwuqingsuanEntity> wrapper);
   	
   	CaiwuqingsuanVO selectVO(@Param("ew") Wrapper<CaiwuqingsuanEntity> wrapper);
   	
   	List<CaiwuqingsuanView> selectListView(Wrapper<CaiwuqingsuanEntity> wrapper);
   	
   	CaiwuqingsuanView selectView(@Param("ew") Wrapper<CaiwuqingsuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaiwuqingsuanEntity> wrapper);
   	

}

