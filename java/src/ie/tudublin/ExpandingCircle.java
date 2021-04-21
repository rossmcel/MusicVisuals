package ie.tudublin;

import processing.core.*;

public class ExpandingCircle {
    MyVisual mv;

    public ExpandingCircle(MyVisual mv) {
        this.mv = mv;
    }

    public void render() {

        mv.noStroke();
        mv.translate(mv.width / 2, mv.height / 2);
        for (int i = 0; i < mv.getBands().length; i++) {
            mv.stroke(100, 255, 255);
            mv.fill(PApplet.map(i, 0, mv.getBands().length, 255, 0), 255, 255);
            mv.circle(0, 0, mv.getSmoothedBands()[i]);

            mv.rotateY((float) 0.5);
            mv.noFill();
            mv.box(0, 0, 50);
        }
    }

}
