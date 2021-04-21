package ie.tudublin;

import processing.core.*;

public class AliveBoxes {
    MyVisual mv;

    public AliveBoxes(MyVisual mv) {
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
            mv.translate(98, 88, 0);
            mv.rotateY((float) 0.5);
            mv.noFill();
            mv.box(50);
            mv.rotate((float) (mv.PI * mv.getSmoothedBands()[i] / 20) / (float) 3.0);
        }
    }

}
