package HW6;

import HW6.Commands.*;

public class Cliente {
    public static void main(String[] args) {

        Historico hist = new Historico();
        BeeBot beeBot = new BeeBot();

        Invoker invoker = new Invoker();
        invoker.setComand(new Forward(beeBot,hist));
        invoker.executeCommand();

        invoker.setComand(new Back(beeBot,hist));
        invoker.executeCommand();

        invoker.setComand(new Right(beeBot,hist));
        invoker.executeCommand();

        invoker.setComand(new Left(beeBot,hist));
        invoker.executeCommand();

        invoker.setComand(new Forward(beeBot,hist));
        invoker.executeCommand();

        invoker.setComand(new Forward(beeBot,hist));
        invoker.executeCommand();

        invoker.setComand(new Delete(beeBot,hist));
        invoker.executeCommand();

        invoker.setComand(new Go(beeBot,hist));
        invoker.executeCommand();

    }
}
