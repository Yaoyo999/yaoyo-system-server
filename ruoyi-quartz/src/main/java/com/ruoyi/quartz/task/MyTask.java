package com.ruoyi.quartz.task;

import org.springframework.stereotype.Component;

import java.util.Date;

// 测试定时任务
@Component
public class MyTask {

    public void runTask1()
    {
        System.out.println(new Date() + "执行定时任务1");
    }
}
