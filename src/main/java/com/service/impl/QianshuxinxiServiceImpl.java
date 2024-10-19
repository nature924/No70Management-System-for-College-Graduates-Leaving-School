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


import com.dao.QianshuxinxiDao;
import com.entity.QianshuxinxiEntity;
import com.service.QianshuxinxiService;
import com.entity.vo.QianshuxinxiVO;
import com.entity.view.QianshuxinxiView;

@Service("qianshuxinxiService")
public class QianshuxinxiServiceImpl extends ServiceImpl<QianshuxinxiDao, QianshuxinxiEntity> implements QianshuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QianshuxinxiEntity> page = this.selectPage(
                new Query<QianshuxinxiEntity>(params).getPage(),
                new EntityWrapper<QianshuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QianshuxinxiEntity> wrapper) {
		  Page<QianshuxinxiView> page =new Query<QianshuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QianshuxinxiVO> selectListVO(Wrapper<QianshuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QianshuxinxiVO selectVO(Wrapper<QianshuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QianshuxinxiView> selectListView(Wrapper<QianshuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QianshuxinxiView selectView(Wrapper<QianshuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
