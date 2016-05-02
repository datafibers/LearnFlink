package hemant.dataset;

import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;

/**
 * Created by hemantd on 03/05/2016.
 */
public class ReadHDFS {
    public static void main(String []args){
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        DataSet<String> hdfsLines = env.readTextFile("hdfs://hemant.server.com:8020/tmp/input.txt");
        try {
            hdfsLines.print();
        } catch (Exception e){}

    }
}
