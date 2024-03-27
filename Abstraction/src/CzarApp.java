
public class CzarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Electric er=new Electric();
     Petrol pr=new Petrol();
     Diesel dr=new Diesel();
     Vehicle vc=new Vehicle();
     vc.doactivity(er);
     System.out.println("           ");
     vc.doactivity(pr);
     System.out.println("           ");
     vc.doactivity(dr);
	}

}
