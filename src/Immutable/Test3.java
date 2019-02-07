package Immutable;

public class Test3 {
	private final int id;
	private final String name;
	private final Newage age;
	public Test3(int id,String name,Newage age){
		this.name=name;
		this.id=id;
		Newage cloneage=new Newage();
		cloneage.setday(age.getday());	
		cloneage.setmonth(age.getmonth());
		this.age=cloneage;
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
			Test3 t=new Test3(1,"sandhya",age);
			System.out.println("before day="+t.getage().getday());
			t.getage().setday(19);
			System.out.println("after month="+t.getage().getday()); 
	 }
			
}
