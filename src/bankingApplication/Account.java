package bankingApplication;

public class Account {
  private String name;
  private int phoneno;
  private int balance;
  public Account(String name,int phoneno,int balance) {
	  this.name=name;
	  this.phoneno=phoneno;
	  this.balance=balance;
	  
	  
  }
  public void checkbalance() {
	  System.out.println( "WELCOME "+this.name+" YOUR ACCOUNT BALANCE IS  "+ this.balance);
  }
  
  public void deposit(int depositedmoney) {
	  this.balance+=depositedmoney;
	  System.out.println("DEPOSIT OF  "+depositedmoney+ "  SUCCESSFULL. CURRENT BALANCE IS "+this.balance);
	  
  }
 public void withdraw(int withdrawmoney) {
	 if(withdrawmoney>this.balance)
	 { System.out.println("SORRY YOUR ACCOUNT HAS INSUFFICIENT FUNDS");}
	
	 else
	 { this.balance-=withdrawmoney;
		
	 System.out.println("WITHDRAWAL OF "+ withdrawmoney+" SUCCESSFULL.YOUR CURRENT BALANCE IS "+this.balance );}
	 
 }
   
   
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Account nithu=new Account("nithish",7780,9000);
      nithu.checkbalance();
      nithu.deposit(1000);
      nithu.withdraw(2000);
      Account manoj=new Account("manoj",7780,9000);
      manoj.checkbalance();
      manoj.deposit(8000);
      manoj.withdraw(5000);
      manoj.withdraw(14000);
      
      
      
      
	}

}
