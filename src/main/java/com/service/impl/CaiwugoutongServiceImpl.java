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


import com.dao.CaiwugoutongDao;
import com.entity.CaiwugoutongEntity;
import com.service.CaiwugoutongService;
import com.entity.vo.CaiwugoutongVO;
import com.entity.view.CaiwugoutongView;

@Service("caiwugoutongService")
public class CaiwugoutongServiceImpl extends ServiceImpl<CaiwugoutongDao, CaiwugoutongEntity> implements CaiwugoutongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaiwugoutongEntity> page = this.selectPage(
                new Query<CaiwugoutongEntity>(params).getPage(),
                new EntityWrapper<CaiwugoutongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaiwugoutongEntity> wrapper) {
		  Page<CaiwugoutongView> page =new Query<CaiwugoutongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaiwugoutongVO> selectListVO(Wrapper<CaiwugoutongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaiwugoutongVO selectVO(Wrapper<CaiwugoutongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaiwugoutongView> selectListView(Wrapper<CaiwugoutongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaiwugoutongView selectView(Wrapper<CaiwugoutongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
