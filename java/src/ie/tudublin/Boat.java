package ie.tudublin;

public class Boat {
    MyVisual mv;

    public Boat(MyVisual mv) {
        this.mv = mv;
    }

    public void render() {
        float gap = mv.width / (float) mv.getBands().length;

        mv.noStroke();
        mv.translate(100, 100);
        for (int i = 0; i < mv.getBands().length; i++) {
            mv.clear();
            mv.translate(mv.getSmoothedBands()[i] / 8, 0);
            // boat
            // mast
            mv.triangle(30, 75, 58, 20, 86, 75);
            // mast pole
            mv.rect(53, 75, 10, 20);
            // bottom
            mv.rect(20, 95, 80, 20, 2);
        }
    }

}
