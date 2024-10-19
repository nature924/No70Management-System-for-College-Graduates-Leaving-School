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


import com.dao.FudaoyuanDao;
import com.entity.FudaoyuanEntity;
import com.service.FudaoyuanService;
import com.entity.vo.FudaoyuanVO;
import com.entity.view.FudaoyuanView;

@Service("fudaoyuanService")
public class FudaoyuanServiceImpl extends ServiceImpl<FudaoyuanDao, FudaoyuanEntity> implements FudaoyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FudaoyuanEntity> page = this.selectPage(
                new Query<FudaoyuanEntity>(params).getPage(),
                new EntityWrapper<FudaoyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FudaoyuanEntity> wrapper) {
		  Page<FudaoyuanView> page =new Query<FudaoyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FudaoyuanVO> selectListVO(Wrapper<FudaoyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FudaoyuanVO selectVO(Wrapper<FudaoyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FudaoyuanView> selectListView(Wrapper<FudaoyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FudaoyuanView selectView(Wrapper<FudaoyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
