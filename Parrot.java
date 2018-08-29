class Parrot extends Bird{
	Animal liveWith;
	
	public void setLiveWith(Animal liveWith) {
		this.liveWith = liveWith;
	}

	void sing() {
		if(liveWith instanceof Dog)
		{
			System.out.println("Woof, woof");
		} else  if(liveWith instanceof Cat)
		{
			System.out.println("Meow");
		} else if(liveWith instanceof Rooster)
		{
			System.out.println("Cock-a-doodle-doo");
		} else 
		{
			System.out.println("I am alone!");
		}
	}
}
