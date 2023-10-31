package com.cbfacademy.copier;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("The copier class should")
public class CopierTest {

    @Test
    @DisplayName("copy a character from the source to the destination")
    public void copyFromSourceToDestination() {
        final SourceFake sourceFake = new SourceFake();
        final DestinationSpy destinationSpy = new DestinationSpy();
        final CharacterCopier copier = new CharacterCopier(sourceFake, destinationSpy);
        
        copier.copy();

        assertTrue(sourceFake.wasCalled());
        assertTrue(destinationSpy.wasCalled());
    }
}
