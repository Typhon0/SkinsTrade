package skinstrade.model.Enum;

public enum TypeGroup {
    RIFLES("Rifles");

    private final String nameBitSkins;

    private TypeGroup(String s) {
        nameBitSkins = s;
    }

    public String toString() {
        return this.nameBitSkins;
    }
}
