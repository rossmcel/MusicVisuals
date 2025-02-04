package C19430472;

import processing.core.*;

public class CrazySquares {
    MyVisual mv;

    public CrazySquares(MyVisual mv) {
        this.mv = mv;
    }

    public void render() {
        float gap = mv.width / (float) mv.getBands().length;
        mv.noStroke();
        for (int i = 0; i < mv.getBands().length; i++) {
            // mv.lights();
            // mv.translate(90, 90, 0);
            // mv.box(100);

            /*
             * mv.stroke(100, 255, 255); mv.translate(58, 48, 0); mv.rotateY((float) 0.5);
             * mv.noFill(); mv.box(40, 20, 90);
             */

            mv.fill(PApplet.map(i, 0, mv.getBands().length, 255, 0), PApplet.map(i, 0, mv.getBands().length, 0, 255),
                    PApplet.map(i, 0, mv.getBands().length * 3, 174, 197));
            mv.translate(mv.width / 2, mv.height / 2);
            mv.rotate((float) mv.PI * mv.getSmoothedBands()[i] / (float) 3.0);
            mv.rect(26, 26, 52, 52);
        }
    }
}
