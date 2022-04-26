interface Transport{
	void deliver();
}
abstract class Animal{
	abstract void display();
}
class Tiger extends Animal{
		void display(){
			System.out.println("Tiger class");
		}
}
class Camel extends Animal implements Transport{
	public void deliver(){
		System.out.println("deliver Camel");
	}
	void display(){
			System.out.println("Camel class");
		}
}
class Deer extends Animal{
	void display(){
			System.out.println("Deer class");
		}
}
class Donkey extends Animal implements Transport{
	public void deliver(){
		System.out.println("deliver Donkey");
	}
	void display(){
			System.out.println("Donkey class");
		}
}
public class TransportDemo{
	public static void main(String[] args){
		Animal[] obj = new Animal[4];
		obj[0]= new Tiger();
		obj[1]= new Camel();
		obj[2]= new Deer();
		obj[3]= new Donkey();

		obj[0].display();
		obj[1].display();
		obj[2].display();
		obj[3].display();

		Camel i1 = new Camel();
		i1.deliver();
		Donkey i2 = new Donkey();
		i2.deliver();
	}
}