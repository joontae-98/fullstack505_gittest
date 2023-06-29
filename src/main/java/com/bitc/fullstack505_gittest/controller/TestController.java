package com.bitc.fullstack505_gittest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {

    @RequestMapping("/")
    public String index() throws Exception {
        return "index";

        // 어렵다 어려워
        // 병합 테스트
        // 병합 테스트2
    }

}
