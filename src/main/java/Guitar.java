public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;
    private String guitarType;

    public Guitar(String colour, String mainMaterial, String instrumentFamily, double buyPrice, double sellPrice, int numberOfStrings, String guitarType) {
        super(colour, mainMaterial, instrumentFamily, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public String play() {
        return "brrring...";
    }
}
