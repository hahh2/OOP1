public class Test {
    public static void main(String[] args){
        Girl anna = new Anna();
        System.out.println("Anna: " + anna.getName() + ", " + anna.getAge() + ", " + anna.getSex());
        Girl emma = new Emma();
        System.out.println("Emma: " + emma.getName() + ", " + emma.getAge() + ", " + emma.getSex());
        Boy jack = new Jack();
        System.out.println("Jack: " + jack.getName() + ", " + jack.getAge() + ", " + jack.getSex());
        Boy duo = new Duo();
        System.out.println("Duo: " + duo.getName() + ", " + duo.getAge() + ", " + duo.getSex());
    }
}
