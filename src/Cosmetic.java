//Клас, що представляє косметику
class Cosmetic {
    private String name; // Назва
    private double price; // Ціна за одиницю косметики
    private String brand; // Бренд
    private int quantity; // Кількість
    private String type; // Тип косметики

    // Конструктор класу Cosmetic
    public Cosmetic(String name, double price, String brand, int quantity, String type) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.quantity = quantity;
        this.type = type;
    }

    // Геттери для полів класу Cosmetic
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getBrand() {
        return brand;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return "Cosmetic {" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", type='" + type + '\'' +
                '}';
    }
}