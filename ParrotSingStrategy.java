class ParrotSingStrategy extends Bird{
	Animal liveWith;
	
	ParrotSingStrategy(Animal liveWith){
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
		} 
		//Any other type adding here.
		
	}
}
