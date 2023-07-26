class Product
{
String pcode,pname;
int price;
Product(String pcode_get,String pname_get,int price_get)
{
 pcode=pcode_get;
pname=pname_get;
price=price_get;
}


void compare(Product p1,Product p2)
{
if(price<=p1.price && price<=p2.price)
{
System.out.println("lowest product:"+pname+ " ,"+pcode+ " , " +price);}

else if(p2.price<=price && p2.price<=p1.price)
{
System.out.println("lowest product:"+p2.pname+ " ,"+p2.pcode+ " , " +p2.price);}

else
{
System.out.println("lowest product:"+p1.pname+ " ,"+p1.pcode+ " , " +p1.price);}

}

public static void main(String args[])
{

Product p_1=new Product("A123","TV",7);
Product p_2=new Product("B123","Cd",4);
Product p_3=new Product("C123","DVd",3);
p_1.compare(p_2,p_3);


}
}



