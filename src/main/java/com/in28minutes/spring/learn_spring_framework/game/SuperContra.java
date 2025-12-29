package com.in28minutes.spring.learn_spring_framework.game;

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
