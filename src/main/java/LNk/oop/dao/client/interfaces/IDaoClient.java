package LNk.oop.dao.client.interfaces;

import LNk.oop.model.client.Client;

import java.util.List;

/**
 * Created by Lena on 01.04.2017.
 */
public interface IDaoClient {
    List<Client> getAll();
    Client getClient(int id);
    void createClient(Client client);
    void updateClient(Client client);
    void deleteClient(int id);
    void showAll();
}
