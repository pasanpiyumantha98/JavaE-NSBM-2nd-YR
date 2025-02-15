class Demo9 {

public static void main(String args[])
{

int a=3;
int b=0;
int result=0;

//errors handling 
try{
result = a/b;
}
catch(Exception e)
{
System.out.println(e);
}

System.out.println(result);
System.out.println("hello");


}

}