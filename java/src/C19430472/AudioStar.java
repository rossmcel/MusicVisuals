package C19430472;

import processing.core.*;

public class AudioStar {
    MyVisual mv;

    public AudioStar(MyVisual mv) {
        this.mv = mv;
    }

    public void render() {
        float midX = mv.width / 2;
        float midY = mv.height / 2;
        int circleDim = 200;

        // ratio of scale difference between midX and midY (since screen width is
        // usually much wider than height)
        float over = midX / midY;
        float x = midX + circleDim + 40;
        float y = midY;

        float change = circleDim / (float) mv.getBands().length;

        mv.noStroke();
        for (int i = 0; i < 6; i++) {
            if (x == midX) {
                x += 0.5;
            }
            if (y == midX) {
                y += 0.5;
            }

            // top left
            if (x < midX && y > midY) {
                x = (x - change);
                y = ((y + change) * over);
            }
            // bottom left
            else if (x < midX && y < midY) {
                x = (x + change);
                y = ((y + change) * over);
            }
            // bottom right
            else if (x > midX && y < midY) {
                x = (x + change);
                // logically should be + 2 but pApplet inverts the logic
                y = ((y - change) * over);
            }
            // top right
            else if (x > midX && y > midY) {
                x = (x - change);
                y = ((y - change) * over);
            }

            // japanese ting
            mv.fill(PApplet.map(0, 0, 0, 255, 0), 255, 255);
            mv.stroke(255, 102, 0);
            mv.curve(5 * i, 26 * i, 5 * i, 26 * i, 73 * i, 24 * i, 73 * i, 61 * i);
            mv.stroke(0);
            mv.curve(5 * i, 26 * i, 73 * i, 24 * i, 73 * i, 61 * i, 15 * i, 65 * i);
            mv.stroke(255, 102, 0);
            mv.curve(73, 24, 73, 61, 15, 65, 15, 65);

            // pac man ting
            mv.arc(midX, midY, circleDim, circleDim, (float) 0, mv.getSmoothedBands()[i] * (float) 0.004, 4);
            mv.arc(midX + 100, midY, circleDim, circleDim, -mv.getSmoothedBands()[i] * (float) 0.004, (float) 0, 4);

            mv.beginShape(mv.TRIANGLE_FAN);
            mv.vertex((float) 57.5, (float) 50);
            mv.vertex((float) 57.5, (float) 15);
            mv.vertex((float) 92, (float) 50);
            mv.vertex((float) 57.5, (float) 85);
            mv.vertex((float) 22, (float) 50);
            mv.vertex((float) 57.5 * mv.getSmoothedBands()[i], (float) 15);
            mv.endShape();

        }

    }

}
