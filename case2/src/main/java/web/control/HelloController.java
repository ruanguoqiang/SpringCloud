package web.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import web.Myexception;

/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */
@Controller
public class HelloController {


    @RequestMapping("/hello")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }

    @RequestMapping("/json")
     public  String myJsom() throws Myexception{
        throw  new Myexception("强哥出错了");
    }
    @RequestMapping
    public String index(ModelMap modelMap){
        modelMap.addAttribute("name","qiangge.com");
        return "index";
    }

}