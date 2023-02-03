public class IndexOfExample {
    public static void main(String argvs[])
    {
        String str = "Welcome to Java Program";
        int count = 0;
        int startFrom = 0;
        for(; ;)
        {
            int index = str.indexOf('o', startFrom);
            if(index >= 0)
            {
                count = count + 1;
                startFrom = index + 1;
            }
            else
            {
                break;
            }
        }
        System.out.println("In the String: "+ str);
        System.out.println("The 'o' character has come "+ count + " times");
        /*
        output:-
        In the String: Welcome to Java Program
        The 'o' character has come 3 times
        */
    }
}