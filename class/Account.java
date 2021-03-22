package inclass;

public class Account {
private int id=0;
private double balance;
private static double annualInterestRate;
private java.util.Date datecreated;
public Account() {
	datecreated=new java.util.Date();

}
public Account(int id,double balance) {
	this.id=id;
	this.balance=balance;
	datecreated=new java.util.Date();

}
public int getId() {
	return id;
}
public double getBlance() {
	
	return balance;
}
public static double getAnnual() {
	return annualInterestRate;
}
public void setId(int newId) {
	id=newId;
}
public void setBalance(double newBalance) {
	balance=newBalance;
}
public static void setAnnual(double Annual) {
	annualInterestRate=Annual;
}
public java.util.Date getDate(){
	
	
	return datecreated;
}
public void withdraw(double amount) {
	balance-=amount;

}
public void deposit(double amount) {
	balance+=amount;
}












}
