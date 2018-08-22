package com.yangmj.springmvc.controller;

import com.alibaba.fastjson.JSONObject;
import com.yangmj.springmvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/test")
@ResponseBody
public class UserController {

    @RequestMapping(value = "/users", method = RequestMethod.POST, produces = "application/json")
    public JSONObject getUsersList(@RequestBody Map<String,Object> params, HttpServletRequest httpServletRequest){
//    public String getUsersList(String param_one, HttpServletRequest httpServletRequest){
//        System.out.println("you win " +httpServletRequest.getParameter("param_one") + "  " + param_one);
//        System.out.println(httpServletRequest.getParameterMap().get("param_one"));
//        System.out.println(params.get("param_one"));
        User test = new User(1, "yang", "male", "1");
//        List<User> users = new ArrayList<User>();
//        users.add(test);
        JSONObject usersJSON = new JSONObject();
        usersJSON.put("id",test.getId());
        usersJSON.put("name",test.getName());
        usersJSON.put("gender",test.getGender());
        usersJSON.put("key",test.getKey());
        System.out.println(usersJSON.toJSONString());
//        System.out.println(users.toString());
        httpServletRequest.setAttribute("response",  usersJSON.toJSONString());
        return usersJSON;
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setView();
//        return "test";
    }

}
