
package com.github.sbzorro.sbws.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Component
public class Test {

//	@GetMapping("/test")
	@GET
	@Path("/test")
    public String test() {
        return "helloworld";
    }
}
