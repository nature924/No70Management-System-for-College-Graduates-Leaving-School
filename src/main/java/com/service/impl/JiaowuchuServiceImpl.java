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


import com.dao.JiaowuchuDao;
import com.entity.JiaowuchuEntity;
import com.service.JiaowuchuService;
import com.entity.vo.JiaowuchuVO;
import com.entity.view.JiaowuchuView;

@Service("jiaowuchuService")
public class JiaowuchuServiceImpl extends ServiceImpl<JiaowuchuDao, JiaowuchuEntity> implements JiaowuchuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaowuchuEntity> page = this.selectPage(
                new Query<JiaowuchuEntity>(params).getPage(),
                new EntityWrapper<JiaowuchuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaowuchuEntity> wrapper) {
		  Page<JiaowuchuView> page =new Query<JiaowuchuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaowuchuVO> selectListVO(Wrapper<JiaowuchuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaowuchuVO selectVO(Wrapper<JiaowuchuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaowuchuView> selectListView(Wrapper<JiaowuchuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaowuchuView selectView(Wrapper<JiaowuchuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
