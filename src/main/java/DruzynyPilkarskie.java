import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor


public class DruzynyPilkarskie {

    private String nazwaDruzyny;
    private int bramkiStracone;
    private int bramkiTrafione;
    private int meczeWygrane;
    private int meczePrzegrane;
    private int meczeZremisowane;
    private int liczbaPunktow;

}
