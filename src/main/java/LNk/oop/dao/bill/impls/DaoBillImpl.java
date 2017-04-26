package LNk.oop.dao.bill.impls;

import LNk.oop.dao.bill.interfaces.IDaoBill;
import LNk.oop.model.bill.Bill;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lena on 01.04.2017.
 */
public class DaoBillImpl implements IDaoBill {
    public List<Bill> bills = new ArrayList<Bill>();

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }



    public DaoBillImpl() {

    }

    public DaoBillImpl(List<Bill> bills) {

        this.bills = bills;
    }


    public List<Bill> getAll() {
        return bills;
    }


    public Bill getBill(int id) {
        Bill result = null;
        for (  Bill item: bills
                ) {
            if (item.getId() == id){
                result = new Bill(

                );
            }
        }
        return result;
    }


    public void createBill(Bill bill) {
        bills.add(bill);
    }


    public void updateBill(Bill bill) {
        Bill updateBill = null;
        for (Bill item : bills) {
            if (item.getId() == bill.getId()) {
                updateBill = item;
                break;

            }
        }
        updateBill = bill;
    }


    public void deleteBill(int id) {
        int i = 0;
        boolean is = false;
        for (Bill item : bills) {
            if (item.getId() == id) {
                is = true;
                break;
            }
            i++;
        }
        if (is){bills.remove(i);}
    }


    public void showAll() {
        for (Bill item: bills
                ) {
            System.out.println(item.toString());
        }
    }
}
