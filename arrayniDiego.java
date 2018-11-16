
public  class arrayniDiego {
    public static void main(String[] args) {
        int[] Array = {1,2,3,4,5,7,6,8,10,9,12,11};
        
        System.out.println("Even numbers: " );
        
        for (int a=0; a<Array.length; a++){
            if (Array[a]%2 ==0){
                System.out.println(Array[a]);
            }
    }
        System.out.println("Odd Numbers: ");
        
        for (int a=0; a<Array.length; a++){
            if  (Array[a]%2 != 0){
            System.out.println(Array[a]);
        }
    }
        
    }
                  
} 