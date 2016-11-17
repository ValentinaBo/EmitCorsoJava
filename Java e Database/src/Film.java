
public class Film {

	int filmID;
	String title;
	String description;
	int releaseYear;
	int languageID;
	int originalLanguageID;
	int rentalDuration;
	float rentalRate;
	int filmLength;
	float replacementCost;
	String rating;
	String specialFeatures;
	
	public int getFilmID() {
		return filmID;
	}
	
	public void setFilmID(int id) {
		this.filmID = id;
	}
	
 	public String getTitle() {
		return title;
	}
	
	public void setTitle(String t) {
		this.title = t;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String d) {
		this.description = d;
	}
	
	public int getReleaseYear() {
		return releaseYear;
	}
	
	public void setReleaseYear(int y) {
		this.releaseYear = y;
	}
	
	public int getLanguageID() {
		return languageID;
	}
	
	public void setLanguageID(int l) {
		this.languageID = l;
	}
	
	public int getOriginalLanguageID() {
		return originalLanguageID;
	}
	
	public void setOriginalLanguageID(int ol) {
		this.originalLanguageID = ol;
	}
	
	public int getRentalDuration() {
		return rentalDuration;
	}
	
	public void setRentalDuration(int d) {
		this.rentalDuration = d;
	}
	
	public float getRentalRate() {
		return rentalRate;
	}
	
	public void setRentalRate(float r) {
		this.rentalRate = r;
	}
	
	public int getFilmLength() {
		return filmLength;
	}
	
	public void setFilmLength(int l) {
		this.filmLength = l;
	}
	
	public float getReplacementCost() {
		return replacementCost;
	}
	
	public void setReplacementCost(float c) {
		this.replacementCost = c;
	}
	
	public String getRating() {
		return rating;
	}
	
	public void setRating(String r) {
		this.rating = r;
	}
	
	public String getSpecialFeatures() {
		return specialFeatures;
	}
	
	public void setSpecialFeatures(String sf) {
		this.specialFeatures = sf;
	}
}
