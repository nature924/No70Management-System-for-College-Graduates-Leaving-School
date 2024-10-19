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


import com.dao.CaiwuchuDao;
import com.entity.CaiwuchuEntity;
import com.service.CaiwuchuService;
import com.entity.vo.CaiwuchuVO;
import com.entity.view.CaiwuchuView;

@Service("caiwuchuService")
public class CaiwuchuServiceImpl extends ServiceImpl<CaiwuchuDao, CaiwuchuEntity> implements CaiwuchuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaiwuchuEntity> page = this.selectPage(
                new Query<CaiwuchuEntity>(params).getPage(),
                new EntityWrapper<CaiwuchuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaiwuchuEntity> wrapper) {
		  Page<CaiwuchuView> page =new Query<CaiwuchuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaiwuchuVO> selectListVO(Wrapper<CaiwuchuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaiwuchuVO selectVO(Wrapper<CaiwuchuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaiwuchuView> selectListView(Wrapper<CaiwuchuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaiwuchuView selectView(Wrapper<CaiwuchuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
