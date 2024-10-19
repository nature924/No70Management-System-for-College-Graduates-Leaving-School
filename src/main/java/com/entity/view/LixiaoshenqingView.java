package com.entity.view;

import com.entity.LixiaoshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 离校申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
@TableName("lixiaoshenqing")
public class LixiaoshenqingView  extends LixiaoshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LixiaoshenqingView(){
	}
 
 	public LixiaoshenqingView(LixiaoshenqingEntity lixiaoshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, lixiaoshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
