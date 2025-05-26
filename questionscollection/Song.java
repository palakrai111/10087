package in.sp.questionscollection;

public class Song 
{
	String artist;
	String title;
	@Override
	public String toString() {
		return "Song [artist=" + artist + ", title=" + title + "]";
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Song(String artist, String title) {
		super();
		this.artist = artist;
		this.title = title;
	}
	

}
