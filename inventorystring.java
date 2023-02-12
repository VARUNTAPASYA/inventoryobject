import java.util.Scanner;
class productname{
    String p1="homeappliances";
    String p2="gadgets";
    String p3="mobilephones";
}
class productnum extends productname{
    int p1=10;
    int p2=20;
    int p3=100;
}
class productcost extends productnum{
    String p1="fridges-20000RS a.c.- 50000Rs";
    String p2="watches- 1000rs,earpodes- 1090rs";
    String p3="redmi-30000Rs, realme-25000rs";
}
public class inventorystring {
    public static void newp(int x,int y){
        System.out.println("new Products:"+(x+y));
    }
    public static void delete(int x,int y){
        System.out.println("deleted Products:"+(x-y));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sold=100;
        int added=100;
        productname name=new productname();
        productnum num=new productnum();
        productcost cost=new productcost();
        System.out.println(name.p1+" : "+num.p1+" : "+cost.p1);
        System.out.println(name.p2+" : "+num.p2+" : "+cost.p2);
        System.out.println(name.p3+" : "+num.p3+" : "+cost.p3);
       
        cost.p1=" \n20% offer on homeappliances ";
        System.out.println(cost.p1);
        cost.p2=" \n1% offer on gadgets ";
        System.out.println(cost.p2);
        cost.p3=" \n5% offer on mobiles ";
        System.out.println(cost.p3);
        System.out.println(); 
        newp(added,num.p1);
        newp(added,num.p2);
        newp(added,num.p3);
        System.out.println();
        delete(sold,num.p1);
        delete(sold,num.p2);
        delete(sold,num.p3);
    }
}
