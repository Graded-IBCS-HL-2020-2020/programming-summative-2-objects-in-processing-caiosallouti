
import processing.core.PApplet;

public class Sketch extends PApplet {

    Ball b1;
    Ball b2;
    Ball b3;
    Ball b4;

    Bubble bb1;
    Bubble bb2;
    Bubble bb3;
    Bubble bb4;

    Snowflake sn1;
    Snowflake sn2;
    Snowflake sn3;
    Snowflake sn4;

    boolean b1s;
    boolean b2s;
    boolean b3s;
    boolean b4s;


    public void settings() {
        size(500, 500);
    }


    public void setup() {
        frameRate(10);
        b1 = new Ball(this);
        b2 = new Ball(this);
        b3 = new Ball(this);
        b4 = new Ball(this);

        bb1 = new Bubble(this);
        bb2 = new Bubble(this);
        bb3 = new Bubble(this);
        bb4 = new Bubble(this);

        sn1 = new Snowflake(this, 200, 20, 57);
        sn2 = new Snowflake(this);
        sn3 = new Snowflake(this);
        sn4 = new Snowflake(this);
    }

    public void draw() {
        background(100);

        /* SUMMATIVE REQUIRED Draw and move all balls, snowflakes, and bubbles */
        b1.drawBall();
        b1.moveBall();
        b2.drawBall();
        b2.moveBall();
        b3.drawBall();
        b3.moveBall();
        b4.drawBall();
        b4.moveBall();

        bb1.drawBubble();
        bb1.moveBubble();
        bb2.drawBubble();
        bb2.moveBubble();
        bb3.drawBubble();
        bb3.moveBubble();
        bb4.drawBubble();
        bb4.moveBubble();

        sn1.drawSnowflake();
        sn1.moveSnowflake();
        sn2.drawSnowflake();
        sn2.moveSnowflake();
        sn3.drawSnowflake();
        sn3.moveSnowflake();
        sn4.drawSnowflake();
        sn4.moveSnowflake();
    }


    public int randomColor(boolean transluscent) {
        int alpha;
        if (transluscent) {
            alpha = 125;
        } else {
            alpha = 255;
        }
        return color(random(0, 255), random(0, 255), random(0, 255), alpha);
    }

public void mousePressed(){
System.out.println("getX() is: " + b1.getX() + "mouseX is: " + mouseX + "mouseY is: " + mouseY);
if (mouseX > b1.getX() - b1.getRadius() && mouseX < b1.getX() + b1.getRadius() && mouseY > b1.getY() - b1.getRadius() && mouseY < b1.getY() + b1.getRadius()){

  b1.stop();
  b1s = true;
  System.out.println("BALL 1!");
}


if (mouseX > b2.getX() - b2.getRadius() && mouseX < b2.getX() + b2.getRadius() && mouseY > b2.getY() - b2.getRadius() && mouseY < b2.getY() + b2.getRadius()){

  b2.stop();
  b2s = true;
  System.out.println("BALL 2!");
}

if (mouseX > b3.getX() - b3.getRadius() && mouseX < b3.getX() + b3.getRadius() && mouseY > b3.getY() - b3.getRadius() && mouseY < b3.getY() + b3.getRadius()){

  b3.stop();
  b3s = true;
  System.out.println("BALL 3!");
}

if (mouseX > b4.getX() - b4.getRadius() && mouseX < b4.getX() + b4.getRadius() && mouseY > b4.getY() - b4.getRadius() && mouseY < b4.getY() + b4.getRadius()){

  b4.stop();
  b4s = true;
  System.out.println("BALL 4!");
}
  
}

public void mouseReleased(){
  if (b1s == true){
    b1.start();
    b1s = false;

  }
  if (b2s == true){
    b2.start();
    b2s = false;

  }
  if (b3s == true){
    b3.start();
    b3s = false;

  }
  if (b4s == true){
    b4.start();
    b4s = false;

  }
}

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
