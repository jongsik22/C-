class Song{
	String title, artist, country;
	int year;
	public Song() {}
	public Song(String t, String a, int y, String c) {title = t; artist = a; year = y; country = c;}
	void show() {System.out.print(year + "�� " + country + "������ " + artist + "�� �θ� " + title);}
}

public class Main {

	public static void main(String[] args) {
		Song s = new Song("Dancing Queen", "ABBA", 1978, "������");
		s.show();
	}

}
