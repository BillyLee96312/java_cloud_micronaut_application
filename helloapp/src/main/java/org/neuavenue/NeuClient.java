package org.neuavenue;

public class NeuClient {
    private final EmailService emailService;

    public NeuClient(EmailService emailService){
        this.emailService = emailService;
    }

    public String processTextMessage(
        String message,
        String sender,
        String receiver
    ){
        return this.emailService.sendStringEmail
        (message, sender, receiver);
    }
}
