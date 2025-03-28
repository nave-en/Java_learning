public class JavaString {
    public static void main(String[] args) {
        String a = "Hello";
        System.out.println(a.charAt(0));
        a = "World";
        System.out.println(a.charAt(0));
        StringBuilder sb = new StringBuilder(a);
        sb.setCharAt(0,'h');
        System.out.println(sb);
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append("World");
        System.out.println(builder);
    }
}
