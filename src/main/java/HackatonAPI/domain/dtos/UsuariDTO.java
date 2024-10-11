package HackatonAPI.domain.dtos;

import HackatonAPI.domain.entities.Usuari;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuariDTO {

    private String nom;

    public UsuariDTO(Usuari usuari) {
        this.nom = usuari.getNom();
    }
}
