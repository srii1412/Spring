package Bean;

public class Employee {
           private int id;
           private String name;
		  
		   public void setId(int id) {
			   this.id = id;
		   }
		   public void setName(String name) {
			   this.name = name;
		   }
		   private Address add;
			public void setAdd(Address add) {
				this.add = add;
			}
			
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("id "+id);
				System.out.println("name "+name);
				System.out.println("address "+add);
			}
			}
		
           
           

