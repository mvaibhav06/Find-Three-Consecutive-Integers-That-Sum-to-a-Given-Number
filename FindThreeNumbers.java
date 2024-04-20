public class FindThreeNumbers {
    public long[] sumOfThree(long num) {

        if((num-3)%3 == 0){
            long i = (num-3)/3;
            return new long[]{i,i+1,i+2};
        }
        return new long[]{};
    }
}
