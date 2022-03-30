package org.neuavenue;

public class EmailService {
    public EmailService(){

    }   
    public String sendStringEmail(
        String message,
        String sender,
        String receiver
    ) {
        return "Email sent to the " + receiver +
            " with Message : [" + message +
            " from the " + sender;
    }
}
