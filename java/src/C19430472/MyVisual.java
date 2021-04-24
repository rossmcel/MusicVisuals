package C19430472;

public class MyVisual extends Visual {
    // WaveForm wf;
    // AudioBandsVisual abv;
    // AudioStar as;
    SphereBounce sb;
    CrazySquares cs;
    RotatingSquares rs;
    TileStairs ts;
    RotatingLine rl;
    AliveBoxes ab;
    Transition transition;
    ExpandingCircle ec;
    Pulse ps;

    public void settings() {
        size(1024, 500, processing.core.PConstants.P3D);

        // Use this to make fullscreen
        fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        // fullScreen(P3D, SPAN);
    }

    public void setup() {
        startMinim();

        // Call loadAudio to load an audio file to process
        loadAudio("heroplanet.mp3");

        // Call this instead to read audio from the microphone
        // startListening();

        sb = new SphereBounce(this);
        cs = new CrazySquares(this);
        rs = new RotatingSquares(this);
        ts = new TileStairs(this);
        rl = new RotatingLine(this);
        ab = new AliveBoxes(this);
        transition = new Transition(this);
        ec = new ExpandingCircle(this);
        ps = new Pulse(this);
    }

    public void keyPressed() {
        if (key == ' ') {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }
    }

    public void draw() {
        background(0);
        try {
            // Call this if you want to use FFT data
            calculateFFT();
        } catch (VisualException e) {
            e.printStackTrace();
        }

        textSize(32);
        fill(0, 102, 153);
        text("Welcome", width / 2 - 60, height / 2);

        textSize(22);
        fill(0, 102, 153);
        text("Press Space to Start the Music", width / 2 - 160, height / 2 + 50);

        textSize(22);
        fill(0, 102, 153);
        text("Click keys 1 through 7 to choose new animations", width / 2 - 270, height / 2 + 90);

        // Call this is you want to use frequency bands
        calculateFrequencyBands();

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();

        /*
         * if (millis() < 20000) { clear(); ts.render(); } else if (millis() >= 20000 &&
         * millis() < 50000) { clear(); // ab.render(); ab.render(); } else if (millis()
         * >= 50000 && millis() < 80000) { clear(); ec.render(); } else if (millis() >=
         * 80000 && millis() < 100000) { clear(); ts.render(); } else if (millis() >=
         * 100000 && millis() < 130000) { clear(); cs.render(); } else if (millis() >=
         * 130000 && millis() < 150000) { clear(); rs.render(); } else if (millis() >=
         * 150000) { clear(); ab.render(); }
         */
        if (key == '1') {
            clear();
            sb.render();
        } else if (key == '1') {
            clear();
            // ab.render();
            ab.render();
        } else if (key == '2') {
            clear();
            ec.render();
        } else if (key == '3') {
            clear();
            ts.render();
        } else if (key == '4') {
            clear();
            cs.render();
        } else if (key == '5') {
            clear();
            rs.render();
        } else if (key == '6') {
            clear();
            ab.render();
        }
    }
}
