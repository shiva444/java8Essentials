package encap.model.model;

public abstract class Olive {

    public OliveName name;
    private OliveColor color;
    private int oil;

    public Olive(OliveName name, OliveColor color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public OliveColor getColor() {
        return color;
    }

    public void setColor(OliveColor color) {
        this.color = color;
    }

    public int crush() {
        String msg = name + "->" +  "having" + oil + "UNITS" + "From" +  getOrigin();
        System.out.println(msg + " " + getState());
        return oil;
    }


    public void setOil(int oil) {
        this.oil = oil;
    }

    public abstract String getOrigin();
    public abstract String getState();

    @Override
    public String toString() {
        return name.toString();
    }

}
