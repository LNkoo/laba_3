package LNk.oop.controller;

import LNk.oop.model.hairdro.Hairdro;
import LNk.oop.service.hairdro.impls.HairdroServiceImpl;
import LNk.oop.service.hairdro.interfaces.IHairdroService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.support.ChainedPersistenceExceptionTranslator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Lena on 25.04.2017.
 */
@RestController
public class HairdroController {
/*
    ApplicationContext mySpringContext = new
            ClassPathXmlApplicationContext("service-hairdro-context.xml");
    IHairdroService hairdroService = (HairdroServiceImpl) mySpringContext.getBean("service_hair");

    @RequestMapping("/api/hairdro/get_all")
    public List<Hairdro> getAll (){
        return hairdroService.getAll();
    }

    @RequestMapping("/api/hairdro/get_haidro__{id}")
    public  Hairdro getHairdro (@PathVariable int id){
        return  hairdroService.getHairdro(id);
    }

    @RequestMapping("/api/hairdro/create_hairdro__{id}_{name}_{price}_{washing}_{draing}_{fixing}")
    public void createHairdro (@PathVariable int id, @PathVariable String name, @PathVariable int price, @PathVariable boolean washing, @PathVariable boolean draing, @PathVariable boolean fixing){
        Hairdro hairdro = new Hairdro(id,name,price,washing,draing,fixing);
        hairdroService.createHairdro(hairdro);
    }

    @RequestMapping("/api/hairdro/update_hairdro__{id}_{name}_{price}_{washing}_{draing}_{fixing}")
    public void updateClient (@PathVariable int id, @PathVariable String name, @PathVariable int price, @PathVariable boolean washing, @PathVariable boolean draing,@PathVariable boolean fixing){
        Hairdro hairdro = new Hairdro(id,name,price,washing,draing,fixing);
        hairdroService.updateHairdro(hairdro);
    }

    @RequestMapping("/api/hairdro/delete_hairdro__{id}")
    public  void  deleteHairdro(@PathVariable int id){
        hairdroService.deleteHairdro(id);
    }

    @RequestMapping("/api/hairdro/hello")
    public String hello() {
        return "hello";
    }*/
}


