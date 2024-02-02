public class Main {
    public static void main(String[] args) {

        Collection myCollection = new Collection("My Playlist", "John Doe");

        MusicalMedia album1 = new MusicalMedia("Artist1", "Rock", 2020);
        MusicalMedia album2 = new MusicalMedia("Artist2", "Pop", 2021);

        MusicalWork work1 = new MusicalWork("Song1", 180, album1);
        MusicalWork work2 = new MusicalWork("Song2", 200, album1);
        MusicalWork work3 = new MusicalWork("Song3", 150, album2);

        // Add media to the collection
        myCollection.addMedia(album1);
        myCollection.addMedia(album2);

        album1.addMusicalWork(work1);
        album1.addMusicalWork(work2);
        album2.addMusicalWork(work3);


        System.out.println("Collection: " + myCollection.getName() + " - Owner: " + myCollection.getOwner());

        for (MusicalMedia media : myCollection.getMedia()) {
            System.out.println("\nAlbum: " + media.getAuthor() + " - Genre: " + media.getGenre() + " - Year: " + media.getYear());

            for (MusicalWork work : media.getMusicalWorks()) {
                System.out.println("   - " + work.getName() + " (" + work.getDuration() + " seconds)");
            }

            System.out.println("Total Duration of Album: " + media.getTotalDuration() + " seconds\n");
        }


        String titleToSearch = "Song2";
        MusicalWork foundWork = myCollection.searchMusicByTitle(titleToSearch);

        if (foundWork != null) {
            System.out.println("\nFound work: " + foundWork.getName() + " in Album: " + foundWork.getMedia().getAuthor());
        } else {
            System.out.println("\nWork with title '" + titleToSearch + "' not found.");
        }
    }
}
