package encapsulate;

class Ccar {					//汽車類別
	//gas最屬載油量，tbo平均耗油量		//gas,tbo,max_dist 為成員變數
	private double gas,tbo;		    //資料成員(屬性或欄位)，	
	private double max_dist = 0;		//資料成員(屬性或欄位)，加滿油可行駛最長距離
	
	//方法成員內若沒有return敘述，則在方法名稱前面的傳回值型別要使用void
	private void maxDist()			//方法成員(方法或函式)，計算可行駛最長距離
	{
		max_dist = gas * tbo;
	}
	
	public void setValue(double g, double t)//傳入資料
	{
		gas = g;
		tbo = t;
		maxDist();
	}
	
	////方法成員內若有return敘述，則在方法名稱前面要宣告傳回值的資料型別
	public double getDist()	//傳出資料
	{
		return max_dist;
	}
	
	public double dist(double oil)	//方法成員(方法或函式)，一般加油可行駛距離
	{
		return oil * tbo;
	}
	
	
}



public class Encapsulate {

	public static void main(String[] args) {
		Ccar car1 = new Ccar();
		double g1 = 40, t1 = 13.6;
		car1.setValue(g1, t1);
		double distance1 = car1.getDist();//使用getDist方法取得max_dist的值
		System.out.println("car1加滿油可行駛" + distance1 + "km");
		
		Ccar car2 = new Ccar();
		car2.setValue(60, 9.5);
		double distance2 = car2.getDist();//使用getDist方法取得max_dist的值
		System.out.println("car2加滿油可行駛" + distance2 + "km");
		
		double dist1 = car1.dist(20);
		System.out.println("加20L可行駛：" + dist1 + "km");
		double dist2 = car2.dist(20);
		System.out.println("加20L可行駛：" + dist2 + "km");

	}

}
