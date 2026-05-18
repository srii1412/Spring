package Bean;

public class Address {
   private int Doorno;
   private String address;
   public void setDoorno(int doorno) {
	Doorno = doorno;
   }
   public void setAddress(String address) {
	this.address = address;
   }
   @Override
   public String toString() {
          return Doorno + "Doorno" +  address + "address";
   }
}
 
   

