



import java.io.*;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.mapreduce.lib.input.*;
import org.apache.hadoop.mapreduce.lib.output.*;

import org.apache.hadoop.io.DoubleWritable;

public class AverageStockPrice	 {
	

	public static class MapClass extends Mapper<LongWritable,Text,Text,DoubleWritable>
	   {
	      public void map(LongWritable key, Text value, Context context)
	      {	    	  
	         try{
	            String[] str = value.toString().split(",");	 
	            double  Avg_price = Double.parseDouble(str[6]);
	            context.write(new Text(str[1]),new DoubleWritable(Avg_price));
	         }
	         catch(Exception e)
	         {
	            System.out.println(e.getMessage());
	         }
	      }
	   }
	
	  public static class ReduceClass extends Reducer<Text,DoubleWritable,Text,DoubleWritable>
	   {
		    private DoubleWritable result = new DoubleWritable();
		    
		    public void reduce(Text key, Iterable<DoubleWritable> values,Context context) throws IOException, InterruptedException {
		      double sum  = 0;
		      int count = 0  ;
				
		         for (DoubleWritable val : values)
		         {       	
					
				 sum +=val.get();
				 count++;
		         }

		      double avg =sum / count ;
		      result.set(avg);		      
		      context.write(key, result);
		      //context.write(key, new DoubleWritable(max_price));
		      
		    }
	   }
	  public static void main(String[] args) throws Exception {
		    Configuration conf = new Configuration();
		    //conf.set("name", "value")
		    //conf.set("mapreduce.input.fileinputformat.split.minsize", "134217728");
		    Job job = Job.getInstance(conf, "avg price of stock");
		    job.setJarByClass(AverageStockPrice.class);
		    job.setMapperClass(MapClass.class);
		    //job.setCombinerClass(ReduceClass.class);
		    job.setReducerClass(ReduceClass.class);
		    job.setNumReduceTasks(1);     // repeat with 0 ?  
		    job.setOutputKeyClass(Text.class);
		    job.setOutputValueClass(DoubleWritable.class);
		    FileInputFormat.addInputPath(job, new Path(args[0]));
		    FileOutputFormat.setOutputPath(job, new Path(args[1]));
		    System.exit(job.waitForCompletion(true) ? 0 : 1);
		  }
}

