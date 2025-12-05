
class Song {
    String title;
    Song prev;
    Song next;

    public Song(String title) {
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}