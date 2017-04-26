package LNk.oop.dao.work.impls;

import LNk.oop.dao.work.interfaces.IDaoWork;
import LNk.oop.model.work.Work;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lena on 01.04.2017.
 */
public class DaoWorkImpl implements IDaoWork{


    public List<Work> works = new ArrayList<Work>();

    public DaoWorkImpl(List<Work> Works) {
        this.works = works;
    }

    public DaoWorkImpl() {

    }

    public List<Work> getAll() {
        return null;
    }


    public Work getWork(int id) {

        Work result = null;
        for (Work item : works) {
            if (item.getId() == id) {
                result = new Work(
                        item.getId(),
                        item.getName(),
                        item.getPrice(),
                        item.getDate(),
                        item.getCode());
            }
        }
        return  result;
    }


    public void createWork(Work work) { works.add(work);

    }


    public void updateWork(Work work) {
        Work updateWork = null;
        for ( Work item : works) {
            if (item.getId() == work.getId()){
                updateWork = item;
                break;
            }
        }
        updateWork = work;
    }


    public void deleteWork(int id) {
        int i = 0;
        boolean is = false;
        for ( Work item : works) {
            if (item.getId() == id){
                is = true;
                break;
            }
         i++;
        }
if(is){
    works.remove(i);
}
    }


    public void showAll() {

        for (Work item: works
                ) {
            System.out.println(item.toString());
        }

    }
}
