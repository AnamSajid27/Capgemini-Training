 /**
  * 2.	TypeScript classes & types: Write a class Account with attributes id, name, balance. 
  * Add two sub classes SavingAccount & CurrentAccount having specific attribute interest & 
  * cash_credit respectively. Create multiple saving & current account objects. 
  * Write a functionality to find out total balance in the bank.
  */
 class Account1{
     id:number;
     name:string;
     balance:number;
    constructor(id:number,name:string,balance:number){
        this.id=id;
        this.name= name;
        this.balance = balance;
    }
}

class SavingAccount1 extends Account1{
    interest:number;
    totalBalance:number;
   constructor(id:number,name:string,balance:number,interest:number){
          super(id,name,balance)
          this.interest  = interest;
   }
   getBalance(){
       this.totalBalance=0;
       this.totalBalance = this.balance + (this.balance*this.interest);
       return this.totalBalance;
   }
}

class CurrentAccount1 extends Account1{
    cash_credit:number;
    totalBalance:number;
   constructor(id:number,name:string,balance:number,cash_credit:number){
          super(id,name,balance);
          this.cash_credit  = cash_credit;
   }
   getBalance(){
       this.totalBalance=0;
       this.totalBalance = this.balance -this.cash_credit;
       return this.totalBalance;
   }
}

let SavingAccountObj = new SavingAccount1(11,"john",1500,10);
console.log(SavingAccountObj.getBalance())

let CurrentAccountObj = new CurrentAccount1(11,"jack",15000,500);
console.log(CurrentAccountObj.getBalance())

/**
 * 3.	TypeScript Interfaces: Write an interface Printable. Create 2 objects circle & 
 * employee those implement Printable interface. Write a function printAll() 
 * that takes all objects as argument & invoke print() method on every object.
 */

 interface Printable{
     print():string;
 }

 class Circle implements Printable{
     radius:number;
     constructor(radius:number){
         this.radius=radius;
     }
     print(): string {
         return "The radius of Cicle is "+this.radius +"\nArea is "+ (Math.PI*this.radius*this.radius);
     }

 }
 class Employee implements Printable{
     ename:string;
     eid:number;
     edesignatio:string;
     constructor( ename:string,eid:number,edesignatio:string){
         this.eid=eid;
         this.ename=ename;
         this.edesignatio=edesignatio;
     }
     print(): string {
         return "Employee Details:\n"+"Employee Id:"+this.eid+"\n"+"Employee Name: "+this.ename 
               +"\n"+"Employee Designation: "+this.edesignatio;
     }

 }
 function printAll(obj1,obj2){
     console.log(obj1.print());
     console.log(obj2.print());
}
 let circleObj = new Circle(2);
 let employeeObj = new Employee("john",11,"jr analyst");

 printAll(circleObj,employeeObj);

 