package com.entity.view;

import com.entity.SuguangoutongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宿管沟通
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
@TableName("suguangoutong")
public class SuguangoutongView  extends SuguangoutongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SuguangoutongView(){
	}
 
 	public SuguangoutongView(SuguangoutongEntity suguangoutongEntity){
 	try {
			BeanUtils.copyProperties(this, suguangoutongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
