package com.in28minutes.spring.learn_spring_framework;

import com.in28minutes.spring.learn_spring_framework.game.Game;
import com.in28minutes.spring.learn_spring_framework.game.GameRunner;
import com.in28minutes.spring.learn_spring_framework.game.MarioGame;
import com.in28minutes.spring.learn_spring_framework.game.SuperContra;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(LearnSpringFrameworkApplication.class, args);
//		Game game = new MarioGame();
//		SuperContra contraGame = new SuperContra();
//		GameRunner runner = new GameRunner(game);

		//fetch the bean of game runner class name it runner
		GameRunner runner = context.getBean(GameRunner.class);

		runner.run();
	}

}
