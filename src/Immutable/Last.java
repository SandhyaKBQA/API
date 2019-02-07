package Immutable;

public class Last {
		private final int id;
		private final String name;
		private final Newage age;
		Last(int id,String name,Newage age){
			this.name=name;
			this.id=id;
			this.age=age;
		}
	    public int getid()
		  {
			return id;
		      }
		 public String getname()
		    {
			return name;
		      }
		 public Newage getage()
		    {
			 Newage cloneage=new Newage();
				cloneage.setday(this.age.getday());
				cloneage.setmonth(this.age.getmonth());
				return cloneage;
				}
		 
			public static void main(String[] args) {
				Newage age=new Newage();
				age.setday(18);
				age.setmonth(4);
				Last l=new Last(1,"sandhya",age);
				System.out.println("before day="+l.getage().getday());
				l.getage().setday(19);
				System.out.println("after month="+l.getage().getday()); 
			}
	
	}


/*    */

