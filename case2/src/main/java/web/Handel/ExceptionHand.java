package web.Handel;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import web.Myexception;
import web.beans.ExceptionInfo;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHand {

    @ExceptionHandler(Exception.class)
    public ModelAndView handException(HttpServletRequest httpRequest,Exception e ){
        ModelAndView model=null;
        model.addObject("exception",e);
        model.addObject("url",httpRequest.getRequestURI());
        model.setViewName("error");
        return model;
    }

    @ExceptionHandler(Myexception.class)
    @ResponseBody
    public ExceptionInfo<String> handMyException(HttpServletRequest httpServletRequest,Myexception e){
        ExceptionInfo<String> r=new ExceptionInfo<>();
        r.setMessage(e.getMessage());
        r.setCode(ExceptionInfo.error);
        r.setUrl(httpServletRequest.getRequestURI());
        r.setData("qiangge chupin");
        return r;
    }
}
