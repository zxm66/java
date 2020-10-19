package designPattern;


public class ProtoType{
	
	/**
	 * 原型模式
	 *
	 * */
	public static void main(String[] args) {
		Product product = new Product();
		Product product2 = (Product) product.clone();
		
	}


}

class Product implements Cloneable{

	private String part1;
	private String part2;
	private String part3;
	private String part4;
	private String part5;
	
	/**
	* @return the part1
	*/
	public String getPart1() {
		return part1;
	}
	/**
	* @return the part2
	*/
	public String getPart2() {
		return part2;
	}
	/**
	* @return the part3
	*/
	public String getPart3() {
		return part3;
	}
	/**
	* @return the part4
	*/
	public String getPart4() {
		return part4;
	}
	/**
	* @return the part5
	*/
	public String getPart5() {
		return part5;
	}

	/**
	* @param part1 the part1 to set
	*/
	public void setPart1(String part1) {
		this.part1 = part1;
	}
	/**
	* @param part2 the part2 to set
	*/
	public void setPart2(String part2) {
		this.part2 = part2;
	}
	/**
	* @param part3 the part3 to set
	*/
	public void setPart3(String part3) {
		this.part3 = part3;
	}
	/**
	* @param part4 the part4 to set
	*/
	public void setPart4(String part4) {
		this.part4 = part4;
	}
	/**
	* @param part5 the part5 to set
	*/
	public void setPart5(String part5) {
		this.part5 = part5;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Product(){
	}

	public Product(String part1,String part2,String part3,String part4,String part5){
		this.part1 = part1;
		this.part2 = part2;
		this.part3 = part3;
		this.part4 = part4;
		this.part5 = part5;
	}
}
