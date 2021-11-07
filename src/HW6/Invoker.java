package HW6;

public class Invoker {

    private Command command;

    public void setComand(Command comand) {
        this.command = comand;
    }

    public void executeCommand(){
        command.execute();
    }
}
