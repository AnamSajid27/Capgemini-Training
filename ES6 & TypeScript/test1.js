/**
 * 4.	Collections: Using Set & Map, create a static data for chatting application. 
 * Here we have 2 chatrooms, every chatroom is having 3 users & every user has 
 * posted different messages in a chat room. Note that one user can belong to a 
 * single chat room only. Now you need to find out how you will hold this data 
 * using Set & Map data structures. Also add functionality to get list of all users 
 * from a specific chatroom & listing down all message from a chatroom.
*/

class User{
    constructor(name,msg){
        this.name=name;
    }
    
}
class chatroom1{
    constructor(msg){
        this.msg;
    }
    getmsg(){
        return this.msg;
    }
}

class chatroom2{
    constructor(msg){
        this.msg;
    }
    getmsg(){
        return msg;
    }

}

u1 = new User("john");
u2= new User("dick");
u3 = new User("harry");
u4 = new User("john1");
u5 = new User("dick1");
u6 = new User("harray1");


var mp = new Map();
mp.set(u1,chatroom1);
mp.set(u2,chatroom1);
mp.set(u3,chatroom1);
mp.set(u4,chatroom2);
mp.set(u1,chatroom2);
mp.set(u6,chatroom2);

console.log(get(u1))





