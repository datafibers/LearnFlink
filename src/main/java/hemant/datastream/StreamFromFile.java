package hemant.datastream;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.source.FileMonitoringFunction;

/**
 * Created by hemantd on 27/04/2016.
 */
public class StreamFromFile {
    public static void main(String []args){
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        DataStream<String> dst = env.readTextFile("F:\\LearnFlink\\01.txt");
        dst.print();
        try {
            env.execute("SampleStream");
        }catch (Exception e){}
    }
}
