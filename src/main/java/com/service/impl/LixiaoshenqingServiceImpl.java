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


import com.dao.LixiaoshenqingDao;
import com.entity.LixiaoshenqingEntity;
import com.service.LixiaoshenqingService;
import com.entity.vo.LixiaoshenqingVO;
import com.entity.view.LixiaoshenqingView;

@Service("lixiaoshenqingService")
public class LixiaoshenqingServiceImpl extends ServiceImpl<LixiaoshenqingDao, LixiaoshenqingEntity> implements LixiaoshenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LixiaoshenqingEntity> page = this.selectPage(
                new Query<LixiaoshenqingEntity>(params).getPage(),
                new EntityWrapper<LixiaoshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LixiaoshenqingEntity> wrapper) {
		  Page<LixiaoshenqingView> page =new Query<LixiaoshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LixiaoshenqingVO> selectListVO(Wrapper<LixiaoshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LixiaoshenqingVO selectVO(Wrapper<LixiaoshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LixiaoshenqingView> selectListView(Wrapper<LixiaoshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LixiaoshenqingView selectView(Wrapper<LixiaoshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<LixiaoshenqingEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<LixiaoshenqingEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<LixiaoshenqingEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
