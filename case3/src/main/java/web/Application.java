package web;

import beans.Events;
import beans.States;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.statemachine.StateMachine;

@SpringBootApplication
@ComponentScan
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private StateMachine<States, Events> stateMachine;

	@Override
	public void run(String... args) throws Exception {
		stateMachine.start();
		stateMachine.sendEvent(Events.PAY);
		stateMachine.sendEvent(Events.RECEIVE);
	}

}
