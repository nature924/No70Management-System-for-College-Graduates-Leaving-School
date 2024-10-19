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


import com.dao.TushuguanDao;
import com.entity.TushuguanEntity;
import com.service.TushuguanService;
import com.entity.vo.TushuguanVO;
import com.entity.view.TushuguanView;

@Service("tushuguanService")
public class TushuguanServiceImpl extends ServiceImpl<TushuguanDao, TushuguanEntity> implements TushuguanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TushuguanEntity> page = this.selectPage(
                new Query<TushuguanEntity>(params).getPage(),
                new EntityWrapper<TushuguanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TushuguanEntity> wrapper) {
		  Page<TushuguanView> page =new Query<TushuguanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TushuguanVO> selectListVO(Wrapper<TushuguanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TushuguanVO selectVO(Wrapper<TushuguanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TushuguanView> selectListView(Wrapper<TushuguanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TushuguanView selectView(Wrapper<TushuguanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
