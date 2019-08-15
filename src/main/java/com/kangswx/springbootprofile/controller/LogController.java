package com.kangswx.springbootprofile.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/log")
public class LogController {

    private static final Logger logger = LoggerFactory.getLogger(LogController.class.getName());

    @GetMapping("show")
    public String showLog() throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            logger.info("开始打印日志1-"+i);
            logger.info("开始打印日志2-"+i);
            logger.info("开始打印日志3-"+i);
            logger.info("开始打印日志4-"+i);
            logger.info("开始打印日志5-"+i);
            logger.info("开始打印日志6-"+i);
            logger.info("开始打印日志7-"+i);
            logger.info("开始打印日志8-"+i);
            logger.info("开始打印日志9-"+i);
            logger.info("开始打印日志10-"+i);
        }
        return "日志打印结束";
    }
}
