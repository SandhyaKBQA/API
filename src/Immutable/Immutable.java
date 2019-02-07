package Immutable;

public final class Immutable {
	
	private final int id;
	private final String name;
	private final Newage age;
	Immutable(int id,String name,Newage age){
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
		return age;
	      }
	 
	 public static void main(String[] args) {
			Newage age=new Newage();
			age.setday(18);
			age.setmonth(4);
			Immutable i=new Immutable(1,"sandhya",age);
			System.out.println("before day="+i.getage().getday());
			age.setday(19);
			System.out.println("after month="+i.getage().getday());
	 }
			

}

