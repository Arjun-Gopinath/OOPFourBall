import processing.core.PApplet;

import java.util.ArrayList;

public class OOPFourBall extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static ArrayList<Ball> Balls = new ArrayList<>();
    ;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int ball = 1; ball <= 4; ball++) {
            Balls.add(new Ball(ball, ball * HEIGHT / 5));
        }
    }

    @Override
    public void draw() {
        for (Ball ball : Balls) {
            ball.moveBall(this);
        }
    }

    public static void main(String[] args) {
        PApplet.main("OOPFourBall",args);
    }
}
