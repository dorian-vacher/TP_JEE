package fr.polytech.todo.servlet;

public class Todo {
	private Long id;
	private String name, description;
	
	public Todo(Long id, String name, String desc) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.description = desc;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "["+this.id+"] "+this.name+" : "+this.description;
	}
	
	public static void main(String args[]) {
		Todo td = new Todo((long)59,"Acheter le lait","En sortant ce soir prendre 1L d'écrémé");
		System.out.println(td);
	}
}


