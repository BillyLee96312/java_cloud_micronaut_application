package org.neuavenue.dip;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("eService") 
public class EmailServiceController {
    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String sendEmailByURL(){
        return new NeuClient().sendString();
    }
}
