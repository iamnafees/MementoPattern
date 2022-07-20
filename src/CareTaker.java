import java.util.ArrayList;

public class CareTaker {

    private ArrayList<Memento> history;
    private int currStep = -1;

    public CareTaker(){
        this.history = new ArrayList<>();

    }
     public void addMemento(Memento m){
        this.history.add(m);
        currStep = this.history.size()-1;

     }

     public Memento getMemento(int index){
        return history.get(index);
     }

     public Memento undo(){
        System.out.println("Undoing state..");
        if (currStep <= 0){
            currStep=0;
            return  getMemento(0);

        }
        currStep--;
        return getMemento((currStep));

     }
     public  Memento redo(){
        System.out.println(("Redoing state.."));
        if (currStep >= history.size()-1){
            currStep  =history.size()-1;
            return  getMemento(currStep);
        }

        currStep++;
        return getMemento(currStep);
     }
}
