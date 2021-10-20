package HW4.compositeDecorator;

public class SongMP4 extends SongDecorator{
    public SongMP4(SongComponent s) {
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

    public String decorate(){
        return "\nON MP4\n";
    }
}
