package My_Java_Programs;

public class SecondHighestValueInArray {

// Sort the array using bubble sort
// Print the second element
	
    public static void main(String[] args) {
        int[] array = {2,1,3,4,5,6,7,89,3,4};
        int i, j, temp;
        int num = array.length;
        
        for (i = 0; i < ( num - 1 ); i++) {
            for (j = 0; j < num - i - 1; j++) {
              if (array[j] < array[j+1]) 
              {
                 temp = array[j];
                 array[j] = array[j+1];
                 array[j+1] = temp;
              }
            }
          }
       
          System.out.println("The second highest value is: " + array[1]);
    }
}
