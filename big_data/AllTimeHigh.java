



import java.io.*; // Provides classes for reading and writing to files and streams.
import org.apache.hadoop.io.Text; // Represents text in Hadoop's data types, used for keys and values in MapReduce.
import org.apache.hadoop.io.LongWritable; // Represents a long integer in Hadoop's data types, used as a key in MapReduce.
import org.apache.hadoop.mapreduce.Job; // Represents a MapReduce job, used to configure and run MapReduce tasks.
import org.apache.hadoop.mapreduce.Mapper; // Base class for Mapper implementations in MapReduce.
import org.apache.hadoop.mapreduce.Reducer; // Base class for Reducer implementations in MapReduce.
import org.apache.hadoop.conf.*; // Provides access to Hadoop configuration settings.
import org.apache.hadoop.fs.*; // Provides a filesystem abstraction over Hadoop's supported filesystems.
import org.apache.hadoop.mapreduce.lib.input.*; // Provides input formats and related classes for reading input data in MapReduce.
import org.apache.hadoop.mapreduce.lib.output.*; // Provides output formats and related classes for writing output data in MapReduce.
import org.apache.hadoop.io.DoubleWritable; // Represents a double value in Hadoop's data types, used as a value in MapReduce.


public class AllTimeHigh {
    // Mapper class

// mapper class is reponsible for  processing input data  and emitting intermediate key-value pairs .

// declares map class which inherits Mapper class form hadoop.jar files

// 
    public static class MapClass extends Mapper<LongWritable, Text, Text, DoubleWritable> {
        // Map function 
        public void map(LongWritable key, Text value, Context context) {
            try {
                // Splitting each line into fields
                String[] str = value.toString().split(",");	 
                // Extracting the high price from the data
                double high_price = Double.parseDouble(str[4]);
                // Emitting the stock symbol as key and its high price as value
                context.write(new Text(str[1]), new DoubleWritable(high_price));
            } catch(Exception e) {
                // Handling any exceptions
                System.out.println(e.getMessage());
            }
        }
    }
	
    // Reducer class
    public static class ReduceClass extends Reducer<Text, DoubleWritable, Text, DoubleWritable> {
        private DoubleWritable result = new DoubleWritable();
        
        // Reduce function
        public void reduce(Text key, Iterable<DoubleWritable> values, Context context) throws IOException, InterruptedException {
            double max_price = 0;
            
            // Loop through all the values for a particular stock symbol
            for (DoubleWritable val : values) {
                // Finding the maximum price
                if (val.get() > max_price) {
                    max_price = val.get();
                }
            }
            
            // Setting the result to the maximum price
            result.set(max_price);
            // Emitting the stock symbol and its all-time high price
            context.write(key, result);
        }
    }
  
    // Main method
    public static void main(String[] args) throws Exception {
        /* 


	hadoop Configuration class is part of hadoop java api 
	used to configure hadoop-related setting parameters like 
	file system  conig , cluster or job config before interacting with 
	hdfs 

	
	*/

        Configuration conf = new Configuration();

	/* 
	 getInstance() is a method from Job class .
	 used to create new instance for new mapreduce job


	*/
        Job job = Job.getInstance(conf, "All time high price for each stock");
        // Specifying the main class
        job.setJarByClass(AllTimeHigh.class);
        // Setting the mapper class
        job.setMapperClass(MapClass.class);
        // Setting the reducer class
        job.setReducerClass(ReduceClass.class);
        // Setting the number of reduce tasks to 0 since we don't want any reducers
        job.setNumReduceTasks(0);
        // Setting the output key class
        job.setOutputKeyClass(Text.class);
        // Setting the output value class
        job.setOutputValueClass(DoubleWritable.class);
        // Setting the input and output paths
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        // Exiting the program with status code based on job completion
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}

