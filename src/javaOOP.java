public class javaOOP {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        Vehicle car2 = new Vehicle();
        Vehicle car ;
        int[] x = new int[]{2,3,4,5,6};
        int y = 3;
        for (int a:x) {
            System.out.print(a+" ");
        }
        System.out.println("\n"+y);
        System.out.println("============================================");
        car1.setWheel(3);
        car2.setWheel(4);
        car=car1;
        System.out.println("car1 has "+car1.getWheel()+" wheels.");
        System.out.println("car2 has "+car2.getWheel()+" wheels.");
        System.out.println("car has "+car.getWheel()+" wheels.");
	System.out.print("============================================");
    }
}
