public class HelloWorld {
    public static void main(String[] args) {

    }

    public String sayHi() {
        return "Hello World";
    }

    public String sayHi(String name) {
        String substring1 = name.substring(0,1).toUpperCase();
        String substring2 = name.substring(1,name.length()).toLowerCase();
        String capitalizedName = substring1 + substring2;
        return "Hello " + capitalizedName;
    }
}
