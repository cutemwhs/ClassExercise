
public class MainClass {
	public static void main(String[] args) {
		Grandeur myCar1 = new Grandeur();//new Grandeur 하는 순간 Grandeur 생성자 호출
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price = 100;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
		Grandeur myCar2 = new Grandeur();//new Grandeur 하는 순간 Grandeur 생성자 호출
		myCar2.color = "yellow";
		myCar2.gear = "auto";
		myCar2.price = 500;
		
		myCar2.run();
		myCar2.stop();
		myCar2.info();
		
		Bicycle myBicycle = new Bicycle("red", 100);
		myBicycle.info();
		
		myBicycle.color = "yellow";
		myBicycle.info();
	}
}
