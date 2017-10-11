package skinstrade.model.Enum;

public enum Wear {
    ANY(""),
    VANILLA("Vanilla"),
    FACTORYNEW("Factory+New"),
    MINIMALWEAR("Minimal+Wear"),
    FIELDTESTED("Field-Tested"),
    WELLWORN("Well-Worn"),
    BATTLESCARRED("Battle-Scarred");


    private final String nameBitSkins;

    Wear(String s) {
        nameBitSkins = s;
    }

    public String toStringBitSkins() {
        return this.nameBitSkins;
    }
}
