package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Playlist;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/playlist")
public class PlaylistAPIController {
    private static final List<Playlist> playlist = new ArrayList<Playlist>();

    public PlaylistAPIController() {
        playlist.add(new Playlist("Eminem", "without me", 4.58F));
        playlist.add(new Playlist("Lady Gaga", "Shallow", 3.57F));
        playlist.add(new Playlist("Chitãozinho e Xororó", "Evidências", 4.57F));
        playlist.add(new Playlist("MC Gorila", "Chei de Sal", 3.34F));    }

@GetMapping
    public List<Playlist> getPlaylist(){
        return playlist;
    }
}

