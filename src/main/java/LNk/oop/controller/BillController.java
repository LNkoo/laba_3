package LNk.oop.controller;

import LNk.oop.model.bill.Bill;
import LNk.oop.model.client.Client;
import LNk.oop.model.hairdro.Hairdro;
import LNk.oop.model.work.Work;
import LNk.oop.service.bill.impls.BillServiceImpl;
import LNk.oop.service.bill.interfaces.IBillService;
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
public class BillController {
  /*  ApplicationContext
            mySpringContext = new
            ClassPathXmlApplicationContext("services-bill-context.xml");

    IBillService billService = (BillServiceImpl) mySpringContext.getBean("service_bill");


    @RequestMapping("/api/bill/get_all")
    public List<Bill> getAll(){
        return billService.getAll();

    }


    @RequestMapping("/api/bill/get_bill__{id}")
    public Bill getBill(@PathVariable int id){
        return billService.getBill(id);

    }
    @RequestMapping("/api/bill/create_bill__{id}__client__{id1}_{name}_{status}_{code}__hairdro__{id2}_{name1}_{price}_{washing}_{draing}_{fixing}__work__{id3}_{name2}_{price1}_{date}_{code1}")
    public void createBill(@PathVariable int id ,
                           @PathVariable int id1 ,
                           @PathVariable String name ,
                           @PathVariable int status ,
                           @PathVariable int code ,
                           @PathVariable int id2 ,
                           @PathVariable String name1,
                           @PathVariable int price,
                           @PathVariable boolean washing,
                           @PathVariable boolean draing ,
                           @PathVariable boolean fixing ,
                           @PathVariable int id3 ,
                           @PathVariable String name2,
                           @PathVariable int price1,
                           @PathVariable String date,
                           @PathVariable int code1

    ){
        Client client = new Client(id1, name,status,code);
        Hairdro hairdro = new Hairdro(id2, name1,price, washing,draing, fixing );
        Work work = new Work(id3, name2, price1,date, code1);
        Bill bill = new Bill(id, client,hairdro,work);
        billService.createBill(bill);
    }

    @RequestMapping("/api/bill/update_bill__{id}__client__{id1}_{name}_{status}_{code}__hairdro__{id2}_{name1}_{price}_{washing}_{draing}_{fixing}__work__{id3}_{name2}_{price1}_{date}_{code1}")
    public void updateBill(@PathVariable int id ,
                           @PathVariable int id1 ,
                           @PathVariable String name ,
                           @PathVariable int status ,
                           @PathVariable int code ,
                           @PathVariable int id2 ,
                           @PathVariable String name1,
                           @PathVariable int price,
                           @PathVariable boolean washing,
                           @PathVariable boolean draing ,
                           @PathVariable boolean fixing ,
                           @PathVariable int id3 ,
                           @PathVariable String name2,
                           @PathVariable int price1,
                           @PathVariable String date,
                           @PathVariable int code1
    ){
        Client client = new Client(id1, name,status,code);
        Hairdro hairdro = new Hairdro(id2, name1, price,washing,draing,fixing);
        Work work = new Work(id3, name2, price1,date,code1);
        Bill bill = new Bill(id, client,hairdro,work);
        billService.updateBill(bill);
    }

    @RequestMapping("/api/bill/delete_bill__{id}")
    public void deletebill(@PathVariable int id){
        billService.deleteBill(id);

    }

    @RequestMapping("/api/bill/hello")
    public  String hello(){
        return "hello";
    }*/
}

