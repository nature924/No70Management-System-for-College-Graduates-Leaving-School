package com.entity.vo;

import com.entity.SushexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 宿舍信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
public class SushexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 费用名称
	 */
	
	private String feiyongmingcheng;
		
	/**
	 * 归还钥匙
	 */
	
	private String guihaiyaochi;
		
	/**
	 * 损害公务
	 */
	
	private String sunhaigongwu;
		
	/**
	 * 费用折算
	 */
	
	private Float feiyongzhesuan;
		
	/**
	 * 费用描述
	 */
	
	private String feiyongmiaoshu;
		
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
	 * 设置：费用名称
	 */
	 
	public void setFeiyongmingcheng(String feiyongmingcheng) {
		this.feiyongmingcheng = feiyongmingcheng;
	}
	
	/**
	 * 获取：费用名称
	 */
	public String getFeiyongmingcheng() {
		return feiyongmingcheng;
	}
				
	
	/**
	 * 设置：归还钥匙
	 */
	 
	public void setGuihaiyaochi(String guihaiyaochi) {
		this.guihaiyaochi = guihaiyaochi;
	}
	
	/**
	 * 获取：归还钥匙
	 */
	public String getGuihaiyaochi() {
		return guihaiyaochi;
	}
				
	
	/**
	 * 设置：损害公务
	 */
	 
	public void setSunhaigongwu(String sunhaigongwu) {
		this.sunhaigongwu = sunhaigongwu;
	}
	
	/**
	 * 获取：损害公务
	 */
	public String getSunhaigongwu() {
		return sunhaigongwu;
	}
				
	
	/**
	 * 设置：费用折算
	 */
	 
	public void setFeiyongzhesuan(Float feiyongzhesuan) {
		this.feiyongzhesuan = feiyongzhesuan;
	}
	
	/**
	 * 获取：费用折算
	 */
	public Float getFeiyongzhesuan() {
		return feiyongzhesuan;
	}
				
	
	/**
	 * 设置：费用描述
	 */
	 
	public void setFeiyongmiaoshu(String feiyongmiaoshu) {
		this.feiyongmiaoshu = feiyongmiaoshu;
	}
	
	/**
	 * 获取：费用描述
	 */
	public String getFeiyongmiaoshu() {
		return feiyongmiaoshu;
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
