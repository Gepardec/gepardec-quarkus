package com.gepardec;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/demo")
public class DemoResource {

    @GET
    public String demo() {
        return "Hello from the demo resource!";
    }
}
