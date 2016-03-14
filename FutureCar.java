class FutureCar extends Car{
	public FutureCar(String name,String color,String engine) {
		super(name,color,engine);
	}
	@Override
	public void moveForward(){
		System.out.println("Moving Forward...");
	}
	@Override
	public void brake(){
		System.out.println("brake.....");
	}
}