package com.fusion.springboot.camel.route;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import com.fusion.springboot.camel.*;
import com.fusion.springboot.camel.processor.SimpleCustomerProcessor;
@Component
public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	from("file:C:/POC/springboot-camel/TEST/In?noop=false").process(new SimpleCustomerProcessor()).to("file:C:/POC/springboot-camel/TEST/Out");
    }

}
