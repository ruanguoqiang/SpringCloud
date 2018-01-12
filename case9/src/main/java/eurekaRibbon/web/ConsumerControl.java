package eurekaRibbon.web;

import eurekaRibbon.Service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerControl {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String  countNumber(){
      return consumerService.add();
    }
}
