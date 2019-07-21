package com.example.daocloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Frank on 2019/7/21.
 */
@Controller
@ResponseBody
public class MyController {
    @Autowired
    MySvc mySvc;

    @GetMapping("/")
    public String index(){
        return "hello spring";
    }

    @GetMapping("/add")
    public String add(int a, int b ){
        return mySvc.add(a,b)+"";
    }
}
