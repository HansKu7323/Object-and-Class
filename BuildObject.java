package ex06;

public class BuildObject {

	public static void main(String[] args) {
		Ccar car1;			//宣告car1物件
		car1 = new Ccar();	//建立car1物件
		car1.gas = 40;		//設定car1物件的屬性值
		car1.tbo = 13.6666;	//設定car1物件的屬性值
		//方法沒有回傳值，使用時可直接呼叫
		car1.maxDist();		//呼叫car1物件maxDist()方法，max_dist = gas * tbo;
		
		//dist方法為return oil * tbo;
		//有return時，需要將回傳值指定給一個變數(distance)
		double distance = car1.dist(20);	//呼叫car1物件dist方法，並取得傳回值
		System.out.println("car1汽車資訊：");
		System.out.println("最大載油量：" + car1.gas + "L");
		System.out.println("平均耗油量：" + car1.tbo + "km/L");
		System.out.println("加滿油可行駛：" + car1.max_dist + "km");
		System.out.println("加20L可行駛：" + distance + "km");
		
		Ccar car2 = new Ccar(); //宣告car2並建立car2物件
		car2.gas = 60;			//設定car2物件的屬性值
		car2.tbo = 9.5;			//設定car2物件的屬性值
	}

}
