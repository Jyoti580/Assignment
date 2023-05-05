package Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class InMemoryStore {

	public static void main(String[] args) {

		ArrayList<Songs> songAlbum = createAlbumOfSongs();

		Map<Integer, Playlist> songUserPairList = new HashMap<Integer, Playlist>();

		User user1 = new User();
		Playlist p1 = new Playlist("playlist1", new LinkedList<Songs>());

		Playlist currentList = user1.createPlayListForAnUser(songAlbum, p1);
		songUserPairList.put(user1.userId, currentList);

		Collections.shuffle(songAlbum);

		User user2 = new User();
		Playlist p2 = new Playlist("playlist2", new LinkedList<Songs>());

		Playlist currentList2 = user2.createPlayListForAnUser(songAlbum, p2);
		songUserPairList.put(user2.userId, currentList2);

		displayFinalUserPlaylistPairDetails(songUserPairList);
	}

	private static void displayFinalUserPlaylistPairDetails(Map<Integer, Playlist> songUserPairList) {
		Set<Integer> keys = songUserPairList.keySet();
		for (Integer key : keys) {
			System.out.println("\nUser ID: " + key);
			LinkedList<Songs> p = songUserPairList.get(key).songsList;
			System.out.println("Playlist name: " + songUserPairList.get(key).getName());
			System.out.print("Songs in the playlist: ");
			for (Songs song : p) {
				System.out.print(song.songName + " ");
			}
			System.out.println("\n--------------------------------------");
		}

	}

	private static ArrayList<Songs> createAlbumOfSongs() {
		Songs s1 = new Songs("S1", 5);
		Songs s2 = new Songs("S2", 4);
		Songs s3 = new Songs("S3", 2);
		Songs s4 = new Songs("S4", 7);
		Songs s5 = new Songs("S5", 4);
		Songs s6 = new Songs("S6", 3);
		Songs s7 = new Songs("S7", 1);

		ArrayList<Songs> songAlbum = new ArrayList<Songs>();
		songAlbum.add(s1);
		songAlbum.add(s2);
		songAlbum.add(s3);
		songAlbum.add(s4);
		songAlbum.add(s5);
		songAlbum.add(s6);
		songAlbum.add(s7);

		return songAlbum;
	}

}

/*public void testAddSongs() {
Playlist playlist1 = new Playlist();
Songs song1 = new Songs();
Songs song2 = new Songs();
Songs song3 = new Songs();
Songs song4 = new Songs();
Songs song5 = new Songs();
Songs song6 = new Songs();

playlist1.addSongsToPlayList(song1);
playlist1.addSongsToPlayList(song2);
playlist1.addSongsToPlayList(song3);
playlist1.addSongsToPlayList(song4);
LinkedList<Songs> currentPlaylist= playlist1.addSongsToPlayList(song5);
LinkedList<Songs> finalPlaylist = playlist1.addSongsToPlayList(song6);

LinkedList<Songs> ExpectedCurrentPlaylist = new LinkedList<Songs>();
ExpectedCurrentPlaylist.add(song1);
ExpectedCurrentPlaylist.add(song2);
ExpectedCurrentPlaylist.add(song3);
ExpectedCurrentPlaylist.add(song4);
ExpectedCurrentPlaylist.add(song5);

LinkedList<Songs> currentPlaylist = new LinkedList<Songs>();
currentPlaylist.add(song2);
currentPlaylist.add(song3);
currentPlaylist.add(song4);
currentPlaylist.add(song5);
currentPlaylist.add(song6);

//Assert.assertEquals()
for(Song s: currentPlaylist) {
	System.out.println(s.getName());
}

}
*/