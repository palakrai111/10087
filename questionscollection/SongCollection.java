package in.sp.questionscollection;

import java.util.ArrayList;
import java.util.Random;

public class SongCollection {
	ArrayList<Song> songs; 
	SongCollection()
	{
		songs = new ArrayList<Song>();
	}
	
	void addSong(Song s)
	{
		songs.add(s);
	}
    void removeSong(Song s)
    {
    	songs.remove(s);
    }
    void playRandomSong()
    {
    	int size = songs.size();
    	Random r = new Random(); 
    	int index = r.nextInt(size);
    	Song s = songs.get(index);
    	System.out.println(s.getArtist() + " "+s.getTitle());
    	
     
    }
    
    ArrayList<Song> getALlSongs()
    {
    	return songs;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SongCollection ob = new SongCollection();
		Song s1 = new Song("Abhijeet", "abcabc");
		Song s2 = new Song("Alizee", "tatata");
		Song s3 = new Song("Arijeet", "sanam");
		ob.addSong(s1);
		ob.addSong(s2);
		ob.addSong(s3);
		System.out.println("display songs");
		for(Song s:ob.getALlSongs())
		{
			System.out.println(s);
		}
		System.out.println("remove songs");
		ob.removeSong(s3);
		for(Song s:ob.getALlSongs())
		{
			System.out.println(s);
		}
		System.out.println("play first random songs");
		ob.playRandomSong();
		System.out.println("play second random songs");
		ob.playRandomSong();
		
		
	}

}
