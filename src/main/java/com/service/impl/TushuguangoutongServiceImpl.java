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


import com.dao.TushuguangoutongDao;
import com.entity.TushuguangoutongEntity;
import com.service.TushuguangoutongService;
import com.entity.vo.TushuguangoutongVO;
import com.entity.view.TushuguangoutongView;

@Service("tushuguangoutongService")
public class TushuguangoutongServiceImpl extends ServiceImpl<TushuguangoutongDao, TushuguangoutongEntity> implements TushuguangoutongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TushuguangoutongEntity> page = this.selectPage(
                new Query<TushuguangoutongEntity>(params).getPage(),
                new EntityWrapper<TushuguangoutongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TushuguangoutongEntity> wrapper) {
		  Page<TushuguangoutongView> page =new Query<TushuguangoutongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TushuguangoutongVO> selectListVO(Wrapper<TushuguangoutongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TushuguangoutongVO selectVO(Wrapper<TushuguangoutongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TushuguangoutongView> selectListView(Wrapper<TushuguangoutongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TushuguangoutongView selectView(Wrapper<TushuguangoutongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
