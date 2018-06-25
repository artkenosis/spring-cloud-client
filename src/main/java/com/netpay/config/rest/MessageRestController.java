package com.netpay.config.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageRestController {

	@Value("${message:Hello default}")
    private String message;

    @RequestMapping(method = RequestMethod.GET, value="/message")
    String getMessage() {
    	return this.message;
    }
	
}
