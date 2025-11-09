class Item {
    private String name;
    private int weight;
    private int price;
    
    public Item(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public int getPrice() {
        return price;
    }
    
    public boolean equals(Item other) {
        return this.name.equalsIgnoreCase(other.name) && (this.weight == other.weight || this.price == other.price);
    }
    public String toString() {
        return name + " " + weight + " " + price;
    }
}
