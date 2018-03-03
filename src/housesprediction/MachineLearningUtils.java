/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housesprediction;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;



/**
 *
 * @author Mohamed Nagy
 */
public class MachineLearningUtils {
    
    public static double cost(Function<Double[], Double> targetFunction, List<Double[]> dataSet, List<Double> exactData, int startPoint){
        if(startPoint < exactData.size()){
            return (1.0/(2*dataSet.size())) 
                    * Math.pow(targetFunction.apply(dataSet.get(startPoint)) - exactData.get(startPoint), 2)
                    + cost(targetFunction, dataSet, exactData, ++startPoint);
        }else{
            return 0;
        }
    }
    
    public static RegressionLearningMethod train(RegressionLearningMethod regressionLearningMethod, List<Double[]> dataSet, 
        List<Double> exactData, Double alpha){
        final int thetaNumber = regressionLearningMethod.getThetas().length;
        double[] newThetaList = new double[thetaNumber];
        
        for(int i = 0; i < thetaNumber; i++){
            newThetaList[i] = regressionLearningMethod.getThetas()[i] - ((alpha/dataSet.size()) * 
                    errorMultiplyFeatureVector(regressionLearningMethod, dataSet, exactData, i, 0));
            System.out.println("done new theta"+i+" is "+ newThetaList[i]);
        }
        return new RegressionLearningMethod(newThetaList);
        
    }
    
    /**
     * This Method calculate Σ(hθ(x.i)-Y.i)
     * @return 
     */
    public static double errorMultiplyFeatureVector(RegressionLearningMethod regressionLearningMethod, List<Double[]> dataSet,
            List<Double> exactData, int vector, int startPoint){
        if(startPoint < dataSet.size()){
            return (regressionLearningMethod.apply(dataSet.get(startPoint)) - exactData.get(startPoint)) * dataSet.get(startPoint)[vector] +
                    errorMultiplyFeatureVector(regressionLearningMethod, dataSet, exactData, vector, startPoint + 1);
        }else{
            return 0;
        }
    }
}
