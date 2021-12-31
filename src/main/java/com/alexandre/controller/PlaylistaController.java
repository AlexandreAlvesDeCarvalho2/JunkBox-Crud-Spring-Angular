package com.alexandre.controller;

import java.util.List;

import com.alexandre.model.Playlist;
import com.alexandre.repository.PlaylistRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;

@AllArgsConstructor
@RestController
public class PlaylistaController {
    private final PlaylistRepository playlistRepository;

    @GetMapping("api/Playlist")
    public List<Playlist> getAllPlaylist() {
        return playlistRepository.findAll();

    }

    @PostMapping("/api/Playlist")
    public Playlist savarPlaylist(@RequestBody Playlist playlist) {
        return playlistRepository.save(playlist);
    }

    @DeleteMapping("/api/Playlist/{id}")
    public void deleteMusica(@PathVariable Long id) {
        playlistRepository.deleteById(id);
    }

    @PutMapping(value = "api/Playlist/{id}")
    public Playlist alterar(@PathVariable Long id, @RequestBody Playlist playlist) {
        return playlistRepository.saveAndFlush(playlist);
    }

    

}