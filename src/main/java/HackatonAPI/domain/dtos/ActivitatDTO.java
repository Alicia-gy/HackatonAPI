package HackatonAPI.domain.dtos;

import HackatonAPI.domain.entities.Activitat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ActivitatDTO {

    private String nom;
    private String descripcio;
    private int capacacitat_maxima;

    public ActivitatDTO(Activitat activitat) {
        this.nom = activitat.getNom();
        this.descripcio = activitat.getDescripcio();
        this.capacacitat_maxima = activitat.getCapacitat_maxima();
    }

    @Override
    public String toString() {
        return "nom: " + nom +
                "\ndescripció: " + descripcio +
                "\ncapactitat maxima: " + capacacitat_maxima;
    }

}
