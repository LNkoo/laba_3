package LNk.oop;

import LNk.oop.service.bill.impls.BillServiceImpl;
import LNk.oop.service.bill.interfaces.IBillService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Lena on 01.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext mySpringContext =
                new ClassPathXmlApplicationContext("spring-context.xml");
        IBillService billManagers = (BillServiceImpl) mySpringContext.getBean("service_bill");
        billManagers.showAll();
    }
}


