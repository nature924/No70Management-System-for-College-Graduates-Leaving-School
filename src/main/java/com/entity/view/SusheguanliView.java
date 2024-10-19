package com.entity.view;

import com.entity.SusheguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宿舍管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
@TableName("susheguanli")
public class SusheguanliView  extends SusheguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SusheguanliView(){
	}
 
 	public SusheguanliView(SusheguanliEntity susheguanliEntity){
 	try {
			BeanUtils.copyProperties(this, susheguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
