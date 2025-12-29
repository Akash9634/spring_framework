package com.in28minutes.spring.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SuperContra implements Game{
    public void up() {
        System.out.println("jump");
    }

    public void down() {
        System.out.println("duck");
    }

    public void right() {
        System.out.println("move fast");
    }

    public void left() {
        System.out.println("stop");
    }
}
