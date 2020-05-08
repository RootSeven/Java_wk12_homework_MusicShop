public class SheetMusic implements ISell {

    private String publisher;
    private String composer;
    private String name;

    private double buyPrice;
    private double sellPrice;

    public SheetMusic(String publisher, String composer, String name, double buyPrice, double sellPrice) {
        this.publisher = publisher;
        this.composer = composer;
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getComposer() {
        return composer;
    }

    public String getName() {
        return name;
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
