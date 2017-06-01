public class HelloWorld{

    public static void main(String []args){
        
        Calculator calc1 = new Calculator();
        System.out.println(calc1.add(2f));
        System.out.println(calc1.add(2f));
        System.out.println(calc1.add(2f));
        calc1.clear();
        System.out.println(calc1.add(2f));
    }
}
