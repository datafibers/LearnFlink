package hemant.dataset;

import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
/**
 * Created by hemantd on 24/04/2016.
 */
public class ReadLocalFile {

    public static void main(String []args){
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        DataSet<String> text = env.readTextFile("F:\\LearnFlink\\01.txt");
        try {
            text.print();
        } catch (Exception e){
            System.out.println("Error while printing the output..!");
        }
    }
}
