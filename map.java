import java.util.Map;
import java.util.HashMap;

class demo11{


public static void main(String args[]){

//using hashmaps
Map <Integer,String> studs = new HashMap<>();

studs.put(101, "Pasan");
studs.put(102, "Nimal");

for(String x: studs.values())
{
    System.out.println(x);
}

}
}