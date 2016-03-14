 abstract class  Car implements Vehicle,Brake{
	private String name,color,engine;
	public Car(String name,String color,String engine){
		this.name = name;
		this.color = color;
		this.engine = engine;
	}

	public void reverse(){
		System.out.println("Reversing with nokia tune...");
	}

	// public void brake(){
	// 	System.out.println("sudden brake. broooommm...");
	// }

	// public abstract  void  moveForward();
}