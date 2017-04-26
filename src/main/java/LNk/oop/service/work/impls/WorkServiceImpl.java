package LNk.oop.service.work.impls;

import LNk.oop.dao.work.interfaces.IDaoWork;
import LNk.oop.model.work.Work;
import LNk.oop.service.work.interfaces.IWorkService;

import java.util.List;

/**
 * Created by Lena on 01.04.2017.
 */
public class WorkServiceImpl implements IWorkService {

    IDaoWork daoWork;
    public IDaoWork getDaoWork() { return  daoWork;}
    public void setDaoWork(IDaoWork daoWork) {
        this.daoWork = daoWork;
    }

    public WorkServiceImpl() {

    }

    public WorkServiceImpl(IDaoWork daoWork) {

        this.daoWork = daoWork;
    }
    @Override
    public List<Work> getAll() {
        return daoWork.getAll();
    }

    @Override
    public Work getWork(int id) {
        return daoWork.getWork(id);
    }

    @Override
    public void createWork(Work work) {
       daoWork.createWork(work);
    }

    @Override
    public void updateWork(Work work) {
        daoWork.updateWork(work);
    }

    @Override
    public void deleteWork(int id) {
        daoWork.deleteWork(id);
    }

    @Override
    public void showAll() {
        daoWork.showAll();
    }
}
