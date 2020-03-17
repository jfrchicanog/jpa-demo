package es.uma.informatica.jpa.demo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Book
 *
 */
@Entity

public class Book implements Serializable {

	   
	@Id @GeneratedValue
	private Long id;
	private String title;
	private Float price;
	private String description;
	private String isbn;
	private Integer nbOfPage;
	private Boolean illustrations;
	@ElementCollection
	@CollectionTable(name = "TAG")
	@Column(name = "VALUE")
	private List<String> tags;
	
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	private static final long serialVersionUID = 1L;

	public Book() {
		super();
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
	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}   
	public Integer getNbOfPage() {
		return this.nbOfPage;
	}

	public void setNbOfPage(Integer nbOfPage) {
		this.nbOfPage = nbOfPage;
	}   
	public Boolean getIllustrations() {
		return this.illustrations;
	}

	public void setIllustrations(Boolean illustrations) {
		this.illustrations = illustrations;
	}
   
}
