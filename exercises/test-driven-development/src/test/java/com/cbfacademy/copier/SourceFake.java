package com.cbfacademy.copier;

public class SourceFake implements Source{

    private Integer numberOfCalls = 0;

    @Override
    public char getChar() {
        this.numberOfCalls = this.numberOfCalls+1;
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChar'");
    }

    public boolean wasCalled() {
        return this.numberOfCalls > 0;
    }

}
