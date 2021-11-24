
public class Example {

	public static void main(String[] args) {
		Demo obj=new Demo(3.14);
		//obj,setRadius(3.14);
		double area=Math.PI*obj.getRadius()*obj.getRadius();
		System.out.println("Area of circle:"+area);
		
	}
	
}
