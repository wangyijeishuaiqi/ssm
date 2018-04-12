package com.wyj.ssm.control;

import com.wyj.ssm.pojo.Air_quality_index;
import com.wyj.ssm.service.Air_quality_indexService;
import com.wyj.ssm.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DistrictControl {
    Map<String, Object> map;

    @Autowired
    Air_quality_indexService air_quality_indexService;

    @RequestMapping("/index")
    public ModelAndView index(ModelAndView modelAndView, Page page, HttpSession session) {
        map = new HashMap<String, Object>();
        int count = air_quality_indexService.Air_quality_indexCount();
        page.setPageCount(count);
        map.put("pageNo", (page.getPageNo() - 1) * page.getPageSize());
        map.put("pageSize", page.getPageSize());
        List<Air_quality_index> air_quality_indexs = air_quality_indexService.Air_quality_indexfind(map);
        page.setAir_quality_indexs(air_quality_indexs);
        session.setAttribute("page", page);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/deleteAir_quality_index")
    public ModelAndView delAir_quality_index(ModelAndView andView, int id) {
        int count = air_quality_indexService.delAir_quality_index(id);
        if (count > 0) {
            andView.setViewName("redirect:index");
        } else {
            andView.setViewName("redirect:index");
        }
        return andView;
    }

    @RequestMapping("/add")
    public String add() {
        return "add";
    }

    @RequestMapping("/addAir_quality_index")
    public ModelAndView addAir_quality_index(ModelAndView andView, Air_quality_index air_quality_index) {
        int count = air_quality_indexService.addAir_quality_index(air_quality_index);
        if (count > 0) {
            andView.setViewName("redirect:index");
        } else {
            andView.setViewName("add");
        }
        return andView;
    }

    @RequestMapping("/update")
    public String update(Model m, int id) {
        Air_quality_index air_quality_index = air_quality_indexService.Air_quality_indexbyid(id);
        m.addAttribute("air_quality_index", air_quality_index);
        return "update";
    }

    @RequestMapping("/updateAir_quality_index")
    public ModelAndView updateAir_quality_index(ModelAndView andView, Air_quality_index air_quality_index) {
        int count = air_quality_indexService.updateAir_quality_index(air_quality_index);
        if (count > 0) {
            andView.setViewName("redirect:index");
        } else {
            andView.setViewName("update");
        }
        return andView;
    }
}
