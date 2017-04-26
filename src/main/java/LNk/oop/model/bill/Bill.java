package LNk.oop.model.bill;

import LNk.oop.model.client.Client;
import LNk.oop.model.hairdro.Hairdro;
import LNk.oop.model.work.Work;

/**
 * Created by Lena on 01.04.2017.
 */
public class Bill {
    int id;
    Client client;
    Hairdro hairdro;
    Work work;

    public Bill() { }

    public Bill(int id, Client client, Hairdro hairdro, Work work) {
        this.id = id;
        this.client = client;
        this.hairdro = hairdro;
        this.work = work;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public Client getClient() { return client; }
    public void setClient(Client client) {this.client = client;}
    public Hairdro getHairdro() {return hairdro;}
    public void setHairdro(Hairdro hairdro) {this.hairdro = hairdro;}
    public Work getWork() {return work;}
    public void setWork(Work work) {this.work = work;}

    @Override
    public String toString() {
        return "\n Bill{" +
                "id=" + id +
                ", \n client=" + client.toString() +
                ", \n hairdro=" + hairdro.toString() +
                ", \n work=" + work.toString() +
                '}';
    }


}
