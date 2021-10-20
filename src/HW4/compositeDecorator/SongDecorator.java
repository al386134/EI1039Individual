package HW4.compositeDecorator;

public abstract class SongDecorator implements SongComponent{
    private SongComponent songComponent;

    public SongDecorator(SongComponent songComponent) {
        this.songComponent = songComponent;
    }

    @Override
    public String play(){
        return songComponent.play();
    }

    @Override
    public String getName(){
        return songComponent.getName();
    }
}
