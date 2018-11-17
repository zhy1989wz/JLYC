package cn.com.widemex.examples.charts.vo;

/**
 * 
 * 值对象
 * @author 何启伟
 * @since 2010-7-12
 * @version ExtFw3.0
 *
 */
public class Chart2Vo {
	private String a0; 		//日
	private String a0Name;	//日标题
	
	private double a1;		//用电量
	private String a1Name;	//用电量标题
	
	private double a2;		//产量
	private String a2Name;	//产量标题
	
	private double a3;		//单箱耗电
	private String a3Name;	//单箱耗电标题
	public Chart2Vo(String a0, String name, double a1, String name2, double a2, String name3, double a3, String name4) {
		this.a0 = a0;
		this.a0Name = name;
		this.a1 = a1;
		this.a1Name = name2;
		this.a2 = a2;
		this.a2Name = name3;
		this.a3 = a3;
		this.a3Name = name4;
	}
	public String getA0() {
		return a0;
	}
	public void setA0(String a0) {
		this.a0 = a0;
	}
	public String getA0Name() {
		return a0Name;
	}
	public void setA0Name(String name) {
		a0Name = name;
	}
	public double getA1() {
		return a1;
	}
	public void setA1(double a1) {
		this.a1 = a1;
	}
	public String getA1Name() {
		return a1Name;
	}
	public void setA1Name(String name) {
		a1Name = name;
	}
	public double getA2() {
		return a2;
	}
	public void setA2(double a2) {
		this.a2 = a2;
	}
	public String getA2Name() {
		return a2Name;
	}
	public void setA2Name(String name) {
		a2Name = name;
	}
	public double getA3() {
		return a3;
	}
	public void setA3(double a3) {
		this.a3 = a3;
	}
	public String getA3Name() {
		return a3Name;
	}
	public void setA3Name(String name) {
		a3Name = name;
	}
}
