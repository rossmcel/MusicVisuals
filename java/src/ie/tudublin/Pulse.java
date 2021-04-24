package ie.tudublin;

import processing.core.*;

// This is an example of a visual that uses the audio bands
public class Pulse {
    MyVisual mv;

    public Pulse(MyVisual mv) {
        this.mv = mv;
    }

    public void render() {
        mv.stroke(PApplet.map(120, 0, mv.getBands().length, 255, 0), 255, 255);
        mv.fill(PApplet.map(120, 0, mv.getBands().length, 255, 0), 255, 255);
    }
}