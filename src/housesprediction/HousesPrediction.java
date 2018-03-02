/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housesprediction;

import java.util.function.Function;

/**
 *
 * @author Mohamed Nagy
 */
public class HousesPrediction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Testing Phase One.
        
        double[] thetaVector = new double[]{1.004579, 5.286822};// expected theatas value.
        // size.
        
        RegressionLearningMethod regressionLearningMethod = new RegressionLearningMethod(thetaVector);
        
        Double[] data = new Double[]{1.0, 1330.0};
        final double exactPrice = 6500000;
        
        double prediction = regressionLearningMethod.apply(data) * 1000;
        
        System.out.println("predicted :" + prediction + " , expected " + exactPrice );
        System.out.println("error : " + Math.abs(prediction - exactPrice));
        
        
    }
    
}
