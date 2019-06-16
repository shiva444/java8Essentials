package encap.model.model;

public class Kalamata extends Olive {
    public Kalamata() {
        super(OliveName.KALAMATA, OliveColor.PURPLE, 12);
    }

    @Override
    public String getOrigin() {
        return "USA";
    }

    @Override
    public String getState() {
        return "COLO";
    }
}
