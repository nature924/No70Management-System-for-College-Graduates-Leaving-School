package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuefenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuefenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuefenxinxiView;


/**
 * 学分信息
 *
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface XuefenxinxiService extends IService<XuefenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuefenxinxiVO> selectListVO(Wrapper<XuefenxinxiEntity> wrapper);
   	
   	XuefenxinxiVO selectVO(@Param("ew") Wrapper<XuefenxinxiEntity> wrapper);
   	
   	List<XuefenxinxiView> selectListView(Wrapper<XuefenxinxiEntity> wrapper);
   	
   	XuefenxinxiView selectView(@Param("ew") Wrapper<XuefenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuefenxinxiEntity> wrapper);
   	

}

