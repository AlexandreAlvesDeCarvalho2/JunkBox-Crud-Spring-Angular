package com.alexandre.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="VM_PLAYLIST2")
public class VwPlaylist {

    @Id
    @Column(name="ID_MUSICA")
    private Long idMusica;

    @Column(name="ID_PLAYLIST")
    private Long idPlaylist;
    
    @Column(name="NM_MUSICA")
    private String nmMusica;
    
    @Column(name="NM_ARTISTA")
    private String nmArtista;
    
}
