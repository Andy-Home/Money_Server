package com.andy.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.andy.type.Items;

@Controller
public class LoginController{

    @RequestMapping("/queryItems")
    public ModelAndView queryItems(){

        List<Items> itemList = new ArrayList<Items>();
        Items items1 = new Items();
        items1.setName("����ʼǱ�");
        items1.setPrice(6000f);
        items1.setDetail("ThinkPad T430 ����ʼǱ�����");
        itemList.add(items1);

        System.out.println(itemList.get(0).getName());
        Items items2 = new Items();
        items2.setName("ƻ���ֻ�");
        items2.setPrice(5000f);
        items2.setDetail("iPhone6");

        itemList.add(items2);
        System.out.println(itemList.get(1).getName());

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("itemList", itemList);

        modelAndView.setViewName("/WEB-INF/page/Login.jsp");
        return modelAndView;
    }
    
    @RequestMapping("/xmlOrJson")
    @ResponseBody
    public Map<String, Object> xmlOrJson() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("list", "hello world");
        return map;
    }
}