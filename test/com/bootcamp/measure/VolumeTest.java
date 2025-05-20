package com.bootcamp.measure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void shouldCompareGallonAndLitre() {
        Volume gallon = Volume.fromGallon(1);
        Volume litre = Volume.fromLitre(3.78);

        assertEquals(gallon, litre);
    }

    @Test
    void shouldNotBeSame() {
        Volume gallon = Volume.fromGallon(1);
        Volume litre = Volume.fromLitre(3);

        assertFalse(litre.equals(gallon));
    }
}