package com.example.engine_system;

import com.example.engine_system.service.PlaneService;
import com.example.engine_system.untils.SpringBeanUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EngineSystemApplicationTests {

    @Test
    void contextLoads() {
        PlaneService checkService1 = (PlaneService) SpringBeanUtil.getBean("planeServiceImpl");
        PlaneService checkService2 = (PlaneService) SpringBeanUtil.getBean(PlaneService.class);
        System.out.println(checkService1.findPlaneById(195));
    }

}
