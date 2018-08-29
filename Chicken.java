class Chicken extends Bird {
	void sing() {
		System.out.println("Cluck, cluck");
	}
	void fly() throws UnSupportException {	
		throw new UnSupportException();
	}
}
