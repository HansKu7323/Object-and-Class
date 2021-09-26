package staticMember;

class Ccar {					//汽車類別
	private static int car_num;	//宣告car_num為私有靜態資料成員
	private double gas = 50;
	private double tbo = 12;    
	
	private void setGas(double g)	
	{
		gas = g;
	}
	
	private void setTbo(double t)
	{
		tbo = t;
	}
	
	public Ccar()
	{
		car_num ++;
	}
	
	public Ccar (double g)
	{
		setGas(g);
		car_num ++;
	}
	
	public Ccar (double g, double t)
	{
		setGas(g);
		setTbo(t);
		car_num ++;
	}
	
	public static void getObjectNum()	//公開靜態方法成員
	{
		System.out.print("第" + car_num + "部車");
	}
	public void showValue()				//公開一般方法成員
	{
		System.out.println("最多載油量" + gas + "平均耗油量" + tbo);
	}
}




public class StaticMember {

	public static void main(String[] args) {
		Ccar car1 = new Ccar();
		Ccar.getObjectNum();
		car1.showValue();
		
		Ccar car2 = new Ccar(40.5);
//		car2.getObjectNum();	//建議改用Ccar.getObjectNum();
		Ccar.getObjectNum();
		car2.showValue();
		
		Ccar car3 = new Ccar(64.5,9.2);  
//		car3.getObjectNum();	//建議改用Ccar.getObjectNum()
		Ccar.getObjectNum();
		car3.showValue();
	}

}
