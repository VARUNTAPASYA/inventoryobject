public class inventory{
    public static void main(String[] args) {
        int i;
        String productsname[]={"homeappliances","gadgets","mobilephones"};
        int a=productsname.length;
        int productsnum[]={10,20,100};
        String productcost[]={"fridges-20000RS a.c.- 50000Rs","watches- 1000rs,earpodes- 1090rs",
        "redmi-30000Rs, realme-25000rs"};
        for(i=0;i<a;i++)
        {
            for(i=0;i<a;i++)
            {
            System.out.println(productsname[i]+" - "+productsnum[i]+" : "+productcost[i]);
        }
    }
    
    System.out.println("\nproducts are deleted");
    int delete=30;
    for(i=0;i<a;i++)
    {
        System.out.println(productsnum[i]-delete+" "+productsname[i]);
    }
    System.out.println("\nproducts arrived added");
    int add=60;
    for(i=0;i<a;i++)
    {
        System.out.println(productsnum[i]+add+" "+productsname[i]);
    }
    }
    }
