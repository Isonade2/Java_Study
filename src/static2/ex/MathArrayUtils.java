package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){

    }

    public static int sum(int[] values){
        int result = 0;
        for(int n: values){
            result += n;
        }
        return result;
    }

    public static double average(int[] values){
        int result = 0;
        for(int n: values){
            result += n;
        }
        return (double)result/values.length;
    }

    public static int min(int[] values){
        int min = values[0];
        for(int n: values){
            if(min > n){
                min = n;
            }
        }
        return min;
    }

    public static int max(int[] values){
        int max = values[0];
        for(int n: values){
            if(max < n){
                max = n;
            }
        }
        return max;
    }
}
