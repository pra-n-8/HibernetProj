package com.lti.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Table_Album")
public class Album {
	
	@Id
	@GeneratedValue
	@Column(name="Album_Id")
	private int id;
	
	@Column(name="Album_name",nullable=false)
	private String name;
	
	@Column(name="Album_ReleaseDate",nullable=false)
	private LocalDate releaseDate;
	
	@Column(name="Album_genre",nullable=false)
	private String genre;
	
	@OneToMany(mappedBy = "album",cascade=CascadeType.ALL)
	private List<Song> songs;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
}
