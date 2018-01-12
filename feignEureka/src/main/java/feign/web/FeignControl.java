package feign.web;

import feign.Service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignControl {
    @Autowired
    FeignService feignService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return feignService.doexport(10, 20);
    }
}
