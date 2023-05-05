package Solution;

import java.util.LinkedList;

public class Playlist {

	public String name;
	public LinkedList<Songs> songsList;
	public final int playListCapacity = 5;

	public Playlist(String name, LinkedList<Songs> songs) {
		this.name = name;
		this.songsList = songs;
	}

	public String getName() {
		return name;
	}

	public boolean searchPlaylist(String name) {
		for (Songs song : songsList) {
			if (song.getSongName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	public LinkedList<Songs> addSongsToPlayList(Songs song) {
		if (this.searchPlaylist(song.getSongName()) == true) {
			int index = songsList.indexOf(song);
			songsList.remove(index);
			songsList.add(song);
		} else {
			int size = songsList.size();
			if (size < playListCapacity) {
				songsList.add(song);
			} else {
				songsList.remove();
				songsList.add(song);
			}
		}
		 return songsList;
	}

	public void printCurrentPlaylist(LinkedList<Songs> currentPlaylist) {
		System.out.print("Current playlist after adding one more song: ");
		for(Songs song: currentPlaylist) {
			System.out.print(song.getSongName()+" ");
		}
	}

}
