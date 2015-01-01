package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Image {
	@Id
	@Column(unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String description;
	private String url;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "images")
	private List<Users> users;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "images", cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	private List<Tag> tags;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "images", cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	private List<Groups> groups;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
