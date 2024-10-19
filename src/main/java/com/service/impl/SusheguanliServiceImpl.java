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


import com.dao.SusheguanliDao;
import com.entity.SusheguanliEntity;
import com.service.SusheguanliService;
import com.entity.vo.SusheguanliVO;
import com.entity.view.SusheguanliView;

@Service("susheguanliService")
public class SusheguanliServiceImpl extends ServiceImpl<SusheguanliDao, SusheguanliEntity> implements SusheguanliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SusheguanliEntity> page = this.selectPage(
                new Query<SusheguanliEntity>(params).getPage(),
                new EntityWrapper<SusheguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SusheguanliEntity> wrapper) {
		  Page<SusheguanliView> page =new Query<SusheguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SusheguanliVO> selectListVO(Wrapper<SusheguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SusheguanliVO selectVO(Wrapper<SusheguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SusheguanliView> selectListView(Wrapper<SusheguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SusheguanliView selectView(Wrapper<SusheguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
