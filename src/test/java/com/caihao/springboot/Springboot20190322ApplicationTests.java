package com.caihao.springboot;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot20190322ApplicationTests {



    @Test
    public void contextLoads() {
        System.err.println("测试日志");
        Log log = LogFactory.getLog(getClass());

//      日志级别从低到高
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");


    }

}
