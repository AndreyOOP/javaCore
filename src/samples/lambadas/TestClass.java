package samples.lambadas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {

    public static void main(String[] args) {
        
        FuncInterface fi  = (a, b) -> {return a + b; };
        FuncInterface fi2 = (a, b) -> {return a - b; };

        fi.sum(5, 5);
        fi2.sum(5, 5);

        System.out.println(fi.sum(5, 5) + " ; " + fi2.sum(5, 5) + " ; " + new IntImplement().sum(5, 5));
    }

    static class IntImplement implements FuncInterface{

        @Override
        public int sum(int a, int b){
            return a + b;
        }
    }
}
