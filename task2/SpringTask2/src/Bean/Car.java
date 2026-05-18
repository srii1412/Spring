package Bean;

public class Car {
       private int num;
       private String brand;
       private int price;
       private Engine eng;
	   public void setEng(Engine eng) {
		this.eng = eng;
	}
	   public void setNum(int num) {
		   this.num = num;
	   } 
	    public void setBrand(String brand) {
		   this.brand = brand;
	   }
	   public void setPrice(int price) {
		   this.price = price;
	   
	   }
	   public void show() {
	   
	   System.out.println("number:"+num);
	   System.out.println("Brand:"+brand);
	   System.out.println("Price:"+price);	
	   System.out.println("Engine no:"+eng);
	   
	   }
}




