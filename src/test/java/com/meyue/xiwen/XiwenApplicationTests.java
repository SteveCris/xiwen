package com.meyue.xiwen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XiwenApplicationTests {

    @Test
    public void contextLoads() {
        String date ="2019-09-09 23:23:12";
        System.out.println(date.length());
    }



}
