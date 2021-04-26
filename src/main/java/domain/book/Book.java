package domain.book;

public abstract class Book {
    private long id;
    private String gender;
    private String author;
    private int numberSerial;

    public Book(long id, String gender, String author, int numberSerial) {
        this.id = id;
        this.gender = gender;
        this.author = author;
        this.numberSerial = numberSerial;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberSerial() {
        return numberSerial;
    }

    public void setNumberSerial(int numberSerial) {
        this.numberSerial = numberSerial;
    }

    public abstract boolean Available(String avail); {
    }

}
