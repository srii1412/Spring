package Bean;

public class Processor {
         private int gb;
         private String process;
		 public Processor(int gb, String process) {
			this.gb = gb;
			this.process = process;
			
		 }
		 @Override
		 public String toString() {
			return "Processor [gb=" + gb + ", process=" + process;
		 }
         }
