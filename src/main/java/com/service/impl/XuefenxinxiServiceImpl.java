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


import com.dao.XuefenxinxiDao;
import com.entity.XuefenxinxiEntity;
import com.service.XuefenxinxiService;
import com.entity.vo.XuefenxinxiVO;
import com.entity.view.XuefenxinxiView;

@Service("xuefenxinxiService")
public class XuefenxinxiServiceImpl extends ServiceImpl<XuefenxinxiDao, XuefenxinxiEntity> implements XuefenxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuefenxinxiEntity> page = this.selectPage(
                new Query<XuefenxinxiEntity>(params).getPage(),
                new EntityWrapper<XuefenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuefenxinxiEntity> wrapper) {
		  Page<XuefenxinxiView> page =new Query<XuefenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuefenxinxiVO> selectListVO(Wrapper<XuefenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuefenxinxiVO selectVO(Wrapper<XuefenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuefenxinxiView> selectListView(Wrapper<XuefenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuefenxinxiView selectView(Wrapper<XuefenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
