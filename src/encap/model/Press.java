package encap.model;

import encap.model.model.Olive;

import java.util.List;

public class Press implements IP{
    private  int currentOil;
    public int getOil(List<Olive> olives){
        int totalOil = currentOil;
        for (Olive o : olives) {
            System.out.println(o.name);
            totalOil += o.crush();
        }
        return totalOil;
    }

    @Override
    public void setOil(int oil) {
        currentOil = oil;

    }
}
