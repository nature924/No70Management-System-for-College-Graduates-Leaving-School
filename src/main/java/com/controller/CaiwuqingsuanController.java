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

import com.entity.CaiwuqingsuanEntity;
import com.entity.view.CaiwuqingsuanView;

import com.service.CaiwuqingsuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import com.alipay.api.AlipayClient;
import com.alipay.api.AlipayApiException;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.config.AlipayConfig;
import java.io.InputStream;
import org.springframework.web.multipart.MultipartFile;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 财务清算
 * 后端接口
 * @author 
 * @email 
 * @date 2022-07-23 06:34:11
 */
@RestController
@RequestMapping("/caiwuqingsuan")
public class CaiwuqingsuanController {
    @Autowired
    private CaiwuqingsuanService caiwuqingsuanService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CaiwuqingsuanEntity caiwuqingsuan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("caiwuchu")) {
			caiwuqingsuan.setZhigongzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("biyesheng")) {
			caiwuqingsuan.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<CaiwuqingsuanEntity> ew = new EntityWrapper<CaiwuqingsuanEntity>();
		PageUtils page = caiwuqingsuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, caiwuqingsuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CaiwuqingsuanEntity caiwuqingsuan, 
		HttpServletRequest request){
        EntityWrapper<CaiwuqingsuanEntity> ew = new EntityWrapper<CaiwuqingsuanEntity>();
		PageUtils page = caiwuqingsuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, caiwuqingsuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CaiwuqingsuanEntity caiwuqingsuan){
       	EntityWrapper<CaiwuqingsuanEntity> ew = new EntityWrapper<CaiwuqingsuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( caiwuqingsuan, "caiwuqingsuan")); 
        return R.ok().put("data", caiwuqingsuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CaiwuqingsuanEntity caiwuqingsuan){
        EntityWrapper< CaiwuqingsuanEntity> ew = new EntityWrapper< CaiwuqingsuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( caiwuqingsuan, "caiwuqingsuan")); 
		CaiwuqingsuanView caiwuqingsuanView =  caiwuqingsuanService.selectView(ew);
		return R.ok("查询财务清算成功").put("data", caiwuqingsuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CaiwuqingsuanEntity caiwuqingsuan = caiwuqingsuanService.selectById(id);
        return R.ok().put("data", caiwuqingsuan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CaiwuqingsuanEntity caiwuqingsuan = caiwuqingsuanService.selectById(id);
        return R.ok().put("data", caiwuqingsuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CaiwuqingsuanEntity caiwuqingsuan, HttpServletRequest request){
    	caiwuqingsuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(caiwuqingsuan);
        caiwuqingsuanService.insert(caiwuqingsuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CaiwuqingsuanEntity caiwuqingsuan, HttpServletRequest request){
    	caiwuqingsuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(caiwuqingsuan);
        caiwuqingsuanService.insert(caiwuqingsuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody CaiwuqingsuanEntity caiwuqingsuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(caiwuqingsuan);
        caiwuqingsuanService.updateById(caiwuqingsuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        caiwuqingsuanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<CaiwuqingsuanEntity> wrapper = new EntityWrapper<CaiwuqingsuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("caiwuchu")) {
			wrapper.eq("zhigongzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("biyesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = caiwuqingsuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	




    @RequestMapping("/alipay")
    public R payController(HttpServletRequest request, HttpServletResponse response) throws IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url+"caiwuqingsuan");
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url+"caiwuqingsuan"+"/notify");

        String out_trade_no = new String(request.getParameter("tradeno"));
        String total_amount = new String(request.getParameter("totalamount").getBytes("ISO-8859-1"),"UTF-8");
        String subject = new String(request.getParameter("subject"));
        String body = "";

        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","
                + "\"total_amount\":\"" + total_amount + "\","
                + "\"subject\":\"" + subject + "\","
                + "\"body\":\"" + body + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        String form = "";
        try {
            form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        return R.ok().put("data",form);
    }

    @IgnoreAuth
    @RequestMapping("notify")
    public R nofity(HttpServletRequest request, HttpServletResponse response) throws IOException {
        /* *
         * 功能：支付宝服务器异步通知页面
         *************************页面功能说明*************************
         * 创建该页面文件时，请留心该页面文件中无任何HTML代码及空格。
         * 该页面不能在本机电脑测试，请到服务器上做测试。请确保外部可以访问该页面。
         * 如果没有收到该页面返回的 success
         * 建议该页面只做支付成功的业务逻辑处理，退款的处理请以调用退款查询接口的结果为准。
         */

            //获取支付宝POST过来反馈信息
            Map<String,String> params = new HashMap<String,String>();
            Map<String,String[]> requestParams = request.getParameterMap();
            for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
                String name = (String) iter.next();
                String[] values = (String[]) requestParams.get(name);
                String valueStr = "";
                for (int i = 0; i < values.length; i++) {
                    valueStr = (i == values.length - 1) ? valueStr + values[i]
                            : valueStr + values[i] + ",";
                }
                //乱码解决，这段代码在出现乱码时使用
                valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
                params.put(name, valueStr);
            }

            //商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");

            //支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");

            //交易状态
            String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"),"UTF-8");

            if(trade_status.equals("TRADE_FINISHED")){
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                //如果有做过处理，不执行商户的业务程序

                //注意：
                //退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
            }else if (trade_status.equals("TRADE_SUCCESS")){
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                //如果有做过处理，不执行商户的业务程序

                //注意：
                //付款完成后，支付宝系统发送该交易状态通知
                CaiwuqingsuanEntity caiwuqingsuan = caiwuqingsuanService.selectOne(new EntityWrapper<CaiwuqingsuanEntity>().eq("dingdanbianhao", out_trade_no));
                if(caiwuqingsuan!=null) {
                    caiwuqingsuan.setIspay("已支付");
                    caiwuqingsuanService.updateById(caiwuqingsuan);
                }
            }

            //——请在这里编写您的程序（以上代码仅作参考）——
            return R.ok();
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
                    CaiwuqingsuanEntity caiwuqingsuanEntity =new CaiwuqingsuanEntity();
                    caiwuqingsuanEntity.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
                    String dingdanbianhao = CommonUtil.getCellValue(row.getCell(0));
                    caiwuqingsuanEntity.setDingdanbianhao(dingdanbianhao);
                    String qingsuanbiaoti = CommonUtil.getCellValue(row.getCell(1));
                    caiwuqingsuanEntity.setQingsuanbiaoti(qingsuanbiaoti);
                    String qingsuanqingkuang = CommonUtil.getCellValue(row.getCell(2));
                    caiwuqingsuanEntity.setQingsuanqingkuang(qingsuanqingkuang);
                    String shenheqingkuang = CommonUtil.getCellValue(row.getCell(3));
                    caiwuqingsuanEntity.setShenheqingkuang(shenheqingkuang);
                    String shenheyijian = CommonUtil.getCellValue(row.getCell(4));
                    caiwuqingsuanEntity.setShenheyijian(shenheyijian);
                    String zhigongzhanghao = CommonUtil.getCellValue(row.getCell(5));
                    caiwuqingsuanEntity.setZhigongzhanghao(zhigongzhanghao);
                    String zhigongxingming = CommonUtil.getCellValue(row.getCell(6));
                    caiwuqingsuanEntity.setZhigongxingming(zhigongxingming);
                    String xuehao = CommonUtil.getCellValue(row.getCell(7));
                    caiwuqingsuanEntity.setXuehao(xuehao);
                    String xingming = CommonUtil.getCellValue(row.getCell(8));
                    caiwuqingsuanEntity.setXingming(xingming);
                     
                    //想数据库中添加新对象
                    caiwuqingsuanService.insert(caiwuqingsuanEntity);//方法
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
