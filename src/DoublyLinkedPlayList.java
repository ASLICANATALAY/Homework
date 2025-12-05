// Sınıf 2: DoublyLinkedPlaylist (Ana Yapı Kısmı)
class DoublyLinkedPlaylist {
    private Song head;
    private Song tail;
    private Song current; // O an çalınan şarkı

    // Şarkı ekleme (listenin sonunda)
    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = tail = current = newSong;
            return;
        }
        tail.next = newSong;
        newSong.prev = tail;
        tail = newSong;
    }

    // İleri Gitme Metodu (Sizin Verdiğiniz Kod)
    public void nextSong() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("NS : Now playing: " + current.title);
        } else {
            System.out.println("End of playlist. Can't move forward.");
        }
    }

    // Geri Gitme Metodu (Sizin Verdiğiniz Kod)
    public void previousSong() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("PS : Now playing: " + current.title);
        } else {
            System.out.println("Start of playlist. Can't move backward.");
        }
    }

    // Şarkı Silme Metodu (İlk Kod Parçanızdan)
    public void removeCurrent() {
        if (current == null) return;

        System.out.println("Removing: " + current.title);

        if (current.prev != null)
            current.prev.next = current.next;
        else
            head = current.next; // removing head

        if (current.next != null)
            current.next.prev = current.prev;
        else
            tail = current.prev; // removing tail

        // Yeni current'ı ayarla (varsa bir sonraki, yoksa başa sar)
        current = current.next != null ? current.next : head;
    }

    // Listeyi Yazdırma Metodu (İlk Kod Parçanızdan)
    public void printPlaylist() {
        Song temp = head;
        System.out.print("Playlist: ");
        while (temp != null) {
            System.out.print(temp.title + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

