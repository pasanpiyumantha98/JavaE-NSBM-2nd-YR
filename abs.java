abstract class computer{

public  abstract void comp();

    
}

class dekstop extends computer{

public void comp(){
    System.out.println("Compiling faster...");
}

}

class laptop extends computer{

public void comp(){
    System.out.println("Compiling...");
}

}

class dev {

public void code(computer lap)
{   
    lap.comp();
    System.out.println("Coding");
}
}

class Demo7{

    public static void main(String args[])
    {
        computer l1 = new laptop();

        dev d1 = new dev();

        d1.code(l1);



    }

}
