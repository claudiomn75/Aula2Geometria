package BR.USJT.OO;

        public class Cubo extends Trid{
	  private double volume;
	
	     public Cubo(double base) {
		this.volume = base*base*base;
	         }
	
	           @Override
	            public double volume() {
		      return volume;
	               }
	
	                 @Override
	                   public String toString() {
		             return "Cubo";
	                       }

      }
