package HackatonAPI.domain.entities;

import jakarta.persistence.*;
import lombok.*;

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
    @JoinTable(name = "usuaris_activitats",
    joinColumns = @JoinColumn(name = "activitat_id", referencedColumnName = "id"))
    private Set<Usuari> usuari_id;

}
