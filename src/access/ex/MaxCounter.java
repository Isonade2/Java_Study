package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    MaxCounter(int max){
        this.count = 0;
        this.max = max;
    }

    void increment(){
        if(count < max){
            count += 1;
        }else{
            System.out.println("최대값을 초과할 수 없습니다.");
        }

    }
    int getCount(){
        return count;
    }
}
