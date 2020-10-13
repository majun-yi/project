package com.demo.listener;

import cn.hutool.core.date.DateUtil;
import com.demo.event.StudentEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Description 监听器
 * @Date 2020/10/12 19:26
 */
@Component
@Slf4j
public class StudentEventListener {
    @EventListener(StudentEvent.class)
    public void onApplication(StudentEvent studentEvent) {
        log.info("监听器接收消息时间:{}", DateUtil.now());
        log.info("接收的消息为:{}", studentEvent.getMessage());
    }
}
