package day_4;

abstract class Player {
    boolean pause;
    int currentPos;

    public Player() {
        pause = false;
        currentPos = 0;
    }

    abstract void play(int pos);
    abstract void stop();

    void play() {
        play(currentPos);
    }

    void pause() {
        if (pause) {
            pause = false;
            play(currentPos);
        } else {
            pause = true;
            stop();
        }
    }
}

class CDPlayer extends Player {
    @Override
    void play(int pos) {

    }

    @Override
    void stop() {

    }
}
