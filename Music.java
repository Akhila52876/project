package collections;

public class Music {

	private String Title;
	 private String Artist;
	 
	public Music(String title, String artist) {
		this.Title = title;
		this.Artist = artist;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getArtist() {
		return Artist;
	}

	public void setArtist(String artist) {
		Artist = artist;
	}
	 
	public String toString()
	{
		return Title + " - " +Artist;
		}
}
	