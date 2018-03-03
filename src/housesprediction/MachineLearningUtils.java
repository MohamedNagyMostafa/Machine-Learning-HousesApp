/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housesprediction;

import java.util.List;
import java.util.function.Function;



/**
 *
 * @author Mohamed Nagy
 */
public class MachineLearningUtils {
    
    public static double cost(Function<Double[], Double> targetFunction, List<Double[]> dataSet, List<Double> exactData, int startPoint){
        if(startPoint < exactData.size()){
            return (1.0/(2*dataSet.get(startPoint).length)) 
                    * Math.pow(targetFunction.apply(dataSet.get(startPoint)) - exactData.get(startPoint), 2)
                    + cost(targetFunction, dataSet, exactData, ++startPoint);
        }else{
            return 0;
        }
    }
}
