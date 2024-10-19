package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LunwenxinxiDao;
import com.entity.LunwenxinxiEntity;
import com.service.LunwenxinxiService;
import com.entity.vo.LunwenxinxiVO;
import com.entity.view.LunwenxinxiView;

@Service("lunwenxinxiService")
public class LunwenxinxiServiceImpl extends ServiceImpl<LunwenxinxiDao, LunwenxinxiEntity> implements LunwenxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LunwenxinxiEntity> page = this.selectPage(
                new Query<LunwenxinxiEntity>(params).getPage(),
                new EntityWrapper<LunwenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LunwenxinxiEntity> wrapper) {
		  Page<LunwenxinxiView> page =new Query<LunwenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LunwenxinxiVO> selectListVO(Wrapper<LunwenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LunwenxinxiVO selectVO(Wrapper<LunwenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LunwenxinxiView> selectListView(Wrapper<LunwenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LunwenxinxiView selectView(Wrapper<LunwenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
