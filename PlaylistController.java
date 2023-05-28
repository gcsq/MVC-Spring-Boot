package br.fatecrl.mvcdemo.controllers;
import br.fatecrl.mvcdemo.models.Playlist;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/playlist")
public class PlaylistController  {
    private static final List<Playlist> playlist = new ArrayList<Playlist>();

    public PlaylistController() {
        playlist.add(new Playlist("Eminem", "without me", 4.58F));
        playlist.add(new Playlist("Lady Gaga", "Shallow", 3.57F));
        playlist.add(new Playlist("Chitãozinho e Xororó", "Evidências", 4.57F));
        playlist.add(new Playlist("MC Gorila", "Chei de Sal", 3.34F));    }

    @GetMapping
    public String getPlaylist(Model model){

        model.addAttribute("playlist", playlist);
        return "playlist";
    }
}
