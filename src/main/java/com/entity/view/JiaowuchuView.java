package com.entity.view;

import com.entity.JiaowuchuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教务处
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
@TableName("jiaowuchu")
public class JiaowuchuView  extends JiaowuchuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaowuchuView(){
	}
 
 	public JiaowuchuView(JiaowuchuEntity jiaowuchuEntity){
 	try {
			BeanUtils.copyProperties(this, jiaowuchuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
