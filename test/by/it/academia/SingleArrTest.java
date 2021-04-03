package by.it.academia;

import org.junit.Assert;
import org.junit.Test;

public class SingleArrTest {
    @Test
    public void setArrSuit() {
        SingleArr sngArr = new SingleArr();
        int[][] arr = sngArr.setArr(10);
        int waitedResult = 30;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                Assert.assertEquals(waitedResult, arr[i][j]);
            }
        }

    }
}
