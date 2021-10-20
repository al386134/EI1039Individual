package HW4.compositeDecorator;

public class SongVinyl extends SongDecorator{

    public SongVinyl(SongComponent s) {
        super(s);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String play(){
        return super.play() + decorateVinyl();
    }

    public String decorateVinyl() {
        return "\nON vinyl";
    }
}
