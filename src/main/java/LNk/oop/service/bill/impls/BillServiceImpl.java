package LNk.oop.service.bill.impls;

import LNk.oop.dao.bill.interfaces.IDaoBill;
import LNk.oop.model.bill.Bill;
import LNk.oop.service.bill.interfaces.IBillService;

import java.util.List;

/**
 * Created by Lena on 01.04.2017.
 */
public class BillServiceImpl implements IBillService{
    IDaoBill daoBill;
    public IDaoBill getDaoBill() {
        return daoBill;
    }

    public void setDaoBill(IDaoBill daoBill) {
        this.daoBill = daoBill;
    }

    public BillServiceImpl() {

    }

    public BillServiceImpl(IDaoBill daoBill) {

        this.daoBill = daoBill;
    }

    @Override
    public List<Bill> getAll() {
        return daoBill.getAll();
    }

    @Override
    public Bill getBill(int id) {
        return daoBill.getBill(id);

    }
    @Override
    public void createBill(Bill bill) {
        daoBill.createBill(bill);

    }

    @Override
    public void updateBill(Bill bill) {
        daoBill.updateBill(bill);
    }

    @Override
    public void deleteBill(int id) {
        daoBill.deleteBill(id);
    }

    @Override
    public void showAll() {
        daoBill.showAll();
    }

    @Override
    public int getSumOfAllClients() {return 0;}
    @Override
    public int getSumForWomensHaircat() {return 0;}
    @Override
    public int getSumMensHaircat() {return 0;}
    @Override
    public int getNumberOfClients() {return 0;}
    @Override
    public int getRevenuesForTheMonthWithClients() {return 0;}
}
