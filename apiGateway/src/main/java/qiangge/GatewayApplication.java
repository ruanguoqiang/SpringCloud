package qiangge;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.Bean;
import qiangge.Filter.AcessFilter;

@SpringCloudApplication
@EnableZuulProxy
public class GatewayApplication {
    public static void main(String args[]){
        new SpringApplicationBuilder(GatewayApplication.class).web(true).run(args);
    }

    @Bean
    public AcessFilter acessFilter(){
        return new AcessFilter();
    }
}
