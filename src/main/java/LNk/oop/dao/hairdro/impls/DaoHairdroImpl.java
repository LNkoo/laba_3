package LNk.oop.dao.hairdro.impls;

import LNk.oop.dao.hairdro.interfaces.IDaoHairdro;
import LNk.oop.model.client.Client;
import LNk.oop.model.hairdro.Hairdro;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lena on 01.04.2017.
 */
public class DaoHairdroImpl implements IDaoHairdro {

    public List<Hairdro> hairdros = new ArrayList<Hairdro>();

    public DaoHairdroImpl(List<Hairdro> hairdros) {
        this.hairdros = hairdros;
    }

    public DaoHairdroImpl() {
    }

    public List<Hairdro> getHaidro() {
        return hairdros;
    }

    public void setHairdros(List<Hairdro> hairdros) {
        this.hairdros = hairdros;
    }



    public List<Hairdro> getAll() {

        return hairdros;
    }


    public Hairdro getHairdro(int id) {
       Hairdro result = null;
        for (Hairdro item : hairdros) {
            if (item.getId() == id){
                result = new Hairdro(
                        item.getId(),
                        item.getName(),
                        item.getPrice(),
                        item.isWashing(),
                        item.isDraing(),
                        item.isFixing());
            }
        }
        return  result;
    }


    public void createHairdro(Hairdro hairdro) {hairdros.add(hairdro);}


    public void updateHairdro(Hairdro hairdro) {
        Hairdro updateHairdro = null;
        for (Hairdro item : hairdros) {
            if (item.getId() == hairdro.getId()){
                updateHairdro = item;
                break;
            }
        }
        updateHairdro = hairdro;
    }


    public void deleteHairdro(int id) {
        int i =0;
        boolean is = false;
        for ( Hairdro item : hairdros) {
            if (item.getId() == id){
                is = true;
                break;
            }
            i++;
        }
        if (is){
            hairdros.remove(i);
        }
    }


    public void showAll() {
        for (Hairdro item: hairdros
                ) {
            System.out.println(item.toString());
        }
    }
}
