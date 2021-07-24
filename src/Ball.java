import processing.core.PApplet;

public class Ball extends PApplet {

    private final int height;
    private int positionX;
    private int speed;
    private final int diameter;

    public Ball(int speed, int height) {
        this.height = height;
        this.speed = speed;
        this.diameter = 10;
        this.positionX = 0;
    }
    
    public void moveBall(PApplet draw) {
        draw.ellipse(this.positionX,this.height,this.diameter,this.diameter);
        newPosition();
    }

    private void newPosition() {
        this.positionX = this.positionX + this.speed;
    }
}
