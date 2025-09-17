package Overriding;

public class Lion extends Animal
{    
	//constructor chaining
	// constructor to constructor call by used this key word
	public Lion() {
		this(23);
	}

    public Lion(int a) {
		System.out.println("a is constructor is:"+a);
	}
    
	public int number =123;

	public void printColor() {
		System.out.println(" yello black stripped");
		printCity();
		super.printCity();
		super.printName();
		System.out.println(super.age);
	}

	public void something() {
		System.out.println("Somthing method");
		System.out.println(this.number);
		this.printColor();
		this.printName();
	}
	@Override
	public void printName() {
		// TODO Auto-generated method stub
       System.out.println("print name -Lion");
	}	
	
}


//this key word ni aapan same class madha lya method call karu sakto
// this constructor  chaining
// constructor it should be ones 
