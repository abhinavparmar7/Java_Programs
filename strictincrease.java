public class strictincrease {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int index=0,e=0,x=0;
        
        int n = sc.nextInt();
        
        int[] nums= new int[n];
     
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
      
       
       
            for(int i=0; i<n; i++) {
                for(int j=i+1; j<n; j++) {
                    if(nums[i] == nums[j]){
                       x=1;
                    }
                }
            }
            
       
    
        for(int j=0; j<n; j++){
           if(nums[j]<nums[j+1]) {
               e++;
           }
           else{
               break;
           }
        }
        
        System.out.println("-->"+e+"<--");
        int[] arr = new int[n-1];
        int j=0;
        for(int i=0; i<n; i++){
            if(i != e) {
                arr[j] = nums[i];
                j++;
            }
        }

        
        int b = n-1;
        if(x==1) {
            System.out.println("False");
        }
        else if(e == n) {
            System.out.println("False");
        }
        else if(b == n-1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        //System.out.println("After deletion :" + Arrays.toString(arr));
       }
}
