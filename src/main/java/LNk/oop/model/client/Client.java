package LNk.oop.model.client;

/**
 * Created by Lena on 01.04.2017.
 */
public class Client {

    int id;
    String name;
    int status;
    int code;
    public Client() { }

    //public Client(int id1, String name, String s, int status, int code) { }

    public Client(int id, String name, int status, int code) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.code = code;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getStatus() {return status;}
    public void setStatus(int status) {this.status = status;}
    public int getCode() {return code;}
    public void setCode(int code) {this.code = code;}

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", code=" + code +
                '}';
    }

}
