class Fish extends Bird {
	void swim() {
		System.out.println("I am swimming");
	}
	void sing() throws UnSupportException {
		throw new UnSupportException();
	}
	void walk() throws UnSupportException {
		throw new UnSupportException();
	}
	void size () {};
	void color() {};
	void character() {};
}
