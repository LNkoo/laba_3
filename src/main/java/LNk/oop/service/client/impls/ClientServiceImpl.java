package LNk.oop.service.client.impls;

import LNk.oop.dao.client.interfaces.IDaoClient;
import LNk.oop.model.client.Client;

import java.util.List;

/**
 * Created by Lena on 01.04.2017.
 */
public class ClientServiceImpl implements IDaoClient{
    IDaoClient daoClient;

    public IDaoClient getDaoClient() {
        return daoClient;
    }

    public void setDaoClient(IDaoClient daoClient) {
        this.daoClient = daoClient;
    }

    public ClientServiceImpl() {

    }

    public ClientServiceImpl(IDaoClient daoClient) {

        this.daoClient = daoClient;
    }
    @Override
    public List<Client> getAll() {
        return daoClient.getAll();
    }
    @Override
    public Client getClient(int id) {

        return daoClient.getClient(id);
    }

    @Override
    public void createClient(Client client) {
        daoClient.createClient(client);
    }
    @Override
    public void updateClient(Client client) {
        daoClient.updateClient(client);
    }
    @Override
    public void deleteClient(int id) {
        daoClient.deleteClient(id);
    }
    @Override
    public void showAll() {
        daoClient.showAll();
    }
}
