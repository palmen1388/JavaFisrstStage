public class Movie {
    String name;
    int duration;
    String director;

    Movie () {

    }

    Movie (String name, int duration, String director){
        this.name = name;
        this.duration = duration;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
