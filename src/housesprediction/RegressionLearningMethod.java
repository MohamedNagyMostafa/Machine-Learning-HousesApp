/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housesprediction;

import java.util.Arrays;
import java.util.function.Function;

/**
 *
 * @author Mohamed Nagy
 */
public class RegressionLearningMethod implements Function<Double[], Double>{
    private final double [] THETA_VECTOR;
    
    public RegressionLearningMethod(double []thetaVector){
        THETA_VECTOR = thetaVector;
    }
    
    @Override
    public Double apply(Double[] featureVector) {
        assert featureVector[0] == 1.0;
        double prediction = 0;
        prediction = linearRegression(featureVector, (int)prediction);
        
        return prediction;
    }
    
    private double linearRegression(Double [] featureVector, int mover){
        if(mover < THETA_VECTOR.length){
            return (Math.pow(featureVector[mover], mover)* THETA_VECTOR[mover])+ linearRegression(featureVector, mover + 1);
        }else{
            return 0.0f;
        }
    }
    
    public double [] getThetas(){
        return Arrays.copyOf(THETA_VECTOR, THETA_VECTOR.length);
    }
    
}
