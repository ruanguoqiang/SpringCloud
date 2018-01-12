package computeService.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class Recieve {

    @RabbitHandler
    public void comsumer(String hello) {
        System.out.println("Receiver : " + hello);
    }

}
