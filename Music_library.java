package collections;

import java.util.ArrayList;
import java.util.Random;

public class Music_library {
       ArrayList<Music> songs;

	 Music_library(ArrayList<String> songs) {
		super();
		this.songs = new ArrayList<>();
	}
	void addsong(String title,String artist)
	{
		songs.add(new Music(title,artist));
	}
	void removeSong(int a)
	{
		songs.remove(a);
	}
	 void displaysong()
	 {
		 System.out.println("--------------Musics------------");
		 for(Music s:songs)
		 {
			 System.out.println(s);
		 }
	 }
	 void playRandom()
	 {
		 Random r=new Random();
		 System.out.println("------------------Random Songs----------");
		
		 for(int i=0;i<3;i++)
		 {
			 int index=r.nextInt(songs.size());
			 System.out.println(songs.get(index));
		
		 }
		 }
       
}
