package hemant.dataset;

import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;

/**
 * Created by hemantd on 03/05/2016.
 */
public class WriteHDFS {
    public static void main(String []args){
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        DataSet<String> hdfsLines = env.readTextFile("hdfs://hemant.server.com:8020/tmp/input.txt");
        hdfsLines.writeAsText("hdfs://hemant.server.com:8020/tmp/input2.txt");
        DataSet<String> hdfsLines2 = env.readTextFile("hdfs://hemant.server.com:8020/tmp/input2.txt");
        try {
            hdfsLines2.print();
        } catch (Exception e){}

    }
}
