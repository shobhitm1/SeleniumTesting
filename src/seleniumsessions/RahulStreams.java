 package seleniumsessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

import com.google.common.collect.Streams;

public class RahulStreams {

	public static void main(String[] args) {
		RahulStreams.stramfilter();
		ArrayList<String> a = new ArrayList<String>();
		a.add("Abhijeet");a.add("Shobhit");a.add("Rahul");
		a.add("Shashank");
		int count=0;
		for(int i=0;i<a.size();i++) {
			String actual=a.get(i);
			if(actual.startsWith("A")) {
				count++;
			}
			
		}System.out.println("Count Value"+" "+count);
	}
	
	
	//Lambda :- lhs and rhs are seprated by (->)Left side parameter and right side expresses action on the parameter
	public static void stramfilter(){
		ArrayList<String> a = new ArrayList<String>();
		a.add("Abhijeet");a.add("Shobhit");a.add("Rahul");
		a.add("Shashank");//Stream is a sequential stream with collection as its source
		long c=a.stream().filter(s->s.startsWith("A")).count();//Returns a stream with the given filter. 
		//count( is a terminal operation)
		System.out.println(c);
		
		Long count=Stream.of("Sunny","Anil","Shobhit","Shan").filter(s->s.startsWith("A")).count();//To make stream compatible
		// of()-Returns a sequential ordered stream whose elements are the specified values
		System.out.println("Count is equals to "+ count);
		//terminal operation will execute only if intermediate operation returns true	
		System.out.println("Printing values with Stream operation");
		//Using foreach method()
		a.stream().filter(b->b.length()>4).forEach(s->System.out.println(s));
		//using Linit() method at terminal
		a.stream().filter(b->b.length()>4).limit(2).forEach(s->System.out.println(s));
		//Using Map() method-to modify stream
		System.out.println("Using Map() method-to modify stream");
		Stream.of("Sunny","Anila","Shobhita","Shana").filter(m->m.endsWith("a")).map(z->z.toUpperCase()).forEach(s->System.out.println(s));
		
		List<String> le = Arrays.asList("abhijeet","Don","aShobhit","aKshay");
		System.out.println("------");
		le.stream().filter(s->s.startsWith("a")).map(d->d.toUpperCase()).sorted().forEach(s->System.out.println(s));
		System.out.println("------");
		//Use of Concat method
		Stream<String> newStream=Streams.concat(a.stream(),le.stream());
		boolean b=newStream.anyMatch(s->s.equalsIgnoreCase("aShobhit"));
		System.out.println("aShobhit is present " + b);
		//Use of Collect method	//Collectors class is from stream package
	List<String> t=Stream.of("Sunny","Anila","Shobhita","Shana").filter(m->m.endsWith("a")).map(z->z.toUpperCase()).collect(Collectors.toList());
		System.out.println(t.get(0));
		//use distinct method
		a.stream().distinct().forEach(q->System.out.println(q));
	}

}

