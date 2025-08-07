public class SmallestElement {
    static void smallest()
    {
        int arr [] = {5,6,8,7,9,6,66,46,55,78,-5,-8,-1,-9,-56,-3};
        int min = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        smallest();
    }
}
