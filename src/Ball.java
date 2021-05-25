import processing.core.*;

public class Ball {
    private PApplet sketch;

    private float x;
    private float y;
    private float size;
    private float xSpeed=1;
    //private float ySpeed;

    public Ball(PApplet sketch, float x, float y){
        this.sketch = sketch;
        this.x = x;
        this.y = y;
        this.size = sketch.random(20, 20);

    }

    public void step(int i){

        x += xSpeed*i;


    }

    public void render(){
        sketch.ellipse(x, y, size, size);
    }
}


