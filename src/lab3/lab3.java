package lab3;

import java.lang.Math;

public class lab3 implements var09 {

	public double logika(double d1, double d2, double d3) {
		double max = d1 * d2;
        double temp = d1 * d3;
        if (temp > max)
        	max = temp;
        temp = d2 * d3;
        if (temp > max)
        	max = temp;
        return max;
    }

    public void poka(int N) {
        if (N <= 0)
        {
            System.out.println("Число N отрицательное!");
            return;
        }
        for (int i = 2; i < N; i++)
        	if (N % i == 0) {
          		System.out.println("FALSE");
          		return;
        	}
        System.out.println("TRUE");
    }
    
    public void massivy(double[] A) {
    	if (A.length == 0) {
    		System.out.println("Массив A пуст!");
    		return;
    	}
        double sign = A[0] / Math.abs(A[0]);
        double max = A[0];
        boolean isAlternates = true;
        for (int i = 1; i < A.length; i++) {
        	if (A[i] > max)
        		max = A[i];
        	if (isAlternates && sign * A[i] < 0) {
        		sign *= -1;
        	} else
        		isAlternates = false;
        }
        if (isAlternates)
        	System.out.println(0);
        else
        	System.out.println(max);
    }
	
}
