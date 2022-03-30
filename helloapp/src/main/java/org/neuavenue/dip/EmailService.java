package org.neuavenue.dip;

public class EmailService implements Service{ 

    public static final String message = "Hi.. Microanut!!";
    public static final String sender = "Billy Lee";
    public static final String receiver = "Philip S.";

    public EmailService(){

    }

    @Override
    public String printMessage() {
        // TODO Auto-generated method stub
        return "Email sent to the " + receiver + 
        " with Message : [" + message + "]" + 
        " from the " + sender;
    }
    
}
