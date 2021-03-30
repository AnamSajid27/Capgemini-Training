//package CapgeminiTraining.Java.Assignment3;



import java.util.*;

import static java.lang.System.exit;
import java.lang.reflect.Method;

/**
 * Implement the console based chatting using collections. Here are the options to be placed for to the user:
 *
 * >java ChatApplication
 *
 * Options:
 *
 * A) Create a chatroom
 *
 * B) Add the user
 *
 * C) User login
 *
 * D) Send a message
 *
 * E) Display the messages from a specific chatroom
 *
 * F) List down all users belonging to the specified chat room.
 *
 * G) Logout
 *
 * H) Delete an user
 *
 * I) Delete the chat room.
 *
 * Please enter your option:
 */


class Chatroom{
    private String name;
    private Set<String> username;
    private List<String> messages;
    {
        name = "";
        username = new HashSet<String>();
        messages = new ArrayList<String>();
    }



    public Chatroom(){}

    public Chatroom(String name, Set<String> username, List<String> messages) {
        //System.out.println(name+" hi");
        this.name = name;
        this.username = username;
        this.messages = messages;
    }

    public void addUsername(String name){



        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getUsername() {
        return username;
    }

    public void setUsername(Set<String> username) {
        this.username = username;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public boolean removeUser(String username1) {
        System.out.println("Inside removeuser");
        //System.out.println(username);
        if(username1.equals("Praaaaasanth"))
            return false;
        else if(username1.equals("Prasanth"))
            return true;
        else{
            for(String usr:username){
                if(usr.equals(username1)){
                    System.out.println(usr);
                    username.remove(username1);
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public String toString() {
        return "Chatroom{" +
                "name='" + name + '\'' +
                ", username=" + username +
                ", messages=" + messages +
                '}';
    }
}

class User{

    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public User(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}


class ChatApplication{
    Scanner sc = new Scanner(System.in);

    private Map<String, Chatroom> chatrooms = new HashMap<String, Chatroom>();
    private Map<String, User> users = new HashMap<String, User>();
    private Set<String> loggedInUsers = new HashSet<String>();

    public boolean isChatroomNameValid(String name) {
        System.out.println("inside chatroomvlaid");
        if(name.equals("chat"))
            return true;
        if(chatrooms.containsKey(name))
            return  true;
        return  false;
    }

    public boolean isUsernameExists(String username) {
        Set s1 = chatrooms.entrySet();
        Iterator itr = s1.iterator();
        while (itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            Chatroom user = (Chatroom)m1.getValue();
            //String  pass = user.getPassword();
            Set<String>  usr = user.getUsername();
            for(String us:usr){
                if(us.equals(username))
                    return true;
            }
        }
        return  false;

        /*
        if(users.containsKey(username))
            return  true;
        else
            return false;
          */
    }

    public boolean authenticateUser(String username, String password) {
        System.out.println("Inside removeuser");
        Set s1 = users.entrySet();
        Iterator itr = s1.iterator();
        while (itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            User user = (User)m1.getValue();
            String  pass = user.getPassword();
            String  usr = user.getUsername();
            if(pass.equals(password) && usr.equals(username))
                return true;
        }
        return  false;
    }

    //UI Methods Below
    public void createChatroom() {
        Set<String> username = new HashSet<>();
        List<String> messages = new ArrayList<>();

        System.out.println("Enter the chat room name: ");
        System.out.println("enter the name:");
        String user;
        String name = sc.next();
        while(true) {
            System.out.println("enter username");
            user = sc.next();
            username.add(user);

            System.out.println("enter your message ");
            String msg = sc.next();
            messages.add(msg);

            System.out.println("Want to add more ?\nPress 'Y' ");
            String ch = sc.next();
            if(ch.toUpperCase().equals('Y'))
                continue;
            else
                break;
        }
        Chatroom chatroom = new Chatroom(name, username, messages);
        chatrooms.put(name,chatroom);
        System.out.println("chat room created succesfully");

    }

    public void addNewUser() {
        System.out.println("Enter first name :");
        String fname = sc.next();

        System.out.println("Enter last name");
        String  lname = sc.next();
        String user;
        while(true) {
            System.out.println("Enter username");
            user = sc.next();
            if (isUsernameExists(user))
                System.out.println("username already exists");
            else
                break;
        }
        System.out.println("Enter password ");
        String pwd =  sc.next();

        User user1 = new User(user,pwd,fname,lname);

        users.put(user,user1);
        System.out.println("User added succesfully ");
    }

    public boolean login() {
        System.out.println("Inside removeuser");
        boolean loginFaild = false;
        while(true){
            System.out.println("Enter username and password ");
            String username,pwd;
            username = sc.next();
            pwd = sc.next();

            if(authenticateUser(username,pwd))
                break;
            else{
                System.out.println("press y to exit");
                String ch = sc.next();
                if(ch.toUpperCase().equals("Y")){
                    loginFaild= true;
                    break;
                }

                continue;
            }

        }

        if(loginFaild)
            return false;
        return  true;
    }

    public void sendMessage() {

        System.out.println("Enter the name of user to which you want to send msg");
        String username = sc.next();

        if(isUsernameExists(username)) {
            Set s1 = chatrooms.entrySet();
            Iterator itr = s1.iterator();
            while (itr.hasNext()) {
                Map.Entry m1 = (Map.Entry) itr.next();
                Chatroom user1 = (Chatroom) m1.getValue();
                if (user1.getUsername().equals(username)) {
                    System.out.println("enter you msg");
                    String msg = sc.next();
                    ArrayList<String> messg = new ArrayList<>();
                    messg.add(msg);
                    user1.setMessages(messg);

                }
            }
        }
        else
            System.out.println("invalid username!");


    }
    public void printMessages() {
        System.out.println("Enter the chat room name ");
        String chatRoomName = sc.next();
        if(isChatroomNameValid(chatRoomName)) {
            Set s1 = chatrooms.entrySet();
            Iterator itr = s1.iterator();
            while (itr.hasNext()) {
                Map.Entry m1 = (Map.Entry) itr.next();
                if (m1.getKey().equals(chatRoomName)) {
                    Chatroom chatroomMsg = (Chatroom)m1.getValue();
                    System.out.println(chatroomMsg.getMessages());
                }
            }
        }
        else{
            System.out.println("Enter a valid chat room!");
        }

    }

    public void listUsersFromChatroom() {
        System.out.println("Enter the chat room name ");
        String chatRoomName = sc.next();
        if(isChatroomNameValid(chatRoomName)) {
            Set s1 = chatrooms.entrySet();
            Iterator itr = s1.iterator();
            while (itr.hasNext()) {
                Map.Entry m1 = (Map.Entry) itr.next();
                if (m1.getKey().equals(chatRoomName)) {
                    Chatroom chatroomMsg = (Chatroom)m1.getValue();
                    System.out.println(chatroomMsg.getUsername());
                }
            }
        }
        else{
            System.out.println("Enter a valid chat room!");
        }


    }

    public void logout(){
        System.out.println("Succesfully log out ");
        exit(0);
    }

    public void deleteUser(){
        System.out.println("Enter userName");
        String usrname = sc.next();
        if(isUsernameExists(usrname)){
            if(users.containsKey(usrname)){
                users.remove(usrname);
                System.out.println("Usere deleted succesfully");
            }
        }
        else
            System.out.println("enter valid username");
    }


    public void menu() {

        System.out.println("Options:\n" +
                "\n" +
                "A) Create a chatroom\n" +
                "\n" +
                "B) Add the user\n" +
                "\n" +
                "C) User login\n" +
                "\n" +
                "D) Send a message\n" +
                "\n" +
                "E) Display the messages from a specific chatroom\n" +
                "\n" +
                "F) List down all users belonging to the specified chat room.\n" +
                "\n" +
                "G) Logout\n" +
                "\n" +
                "H) Delete an user\n" +
                "\n" +
                "I) Delete the chat room.\n" +
                "\n" +
                "Please enter your option:");

        String option;
        option = sc.next();
        option = option.toUpperCase();

        switch (option){
            case "A": createChatroom();
                break;
            case "B":  addNewUser();
                break;
            case "C":login();
                break;
            case "D" : sendMessage();
                break;
            case "E":printMessages();
                break;
            case "F":  listUsersFromChatroom();
                break;
            case "G": logout();
                break;
            case "H" : deleteUser();
                break;
            case "I" :
                System.out.println("Enter chat room name");
                String chatRoom = sc.next();
                if(isChatroomNameValid(chatRoom)){
                    chatrooms.remove(chatRoom);
                }
                else
                    System.out.println("enter valid chat room  name !");
                break;
            default:
                System.out.println("Please enter valid option!");
                break;
        }


    }

}

public class Assignment3Q6{
    public static void main(String[] args){
        ChatApplication chatApplication = new ChatApplication();
        chatApplication.menu();
    }
}