package LNk.oop.dao.work.interfaces;

import LNk.oop.model.work.Work;

import java.util.List;

/**
 * Created by Lena on 01.04.2017.
 */
public interface IDaoWork {
    List<Work> getAll();
    Work getWork(int id);
    void createWork(Work work);
    void updateWork(Work work);
    void deleteWork(int id);
    void showAll();
}
