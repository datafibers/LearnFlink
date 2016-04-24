package hemant.dataset;

import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.tuple.Tuple5;

/**
 * Created by hemantd on 24/04/2016.
 */
public class ReadCsvFile {

    public static void main(String []args){
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
/*
F:\LearnFlink\01.txt
--------------------
01,hemant,29,it,90000
02,kumar,24,hr,10000
03,dindi,21,sales,80000
04,sree,23,it,50000
 */
        DataSet<Tuple5<Integer, String, Integer, String, Integer>> text = env.readCsvFile("F:\\LearnFlink\\01.txt")
                    .fieldDelimiter(",") //Specifify the delimeter
                    .includeFields("11111") //Specify the fields to include 0 -> False, 1 -> True
                    .lineDelimiter("\n") //Specify the delimeter
                    .types(Integer.class,String.class,Integer.class,String.class,Integer.class);//Specify the type of the record


        try {
            text.print();
        } catch (Exception e){}
    }
}
