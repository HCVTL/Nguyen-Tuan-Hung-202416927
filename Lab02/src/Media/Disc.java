package Media;

public class Disc extends Media{
    protected int length;
    protected String director;

    public Disc() {
        super();
    }

    public Disc(int length, String director) {
        super();
        this.length = length;
        this.director = director;
    }

    public Disc(int id, String title, String category, float cost, int length, String director) {
        this.setId(id);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        this.length = length;
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int lenght) {
        this.length = lenght;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
