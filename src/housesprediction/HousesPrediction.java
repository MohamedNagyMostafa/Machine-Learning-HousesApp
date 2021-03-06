/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housesprediction;

import java.util.List;
import java.util.ArrayList;


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
        
        double[] thetaVector = new double[]{0.1, 0.1,0.1};// expected theatas value.
        // size.
        
        RegressionLearningMethod regressionLearningMethod = new RegressionLearningMethod(thetaVector);
        
//        Double[] data1 = new Double[]{1.0, 90.0, 2.0, 1.0};
//        Double[] data2 = new Double[]{1.0, 101.0, 2.0, 0.5};
//        Double[] data3 = new Double[]{1.0, 200.0, 4.0, 3.0};
//        Double[] data4 = new Double[]{1.0, 500.0, 3.0, 1.5};
//        Double[] data5 = new Double[]{1.0, 650.0, 5.0, 3.0};
//        Double[] data6 = new Double[]{1.0, 900.0, 6.0, 4.0};
//        Double[] data7 = new Double[]{1.0, 1330.0, 8.0, 2.0};
        
        Double[] data1 = new Double[]{1.0, 90.0, 90.0} ;
        Double[] data2 = new Double[]{1.0, 101.0, 101.0};
        Double[] data3 = new Double[]{1.0, 200.0, 200.0};
        Double[] data4 = new Double[]{1.0, 500.0, 500.0};
        Double[] data5 = new Double[]{1.0, 650.0, 650.0};
        Double[] data6 = new Double[]{1.0, 900.0, 900.0};
        Double[] data7 = new Double[]{1.0, 1330.0, 1330.0};
        
        final double exactPrice1 = 249000;
        final double exactPrice2 = 338000;
        final double exactPrice3 = 400000;
        final double exactPrice4 = 738000;
        final double exactPrice5 = 810000;
        final double exactPrice6 = 1986000;
        final double exactPrice7 = 2338000;
        
        double prediction1 = regressionLearningMethod.apply(data1);
        double prediction2 = regressionLearningMethod.apply(data2);
        double prediction3 = regressionLearningMethod.apply(data3);
        double prediction4 = regressionLearningMethod.apply(data4);
        double prediction5 = regressionLearningMethod.apply(data5);
        double prediction6 = regressionLearningMethod.apply(data6);
        double prediction7 = regressionLearningMethod.apply(data7);

        System.out.println("predicted1 :" + prediction1 + " , expected1 " + exactPrice1 );
        System.out.println("error1 : " + Math.abs(prediction1 - exactPrice1));
        System.out.println("predicted2 :" + prediction2 + " , expected2 " + exactPrice2 );
        System.out.println("error2 : " + Math.abs(prediction2 - exactPrice2));
        System.out.println("predicted3 :" + prediction3 + " , expected3 " + exactPrice3 );
        System.out.println("error3 : " + Math.abs(prediction3 - exactPrice3));
        System.out.println("predicted4 :" + prediction4 + " , expected4 " + exactPrice4 );
        System.out.println("error4 : " + Math.abs(prediction4 - exactPrice4));
        System.out.println("predicted5 :" + prediction5 + " , expected5 " + exactPrice5 );
        System.out.println("error5 : " + Math.abs(prediction5 - exactPrice5));
        System.out.println("predicted6 :" + prediction6 + " , expected6 " + exactPrice6 );
        System.out.println("error6 : " + Math.abs(prediction6 - exactPrice6));
        System.out.println("predicted7 :" + prediction7 + " , expected7 " + exactPrice7 );
        System.out.println("error7 : " + Math.abs(prediction7 - exactPrice7));
        // Calculate cost.
        List<Double[]> dataSet = new ArrayList<>();
        dataSet.add(data1);
        dataSet.add(data2);
        dataSet.add(data3);
        dataSet.add(data4);
        dataSet.add(data5);
        dataSet.add(data6);
        dataSet.add(data7);
       
        List<Double> exactData = new ArrayList<>();
        exactData.add(exactPrice1);
        exactData.add(exactPrice2);
        exactData.add(exactPrice3);
        exactData.add(exactPrice4);
        exactData.add(exactPrice5);
        exactData.add(exactPrice6);
        exactData.add(exactPrice7);
        double cost = MachineLearningUtils.cost(regressionLearningMethod, dataSet, exactData, 0);
        System.out.println("cost : "+ getNumber(cost));
        double error = exactData.get(0) - prediction1;
        System.out.println("error " + error);
        // set train.
        for(int j = 0;j< 10; j++){
            long i;
            if(j == 0)
                i = 0;
            else
                i = 2000000000l;
            for( ;i< 3000000000l + j;i++){
            regressionLearningMethod = MachineLearningUtils.train(regressionLearningMethod, dataSet, exactData,0.000000001);
            }
              prediction1 = regressionLearningMethod.apply(data1) ;
            prediction2 = regressionLearningMethod.apply(data2) ;
            prediction3 = regressionLearningMethod.apply(data3) ;
            prediction4 = regressionLearningMethod.apply(data4) ;
            prediction5 = regressionLearningMethod.apply(data5) ;
            prediction6 = regressionLearningMethod.apply(data6) ;
            prediction7 = regressionLearningMethod.apply(data7) ;

            System.out.println(getNumber(prediction1) + "/ factor,");
            System.out.println(getNumber(prediction2) + "/ factor,");
            System.out.println(getNumber(prediction3) + "/ factor,");
            System.out.println(getNumber(prediction4) + "/ factor,");
            System.out.println(getNumber(prediction5) + "/ factor,");
            System.out.println(getNumber(prediction6) + "/ factor,");
            System.out.println(getNumber(prediction7) + "/ factor,");
            System.out.println("---------------------" + j +"----------------------");
        }
        
        //0.000000001
        /**
        List<Double> errors = new ArrayList<>();
        for(int i = 0 ;i< 1000;i++){
            regressionLearningMethod = MachineLearningUtils.train(regressionLearningMethod, dataSet, exactData,0.00000001);
            errors.add(Math.abs(MachineLearningUtils.error(regressionLearningMethod, dataSet, exactData, 0)/dataSet.size()));
        }
        
        // set Errors for python
        System.out.println("[");
        for(int i = 0; i < 1000;i++){
            System.out.println(i+",");

        }
        System.out.println("],");
        System.out.println("[");
        for(int i = 0; i < 1000;i++){
            System.out.println(errors.get(i)+",");
        }
        System.out.println("],");
        **/
//        cost = MachineLearningUtils.cost(regressionLearningMethod, dataSet, exactData, 0);
//        System.out.println("cost : "+ getNumber(cost));
        
      
       
    }
    
    private static String getNumber(double num){
        return String.format("%.12f", num);
    }
}
