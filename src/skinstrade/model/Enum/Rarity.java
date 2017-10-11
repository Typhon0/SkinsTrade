package skinstrade.model.Enum;

public enum Rarity {
    ANY(""),
    BASEGRADE("Base+Grade"),
    CLASSIFIED("Classified"),
    CONSUMERGRADE("Consumer+Grade"),
    CONTRABAND("Contraband"),
    COVERT("Covert"),
    EXOTIC("Exotic"),
    EXTRAORDINARY("Extraordinary"),
    HIGHGRADE("High+Grade"),
    INDUSTRIALGRADE("Industrial+Grade"),
    MILSPECGRADE("Mil-Spec+Grade"),
    REMARKABLE("Remarkable"),
    RESTRICTED("Restricted");


    private final String nameBitSkins;

    Rarity(String s) {
        nameBitSkins = s;
    }

    public String toStringBitSkins() {
        return this.nameBitSkins;
    }
}
