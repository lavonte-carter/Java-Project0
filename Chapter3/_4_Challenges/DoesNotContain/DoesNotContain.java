package Chapter3._4_Challenges.DoesNotContain;

public class DoesNotContain {
    public boolean arrayDoesNotContain(int[] arr, int target) {

        for(int i=0; i<arr.length;i++){
            if (arr[i] == target){
                return false;
            }
        }
        return true;
    }
    //if statment in side a for loop

}
