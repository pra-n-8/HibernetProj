package com.lti.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Table_Song")
public class Song {
	
	@Id
	@GeneratedValue
	@Column(name="Song_Id")
	private int id;
	
	@Column(name="Song_Title",nullable=false)
	private String title;
	
	@Column(name="Song_Duration",nullable=false)
	private double duration;
	
	@Column(name="Song_Artist",nullable=false)
	private String artist;
	
	@ManyToOne
	@JoinColumn(name="Album_Id",nullable=true)
	private Album album;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double d) {
		this.duration = d;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}

}
