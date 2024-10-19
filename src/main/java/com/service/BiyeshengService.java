package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BiyeshengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BiyeshengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BiyeshengView;


/**
 * 毕业生
 *
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface BiyeshengService extends IService<BiyeshengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BiyeshengVO> selectListVO(Wrapper<BiyeshengEntity> wrapper);
   	
   	BiyeshengVO selectVO(@Param("ew") Wrapper<BiyeshengEntity> wrapper);
   	
   	List<BiyeshengView> selectListView(Wrapper<BiyeshengEntity> wrapper);
   	
   	BiyeshengView selectView(@Param("ew") Wrapper<BiyeshengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BiyeshengEntity> wrapper);
   	

}

