import org.junit.Test;
import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void getName() {
        Movie movie = new Movie();
        movie.setName("Terminator");
        assertEquals("Terminator", movie.getName());
    }

    @Test
    public void setName() {
        Movie movie = new Movie();
        movie.setName("Terminator");
        assertEquals("Terminator", movie.getName());
    }

    @Test
    public void getDuration() {
        Movie movie = new Movie();
        movie.setDuration(40000);
        assertEquals(40000, movie.getDuration());
    }

    @Test
    public void setDuration() {
        Movie movie = new Movie();
        movie.setDuration(40000);
        assertEquals(40000, movie.getDuration());
    }

    @Test
    public void getDirector() {
        Movie movie = new Movie();
        movie.setDirector("D.Kameron");
        assertEquals("D.Kameron", movie.getDirector());
    }

    @Test
    public void setDirector() {
        Movie movie = new Movie();
        movie.setDirector("D.Kameron");
        assertEquals("D.Kameron", movie.getDirector());
    }
}