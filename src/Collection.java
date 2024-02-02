import java.util.ArrayList;

class Collection {
    private String name;
    private String owner;
    private ArrayList<MusicalMedia> media;

    public Collection(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.media = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public ArrayList<MusicalMedia> getMedia() {
        return media;
    }

    public void addMedia(MusicalMedia media) {
        this.media.add(media);
    }

    public void removeMedia(MusicalMedia media) {
        this.media.remove(media);
    }

    public MusicalWork searchMusicByTitle(String title) {
        for (MusicalMedia media : media) {
            for (MusicalWork work : media.getMusicalWorks()) {
                if (work.getName().equals(title)) {
                    return work;
                }
            }
        }
        return null;
    }
}
