package com.cbfacademy.copier;


public class DestinationSpy implements Destination {

    private Integer numberOfCalls = 0;

    @Override
    public void setChar(char character) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setChar'");
    }

    public boolean wasCalled() {
        return this.numberOfCalls > 0;
    }

}
