package LNk.oop.model.work;

/**
 * Created by Lena on 01.04.2017.
 */
public class Work {
    int id;
    String name;
    int price;
    String date;
    int code;

    public  Work (){}
    //public Work(int id3, String date, int price1) {    }

    public Work(int id, String name, int price, String date, int code) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.date = date;
        this.code = code;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}
    public String getDate() {return date;}
    public void setDate(String date) {this.date = date;}
    public int getCode() {return code;}
    public void setCode(int code) {this.code = code;}

    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", code=" + code +
                '}';
    }
}
