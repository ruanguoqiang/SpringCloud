package eurekaRibbon.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "returnFalse")
    public String  add(){
        return  restTemplate.getForEntity("http://springBoot-qiang/hello?a=10&b=20",String.class).getBody();
    }
    public String returnFalse(){
        return "false";
    }
}
