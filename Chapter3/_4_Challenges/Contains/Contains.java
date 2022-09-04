package Chapter3._4_Challenges.Contains;
/*
true if array contains a value. false otherwise
 */
public class Contains {
    public boolean arrayContains(int[] arr, int target){

        for(int i=0; i<arr.length;i++){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }
    //if statment in side a for loop

}
