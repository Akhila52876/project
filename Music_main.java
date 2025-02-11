package collections;

public class Music_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Music_library music=new Music_library(null);
           
            music.addsong("Maha Abutham", "Anirudh");
            music.addsong("Let Me Love You", "Justin Bieber");
            music.addsong("Believer", "Imagine Dragons");
            music.addsong("Illegal Weapon", "Jasmine Sandlas");
            music.addsong("Run away","Aurora");

            music.displaysong();
            music.removeSong(3);
            music.displaysong();
            music.playRandom();
         
            Music obj =new Music("Sid Sri Ram","Oh baby");
            obj.setArtist("Sid Sri Ram");
            obj.getArtist();
            obj.setTitle("Oh Baby");
            obj.getTitle();
            obj.toString();	
            }

}
