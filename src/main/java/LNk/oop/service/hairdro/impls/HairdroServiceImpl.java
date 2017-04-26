package LNk.oop.service.hairdro.impls;

import LNk.oop.dao.hairdro.interfaces.IDaoHairdro;
import LNk.oop.model.hairdro.Hairdro;
import LNk.oop.service.hairdro.interfaces.IHairdroService;

import java.util.List;

/**
 * Created by Lena on 01.04.2017.
 */
public class HairdroServiceImpl implements IHairdroService{
    IDaoHairdro daoHairdro;

    public IDaoHairdro getDaoHairdro() {
        return daoHairdro;
    }

    public void setDaoHairdro(IDaoHairdro daoHairdro) {
        this.daoHairdro = daoHairdro;
    }

    public HairdroServiceImpl() {

    }

    public HairdroServiceImpl(IDaoHairdro daoHairdro) {

        this.daoHairdro = daoHairdro;
    }


    public List<Hairdro> getAll() {
        return daoHairdro.getAll();
    }

    public Hairdro getHairdro(int id) {
        return daoHairdro.getHairdro(id);
    }

    public void createHairdro(Hairdro hairdro) {
        daoHairdro.createHairdro(hairdro);
    }

    public void updateHairdro(Hairdro hairdro) {
        daoHairdro.updateHairdro(hairdro);
    }

    public void deleteHairdro(int id) {
        daoHairdro.deleteHairdro(id);
    }

    public void showAll() {
        daoHairdro.showAll();
    }

    @Override
    public int getAmountOfAllBills() {
        return daoHairdro.getAll().size();
    }
}
