package HW4.compositeDecorator;

public class Song implements SongComponent {
    public String name;
    public String artist;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    @Override
    public String play(){
        return "Escuchando..." + getName() + " BY " + getArtist();
    }

    public String getName() {
        return this.name;
    }

    public String getArtist() {
        return this.artist;
    }
}
