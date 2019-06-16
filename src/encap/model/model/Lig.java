package encap.model.model;

public class Lig extends Olive {
    public Lig(){
        super(OliveName.LIG, OliveColor.BLACK, 34);
    }

    @Override
    public String getOrigin() {
        return "INDIA";
    }

    @Override
    public String getState() {
        return "HYD";
    }
}
