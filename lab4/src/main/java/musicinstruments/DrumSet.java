package musicinstruments;

public class DrumSet {
    private HighHat highHat = new HighHat();
    private SnareDrum snareDrum = new SnareDrum();
    private BassDrum bassDrum = new BassDrum();

    public Drummer getDrummer() {
        return new Drummer(this);
    }


    private HighHat getHighHat() {
        return highHat;
    }
    private SnareDrum getSnareDrum() {
        return snareDrum;
    }

    private BassDrum getBassDrum() {
        return bassDrum;
    }

/*
Inner Class
 */
    private class HighHat {
        public void play(boolean isPedalPressed) {
            /*
            Local Class
             */
            class HighHatPedal {
                private boolean isPedalPressed;
                public HighHatPedal(boolean isPedalPressed) {
                    this.isPedalPressed = isPedalPressed;
                }

                public void play() {
                    if (isPedalPressed) {
                        System.out.println("*Open High-Hat sound*");
                    } else {
                        System.out.println("*Closed High-Hat sound*");
                    }
                }
            }

            new HighHatPedal(isPedalPressed).play();
        }
    }

    private class SnareDrum {
        public void play() {
            System.out.println("*Snare drum sound*");
        }
    }

    private class BassDrum {
        public void play() {
            System.out.println("*Bass drum sound*");
        }
    }
/*
Nested class, executioner
 */
    public static class Drummer {
        private DrumSet drumSet;
        public Drummer(DrumSet drumSet) {
            this.drumSet = drumSet;
        }

        public void playHighHat(boolean isPedalPressed) {
            drumSet.getHighHat().play(isPedalPressed);
        }

        public void playSnareDrum() {
            drumSet.getSnareDrum().play();
        }

        public void playBassDrum() {
            drumSet.getBassDrum().play();
        }

    }

}

