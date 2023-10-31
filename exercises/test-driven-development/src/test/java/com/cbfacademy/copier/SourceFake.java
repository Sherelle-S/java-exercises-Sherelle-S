package com.cbfacademy.copier;

public class SourceFake implements Source{

    private Integer numberOfCalls = 0;

    @Override
    public char getChar() {
        this.numberOfCalls = this.numberOfCalls + 1;
        return 'a';
    }

    public boolean wasCalled() {
        return this.numberOfCalls > 0;
    }

}
