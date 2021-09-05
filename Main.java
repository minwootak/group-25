public class group25
{
    public static void main(String args[])
    {
        Frame frame = new Frame();
        System.out.println("Type a keyword you would like to search.");
        Scanner sc = new Scanner(System.in);
        String Keyword = sc.next();
        sc.close();
        DataLoad(Keyword);
    }
}
