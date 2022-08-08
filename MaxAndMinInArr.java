public class MaxAndMinInArr {
    public static void main(String[] args) {
        int arr[]={1445,234534,33,4,5};
        
        
        
       /* int min,max;
        int start=0,       end=arr.length-1;
       
       for max
       while(true){
                if(arr[start]>arr[end]){
                      end--;
                      if (arr[start]==arr[end]) {
                        max =arr[start];
                        System.out.println("max no. in array is "+max);
                        break;
                    }
                  }
                  else{
                    start++;
                    if (arr[start]==arr[end]) {
                        max =arr[start];
                        System.out.println("max no. in array is "+max);
                        break;
                  }
              
                  }
            }
          */
      

            int min=38945934,max=0;

            for (int i = 0; i < arr.length; i++) {
              if (arr[i]>max) {
                max=arr[i];
              }
              if (arr[i]<min) {
                min=arr[i];
                 
              }
            }
            System.out.println(max);
            System.out.println(min);

    }
}
