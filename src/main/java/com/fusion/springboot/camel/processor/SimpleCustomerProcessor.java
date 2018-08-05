package com.fusion.springboot.camel.processor;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class SimpleCustomerProcessor implements Processor{
	 public void process(Exchange exchange) throws Exception {
	        System.out.println("hello");
	    }
}
