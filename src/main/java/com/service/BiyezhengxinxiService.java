package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BiyezhengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BiyezhengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BiyezhengxinxiView;


/**
 * 毕业证信息
 *
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public interface BiyezhengxinxiService extends IService<BiyezhengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BiyezhengxinxiVO> selectListVO(Wrapper<BiyezhengxinxiEntity> wrapper);
   	
   	BiyezhengxinxiVO selectVO(@Param("ew") Wrapper<BiyezhengxinxiEntity> wrapper);
   	
   	List<BiyezhengxinxiView> selectListView(Wrapper<BiyezhengxinxiEntity> wrapper);
   	
   	BiyezhengxinxiView selectView(@Param("ew") Wrapper<BiyezhengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BiyezhengxinxiEntity> wrapper);
   	

}

