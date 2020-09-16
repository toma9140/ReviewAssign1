package Part1;
import TurtleGraphics.*;
import BreezySwing.*;


public class ObjectExample {

    public static void main(String[] args) {
        Pen p1 = new StandardPen();
        
        p1.move(25);
        p1.move(-30,50);
        
        SketchPadWindow w = new SketchPadWindow(500,500);
        WigglePen wp = new WigglePen(w);
        Pen rp = new RainbowPen(w);
        wp.move(200);
        rp.setDirection(145);
        rp.move(100);
        
    }
    
}
