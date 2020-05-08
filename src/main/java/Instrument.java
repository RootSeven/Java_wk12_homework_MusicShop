public class Instrument implements ISell {

    private String colour;
    private String mainMaterial;
    private String instrumentFamily;

    private double buyPrice;
    private double sellPrice;

    public Instrument(String colour, String mainMaterial, String instrumentFamily, double buyPrice, double sellPrice) {
        this.colour = colour;
        this.mainMaterial = mainMaterial;
        this.instrumentFamily = instrumentFamily;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getColour() {
        return colour;
    }

    public String getMainMaterial() {
        return mainMaterial;
    }

    public String getInstrumentFamily() {
        return instrumentFamily;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup() {
        return (sellPrice - buyPrice)/buyPrice;
    }
}
