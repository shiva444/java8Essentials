package encap.model;

import encap.model.model.*;
/* this is an olive press application */

import java.util.ArrayList;
import java.util.List;

public class Main {
    /* Main Method
        array of String Values
     */
    public static void main(String args[]){
        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Lig());
        olives.add(new Kalamata());
        olives.add(new Lig());
        IP p = new Press();
        p.setOil(5);
       int totalOil =  p.getOil(olives);
        System.out.println("total:" + totalOil);

    }
}
