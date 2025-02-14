interface computer{

//implementing interfaces with java
void comp();

    
}

class dekstop implements computer{

public void comp(){
    System.out.println("Compiling faster...");
}

}

class laptop implements computer{

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

class Demo8{

    public static void main(String args[])
    {
        computer l1 = new laptop();

        dev d1 = new dev();

        d1.code(l1);



    }

}
