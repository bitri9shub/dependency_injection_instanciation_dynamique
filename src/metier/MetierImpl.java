package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao; // couplage faible
    @Override
    public double calcul() {
        double tmp = dao.getData();
        return tmp*540/Math.cos(Math.PI*tmp);
    }

    /*
    Injecter dans la variable dao un objet d'une
    classe qui implément l'interface IDao
     */
    public void setDao(IDao dao){
        this.dao = dao;
    }
}
