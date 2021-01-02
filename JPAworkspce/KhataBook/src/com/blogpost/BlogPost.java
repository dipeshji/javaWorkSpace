package com.blogpost;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blogs")
public class BlogPost {

	@Id
	@Column(name = "blog_id")
	private Integer blogId;

	@Column(name = "blog_heading")
	private String blogHeading;

	@Column(name = "blog_cont")
	private String blogContent;
//private byte[] image;

	@Column(name = "blog_name")
	private String createrName;

	public Integer getBlogId() {
		return blogId;
	}

	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	public String getBlogHeadin() {
		return blogHeading;
	}

	public void setBlogHeadin(String blogHeadin) {
		this.blogHeading = blogHeadin;
	}

	public String getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

	public String getCreaterName() {
		return createrName;
	}

	public void setCreaterName(String createrName) {
		this.createrName = createrName;
	}

}
