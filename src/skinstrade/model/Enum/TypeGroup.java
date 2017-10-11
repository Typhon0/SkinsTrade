package skinstrade.model.Enum;

public enum TypeGroup {
    ANY(""),
    COLLECTIBLE("Collectible"),
    CONTAINER("Container"),
    GIFT("Gift"),
    GLOVES("Gloves"),
    GRAFFITI("Graffiti"),
    KEY("Key"),
    KNIFE("Knife"),
    MACHINEGUN("Machinegun"),
    MUSICKIT("Music+Kit"),
    PASS("Pass"),
    PISTOL("Pistol"),
    RIFLE("Rifle"),
    SMG("SMG"),
    SHOTGUN("Shotgun"),
    SNIPERRIFLE("Sniper+Rifle"),
    STICKER("Sticker"),
    TAG("Tag"),
    TOOL("Tool");

    private final String nameBitSkins;

    TypeGroup(String s) {
        nameBitSkins = s;
    }

    public String toStringBitSkins() {
        return this.nameBitSkins;
    }
}
