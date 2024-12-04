package main;
 
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int lenght;
	private float cost;


	public String getTitle() {
		return title;
	}


	public String getCategory() {
		return category;
	}


	public String getDirector() {
		return director;
	}


	public int getLenght() {
		return lenght;
	}


	public float getCost() {
		return cost;
	}
	
	public DigitalVideoDisc(String title) {
			this.title = title;
		}

	public DigitalVideoDisc(String title, String category, String director, int lenght, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.lenght = lenght;
		this.cost = cost;
	}
		

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
 
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
 

		
		public void displayDVDInformation() {
			System.out.println("Title: " + this.title);
			System.out.println("Category: " + this.category);
			System.out.println("Director: " + this.director);
			System.out.println("Length: " + this.lenght);
			System.out.println("Cost: " + this.cost);
			System.out.println();
	}
 
		}