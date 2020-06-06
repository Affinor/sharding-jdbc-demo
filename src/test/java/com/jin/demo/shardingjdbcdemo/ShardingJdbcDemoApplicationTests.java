package com.jin.demo.shardingjdbcdemo;

import com.jin.demo.shardingjdbcdemo.dao.COrder;
import com.jin.demo.shardingjdbcdemo.dao.COrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest(classes = ShardingJdbcDemoApplication.class)
class ShardingJdbcDemoApplicationTests {

    @Autowired
    COrderRepository cOrderRepository;

    @Test
    void contextLoads() {
        for (int i = 0; i < 10; i++) {
            COrder cOrder = new COrder();
            cOrder.setIsDel(true);
            cOrder.setCompanyId(i);
            cOrder.setCreateTime(new Date());
            cOrder.setPositionId(2);
            cOrder.setPublishUserId(2);
            cOrder.setResumeType(2);
            cOrder.setStatus("WAIT");
            cOrder.setUpdateTime(new Date());
            cOrder.setUserId(i);
            cOrderRepository.save(cOrder);
        }
    }

    @Test
    public void select(){
        System.out.println("findAll start====");
        List<COrder> all = cOrderRepository.findAll();
        all.forEach(System.out::println);
    }
}
