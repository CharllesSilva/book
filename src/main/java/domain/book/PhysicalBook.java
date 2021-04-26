package domain.book;

public class PhysicalBook extends Book{
    public PhysicalBook(long id, String gender, String author, int numberSerial) {
        super(id, gender, author, numberSerial);
    }

    @Override
    public boolean Available(String avail) {

        return false;
    }
}
