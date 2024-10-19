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


import com.dao.JiaowugoutongDao;
import com.entity.JiaowugoutongEntity;
import com.service.JiaowugoutongService;
import com.entity.vo.JiaowugoutongVO;
import com.entity.view.JiaowugoutongView;

@Service("jiaowugoutongService")
public class JiaowugoutongServiceImpl extends ServiceImpl<JiaowugoutongDao, JiaowugoutongEntity> implements JiaowugoutongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaowugoutongEntity> page = this.selectPage(
                new Query<JiaowugoutongEntity>(params).getPage(),
                new EntityWrapper<JiaowugoutongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaowugoutongEntity> wrapper) {
		  Page<JiaowugoutongView> page =new Query<JiaowugoutongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaowugoutongVO> selectListVO(Wrapper<JiaowugoutongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaowugoutongVO selectVO(Wrapper<JiaowugoutongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaowugoutongView> selectListView(Wrapper<JiaowugoutongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaowugoutongView selectView(Wrapper<JiaowugoutongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
