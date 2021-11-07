package HW6;

import java.util.ArrayList;

public class Historico {
    private ArrayList<Command> hist = new ArrayList<>();

    public ArrayList<Command> getHist() {
        return hist;
    }

    public void add (Command command){
        this.hist.add(command);
    }

    public void delete(){
        if (!this.hist.isEmpty()){ this.hist.remove(this.hist.size()-1); }
    }
}
