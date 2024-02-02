import java.util.ArrayList;

class MusicalMedia {
    private String author;
    private String genre;
    private int year;
    private ArrayList<MusicalWork> musicalWorks;

    public MusicalMedia(String author, String genre, int year) {
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.musicalWorks = new ArrayList<>();
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public ArrayList<MusicalWork> getMusicalWorks() {
        return musicalWorks;
    }

    public void addMusicalWork(MusicalWork work) {
        musicalWorks.add(work);
    }

    public void removeMusicalWork(MusicalWork work) {
        musicalWorks.remove(work);
    }

    public int getTotalDuration() {
        int totalDuration = 0;
        for (MusicalWork work : musicalWorks) {
            totalDuration += work.getDuration();
        }
        return totalDuration;
    }
}
