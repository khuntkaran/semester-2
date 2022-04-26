interface  EventListener{
    void performEvent();
}
interface MouseListener extends EventListener{
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}
interface KeyListener extends EventListener{
    void keyPressed();
    void keyReleased();
}
class EventDemo implements MouseListener,KeyListener{
    @Override
    public void performEvent(){
        System.out.println("i am performEvent");
    }
    @Override
    public void mouseClicked(){
        System.out.println("i am mouseClicked");
    }
    @Override
    public void mousePressed(){
        System.out.println("i am mousePressed");
    }
    @Override
    public void mouseReleased(){
        System.out.println("i am mouseReleased");
    }
    @Override
    public void mouseMoved(){
        System.out.println("i am mouseMoved");
    }
    @Override
    public void mouseDragged(){
        System.out.println("i am mouseDragged");
    }
    @Override
    public void keyPressed(){
        System.out.println("i am KeyPressed");
    }
    @Override
    public void keyReleased() {
        System.out.println("i am ♥ KeyReleased");
    }
}
public class EventListenerDemo {
    public static void main(String[] args) {
        EventDemo E = new EventDemo();
        E.performEvent();
        E.mouseClicked();
        E.mousePressed();
        E.mouseReleased();
        E.mouseMoved();
        E.mouseDragged();
        E.keyPressed();
        E.keyReleased();
    }
}
