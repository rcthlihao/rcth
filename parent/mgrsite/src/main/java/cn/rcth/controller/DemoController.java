package cn.rcth.controller;

import cn.rcth.base.serivce.IUserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DemoController {

    @Autowired
    private IUserSerivce userSerivce;

    /*@RequestMapping("getUser")
    @ResponseBody
    public Map<Object,Object> getUser() {
        List<User> users = userSerivce.all();
        HashMap<Object, Object> map = new HashMap<>();
        for (User user : users) {
            map.put(user.getName(),user.getAge());
        }
        return map;
    }*/


}
