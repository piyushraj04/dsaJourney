package SearchingAlgos;
public class LinearSearchString {
    static int linearSearch(String[] str,String key)
    {
        for(int i = 0;i<str.length;i++)
        {
            if(str[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str[] = {"ram","shyam","piyush","gagan"};
        int index = linearSearch(str,"ram");
        if(index==-1)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println("String find at index : "+index);
        }

    }
}
