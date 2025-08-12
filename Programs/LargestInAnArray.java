public class LargestInAnArray {

    static void app1(){
        int arr [] = {5,6,8,7,9,6,66,46,55,78};
        int max = 0;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    max = arr[i];
                }
            }
            }
            System.out.println(max);
        }
    }

    static void app2()
    {
        int arr [] = {5,6,8,7,9,6,66,46,55,78};
        int max = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        app2();
        
    }

