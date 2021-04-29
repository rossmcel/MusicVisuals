package C19430472;

import processing.core.*;

// This is an example of a visual that uses the audio bands
public class RotatingSquares {
    MyVisual mv;

    public RotatingSquares(MyVisual mv) {
        this.mv = mv;
    }

    public void render() {
        float gap = mv.width / (float) mv.getBands().length;
        mv.noStroke();
        mv.translate(mv.width / 2, mv.height / 2);
        for (int i = 0; i < mv.getBands().length; i++) {
            // mv.lights();
            // mv.translate(90, 90, 0);
            // mv.box(100);

            /*
             * mv.stroke(100, 255, 255); mv.translate(58, 48, 0); mv.rotateY((float) 0.5);
             * mv.noFill(); mv.box(40, 20, 90);
             */

            mv.stroke(100, 255, 255);
            mv.fill(PApplet.map(i, 0, mv.getBands().length, 180, 20), 125, 255);
            // mv.translate(120, 20);
            mv.rotate((float) (mv.PI * mv.getSmoothedBands()[i] / 15) / (float) 3.0);
            mv.rect(26, 26, 52, 52);
        }
    }
}