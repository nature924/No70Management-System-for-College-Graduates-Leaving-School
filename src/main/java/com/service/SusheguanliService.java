package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SusheguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SusheguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SusheguanliView;


/**
 * 宿舍管理
 *
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface SusheguanliService extends IService<SusheguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SusheguanliVO> selectListVO(Wrapper<SusheguanliEntity> wrapper);
   	
   	SusheguanliVO selectVO(@Param("ew") Wrapper<SusheguanliEntity> wrapper);
   	
   	List<SusheguanliView> selectListView(Wrapper<SusheguanliEntity> wrapper);
   	
   	SusheguanliView selectView(@Param("ew") Wrapper<SusheguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SusheguanliEntity> wrapper);
   	

}

