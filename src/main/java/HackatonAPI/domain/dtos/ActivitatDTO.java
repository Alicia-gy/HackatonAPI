package HackatonAPI.domain.dtos;

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

    @Override
    public String toString() {
        return "name";
    }

}
