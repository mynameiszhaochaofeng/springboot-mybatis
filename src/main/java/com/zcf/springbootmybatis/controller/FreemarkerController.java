package com.zcf.springbootmybatis.controller;

import com.zcf.springbootmybatis.dao.TWtdMapper;
import com.zcf.springbootmybatis.dao.TZxdMapper;
import com.zcf.springbootmybatis.dto.ZxdWtd;
import com.zcf.springbootmybatis.pojo.TWtd;
import com.zcf.springbootmybatis.pojo.TZxd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/freemarker")
@EnableAutoConfiguration
public class FreemarkerController {

    @Autowired
    TZxdMapper zxdMapper;
    @Autowired
    TWtdMapper wtdMapper;

    @RequestMapping("/showZxd")
    public ModelAndView showZxd(@RequestParam long zxdid){
        TZxd zxd = zxdMapper.selectByPrimaryKey(zxdid);
        if(zxd==null)return null;
        TWtd wtd = wtdMapper.selectByPrimaryKey(zxd.getWtdid());
        if(wtd==null)return null;
        ZxdWtd zxdwtd = new ZxdWtd(zxd,wtd);
        ModelAndView mav = new ModelAndView();
        mav.addObject("zxd",zxdwtd.getZxd());
        mav.addObject("wtd",zxdwtd.getWtd());
        mav.setViewName("zxd");
        return mav;
    }

}
