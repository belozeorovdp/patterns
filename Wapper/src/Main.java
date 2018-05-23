public class Main
{
    public static void main(String[] args)
    {
        WapperString ws = new WapperString("Hello");
        System.out.println("ws: "+ ws.get());
        ws.reverse();
        System.out.println("ws: "+ ws.get());
        System.out.println("ws.length: "+ ws.length());
    }
}
