package LNk.oop.model;

import LNk.oop.model.bill.Bill;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lena on 01.04.2017.
 */
public class BillManagers {
    List<Bill> list = new ArrayList<Bill>();

    public List<Bill> getList() {
        return list;
    }

    public void setList(List<Bill> list) {
        this.list = list;
    }

    public BillManagers() {

    }

    public BillManagers(List<Bill> list) {

        this.list = list;
    }
}
