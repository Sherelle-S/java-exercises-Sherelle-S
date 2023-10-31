package com.cbfacademy.copier;

public class CharacterCopier {

    private final Source source;
    private final Destination destination;

    public CharacterCopier(final Source source, final Destination destination) {
        this.source = source;
        this.destination = destination;
    }

    public void copy(){
       final char character = this.source.getChar();
       this.destination.setChar(character);
    }

}
