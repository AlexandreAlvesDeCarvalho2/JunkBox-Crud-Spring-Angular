package com.alexandre.controller;

import java.util.List;
import java.util.Optional;

import com.alexandre.model.Musica;

import com.alexandre.repository.MusicaRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController

public class MusicController {

    private final MusicaRepository musicaRepository;

    @GetMapping("/api/Musica")
    public List<Musica> getAllMusicas() {
        return musicaRepository.findAll();
    }

    @GetMapping("/api/Musica/{id}")
    public Optional<Musica> getMusicaById(@PathVariable Long id) {
        return musicaRepository.findById(id);
    }

    @DeleteMapping("/api/Musica/{id}")
    public void deleteMusica(@PathVariable Long id) {
        musicaRepository.deleteById(id);
    }

    @PostMapping("/api/Musica")
    public Musica saveMusica(@RequestBody Musica musica) {
        return musicaRepository.save(musica);
    }
}
