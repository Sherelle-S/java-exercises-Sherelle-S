package com.cbfacademy.copier;


public class DestinationSpy implements Destination {

    private Integer numberOfCalls = 0;
    

    @Override
    public void setChar(char character) {
        this.numberOfCalls = this.numberOfCalls + 1;
        
    }
    
    public Boolean wasCalled() {
        return this.numberOfCalls > 0;
    }

}
