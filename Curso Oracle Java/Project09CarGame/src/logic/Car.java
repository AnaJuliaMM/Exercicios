package logic;

public class Car {
	//Atributos
	private String color;
	private int speed;
	private int positionX;
	private int positionY;
	private int health;
	
	//Construtor
	public Car() {
	}
	public Car(String color) {
		this.color = color;
	}
	public Car(String color, int positionX, int positionY) {
		this.color = color;
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	public Car(String color, int speed, int positionX, int positionY, int health) {
		this.color = color;
		this.speed = speed;
		this.positionX = positionX;
		this.positionY = positionY;
		this.health = health;
	}
	
	//Método funcional
	
	public void accelerate() {
		this.speed += 1;
	}
	public void accelerate(int speedAcceleration) {
		this.speed += speedAcceleration;
		if(this.speed<0)
			this.speed = 0;
		
	}
	
	
	
	//Métodos de acesso
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getPositionX() {
		return positionX;
	}
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	public int getPositionY() {
		return positionY;
	}
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Car {\n color= " + color + ",\n speed= " + speed + ",\n positionX= " + positionX + ",\n positionY= " + positionY
				+ ",\n health= " + health + "\n}";
	}
	
	
	
	
	
	
	

}
