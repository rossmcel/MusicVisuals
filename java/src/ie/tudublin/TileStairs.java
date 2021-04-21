package ie.tudublin;

import processing.core.*;

public class TileStairs {
    MyVisual mv;

    public TileStairs(MyVisual mv) {
        this.mv = mv;
    }

    public void render() {
        mv.noStroke();
        for (int i = 0; i < mv.getBands().length; i++) {

            mv.fill(PApplet.map(i, 0, mv.getBands().length, 255, 0), 255, 255);
            mv.noStroke();
            mv.lights();
            mv.translate(150, 10 + mv.getSmoothedBands()[i] / 4);
            mv.box(40, 20, 50);
            ;
        }
    }
}