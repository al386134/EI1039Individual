package HW6;

import java.util.ArrayList;

public class BeeBot {

    private ArrayList<String> hist = new ArrayList<>();

    public void mover(String movimiento){
        hist.add(movimiento);
    }

    public void go(){
        for(String s : hist)
            System.out.println(s);
    }

    public void delete(){
        if (!this.hist.isEmpty()){ this.hist.remove(this.hist.size()-1); }
    }
}
