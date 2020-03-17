package es.uma.informatica.jpa.demo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: CD
 *
 */
@Entity

public class CD implements Serializable {

	@Id
	private Long id;
	private String title;
	private Float price;
	private String description;
	
	@ManyToMany(mappedBy = "appearsOnCDs")
	private List<Artist> createdByArtists;
	
	private static final long serialVersionUID = 1L;
	
	public CD() {
		super();
	}   

	public List<Artist> getCreatedByArtists() {
		return createdByArtists;
	}
	public void setCreatedByArtists(List<Artist> createdByArtists) {
		this.createdByArtists = createdByArtists;
	}
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}   
	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
   
}
