/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housesprediction;


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
        
        double[] thetaVector = new double[]{1.6485, 2.00004589};// expected theatas value.
        final int FACTOR = 1000;
        // size.
        
        RegressionLearningMethod regressionLearningMethod = new RegressionLearningMethod(thetaVector);
        
        Double[] data1 = new Double[]{1.0, 90.0};
        Double[] data2 = new Double[]{1.0, 101.0};
        Double[] data3 = new Double[]{1.0, 200.0};
        Double[] data4 = new Double[]{1.0, 500.0};
        Double[] data5 = new Double[]{1.0, 650.0};
        Double[] data6 = new Double[]{1.0, 900.0};
        Double[] data7 = new Double[]{1.0, 1330.0};
        
        final double exactPrice1 = 249000;
        final double exactPrice2 = 338000;
        final double exactPrice3 = 400000;
        final double exactPrice4 = 738000;
        final double exactPrice5 = 810000;
        final double exactPrice6 = 1986000;
        final double exactPrice7 = 2338000;
        
        double prediction1 = regressionLearningMethod.apply(data1) * FACTOR;
        double prediction2 = regressionLearningMethod.apply(data2) * FACTOR;
        double prediction3 = regressionLearningMethod.apply(data3) * FACTOR;
        double prediction4 = regressionLearningMethod.apply(data4) * FACTOR;
        double prediction5 = regressionLearningMethod.apply(data5) * FACTOR;
        double prediction6 = regressionLearningMethod.apply(data6) * FACTOR;
        double prediction7 = regressionLearningMethod.apply(data7) * FACTOR;

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
    }
    
}
