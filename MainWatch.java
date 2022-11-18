package lab11;

public class MainWatch {

	public static void main(String[] args) {
		Watch watch = new Watch();
		watch.display();
		Seiko seiko = new Seiko();
		seiko.design();
		Carson carson = new Carson();
		carson.type();
		Tissot tissot = new Tissot();
		tissot.property();
		Quartz quartz= new Quartz();
		quartz.type();
	}

}
