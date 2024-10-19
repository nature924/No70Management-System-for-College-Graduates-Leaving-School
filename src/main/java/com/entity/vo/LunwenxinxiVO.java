package com.entity.vo;

import com.entity.LunwenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 论文信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public class LunwenxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 完成情况
	 */
	
	private String wanchengqingkuang;
		
	/**
	 * 不及格原因
	 */
	
	private String bujigeyuanyin;
		
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
	 * 设置：完成情况
	 */
	 
	public void setWanchengqingkuang(String wanchengqingkuang) {
		this.wanchengqingkuang = wanchengqingkuang;
	}
	
	/**
	 * 获取：完成情况
	 */
	public String getWanchengqingkuang() {
		return wanchengqingkuang;
	}
				
	
	/**
	 * 设置：不及格原因
	 */
	 
	public void setBujigeyuanyin(String bujigeyuanyin) {
		this.bujigeyuanyin = bujigeyuanyin;
	}
	
	/**
	 * 获取：不及格原因
	 */
	public String getBujigeyuanyin() {
		return bujigeyuanyin;
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
