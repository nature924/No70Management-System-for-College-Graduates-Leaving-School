package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 欠书信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
@TableName("qianshuxinxi")
public class QianshuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QianshuxinxiEntity() {
		
	}
	
	public QianshuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
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
