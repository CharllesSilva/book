package domain;


public abstract class User {

    private long id;
    private String name;
    private String birthDate;
    private String password;

    public User(long id, String name, String birthDate, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.birthDate = birthDate;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract String Logar(String log);{

        if ("adm123".equals(password)){
            System.out.println("Logado como administrador do site!");
        }else{
            System.out.println("logado com sucesso ");
        }

    }
}
