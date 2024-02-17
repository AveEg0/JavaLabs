package main;

import musicinstruments.*;

/*
This program is built ONLY to demonstrate inner, nested and local classes
Example - Drum Set
 */
public class Main {
    public static void main(String[] args) {
        DrumSet drum = new DrumSet();
        DrumSet.Drummer drummer = drum.getDrummer();
        drummer.playBassDrum();
        drummer.playSnareDrum();
        drummer.playHighHat(true);
        drummer.playHighHat(false);
    }
}
