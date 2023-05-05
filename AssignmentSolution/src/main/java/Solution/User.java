package Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class User {
	public static int userId=100;

	public User() {
		userId++;
	}

	public Playlist createPlayListForAnUser(ArrayList<Songs> songAlbum,Playlist playlist) {
		
		LinkedList<Songs> currentList = null;
		for (int i = 0; i <= 6; i++) {
			currentList = playlist.addSongsToPlayList(songAlbum.get(i));
			playlist.printCurrentPlaylist(currentList);
			System.out.println(" ");
		}
		return playlist;

	}
}
