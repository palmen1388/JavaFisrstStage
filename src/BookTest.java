import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void getName() {
        Book book = new Book();
        book.setName("Bible");
        assertEquals("Bible",book.getName());
    }

    @Test
    public void setName() {
        Book book = new Book();
        book.setName("Bible");
        assertEquals("Bible",book.getName());
    }

    @Test
    public void getNumberOfPages() {
        Book book = new Book();
        book.setNumberOfPages(150);
        assertEquals(150,book.getNumberOfPages());
    }

    @Test
    public void setNumberOfPages() {
        Book book = new Book();
        book.setNumberOfPages(150);
        assertEquals(150,book.getNumberOfPages());
    }

    @Test
    public void getYearOfRelease() {
        Book book = new Book();
        book.setYearOfRelease(0);
        assertEquals(0,book.getYearOfRelease());
    }

    @Test
    public void setYearOfRelease() {
        Book book = new Book();
        book.setYearOfRelease(0);
        assertEquals(0,book.getYearOfRelease());
    }

    @Test
    public void getAuthor() {
        Book book = new Book();
        book.setAuthor("God");
        assertEquals("God",book.getAuthor());
    }

    @Test
    public void setAuthor() {
        Book book = new Book();
        book.setAuthor("God");
        assertEquals("God",book.getAuthor());
    }
}