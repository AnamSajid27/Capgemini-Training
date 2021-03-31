var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
/**
 * 2.	TypeScript classes & types: Write a class Account with attributes id, name, balance.
 * Add two sub classes SavingAccount & CurrentAccount having specific attribute interest &
 * cash_credit respectively. Create multiple saving & current account objects.
 * Write a functionality to find out total balance in the bank.
 */
var Account1 = /** @class */ (function () {
    function Account1(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    return Account1;
}());
var SavingAccount1 = /** @class */ (function (_super) {
    __extends(SavingAccount1, _super);
    function SavingAccount1(id, name, balance, interest) {
        var _this = _super.call(this, id, name, balance) || this;
        _this.interest = interest;
        return _this;
    }
    SavingAccount1.prototype.getBalance = function () {
        this.totalBalance = 0;
        this.totalBalance = this.balance + (this.balance * this.interest);
        return this.totalBalance;
    };
    return SavingAccount1;
}(Account1));
var CurrentAccount1 = /** @class */ (function (_super) {
    __extends(CurrentAccount1, _super);
    function CurrentAccount1(id, name, balance, cash_credit) {
        var _this = _super.call(this, id, name, balance) || this;
        _this.cash_credit = cash_credit;
        return _this;
    }
    CurrentAccount1.prototype.getBalance = function () {
        this.totalBalance = 0;
        this.totalBalance = this.balance - this.cash_credit;
        return this.totalBalance;
    };
    return CurrentAccount1;
}(Account1));
var SavingAccountObj = new SavingAccount1(11, "john", 1500, 10);
console.log(SavingAccountObj.getBalance());
var CurrentAccountObj = new CurrentAccount1(11, "jack", 15000, 500);
console.log(CurrentAccountObj.getBalance());
var Circle = /** @class */ (function () {
    function Circle(radius) {
        this.radius = radius;
    }
    Circle.prototype.print = function () {
        return "The radius of Cicle is " + this.radius + "\nArea is " + (Math.PI * this.radius * this.radius);
    };
    return Circle;
}());
var Employee = /** @class */ (function () {
    function Employee(ename, eid, edesignatio) {
        this.eid = eid;
        this.ename = ename;
        this.edesignatio = edesignatio;
    }
    Employee.prototype.print = function () {
        return "Employee Details:\n" + "Employee Id:" + this.eid + "\n" + "Employee Name: " + this.ename
            + "\n" + "Employee Designation: " + this.edesignatio;
    };
    return Employee;
}());
function printAll(obj1, obj2) {
    console.log(obj1.print());
    console.log(obj2.print());
}
var circleObj = new Circle(2);
var employeeObj = new Employee("john", 11, "jr analyst");
printAll(circleObj, employeeObj);
