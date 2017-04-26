package LNk.oop.service.hairdro.interfaces;

import LNk.oop.model.hairdro.Hairdro;

import java.util.List;

/**
 * Created by Lena on 01.04.2017.
 */
public interface IHairdroService {
    List<Hairdro> getAll();
    Hairdro getHairdro(int id);
    void createHairdro (Hairdro hairdro);
    void updateHairdro(Hairdro hairdro);
    void deleteHairdro(int id);
    void showAll();
    int getAmountOfAllBills();
}
