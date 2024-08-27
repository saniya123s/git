import java.util.StringJoiner;
public class Example2{
    public static void main(String[] args){
        StringJoiner sj=new StringJoiner("/");
        sj.add("08").add("2024");
        System.out.println(sj.toString());
        StringJoiner sj2=new StringJoiner("-");
        sj2.setEmptyValue("object is empty");
        sj2.add("hello");
        System.out.println(sj2.toString());
        sj.merge(sj2);
        System.out.println(sj.toString());
            }
}