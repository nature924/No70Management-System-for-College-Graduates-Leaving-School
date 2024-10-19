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


import com.dao.CaiwuqingsuanDao;
import com.entity.CaiwuqingsuanEntity;
import com.service.CaiwuqingsuanService;
import com.entity.vo.CaiwuqingsuanVO;
import com.entity.view.CaiwuqingsuanView;

@Service("caiwuqingsuanService")
public class CaiwuqingsuanServiceImpl extends ServiceImpl<CaiwuqingsuanDao, CaiwuqingsuanEntity> implements CaiwuqingsuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaiwuqingsuanEntity> page = this.selectPage(
                new Query<CaiwuqingsuanEntity>(params).getPage(),
                new EntityWrapper<CaiwuqingsuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaiwuqingsuanEntity> wrapper) {
		  Page<CaiwuqingsuanView> page =new Query<CaiwuqingsuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaiwuqingsuanVO> selectListVO(Wrapper<CaiwuqingsuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaiwuqingsuanVO selectVO(Wrapper<CaiwuqingsuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaiwuqingsuanView> selectListView(Wrapper<CaiwuqingsuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaiwuqingsuanView selectView(Wrapper<CaiwuqingsuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
