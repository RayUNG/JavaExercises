package com.ray10pm;

import java.util.ArrayList;
import java.util.List;

public class Album {

	private String name;
	private String artist;
	private SongList songs;

	public Album(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = new SongList();
	}

	public String getName() {
		return name;
	}

	public String getArtist() {
		return artist;
	}

	public boolean addSong(String title, double duration) {
		return this.songs.add(new Song(title, duration));
	}

	public void showAlbumSongs() {
		boolean test = true;
		int trackNumber = 1;
		while (test == true) {
			test = albumSongs(trackNumber);
			trackNumber++;			
		}
	}
	
	public boolean albumSongs(int trackNumber) {
		Song showSong = this.songs.songIterator(trackNumber);
		if(showSong != null) {
			System.out.println(trackNumber + "." + showSong);
			return true;
		}else {
			return false;
		}
		
	}

	public boolean addToPlayList(int trackNumber, List<Song> playList) {
		Song checkedSong = this.songs.findSong(trackNumber);
		if (checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("This album does not have a track" + trackNumber);
		return false;
	}

	public boolean addToPlayList(String title, List<Song> playList) {
		Song checkedSong = songs.findSong(title);
		if (checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("The song " + title + " is not in this album");
		return false;
	}

	private class SongList {

		private ArrayList<Song> song;

		public SongList() {
			this.song = new ArrayList<Song>();
		}

		public boolean add(Song songs) {
			if (song.contains(songs)) {
				return false;
			}
			this.song.add(songs);
			return true;
		}

		private Song findSong(String title) {
			for (Song checkedSong : this.song) {
				if (checkedSong.getTitle().equals(title)) {
					return checkedSong;
				}
			}
			return null;
		}

		public Song findSong(int trackNumber) {
			int index = trackNumber - 1;
			if ((index >= 0) && (index < song.size())) {
				return song.get(index);
			}
			return null;
		}

		private Song songIterator(int trackNumber) {
			int index = trackNumber -1;
			if ((index >= 0) && (index < song.size())) {
				return song.get(index);
			}
			return null;
		}
	}

}
