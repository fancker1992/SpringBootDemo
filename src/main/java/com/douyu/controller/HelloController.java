package com.douyu.controller;

import com.douyu.entity.Resut;
import com.douyu.entity.data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("/getInfo")
    public Resut getInfo() {
        Resut resut = new Resut();
        resut.setCode("0");
        resut.setMsg("成功");
//        resut.setContent("i am list");
        List<data> datas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            data data = new data();
            data.setName("熊大" + i);
            data.setAge("18");
            data.setSex("男");
            data.setAddress("五道口");
            datas.add(i, data);
        }
        resut.setContent(datas);
        return resut;
    }
}
