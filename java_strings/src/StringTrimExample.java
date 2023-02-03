public class StringTrimExample{
    public static void main(String args[]){
        String s1="  hello string   ";
        System.out.println(s1+"javatpoint");
        System.out.println(s1.trim()+"javatpoint");
        /*
        output:-
        hello string   javatpoint
        hello stringjavatpoint
        */
    }
}