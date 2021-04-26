package domain.book;

public class DigitalBook extends Book {
    public DigitalBook(long id, String gender, String author, int numberSerial) {
        super(id, gender, author, numberSerial);
    }

    @Override
    public boolean Available(String avail) {
        return false;
    }

}
