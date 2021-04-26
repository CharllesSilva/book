package domain;

import java.util.Date;


public class AdmUser extends User {
    private boolean acess;
    public AdmUser(long id, String name, String birthDate, String password) {
        super(id, name, birthDate, password);
    }

    @Override
    public String Logar(String log) {
        return null ;
    }




}
