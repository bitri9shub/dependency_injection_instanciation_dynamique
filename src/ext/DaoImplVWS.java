package ext;

import dao.IDao;

public class DaoImplVWS implements IDao {

    @Override
    public double getData() {
        IO.println("Version Web Services");
        return 90;
    }
}
