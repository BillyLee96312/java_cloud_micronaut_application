package org.neuavenue.dip;

public class NeuClient {
    private Service service ;

    public NeuClient(){
        this.service = new EmailService();
    }

    public String sendString(){
        return this.service.printMessage();
    }
    
}
