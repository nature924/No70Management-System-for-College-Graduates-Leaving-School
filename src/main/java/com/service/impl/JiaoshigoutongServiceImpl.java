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


import com.dao.JiaoshigoutongDao;
import com.entity.JiaoshigoutongEntity;
import com.service.JiaoshigoutongService;
import com.entity.vo.JiaoshigoutongVO;
import com.entity.view.JiaoshigoutongView;

@Service("jiaoshigoutongService")
public class JiaoshigoutongServiceImpl extends ServiceImpl<JiaoshigoutongDao, JiaoshigoutongEntity> implements JiaoshigoutongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshigoutongEntity> page = this.selectPage(
                new Query<JiaoshigoutongEntity>(params).getPage(),
                new EntityWrapper<JiaoshigoutongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshigoutongEntity> wrapper) {
		  Page<JiaoshigoutongView> page =new Query<JiaoshigoutongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshigoutongVO> selectListVO(Wrapper<JiaoshigoutongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshigoutongVO selectVO(Wrapper<JiaoshigoutongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshigoutongView> selectListView(Wrapper<JiaoshigoutongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshigoutongView selectView(Wrapper<JiaoshigoutongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
