package HW4.compositeDecorator;

public class SongMP4 extends SongDecorator{
    public SongMP4(SongComponent s) {
        super(s);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String play(){
        return super.play() + decorateMP4();
    }

    public String decorateMP4(){
        return "\nON MP4";
    }
}
