
import java.util.ArrayList;
import processing.core.PApplet;

    public class MySketch extends PApplet {

        private ArrayList<Ball> balls = new ArrayList<>();

        public void settings() {
            size(500, 500);
            for (int i = 1; i <= 4; i++) {
                balls.add(new Ball(this, 0 , 100 *i));
            }
        }

            public void draw () {
                //background(64);
                int i=1;
                for (Ball b : balls) {


                    b.step(i++);

                    b.render();
                }
            }



            public static void main (String[]args){
                String[] processingArgs = {"MySketch"};
                MySketch mySketch = new MySketch();
                PApplet.runSketch(processingArgs, mySketch);
            }

    }

