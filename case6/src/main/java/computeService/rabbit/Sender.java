package computeService.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context="hello"+System.currentTimeMillis();
        System.out.print(context);
        amqpTemplate.convertAndSend("hello",context);
    }
}
