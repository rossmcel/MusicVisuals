package C19430472;

import processing.core.*;

public class RotatingLine {
    MyVisual mv;

    public RotatingLine(MyVisual mv) {
        this.mv = mv;
    }

    public void render() {
        float gap = mv.width / (float) mv.getBands().length;

        mv.noStroke();
        mv.translate(mv.width / 2, mv.height / 2);
        for (int i = 0; i < mv.getBands().length; i++) {
            mv.stroke(100, 255, 255);
            mv.fill(PApplet.map(i, 0, mv.getBands().length, 255, 0), 255, 255);
            // mv.translate(120, 20);
            mv.rotate((float) (mv.PI * mv.getSmoothedBands()[i] / 20) / (float) 3.0);
            mv.rect(2, 2, 2 * mv.getSmoothedBands()[i] / 20, 2 * mv.getSmoothedBands()[i] / 20);
            mv.line(0, 0, mv.width, mv.height);
        }
    }

}
