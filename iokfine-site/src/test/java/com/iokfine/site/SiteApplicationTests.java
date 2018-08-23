package com.iokfine.site;

import com.iokfine.common.util.HttpResultUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SiteApplicationTests {

    @Test
    public void contextLoads() {
    }

    public static void main(String[] args) {
         HttpResultUtil.JsonToBean("hjx");
    }
}
