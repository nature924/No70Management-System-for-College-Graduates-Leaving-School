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

import com.entity.TushuguanEntity;
import com.entity.view.TushuguanView;

import com.service.TushuguanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.web.multipart.MultipartFile;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 图书馆
 * 后端接口
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
@RestController
@RequestMapping("/tushuguan")
public class TushuguanController {
    @Autowired
    private TushuguanService tushuguanService;


    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		TushuguanEntity user = tushuguanService.selectOne(new EntityWrapper<TushuguanEntity>().eq("zhigongzhanghao", username));
		if(user==null || !user.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		
		String token = tokenService.generateToken(user.getId(), username,"tushuguan",  "图书馆" );
		return R.ok().put("token", token);
	}
	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody TushuguanEntity tushuguan){
    	//ValidatorUtils.validateEntity(tushuguan);
    	TushuguanEntity user = tushuguanService.selectOne(new EntityWrapper<TushuguanEntity>().eq("zhigongzhanghao", tushuguan.getZhigongzhanghao()));
		if(user!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		tushuguan.setId(uId);
        tushuguanService.insert(tushuguan);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        TushuguanEntity user = tushuguanService.selectById(id);
        return R.ok().put("data", user);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	TushuguanEntity user = tushuguanService.selectOne(new EntityWrapper<TushuguanEntity>().eq("zhigongzhanghao", username));
    	if(user==null) {
    		return R.error("账号不存在");
    	}
        user.setMima("123456");
        tushuguanService.updateById(user);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TushuguanEntity tushuguan,
		HttpServletRequest request){
        EntityWrapper<TushuguanEntity> ew = new EntityWrapper<TushuguanEntity>();
		PageUtils page = tushuguanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tushuguan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TushuguanEntity tushuguan, 
		HttpServletRequest request){
        EntityWrapper<TushuguanEntity> ew = new EntityWrapper<TushuguanEntity>();
		PageUtils page = tushuguanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tushuguan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TushuguanEntity tushuguan){
       	EntityWrapper<TushuguanEntity> ew = new EntityWrapper<TushuguanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tushuguan, "tushuguan")); 
        return R.ok().put("data", tushuguanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TushuguanEntity tushuguan){
        EntityWrapper< TushuguanEntity> ew = new EntityWrapper< TushuguanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tushuguan, "tushuguan")); 
		TushuguanView tushuguanView =  tushuguanService.selectView(ew);
		return R.ok("查询图书馆成功").put("data", tushuguanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TushuguanEntity tushuguan = tushuguanService.selectById(id);
        return R.ok().put("data", tushuguan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TushuguanEntity tushuguan = tushuguanService.selectById(id);
        return R.ok().put("data", tushuguan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TushuguanEntity tushuguan, HttpServletRequest request){
    	tushuguan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tushuguan);
    	TushuguanEntity user = tushuguanService.selectOne(new EntityWrapper<TushuguanEntity>().eq("zhigongzhanghao", tushuguan.getZhigongzhanghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}
		tushuguan.setId(new Date().getTime());
        tushuguanService.insert(tushuguan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TushuguanEntity tushuguan, HttpServletRequest request){
    	tushuguan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tushuguan);
    	TushuguanEntity user = tushuguanService.selectOne(new EntityWrapper<TushuguanEntity>().eq("zhigongzhanghao", tushuguan.getZhigongzhanghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}
		tushuguan.setId(new Date().getTime());
        tushuguanService.insert(tushuguan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TushuguanEntity tushuguan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tushuguan);
        tushuguanService.updateById(tushuguan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tushuguanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<TushuguanEntity> wrapper = new EntityWrapper<TushuguanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = tushuguanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	





    @RequestMapping("/importExcel")
    public R importExcel(@RequestParam("file") MultipartFile file){
        try {
            //获取输入流
            InputStream inputStream = file.getInputStream();
            //创建读取工作簿
            Workbook workbook = WorkbookFactory.create(inputStream);
            //获取工作表
            Sheet sheet = workbook.getSheetAt(0);
            //获取总行
            int rows=sheet.getPhysicalNumberOfRows();
            if(rows>1){
                //获取单元格
                for (int i = 1; i < rows; i++) {
                    Row row = sheet.getRow(i);
                    TushuguanEntity tushuguanEntity =new TushuguanEntity();
                    tushuguanEntity.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
                    String zhigongzhanghao = CommonUtil.getCellValue(row.getCell(0));
                    tushuguanEntity.setZhigongzhanghao(zhigongzhanghao);
                    String mima = CommonUtil.getCellValue(row.getCell(1));
                    tushuguanEntity.setMima(mima);
                    String zhigongxingming = CommonUtil.getCellValue(row.getCell(2));
                    tushuguanEntity.setZhigongxingming(zhigongxingming);
                    String xingbie = CommonUtil.getCellValue(row.getCell(3));
                    tushuguanEntity.setXingbie(xingbie);
                    String zhiwu = CommonUtil.getCellValue(row.getCell(4));
                    tushuguanEntity.setZhiwu(zhiwu);
                    String shouji = CommonUtil.getCellValue(row.getCell(5));
                    tushuguanEntity.setShouji(shouji);
                    String youxiang = CommonUtil.getCellValue(row.getCell(6));
                    tushuguanEntity.setYouxiang(youxiang);
                     
                    //想数据库中添加新对象
                    tushuguanService.insert(tushuguanEntity);//方法
                }
            }
            inputStream.close();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return R.ok("导入成功");
    }


}
