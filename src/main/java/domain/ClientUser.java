package domain;

import java.util.Date;

public class ClientUser extends  User {

    public ClientUser(long id, String name, String birthDate, String password) {
        super(id, name, birthDate, password);

    }

    @Override
    public String Logar(String log) {
        return null;
    }
}
