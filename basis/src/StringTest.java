import javax.sound.midi.Soundbank;

/**
 * 练习字符串常用的api
 */
public class StringTest {
    public static void main(String[] args) {

        String strings = "helloworld";


        char c = strings.charAt(5);
        System.out.println("charAt()返回指定索引处的字符：" + c);

        int i = strings.codePointAt(5);
        System.out.println("codePointAt()返回指定索引处的字符的unicode代码点: " + i);

        int i1 = strings.codePointBefore(5);
        System.out.println(i1);

        int i2 = strings.codePointCount(5, 8);
        System.out.println(i2);

        int helloWorld = strings.compareTo("helloWorld");
        System.out.println(helloWorld);

        int helloWorld1 = strings.compareToIgnoreCase("helloWorld");
        System.out.println(helloWorld1);

        String jack = strings.concat("jack");
        System.out.println(jack);

        boolean world = strings.contains("world");
        System.out.println(world);

        boolean hello = strings.contentEquals("hello");
        System.out.println(hello);

        boolean helloworldbf = strings.contentEquals(new StringBuffer("helloworld"));
        System.out.println(helloworldbf);

        String s = String.copyValueOf(new char[]{'h', 'e'});
        System.out.println(s);

        String format = String.format("-",strings);
        System.out.println(format);

        byte[] bytes = strings.getBytes();
        for (int i3 = 0; i3 < bytes.length; i3++) {
            System.out.print(bytes[i3]+"  ");
        }

        System.out.println();

        int h = strings.indexOf('h');
        System.out.println(h);

        String intern = strings.intern();
        System.out.println(intern);

        System.out.println(strings.isEmpty());

        CharSequence charSequence = new StringBuffer("jackli");

        boolean matches = strings.matches("-");
        System.out.println(matches);

        String anotherString = "";
        char[] chars = strings.toCharArray();
        for (char aChar : chars) {

            if (aChar == chars[chars.length-1]){
                anotherString += String.valueOf(aChar);
                break;
            }
            anotherString += String.valueOf(aChar)+"-";
        }
        System.out.println(anotherString);


        String[] split = anotherString.split("-");
        for (String s1 : split) {
            System.out.print(s1);
        }

        System.out.println();

        CharSequence charSequence1 = strings.subSequence(5, 8);
        System.out.println(charSequence1);

        String substring = strings.substring(5);
        System.out.println(substring);

    }
}
