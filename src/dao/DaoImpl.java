package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
        Se connecter à la BD pour récupérer la température
        */
        IO.println("Version BD");
        return Math.random()*40;
    }
}
