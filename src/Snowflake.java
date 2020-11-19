
class Snowflake {

  private Sketch s;
    private float diameter;
    private float x;
    private float y;
    private int col; 
    private float speedY;
    private float speedX;

    public Snowflake(Sketch sketch){
      s = sketch;
      diameter = s.random(20, 100);
      x = s.random (diameter/ 2, s.width - diameter/ 2 );
      y = s.random (diameter/ 2, s.height - diameter/ 2);
      speedY = s.random (2, 5);
      speedX = s.random (2, 5);
      col = s.color(255,150);
    }

    public Snowflake(Sketch sketch, float X, float Y, float snowDiam, int snowColor, float sx, float sy){
      s = sketch;
      x = X;
      y = Y;
      diameter = snowDiam;
      col = snowColor;
      speedY = sy;
      speedX = sx;
    }

    public Snowflake(Sketch sketch, float snowDiam, float sx, float sy){
      s = sketch;
      x = s.random(diameter / 2, s.width - diameter / 2);
      y = s.random(diameter / 2, s.height - diameter / 2);
      diameter = snowDiam;
      col = s.color(225, 225, 225);
      speedY = sy;
      speedX = sx;
    }

      public float getRadius(){
       return diameter / 2;
     }
     

     public void stop(){
       speedX = 0;
       speedY = 0;
     }
    
    public void start(){
      speedX = 5;
      speedY = 5;
    }
    
    
    public void drawSnowflake() {
        s.stroke(col);
        s.line(x - getRadius() / 2, y - getRadius() / 2, x + getRadius() / 2, y + getRadius() / 2);
        s.line(x - getRadius() / 2, y + getRadius() / 2, x + getRadius() / 2, y - getRadius() / 2);
        s.line(x - getRadius(), y, x + getRadius(), y);
        s.line(x, y - getRadius(), x, y + getRadius());
    }

    public void moveSnowflake() {
        if (x > (s.width - getRadius()) || x < getRadius()) {
            speedX = -speedX;
        }
        if (y < (-getRadius())) {
            y = s.height + getRadius();
        }
        if (y > (s.height + getRadius())) {
            y = -getRadius();
        }
        x += speedX;
        y += speedY;

    }
}
