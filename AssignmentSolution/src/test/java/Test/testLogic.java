package Test;

import java.util.LinkedList;

import org.testng.Assert;
import org.testng.annotations.Test;

import Solution.Playlist;
import Solution.Songs;

public class testLogic {

	@Test
	public void testAddSongs() {
		Playlist playlist1 = new Playlist("testPlaylist", new LinkedList<Songs>());
		Songs song1 = new Songs("s1", 6);
		Songs song2 = new Songs("s", 3);
		Songs song3 = new Songs("s3", 3);
		Songs song4 = new Songs("s4", 1);
		Songs song5 = new Songs("s5", 5);
		Songs song6 = new Songs("s6", 7);

		playlist1.addSongsToPlayList(song1);
		playlist1.addSongsToPlayList(song2);
		playlist1.addSongsToPlayList(song3);
		playlist1.addSongsToPlayList(song4);
		playlist1.addSongsToPlayList(song5);
		playlist1.addSongsToPlayList(song6);
		LinkedList<Songs> finalPlaylist = playlist1.addSongsToPlayList(song1);

		LinkedList<Songs> ExpectedFinalPlaylist = new LinkedList<Songs>();
		ExpectedFinalPlaylist.add(song3);
		ExpectedFinalPlaylist.add(song4);
		ExpectedFinalPlaylist.add(song5);
		ExpectedFinalPlaylist.add(song6);
		ExpectedFinalPlaylist.add(song1);

		Assert.assertEquals(ExpectedFinalPlaylist, finalPlaylist);

	}
}
