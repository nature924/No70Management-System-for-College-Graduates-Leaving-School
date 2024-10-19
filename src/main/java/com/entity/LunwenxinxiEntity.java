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
 * 论文信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
@TableName("lunwenxinxi")
public class LunwenxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LunwenxinxiEntity() {
		
	}
	
	public LunwenxinxiEntity(T t) {
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
	 * 学号
	 */
					
	private String xuehao;
	
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
