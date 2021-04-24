package C19430472;

import processing.core.*;

// This is an example of a visual that uses the audio bands
public class AudioBandsVisual {
    MyVisual mv;

    public AudioBandsVisual(MyVisual mv) {
        this.mv = mv;
    }

    public void render() {
        float gap = mv.width / (float) mv.getBands().length;
        mv.noStroke();
        for (int i = 0; i < mv.getBands().length; i++) {
            mv.fill(PApplet.map(i, 0, mv.getBands().length, 255, 0), 255, 255);
            mv.rect(i * gap, mv.height, gap, -mv.getSmoothedBands()[i] * 0.2f);

            mv.lights();
            mv.translate(90, 90, 0);
            mv.box(100);

            mv.stroke(100, 255, 255);
            mv.translate(58, 48, 0);
            mv.rotateY((float) 0.5);
            mv.noFill();
            mv.box(40, 20, 50);
        }
    }
}