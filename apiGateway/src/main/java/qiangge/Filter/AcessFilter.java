package qiangge.Filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

public class AcessFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext=RequestContext.getCurrentContext();
        HttpServletRequest request=requestContext.getRequest();
        System.out.print("method:"+request.getMethod()+"."+request.getRequestURI().toString());
        Object token=request.getParameter("token");
        if (token==null){
            System.out.print("access token is empty");
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
        }
       System.out.print("access token ok");
        return null;
    }
}
