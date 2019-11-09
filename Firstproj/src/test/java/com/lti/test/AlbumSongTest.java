package com.lti.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.lti.dao.GenericDao;
import com.lti.model.Album;
import com.lti.model.Song;

public class AlbumSongTest {
	
	@Test
	public void AddSongToAlbum(){
		GenericDao dao=new GenericDao();
		Album ab=new Album();
		ab.setName("LinkinPark");
ab.setReleaseDate(LocalDate.of(2007, 05, 25));
		ab.setGenre("sdf");
		Song s1=new Song();
		s1.setTitle("In The End");
		s1.setDuration(04.54);
		s1.setArtist("Chester Bennington");
		s1.setAlbum(ab);
		
		
		Song s2=new Song();
		s2.setTitle("jbj");
		s2.setDuration(06.54);
		s2.setArtist("jkbgjkbgjk njghjg");
		s2.setAlbum(ab);
		
		Song s3=new Song();
		s3.setTitle("ghcvhcv");
		s3.setDuration(02.54);
		s3.setArtist("deasedas");
		s3.setAlbum(ab);
		
		Song s4=new Song();
		s4.setTitle("mj");
		s4.setDuration(01.54);
		s4.setArtist("klmjl");
		s4.setAlbum(ab);
		
		List<Song> s=new ArrayList<Song>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		ab.setSongs(s);
		dao.insert(ab);
		}

/*	@Test
	public void AddToSong(){
		
		GenericDao dao=new GenericDao();
		dao.insert(song);		
	}
	*/
	
}
