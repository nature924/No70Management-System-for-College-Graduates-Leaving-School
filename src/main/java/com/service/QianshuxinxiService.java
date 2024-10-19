package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QianshuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QianshuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QianshuxinxiView;


/**
 * 欠书信息
 *
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface QianshuxinxiService extends IService<QianshuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QianshuxinxiVO> selectListVO(Wrapper<QianshuxinxiEntity> wrapper);
   	
   	QianshuxinxiVO selectVO(@Param("ew") Wrapper<QianshuxinxiEntity> wrapper);
   	
   	List<QianshuxinxiView> selectListView(Wrapper<QianshuxinxiEntity> wrapper);
   	
   	QianshuxinxiView selectView(@Param("ew") Wrapper<QianshuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QianshuxinxiEntity> wrapper);
   	

}

