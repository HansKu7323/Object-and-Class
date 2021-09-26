package ex06;

public class Ccar {					//汽車類別
	//gas最屬載油量，tbo平均耗油量		//gas,tbo,max_dist 為成員變數
	public double gas,tbo;		    //資料成員(屬性或欄位)，	
	public double max_dist = 0;		//資料成員(屬性或欄位)，加滿油可行駛最長距離
	
	//方法成員內若沒有return敘述，則在方法名稱前面的傳回值型別要使用void
	public void maxDist()			//方法成員(方法或函式)，計算可行駛最長距離
	{
		max_dist = gas * tbo;
	}
	
	////方法成員內若有return敘述，則在方法名稱前面要宣告傳回值的資料型別
	public double dist(double oil)	//方法成員(方法或函式)，一般加油可行駛距離
	{
		return oil * tbo;
	}
	
	

}
