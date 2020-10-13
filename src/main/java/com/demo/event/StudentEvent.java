package com.demo.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Description 学生类事件监听
 * @Date 2020/10/12 19:22
 */
public class StudentEvent extends ApplicationEvent {
    /**
     * 监听消息
     */
    private String message;

    /**
     * 构造方法
     *
     * @param source
     * @param message
     */
    public StudentEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
