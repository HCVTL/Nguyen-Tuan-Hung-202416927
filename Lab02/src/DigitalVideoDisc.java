public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int ID;

    public String getTitle() { return title;}
    public String getCategory() {return category;}
    public String getDirector() {return director;}
    public int getLength() {return length;}
    public float getCost() {return cost;}

    public int getID() { return ID; }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(int ID, String title, String category, float cost) {
        this.ID = ID;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(int ID, String title, String category, String director, int length, float cost) {
        this.ID = ID;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        DigitalVideoDisc other = (DigitalVideoDisc) obj;
        return this.title != null && this.title.equals(other.title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String DVDtoString() {
        String res  = this.title + " - " + this.category + " - " + this.director +
                " - " + this.length + ": " + this.cost + "$";

        return res;
    }

}
