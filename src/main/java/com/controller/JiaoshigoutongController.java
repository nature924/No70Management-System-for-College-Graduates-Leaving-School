package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiaoshigoutongEntity;
import com.entity.view.JiaoshigoutongView;

import com.service.JiaoshigoutongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 教师沟通
 * 后端接口
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
@RestController
@RequestMapping("/jiaoshigoutong")
public class JiaoshigoutongController {
    @Autowired
    private JiaoshigoutongService jiaoshigoutongService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaoshigoutongEntity jiaoshigoutong,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhidaolaoshi")) {
			jiaoshigoutong.setZhigongzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("biyesheng")) {
			jiaoshigoutong.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiaoshigoutongEntity> ew = new EntityWrapper<JiaoshigoutongEntity>();
		PageUtils page = jiaoshigoutongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoshigoutong), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaoshigoutongEntity jiaoshigoutong, 
		HttpServletRequest request){
        EntityWrapper<JiaoshigoutongEntity> ew = new EntityWrapper<JiaoshigoutongEntity>();
		PageUtils page = jiaoshigoutongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoshigoutong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaoshigoutongEntity jiaoshigoutong){
       	EntityWrapper<JiaoshigoutongEntity> ew = new EntityWrapper<JiaoshigoutongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaoshigoutong, "jiaoshigoutong")); 
        return R.ok().put("data", jiaoshigoutongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaoshigoutongEntity jiaoshigoutong){
        EntityWrapper< JiaoshigoutongEntity> ew = new EntityWrapper< JiaoshigoutongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaoshigoutong, "jiaoshigoutong")); 
		JiaoshigoutongView jiaoshigoutongView =  jiaoshigoutongService.selectView(ew);
		return R.ok("查询教师沟通成功").put("data", jiaoshigoutongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaoshigoutongEntity jiaoshigoutong = jiaoshigoutongService.selectById(id);
        return R.ok().put("data", jiaoshigoutong);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaoshigoutongEntity jiaoshigoutong = jiaoshigoutongService.selectById(id);
        return R.ok().put("data", jiaoshigoutong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaoshigoutongEntity jiaoshigoutong, HttpServletRequest request){
    	jiaoshigoutong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaoshigoutong);
        jiaoshigoutongService.insert(jiaoshigoutong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaoshigoutongEntity jiaoshigoutong, HttpServletRequest request){
    	jiaoshigoutong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaoshigoutong);
        jiaoshigoutongService.insert(jiaoshigoutong);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiaoshigoutongEntity jiaoshigoutong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaoshigoutong);
        jiaoshigoutongService.updateById(jiaoshigoutong);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaoshigoutongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiaoshigoutongEntity> wrapper = new EntityWrapper<JiaoshigoutongEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhidaolaoshi")) {
			wrapper.eq("zhigongzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("biyesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = jiaoshigoutongService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
