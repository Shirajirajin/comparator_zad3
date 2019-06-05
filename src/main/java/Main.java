import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<DruzynyPilkarskie> druzynyPilkarskies = new ArrayList<DruzynyPilkarskie>();
        druzynyPilkarskies.add(new DruzynyPilkarskie("d1", 1,1,1,1,1,1));
        druzynyPilkarskies.add(new DruzynyPilkarskie("d2", 2,2,2,2,2,2));
        druzynyPilkarskies.add(new DruzynyPilkarskie("d3", 3,3,3,3,3,3));

      // Collections.sort(druzynyPilkarskies, new Comperator());


        Collections.sort(druzynyPilkarskies, new Comperator());









    }




}
