package org.neuavenue;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("email")
public class EmailController {
    private static final String message = "Hi! Micronaut";
    private static final String sender = "Billy Lee";
    private static final String receiver = "Phillip S.";

    EmailService emailService = new EmailService();
    NeuClient neuClient = new NeuClient(emailService);

    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String sendEmailByURL(){
        return neuClient.processTextMessage(message, sender, receiver);
    }
}