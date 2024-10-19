package com.entity.model;

import com.entity.QianshuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 欠书信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public class QianshuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 欠书标题
	 */
	
	private String qianshubiaoti;
		
	/**
	 * 是否欠书
	 */
	
	private String shifouqianshu;
		
	/**
	 * 欠书情况
	 */
	
	private String qianshuqingkuang;
		
	/**
	 * 扣费金额
	 */
	
	private Float koufeijine;
		
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
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：欠书标题
	 */
	 
	public void setQianshubiaoti(String qianshubiaoti) {
		this.qianshubiaoti = qianshubiaoti;
	}
	
	/**
	 * 获取：欠书标题
	 */
	public String getQianshubiaoti() {
		return qianshubiaoti;
	}
				
	
	/**
	 * 设置：是否欠书
	 */
	 
	public void setShifouqianshu(String shifouqianshu) {
		this.shifouqianshu = shifouqianshu;
	}
	
	/**
	 * 获取：是否欠书
	 */
	public String getShifouqianshu() {
		return shifouqianshu;
	}
				
	
	/**
	 * 设置：欠书情况
	 */
	 
	public void setQianshuqingkuang(String qianshuqingkuang) {
		this.qianshuqingkuang = qianshuqingkuang;
	}
	
	/**
	 * 获取：欠书情况
	 */
	public String getQianshuqingkuang() {
		return qianshuqingkuang;
	}
				
	
	/**
	 * 设置：扣费金额
	 */
	 
	public void setKoufeijine(Float koufeijine) {
		this.koufeijine = koufeijine;
	}
	
	/**
	 * 获取：扣费金额
	 */
	public Float getKoufeijine() {
		return koufeijine;
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
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
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
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
