package CapgeminiTraining.Java.Assignment3;

/**
 * There is parking slot available in R-Mall with 3 floors; each floor has 4 sections and each section can
 * maximum park 20 cars. You need to design one application which will maintain all car details in such way
 * when a car owner arrives to collect his care your application should provide details including where it is located.
 *
 * a. Create class Parked_CarOwner_Details which will have field’s owerName, carModel, carNO, owerMobileNo,
 * owerAddress with setter and getter methods.
 *
 * b. Create class Parked_CarOwenerList which will have method’s int add_new_car(Parked_CarOwner_Details obj),
 * remove_car(), get_parked_car_location(token).
 */


class ParkingSlot {
private String ownerName;
private int carNumber;
private int token;
private int level;
private int section;
private int slot;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
}

class Parked_CarOwenerList {
    int levels = 3;
    int sections = 4;
    int slots = 20;
     static int token1 =111;
    private  ParkingSlot parkingSlot;
    int i=1;
    public void add_new_car(Assignment3Q7 obj){
        parkingSlot = new ParkingSlot();
        if(levels==3){
            parkingSlot.setLevel(1);

            if(sections==4 && slots!=0){
                parkingSlot.setSection(1);
                parkingSlot.setSlot(i++);
                parkingSlot.setCarNumber(obj.getCarNo());
                parkingSlot.setOwnerName(obj.getName());
                parkingSlot.setToken(token1);
                token1= token1++;
                slots--;
                if(slots==0) {
                    sections--;
                    slots=20;
                    i=0;
                }
            }
            else if(sections==3 && slots!=0){
                parkingSlot.setSection(2);
                parkingSlot.setSlot(i++);
                parkingSlot.setCarNumber(obj.getCarNo());
                parkingSlot.setOwnerName(obj.getName());
                parkingSlot.setToken(token1);
                token1= token1++;
                slots--;
                if(slots==0) {
                    sections--;
                    slots=20;
                    i=0;
                }
            }
            else if(sections==2 && slots!=0){
                parkingSlot.setSection(3);
                parkingSlot.setSlot(i++);
                parkingSlot.setCarNumber(obj.getCarNo());
                parkingSlot.setOwnerName(obj.getName());
                parkingSlot.setToken(token1);
                token1= token1++;
                slots--;
                if(slots==0) {
                    sections--;
                    slots=20;
                    i=0;
                }
            }
            else{
                parkingSlot.setSection(4);
                parkingSlot.setSlot(i++);
                parkingSlot.setCarNumber(obj.getCarNo());
                parkingSlot.setOwnerName(obj.getName());
                parkingSlot.setToken(token1);
                token1= token1++;
                slots--;
                if(slots==0) {
                    sections--;
                    slots=20;
                    i=0;
                    levels--;
                    sections=4;
                }
            }

        }
        else if(levels==2){
            parkingSlot.setLevel(2);
            if(sections==4 && slots!=0){
                parkingSlot.setSection(1);
                parkingSlot.setSlot(i++);
                parkingSlot.setCarNumber(obj.getCarNo());
                parkingSlot.setOwnerName(obj.getName());
                parkingSlot.setToken(token1);
                token1= token1++;
                slots--;
                if(slots==0) {
                    sections--;
                    slots=20;
                    i=0;
                }
            }
            else if(sections==3 && slots!=0){
                parkingSlot.setSection(2);
                parkingSlot.setSlot(i++);
                parkingSlot.setCarNumber(obj.getCarNo());
                parkingSlot.setOwnerName(obj.getName());
                parkingSlot.setToken(token1);
                token1= token1++;
                slots--;
                if(slots==0) {
                    sections--;
                    slots=20;
                    i=0;
                }
            }
            else if(sections==2 && slots!=0){
                parkingSlot.setSection(3);
                parkingSlot.setSlot(i++);
                parkingSlot.setCarNumber(obj.getCarNo());
                parkingSlot.setOwnerName(obj.getName());
                parkingSlot.setToken(token1);
                token1= token1++;
                slots--;
                if(slots==0) {
                    sections--;
                    slots=20;
                    i=0;
                }
            }
            else{
                parkingSlot.setSection(4);
                parkingSlot.setSlot(i++);
                parkingSlot.setCarNumber(obj.getCarNo());
                parkingSlot.setOwnerName(obj.getName());
                parkingSlot.setToken(token1);
                token1= token1++;
                slots--;
                if(slots==0) {
                    sections--;
                    slots=20;
                    i=0;
                    levels--;
                    sections=4;
                }
            }

        }
        else {
            parkingSlot.setLevel(3);
            if (sections == 4 && slots != 0) {
                parkingSlot.setSection(1);
                parkingSlot.setSlot(i++);
                parkingSlot.setCarNumber(obj.getCarNo());
                parkingSlot.setOwnerName(obj.getName());
                parkingSlot.setToken(token1);
                token1 = token1++;
                slots--;
                if (slots == 0) {
                    sections--;
                    slots = 20;
                    i = 0;
                }
            } else if (sections == 3 && slots != 0) {
                parkingSlot.setSection(2);
                parkingSlot.setSlot(i++);
                parkingSlot.setCarNumber(obj.getCarNo());
                parkingSlot.setOwnerName(obj.getName());
                parkingSlot.setToken(token1);
                token1 = token1++;
                slots--;
                if (slots == 0) {
                    sections--;
                    slots = 20;
                    i = 0;
                }
            } else if (sections == 2 && slots != 0) {
                parkingSlot.setSection(3);
                parkingSlot.setSlot(i++);
                parkingSlot.setCarNumber(obj.getCarNo());
                parkingSlot.setOwnerName(obj.getName());
                parkingSlot.setToken(token1);
                token1 = token1++;
                slots--;
                if (slots == 0) {
                    sections--;
                    slots = 20;
                    i = 0;
                }
            } else {
                parkingSlot.setSection(4);
                parkingSlot.setSlot(i++);
                parkingSlot.setCarNumber(obj.getCarNo());
                parkingSlot.setOwnerName(obj.getName());
                parkingSlot.setToken(token1);
                token1 = token1++;
                slots--;
                if (slots == 0) {
                    System.out.println("parking is full");

                }
            }
        }

    }
    public void remove_car(String name,int carNo){
        if(parkingSlot.getOwnerName().equals(name) && parkingSlot.getCarNumber()==carNo){
            parkingSlot = null;
            System.gc();
            System.out.println("Car removed succesfull");

        }
    }
    public String get_parked_car_location(int token){
        System.out.println(token);
        return "level : "+parkingSlot.getLevel()+",section : "+parkingSlot.getSection()+",slot: "+parkingSlot.getSlot()+".";

    }
}

public class Assignment3Q7 {
    private String name;
    private String carModel;
    private int carNo;
    private int mobileNumber;
    private String address;

    public Assignment3Q7(String name, String carModel, int carNo, int mobileNumber, String address) {
        this.name = name;
        this.carModel = carModel;
        this.carNo = carNo;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarNo() {
        return carNo;
    }

    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Assignment3Q7{" +
                "name='" + name + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carNo=" + carNo +
                ", mobileNumber=" + mobileNumber +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        /*
        name='Ajay', carModel='Hyundai', carNo=123, mobileNumber=89858321,
                address='Nellore'
                */
        Assignment3Q7 car1 = new Assignment3Q7("Ajay","Hundai",123,8958321,"Nellore");
        Parked_CarOwenerList owenerList = new Parked_CarOwenerList();
        owenerList.add_new_car(car1);
        System.out.println(owenerList.get_parked_car_location(111));

        Assignment3Q7 car2 = new Assignment3Q7("Ajay1","Hundai",123,8958321,"Nellore");
        owenerList.add_new_car(car2);
        System.out.println(owenerList.get_parked_car_location(112));



    }
}