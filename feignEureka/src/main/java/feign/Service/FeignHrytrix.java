package feign.Service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class FeignHrytrix implements FeignService {
    @Override
    public Integer doexport(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {

        return 9999;
    }
}
