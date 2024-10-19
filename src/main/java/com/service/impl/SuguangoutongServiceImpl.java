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


import com.dao.SuguangoutongDao;
import com.entity.SuguangoutongEntity;
import com.service.SuguangoutongService;
import com.entity.vo.SuguangoutongVO;
import com.entity.view.SuguangoutongView;

@Service("suguangoutongService")
public class SuguangoutongServiceImpl extends ServiceImpl<SuguangoutongDao, SuguangoutongEntity> implements SuguangoutongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SuguangoutongEntity> page = this.selectPage(
                new Query<SuguangoutongEntity>(params).getPage(),
                new EntityWrapper<SuguangoutongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SuguangoutongEntity> wrapper) {
		  Page<SuguangoutongView> page =new Query<SuguangoutongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SuguangoutongVO> selectListVO(Wrapper<SuguangoutongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SuguangoutongVO selectVO(Wrapper<SuguangoutongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SuguangoutongView> selectListView(Wrapper<SuguangoutongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SuguangoutongView selectView(Wrapper<SuguangoutongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
