package com.in28minutes.spring.learn_spring_framework.game;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    //this autowired annotation is injecting Game dependency , this is called field injection usually constructor injection is recommended
    @Autowired
    private Game game;

    public GameRunner(Game game){
        this.game = game;
    }

   public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
