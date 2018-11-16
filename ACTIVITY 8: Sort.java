//COCKTAIL SORT
//Caranto, Dumacil, Gallardo, Navalta, Asuncion
package sort;

public class Sort {

    public static void main(String[] args) {
        int myArray[] = {8,16,14,13,3,7,2,18,17,9,15,20,4,5,12,10,1,19,11,6};
        
        for (int e = 0; e != (myArray.length); e++){
            System.out.print(myArray[e] + "\t");
        }
        cocktailSort(myArray);
        System.out.print("\n");
        
        for (int e = 0; e != (myArray.length); e++){
            System.out.print(myArray[e] + "\t");
        }
    }
    static int[] cocktailSort(int a[]){
        
        int temp;
        int start = 0;
        int end = a.length-1;
        boolean movement;
        
        do{
            
         movement = false;

            for (int i = start; i < (end); i++){
                if (a[i] > a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    movement = true;
                }  
           }
            
            end--;

            for (int i = end; i >= start; i--){
                if (a[i] > a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    movement = true;
                }
            }
            start++;
        
        } while (movement);
        
        return a; 
        
    }
    
}
