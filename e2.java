class Demo2{


    public static void main(String args[])
    {
        //using methods and if clause
        String stat;

        stat = club("Pasan", 27);

        System.out.println(stat);

    }


    public static String club(String name, int age)
    {
        boolean stat = false;

        stat = age>21 ? true : false ;

        if(stat==true)
        {
            return("Mr." + name + " Welcome to the club");
        } else
        {
             return("Mr." + name + " You cannot enter!");
        }
        
    }



}