class train{

    int capacity;
    String name;

    public void trainname()
    {
        System.out.println("The train name is " + name);
    }

}

class intercitytrain extends train{

double speed = 120.50;
    public void speedk {
        System.out.println("This train is intercity and speed is " + speed)
    }

}




class demo4{


public static void main(String args[]){

intercitytrain t1 = new intercitytrain();

t1.name="Sagarika";

t1.trainname();

t1.speedk();


}

}