
public class Main {
    public static void main(String[] args) {
        DoublyLinkedPlaylist playlist = new DoublyLinkedPlaylist();


        playlist.addSong("Sting - Shape of My heart");
        playlist.addSong("Steelheart - She's gone");
        playlist.addSong("Bill Withers - Ain't No Sunshine");


        playlist.printPlaylist();


        System.out.println("\n--- Hareket ---");
        playlist.nextSong();
        playlist.nextSong();
        playlist.previousSong();

        System.out.println("\n--- Silme ---");
        playlist.removeCurrent();


        System.out.println("\n--- Son Durum ---");
        playlist.printPlaylist();
    }
}