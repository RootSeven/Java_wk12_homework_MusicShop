public class Piano extends Instrument implements IPlay {

    private int numberOfKeys;
    private String pianoType;
    private int numberOfPedals;

    public Piano(String colour, String mainMaterial, String instrumentFamily, double buyPrice, double sellPrice, int numberOfKeys, String pianoType, int numberOfPedals) {
        super(colour, mainMaterial, instrumentFamily, buyPrice, sellPrice);
        this.numberOfKeys = numberOfKeys;
        this.pianoType = pianoType;
        this.numberOfPedals = numberOfPedals;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String getPianoType() {
        return pianoType;
    }

    public int getNumberOfPedals() {
        return numberOfPedals;
    }

    public String play() {
        return "doooo...";
    }
}
