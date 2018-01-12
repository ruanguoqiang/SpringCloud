package computeService.rabbit;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Queue;

@Configuration
public class RabbitConfig {
    @Bean
    public org.springframework.amqp.core.Queue helloQueue(){
        return  new org.springframework.amqp.core.Queue("hello");

    }
}
