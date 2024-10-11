package HackatonAPI.domain.entities;

import HackatonAPI.domain.dtos.UsuariDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuari")
public class Usuari {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", nullable = false)
    private String nom;

    @ManyToMany(mappedBy = "usuarisInscrits")
    private Set<Activitat> activitats = new HashSet<>();

    public Usuari(UsuariDTO dto) {
        this.nom = dto.getNom();
    }


}
