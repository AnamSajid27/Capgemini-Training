// variables
var a: number;
var b: boolean;
var c: string;
a =10;

// array 

var  array : number[];
array = [];
array =[1,2]
//array =["1"];

// tuple  fix set of element

var myArry :[number,boolean];
myArry = [1,true];

// function
//c? optional

function add1(a:number=2,b:number,c?){
    return a+b;
}
console.log(add1(10,20));
console.log(add1(3,2,1));

// 
var f:any;   // type of any
f =10;
f=true;
f="hello";

// union type
var a1 : number | boolean;
a1=10;
a1=true;
//a1="stign";





