public class SplitExample{
    public static void main(String args[]){
        String s1="java string split method by Avi";
        String[] words=s1.split("\\s");
        for(String w:words){
            System.out.println(w);
        }
        /*
        output:-
        java
        string
        split
        method
        by
        Avi
        */
    }
}