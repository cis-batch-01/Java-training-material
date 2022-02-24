package corejavasamples.collections;

import java.util.Collections;
import java.util.Date;

public class Course implements Comparable<Course>{
	private String title;
	private String description;
	private int duration;
	private double rating;
	private String skilLevel;
	private String language;
	private boolean captions;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getSkilLevel() {
		return skilLevel;
	}
	public void setSkilLevel(String skilLevel) {
		this.skilLevel = skilLevel;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public boolean isCaptions() {
		return captions;
	}
	public void setCaptions(boolean captions) {
		this.captions = captions;
	}
	public Course(String title, String description, int duration, double rating, String skilLevel, String language,
			boolean captions) {
		super();
		this.title = title;
		this.description = description;
		this.duration = duration;
		this.rating = rating;
		this.skilLevel = skilLevel;
		this.language = language;
		this.captions = captions;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "[ title=" + title + ", description=" + description + ", duration=" + duration + ", rating="
				+ rating + ", skilLevel=" + skilLevel + ", language=" + language + ", captions=" + captions+"]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((skilLevel == null) ? 0 : skilLevel.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Course other = (Course) obj;
		if (language == null) {
			if (other.language != null) {
				return false;
			}
		} else if (!language.equals(other.language)) {
			return false;
		}
		if (skilLevel == null) {
			if (other.skilLevel != null) {
				return false;
			}
		} else if (!skilLevel.equals(other.skilLevel)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		return true;
	}
	public int compareTo(Course o) {
		// TODO Auto-generated method stub
		if(this.duration>o.duration)
		{
			return 1;
		}
		else if(this.duration<o.duration)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}

	public static Course createCourse(String data)
	{
		String[] userData=data.split(",");
		Course course=new Course(userData[0],
				userData[1], Integer.parseInt(userData[2]),
				Double.parseDouble(userData[3]), userData[4], userData[5], true);
		return course;
	}
	
	

}
