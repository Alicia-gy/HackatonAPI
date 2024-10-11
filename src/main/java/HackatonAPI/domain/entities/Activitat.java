package HackatonAPI.domain.entities;

import HackatonAPI.domain.dtos.ActivitatDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "activitat")
public class Activitat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "descripcio", nullable = false)
    private String descripcio;

    @Column(name = "capacitat_maxima")
    private int capacitat_maxima;

    @ManyToMany
    @JoinTable(
            name = "usuaris_activitats",
            joinColumns = @JoinColumn(name = "usuari_id"),
            inverseJoinColumns = @JoinColumn(name = "activitat_id"))
    private Set<Usuari> usuarisInscrits = new HashSet<>();

    public Activitat(ActivitatDTO dto) {
        this.nom = dto.getNom();
        this.descripcio = dto.getDescripcio();
        this.capacitat_maxima = dto.getCapacacitat_maxima();
    }

}
