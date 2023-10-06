public class Shop {
    public static void main(String[] args) {

        Product p1=new Product("LCD", 50000, 2, new Date(10,4,2023));
        Product p2=new Product("Keyboard",700,10, new Date(23,6,2022));
        Product p3=new Product("Keyboard wireless",700,10,new Date(3,7,2020));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p1.islatest(p1,p2);
        System.out.println("latest : "+p1.islatest(p1,p2));

    }
}
