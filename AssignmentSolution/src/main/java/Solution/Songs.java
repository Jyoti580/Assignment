package Solution;

public class Songs {
	public int songDuration;
	public String songName;
	
	public Songs(String songName, int songDuration) {
		this.songName = songName;
		this.songDuration = songDuration;		
	}

	public int getSongDuration() {
		return songDuration;
	}

	public void setSongDuration(int songDuration) {
		this.songDuration = songDuration;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

}
