package computeService.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeComtrol {
    @Autowired
    private DiscoveryClient discoveryClient;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public Integer  doexport(@RequestParam int a,@RequestParam int b){
        ServiceInstance serviceInstance=discoveryClient.getLocalServiceInstance();
        Integer r = a + b;
        System.out.print("/add, host:" + serviceInstance.getHost() + ", service_id:" + serviceInstance.getServiceId() + ", result:" + r);
        return r;

    }
}
