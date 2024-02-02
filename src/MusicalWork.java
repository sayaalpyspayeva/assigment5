class MusicalWork {
    private String name;
    private int duration;
    private MusicalMedia media;

    public MusicalWork(String name, int duration, MusicalMedia media) {
        this.name = name;
        this.duration = duration;
        this.media = media;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public MusicalMedia getMedia() {
        return media;
    }
}
