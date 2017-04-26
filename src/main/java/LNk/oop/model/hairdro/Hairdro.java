package LNk.oop.model.hairdro;

/**
 * Created by Lena on 01.04.2017.
 */
public class Hairdro {
    int id;
    String name;
    int price;
    boolean washing;
    boolean draing;
    boolean fixing;

    public Hairdro (){}
    //public Hairdro(int id2, boolean fixing, int price) { }

    public Hairdro(int id, String name, int price, boolean washing, boolean draing, boolean fixing) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.washing = washing;
        this.draing = draing;
        this.fixing = fixing;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}
    public boolean isWashing() {return washing;}
    public void setWashing(boolean washing) {this.washing = washing;}
    public boolean isDraing() {return draing;}
    public void setDraing(boolean draing) {this.draing = draing;}
    public boolean isFixing() {return fixing;}
    public void setFixing(boolean fixing) {this.fixing = fixing;}

    @Override
    public String toString() {
        return "Hairdro{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", washing=" + washing +
                ", draing=" + draing +
                ", fixing=" + fixing +
                '}';
    }
}
