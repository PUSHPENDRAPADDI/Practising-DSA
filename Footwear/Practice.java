import java.util.Scanner;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        Footwear[] footwears=new Footwear[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
        int a=sc.nextInt();sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();
        int d=sc.nextInt();
        sc.nextLine();
        footwears[i]=new Footwear(a,b,c,d);
        }
      String inputFootwearType=sc.nextLine();
      String inputFootwearBrand=sc.nextLine();
      int count   =getCountByType(footwears,inputFootwearType);
         if(count==0)
         {
             System.out.println("Footwear not available");
         }
         else
         {
             System.out.println(count);
         }

        Footwear obj=getSecondHighestPriceByBrand(footwears,inputFootwearBrand);
          if(obj==null)
          {
              System.out.println("Brand not available");
          }
          else
          {
              System.out.println(obj.footwearId);
              System.out.println(obj.footwearName);
              System.out.println(obj.price);
          }


    }
    public static Footwear getSecondHighestPriceByBrand(Footwear[] footwears, String inputFootwearBrand) {
        int arrofprice[]=new int[0];
        for (int i = 0; i <5 ; i++) {
            if(footwears[i].footwearName.equalsIgnoreCase(inputFootwearBrand))
            {
                arrofprice=Arrays.copyOf(arrofprice,arrofprice.length+1);
                arrofprice[arrofprice.length-1]=footwears[i].price;
            }
        }
        Arrays.sort(arrofprice);
            if(arrofprice.length>0)
            {
                int x = arrofprice[arrofprice.length - 2];
                for (int i = 0; i < footwears.length; i++) {
                    if (footwears[i].price == x) {
                        return footwears[i];
                    }
                }
            }

        return null;
    }
    public static int  getCountByType(Footwear[] footwears,String type)
   {
       int count=0;
       for (int i = 0; i < 5; i++) {
           if(footwears[i].footwearType.equalsIgnoreCase(type))
           {
               count+=1;
           }
       }
       if(count>0)
       {
           return count;
       }
       return 0;
   }
}
class Footwear{
    int footwearId;
    String footwearName;
    String footwearType;
    int price;
    public Footwear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }
    public int getFootwearId() {
        return footwearId;
    }

    public void setFootwearId(int footwearId) {
        this.footwearId = footwearId;
    }

    public String getFootwearName() {
        return footwearName;
    }

    public void setFootwearName(String footwearName) {
        this.footwearName = footwearName;
    }

    public String getFootwearType() {
        return footwearType;
    }

    public void setFootwearType(String footwearType) {
        this.footwearType = footwearType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

