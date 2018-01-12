package application.web;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloControl {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "hello world" ;
    }
}
