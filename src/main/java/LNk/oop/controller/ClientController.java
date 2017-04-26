package LNk.oop.controller;

import LNk.oop.model.client.Client;
import LNk.oop.service.client.impls.ClientServiceImpl;
import LNk.oop.service.client.interfaces.IClientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Lena on 25.04.2017.
 */
@RestController
public class ClientController {/*
     ApplicationContext mySpringContext = new
             ClassPathXmlApplicationContext("service-client-context.xml");
    IClientService clientService = (IClientService) mySpringContext.getBean("service_client");

    @RequestMapping ("/api/client/get_all")
    public List<Client> getAll (){
        return clientService.getAll();
    }

    @RequestMapping("/api/client/get_client__{id}")
    public  Client getClient(@PathVariable int id){
        return  clientService.getClient(id);
    }

    @RequestMapping("/api/client/create_client__{id}_{name}_{status}_{code}")
    public void createClient (@PathVariable int id, @PathVariable String name, @PathVariable int status, @PathVariable int code){
        Client client = new Client(id,name,status,code);
        clientService.createClient(client);
    }

    @RequestMapping("/api/client/update_client__{id}_{name}_{status}_{code}")
    public void updateClient (@PathVariable int id, @PathVariable String name, @PathVariable int status, @PathVariable int code){
        Client client = new Client(id,name,status,code);
        clientService.updateClient(client);
    }

    @RequestMapping("/api/client/delete_client__{id}")
    public  void  deleteClient(@PathVariable int id){
        clientService.deleteClient(id);
    }

    @RequestMapping("/api/client/hello")
    public String hello(){
        return "hello";
    }*/
}
