package LNk.oop.dao.bill.interfaces;

import LNk.oop.model.bill.Bill;

import java.util.List;

/**
 * Created by Lena on 01.04.2017.
 */
public interface IDaoBill {
    List<Bill> getAll();
    Bill getBill(int id);
    void createBill(Bill bill);
    void updateBill(Bill bill);
    void deleteBill(int id);
    void showAll();
}
