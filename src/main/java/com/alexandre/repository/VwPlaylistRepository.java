package com.alexandre.repository;

import com.alexandre.model.VwPlaylist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VwPlaylistRepository extends JpaRepository<VwPlaylist, Long> {
    
}
