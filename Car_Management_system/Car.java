package Car_Management_system;

public class Car {
    private int id;
	private String name;
	private int availableCount;
	public Car(int id, String name,int availableCount )
	{
		this.id = id;
		this.name = name;
		this.availableCount = availableCount;
	}
	
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
	public int getAvailableCount() {
		return availableCount;
	}
	public void setAvailableCount(int availableCount) {
		this.availableCount = availableCount;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", availableCount=" + availableCount + "]";
	}
	
}
