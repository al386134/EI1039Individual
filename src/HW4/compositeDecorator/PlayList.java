package HW4.compositeDecorator;

import java.util.ArrayList;

public class PlayList implements SongComponent {
    public String playlistName;
    public ArrayList<SongComponent> playlist = new ArrayList();

    public PlayList(String name) {
        this.playlistName = name;
    }

    public void add(SongComponent component) {
        playlist.add(component);
    }

    public void remove(SongComponent component) {
        playlist.remove(component);
    }

    @Override
    public String play(){
        String canciones = "";
        for (SongComponent component: playlist) {
            canciones += "-----" + getName() + "-----\n";
            canciones += component.play()+ "\n";
        }
        return canciones;
    }

    @Override
    public String getName() {
        return this.playlistName;
    }
}
