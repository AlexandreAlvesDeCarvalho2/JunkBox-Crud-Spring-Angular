package com.alexandre.controller;

import java.util.List;

import com.alexandre.model.VwPlaylist;
import com.alexandre.repository.VwPlaylistRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class VwplaylistController {

    private final VwPlaylistRepository vwPlaylistRepository;
    
    @GetMapping("api/VwPlaylist")
    public List<VwPlaylist> getAllVwPlaylist(){
        return vwPlaylistRepository.findAll();
    }





    
}
