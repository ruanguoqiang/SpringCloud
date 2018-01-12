package feign.Service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "springBoot-qiang",fallback = FeignHrytrix.class)
public interface FeignService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public Integer doexport(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
