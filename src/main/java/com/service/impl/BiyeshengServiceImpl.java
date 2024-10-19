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


import com.dao.BiyeshengDao;
import com.entity.BiyeshengEntity;
import com.service.BiyeshengService;
import com.entity.vo.BiyeshengVO;
import com.entity.view.BiyeshengView;

@Service("biyeshengService")
public class BiyeshengServiceImpl extends ServiceImpl<BiyeshengDao, BiyeshengEntity> implements BiyeshengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BiyeshengEntity> page = this.selectPage(
                new Query<BiyeshengEntity>(params).getPage(),
                new EntityWrapper<BiyeshengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BiyeshengEntity> wrapper) {
		  Page<BiyeshengView> page =new Query<BiyeshengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BiyeshengVO> selectListVO(Wrapper<BiyeshengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BiyeshengVO selectVO(Wrapper<BiyeshengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BiyeshengView> selectListView(Wrapper<BiyeshengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BiyeshengView selectView(Wrapper<BiyeshengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
