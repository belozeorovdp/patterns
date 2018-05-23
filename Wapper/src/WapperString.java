public class WapperString
{
    private String str;
    //public StringBuilder a = new StringBuilder();
    public WapperString (String str)
    {
        this.str = str;
        //a.reverse()
    }
    public int length()
    {
        return str.length();
    }
    public void append(String str)
    {
        this.str = this.str + str;
    }
    public void append(int intv)
    {
        this.str = this.str + intv;
    }
    public void reverse()
    {
        char [] string_char = this.str.toCharArray();
        for (int i = 0; i < string_char.length/2; i++)
        {
            char buffchar = string_char[i];
            string_char[i] = string_char[this.str.length() - i - 1];
            string_char[this.str.length() - i - 1] = buffchar;
        }
        this.str = new String(string_char);
    }

    public String get()
    {
        return this.str;
    }
}
