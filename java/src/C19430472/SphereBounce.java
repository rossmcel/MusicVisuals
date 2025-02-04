package C19430472;

import processing.core.*;

// This is an example of a visual that uses the audio bands
public class SphereBounce {
    MyVisual mv;

    public SphereBounce(MyVisual mv) {
        this.mv = mv;
    }

    public void render() {
        float gap = mv.width / (float) mv.getBands().length;

        mv.noStroke();
        mv.translate(mv.width / 2, mv.height / 2);
        for (int i = 0; i < mv.getBands().length; i++) {
            mv.stroke(170, PApplet.map(i, 0, mv.getBands().length, 255, 0),
                    PApplet.map(i, 0, mv.getBands().length, 255, 0) * 3);
            mv.fill(mv.getSmoothedBands()[i] / 3, mv.getSmoothedBands()[i], mv.getSmoothedBands()[i] * 3);
            mv.rotate((float) (mv.PI * mv.getSmoothedBands()[i] / 20) / (float) 3.0);
            mv.rect(2, 2, 2 * mv.getSmoothedBands()[i] / 20, 2 * mv.getSmoothedBands()[i] / 20);
            mv.line(0, 0, mv.width, mv.height);
        }
    }
}