class Song {
    String title;
    int lenInSeconds;  // duration of the song
    Album onAlbum;

    Song (String title, Integer lenInSeconds, Album album) {
        this.title = title;
        this.lenInSeconds = lenInSeconds;
        this.onAlbum = album;
    }
}