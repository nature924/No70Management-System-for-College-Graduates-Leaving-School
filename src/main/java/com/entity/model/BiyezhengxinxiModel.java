package com.entity.model;

import com.entity.BiyezhengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 毕业证信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public class BiyezhengxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否发放
	 */
	
	private String shifoufafang;
		
	/**
	 * 未发放原因
	 */
	
	private String weifafangyuanyin;
		
	/**
	 * 审核情况
	 */
	
	private String shenheqingkuang;
		
	/**
	 * 审核意见
	 */
	
	private String shenheyijian;
		
	/**
	 * 职工账号
	 */
	
	private String zhigongzhanghao;
		
	/**
	 * 职工姓名
	 */
	
	private String zhigongxingming;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：是否发放
	 */
	 
	public void setShifoufafang(String shifoufafang) {
		this.shifoufafang = shifoufafang;
	}
	
	/**
	 * 获取：是否发放
	 */
	public String getShifoufafang() {
		return shifoufafang;
	}
				
	
	/**
	 * 设置：未发放原因
	 */
	 
	public void setWeifafangyuanyin(String weifafangyuanyin) {
		this.weifafangyuanyin = weifafangyuanyin;
	}
	
	/**
	 * 获取：未发放原因
	 */
	public String getWeifafangyuanyin() {
		return weifafangyuanyin;
	}
				
	
	/**
	 * 设置：审核情况
	 */
	 
	public void setShenheqingkuang(String shenheqingkuang) {
		this.shenheqingkuang = shenheqingkuang;
	}
	
	/**
	 * 获取：审核情况
	 */
	public String getShenheqingkuang() {
		return shenheqingkuang;
	}
				
	
	/**
	 * 设置：审核意见
	 */
	 
	public void setShenheyijian(String shenheyijian) {
		this.shenheyijian = shenheyijian;
	}
	
	/**
	 * 获取：审核意见
	 */
	public String getShenheyijian() {
		return shenheyijian;
	}
				
	
	/**
	 * 设置：职工账号
	 */
	 
	public void setZhigongzhanghao(String zhigongzhanghao) {
		this.zhigongzhanghao = zhigongzhanghao;
	}
	
	/**
	 * 获取：职工账号
	 */
	public String getZhigongzhanghao() {
		return zhigongzhanghao;
	}
				
	
	/**
	 * 设置：职工姓名
	 */
	 
	public void setZhigongxingming(String zhigongxingming) {
		this.zhigongxingming = zhigongxingming;
	}
	
	/**
	 * 获取：职工姓名
	 */
	public String getZhigongxingming() {
		return zhigongxingming;
	}
			
}
