package HW4.compositeDecorator;

public class SongVinyl extends SongDecorator{

    public SongVinyl(SongComponent s) {
        super(s);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String play(){
        return super.play() + decorate();
    }

    public String decorate() {
        return "\nON vinyl\n";
    }
}
