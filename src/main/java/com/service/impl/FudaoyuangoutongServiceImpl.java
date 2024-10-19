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


import com.dao.FudaoyuangoutongDao;
import com.entity.FudaoyuangoutongEntity;
import com.service.FudaoyuangoutongService;
import com.entity.vo.FudaoyuangoutongVO;
import com.entity.view.FudaoyuangoutongView;

@Service("fudaoyuangoutongService")
public class FudaoyuangoutongServiceImpl extends ServiceImpl<FudaoyuangoutongDao, FudaoyuangoutongEntity> implements FudaoyuangoutongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FudaoyuangoutongEntity> page = this.selectPage(
                new Query<FudaoyuangoutongEntity>(params).getPage(),
                new EntityWrapper<FudaoyuangoutongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FudaoyuangoutongEntity> wrapper) {
		  Page<FudaoyuangoutongView> page =new Query<FudaoyuangoutongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FudaoyuangoutongVO> selectListVO(Wrapper<FudaoyuangoutongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FudaoyuangoutongVO selectVO(Wrapper<FudaoyuangoutongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FudaoyuangoutongView> selectListView(Wrapper<FudaoyuangoutongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FudaoyuangoutongView selectView(Wrapper<FudaoyuangoutongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
