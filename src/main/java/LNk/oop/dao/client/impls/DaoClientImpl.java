package LNk.oop.dao.client.impls;

import LNk.oop.dao.client.interfaces.IDaoClient;
import LNk.oop.model.client.Client;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lena on 01.04.2017.
 */
public class DaoClientImpl implements IDaoClient{

    public List<Client> getClients() {
        return clients;
    }
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
    public DaoClientImpl() {

    }
    public DaoClientImpl(List<Client> clients) {

        this.clients = clients;
    }


    public List<Client> clients = new ArrayList<Client>();

    public List<Client> getAll() {return clients; }


    public Client getClient(int id) {
        Client result = null;

        for (Client item : clients
                ) {
            if ((item.getId() == id)) {
                result = new Client(
                        item.getId(),
                        item.getName(),
                        item.getStatus(),
                        item.getCode());
            }

        }
        return result;
    }

    public void createClient(Client client) { clients.add(client);}

    public void updateClient(Client client) {
    Client updateClient = null;
        for (Client item: clients)
        {
            if (item.getId()==client.getId()) {
                updateClient = item;
                break;
            }
        }
        updateClient = client;
    }

    public void deleteClient(int id) {
        int i = 0;
        boolean is = false;
        for ( Client item :clients) {
            if (item.getId() == id){
                is = true;
                break;
            }
            i++;
        }
if (is){
    clients.remove(i);
}
    }


    public void showAll() {
        for (Client item: clients
             ) {
            System.out.println(item.toString());

        }

    }
}
