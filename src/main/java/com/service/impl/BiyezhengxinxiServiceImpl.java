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


import com.dao.BiyezhengxinxiDao;
import com.entity.BiyezhengxinxiEntity;
import com.service.BiyezhengxinxiService;
import com.entity.vo.BiyezhengxinxiVO;
import com.entity.view.BiyezhengxinxiView;

@Service("biyezhengxinxiService")
public class BiyezhengxinxiServiceImpl extends ServiceImpl<BiyezhengxinxiDao, BiyezhengxinxiEntity> implements BiyezhengxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BiyezhengxinxiEntity> page = this.selectPage(
                new Query<BiyezhengxinxiEntity>(params).getPage(),
                new EntityWrapper<BiyezhengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BiyezhengxinxiEntity> wrapper) {
		  Page<BiyezhengxinxiView> page =new Query<BiyezhengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BiyezhengxinxiVO> selectListVO(Wrapper<BiyezhengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BiyezhengxinxiVO selectVO(Wrapper<BiyezhengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BiyezhengxinxiView> selectListView(Wrapper<BiyezhengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BiyezhengxinxiView selectView(Wrapper<BiyezhengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
