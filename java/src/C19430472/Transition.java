package C19430472;

import processing.core.*;

public class Transition {
    MyVisual mv;

    public Transition(MyVisual mv) {
        this.mv = mv;
    }

    public void render() {

        float total = 0;

        mv.noStroke();
        for (int i = 1; i < 11; i++) {
            mv.fill(PApplet.map(i, 0, mv.getBands().length, 255, 0), 255, 255);
            mv.rect(0, mv.height + i * (mv.height / 10), 20 * mv.getSmoothedBands()[i], mv.height / 10);
        }

    }
}
