package com.entity.view;

import com.entity.BiyeshengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 毕业生
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
@TableName("biyesheng")
public class BiyeshengView  extends BiyeshengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BiyeshengView(){
	}
 
 	public BiyeshengView(BiyeshengEntity biyeshengEntity){
 	try {
			BeanUtils.copyProperties(this, biyeshengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
