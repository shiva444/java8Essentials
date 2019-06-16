package encap.model.model;

public enum OliveName {
    KALAMATA("Kalamta"), LIG("lig");
    private String name;

    OliveName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
      return name;
    }
}
