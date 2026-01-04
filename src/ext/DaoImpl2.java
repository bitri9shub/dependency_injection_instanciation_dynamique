package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        IO.println("Version Capteurs");
        return 6000;
    }
}
