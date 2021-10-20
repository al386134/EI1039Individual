package HW4.compositeDecorator;

public class Song implements SongComponent {
    public String name;
    public String artist;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }
    
    @Override
    public void play() {
        System.out.println("Escuchando..." + getName() + " BY " + getArtist());
    }

    @Override
    public String getName() {
        return this.name;
    }
    public String getArtist() {
        return this.artist;
    }
}
