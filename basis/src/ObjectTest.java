public class ObjectTest {
    public static void main(String[] args) {

        String strings = "helloworld";

        Class<? extends String> aClass = strings.getClass();
        System.out.println(aClass);

        Class<Object> objectClass = Object.class;
        System.out.println(objectClass);
    }
}
