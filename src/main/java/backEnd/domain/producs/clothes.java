package backEnd.domain.producs;

public class clothes extends product {
    private String clothesSize;
    private String brand;

    public clothes(String productNumber, String productName, Double cost, Double price,String clothesSize,String brand){
        super(productNumber,productName,cost,price);
        this.clothesSize =clothesSize;
        this.brand=brand;

    }

    public String getClothesSize() {
        return clothesSize;
    }

    public void setClothesSize(String clothesSize) {
        this.clothesSize = clothesSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString (){
        return "Clothes " + super.toString() + "brand: " + brand + " size: " + clothesSize;
    }
}
