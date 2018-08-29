class Parrot2 extends Bird{
	Animal liveWith;
	ParrotSingStrategy singStrategy;
	
	public void setLiveWith(Animal liveWith) {
		this.liveWith = liveWith;
		this.singStrategy = new ParrotSingStrategy(liveWith);
	}

	void sing() {
		if(singStrategy != null)
		{
			singStrategy.sing();
		} else 
		{
			System.out.println("I am alone!");
		}
	}
}
