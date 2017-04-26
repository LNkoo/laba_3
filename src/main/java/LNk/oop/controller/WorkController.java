package LNk.oop.controller;

import LNk.oop.model.work.Work;
import LNk.oop.service.work.impls.WorkServiceImpl;
import LNk.oop.service.work.interfaces.IWorkService;
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
public class WorkController {/*
    ApplicationContext
            mySpringContext = new
            ClassPathXmlApplicationContext("service-work-context.xml");

    IWorkService workService = (WorkServiceImpl) mySpringContext.getBean("services_work");


    @RequestMapping("/api/work/get_all")
    public List<Work> getAll(){
        return workService.getAll();

    }


    @RequestMapping("/api/work/get_work__{id}")
    public Work getWork (@PathVariable int id){
        return workService.getWork(id);

    }

    @RequestMapping("/api/work/create_work__{id}_{name}_{price}_{date}_{code}")
    public void createSpa(@PathVariable int id ,@PathVariable String name ,@PathVariable int price, @PathVariable String date, @PathVariable int code){
        Work work = new Work(id, name, price,date,code);
        workService.createWork(work);
    }

    @RequestMapping("/api/work/update_work__{id}_{name}_{price}_{date}_{code}")
    public void updateSpa(@PathVariable int id ,@PathVariable String name ,@PathVariable int price, @PathVariable String date, @PathVariable int code){
        Work work = new Work(id, name, price,date,code);
        workService.updateWork(work);
    }

    @RequestMapping("/api/work/delete_work__{id}")
    public void deleteWork(@PathVariable int id){
        workService.deleteWork(id);

    }

    @RequestMapping("/api/work/hello")
    public  String hello(){
        return "hello";
    }*/
}


