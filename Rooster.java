class Rooster extends Animal{
	Bird chicken;
	
	public Rooster() {
		chicken = new Chicken();
    }
	void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
}
