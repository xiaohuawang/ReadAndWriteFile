package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//C:\Users\xw815d\workspace\InputTest\src\input.txt
public class Test {

	public String getFileName(){
		String filename = (System.getProperty("user.dir") + File.separatorChar +"src" + File.separatorChar + "input.txt");
		return filename;
	}
	
	public HashMap<Integer,ArrayList<String>> readFile(String filename ) throws IOException{
		
		int count=0;
		HashMap<Integer,ArrayList<String>> map = new HashMap<Integer,ArrayList<String>>();
		File file = new File(filename);
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(file));
			String line = reader.readLine();
			
//			for(int i=0;i<5;i++){
			while(line!=null){
				
				count++;
				String parts[] = line.split(" ");
				
				ArrayList<String> list=reformat(parts[0],parts[1],parts[2]);
				
//				list.add(parts[0]);
//				list.add(parts[1]);
//				list.add(parts[2]);
				
				map.put(count, list);
				line = reader.readLine();
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("count= "+count);
		System.out.println();
		
		return map;
	}
	
	private ArrayList<String> reformat(String parts0,String parts1,String parts2) {
		
		StringBuffer sb0=new StringBuffer();
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer();

		ArrayList<String> list=new ArrayList<String>();
		System.out.println("parts0= "+parts0);
		String parts0NoSpace=parts0.trim();
		System.out.println("parts1= "+parts1);
		System.out.println("parts2= "+parts2);

		char[] parts0Char = parts0NoSpace.toCharArray();
		System.out.println("len = " + parts0Char.length);

		for (int i = 0; i < 3; i++) {
			sb0.append(parts0Char[i]);
		}
		String type = sb0.toString();
		list.add(type);
		
		for (int i = 8; i <parts0Char.length-1 ; i++) {
			sb1.append(parts0Char[i]);
		}
		String column1 = sb1.toString();
		list.add(column1);
		
		System.out.println();
		char[] parts2Char=parts2.toCharArray();
		
		for(int i=0;i<parts2Char.length-1;i++){
			sb2.append(parts2Char[i]);
		}
		String column2= sb2.toString();
		System.out.println("part2Formatted= "+column2);
		
		list.add(column2);
		return list;
	}
	
//	public void writeFile0(HashMap<Integer,ArrayList<String>> map) {
//
//		System.out.println(map.size());
//		String filename0 = (System.getProperty("user.dir") + File.separatorChar +"src" +File.separatorChar + "tyep.txt");
//		String filename1 = (System.getProperty("user.dir") + File.separatorChar +"src" +File.separatorChar + "column1.txt");
//		String filename2 = (System.getProperty("user.dir") + File.separatorChar +"src" +File.separatorChar + "column2.txt");
//		
////		\\Users\\xw815String filename = "C:d\\Desktop\\column2.txt";
//		PrintWriter writer0;
//		try {
//			writer0 = new PrintWriter(filename0);
//			Iterator it = map.entrySet().iterator();
//			while(it.hasNext())
//			{
//				Map.Entry pair = (Map.Entry)it.next();
//				ArrayList<Integer> list=(ArrayList<Integer>) pair.getValue();
//				System.out.println("how is the size= "+list.get(0));
////				write each key, value pair to each line
//				writer0.println(list.get(0));
//			}
//			//close the writer
//			writer0.close();
//		} catch (FileNotFoundException e) {
//
//			e.printStackTrace();
//		}
//		
////		try {
////			writer = new PrintWriter(filename1);
////			Iterator it = map.entrySet().iterator();
////			while(it.hasNext())
////			{
////				Map.Entry pair = (Map.Entry)it.next();
////				ArrayList<Integer> list=(ArrayList<Integer>) pair.getValue();
//////				System.out.println("how is the size= "+list.get(0));
////				//write each key, value pair to each line
////				writer.println(list.get(1));
////				it.remove();
////			}
////			//close the writer
//////			writer.close();
////		} catch (FileNotFoundException e) {
////
////			e.printStackTrace();
////		}
////		
////		try {
////			writer = new PrintWriter(filename2);
////			Iterator it = map.entrySet().iterator();
////			while(it.hasNext())
////			{
////				Map.Entry pair = (Map.Entry)it.next();
////				ArrayList<Integer> list=(ArrayList<Integer>) pair.getValue();
//////				System.out.println("how is the size= "+list.get(0));
////				//write each key, value pair to each line
////				writer.println(list.get(2));
////				it.remove();
////			}
////			//close the writer
////			writer.close();
////		} catch (FileNotFoundException e) {
////
////			e.printStackTrace();
////		}
//	}
//	
//	public void writeFile1(HashMap<Integer,ArrayList<String>> map) {
//
//		System.out.println("writer1");
//
//		String filename0 = (System.getProperty("user.dir") + File.separatorChar +"src" +File.separatorChar + "tyep.txt");
//		String filename1 = (System.getProperty("user.dir") + File.separatorChar +"src" +File.separatorChar + "column1.txt");
//		String filename2 = (System.getProperty("user.dir") + File.separatorChar +"src" +File.separatorChar + "column2.txt");
//		
////		\\Users\\xw815String filename = "C:d\\Desktop\\column2.txt";
//		PrintWriter writer1;
//		try {
//			writer1 = new PrintWriter(filename1);
//			Iterator it = map.entrySet().iterator();
//			while(it.hasNext())
//			{
//				Map.Entry pair = (Map.Entry)it.next();
//				ArrayList<Integer> list=(ArrayList<Integer>) pair.getValue();
//				System.out.println("how is the size= "+list.get(1));
////				write each key, value pair to each line
//				writer1.println(list.get(1));
//			}
//			//close the writer
//			writer1.close();
//		} catch (FileNotFoundException e) {
//
//			e.printStackTrace();
//		}
//	}
//
//	
//	public void writeFile2(HashMap<Integer,ArrayList<String>> map) {
//
//		System.out.println("writer2");
//
//		String filename0 = (System.getProperty("user.dir") + File.separatorChar +"src" +File.separatorChar + "tyep.txt");
//		String filename1 = (System.getProperty("user.dir") + File.separatorChar +"src" +File.separatorChar + "column1.txt");
//		String filename2 = (System.getProperty("user.dir") + File.separatorChar +"src" +File.separatorChar + "column2.txt");
//		
////		\\Users\\xw815String filename = "C:d\\Desktop\\column2.txt";
//		PrintWriter writer2;
//		try {
//			writer2 = new PrintWriter(filename2);
//			Iterator it = map.entrySet().iterator();
//			while(it.hasNext())
//			{
//				Map.Entry pair = (Map.Entry)it.next();
//				ArrayList<Integer> list=(ArrayList<Integer>) pair.getValue();
//				System.out.println("how is the size= "+list.get(2));
////				write each key, value pair to each line
//				writer2.println(list.get(2));
//				it.remove();
//			}
//			//close the writer
//			writer2.close();
//		} catch (FileNotFoundException e) {
//
//			e.printStackTrace();
//		}
//	}
	
	public void writeFileAll(HashMap<Integer,ArrayList<String>> map) {

		System.out.println(map.size());
		String filename0 = (System.getProperty("user.dir") + File.separatorChar +"src" +File.separatorChar + "tyep.txt");
		String filename1 = (System.getProperty("user.dir") + File.separatorChar +"src" +File.separatorChar + "column1.txt");
		String filename2 = (System.getProperty("user.dir") + File.separatorChar +"src" +File.separatorChar + "column2.txt");
		
//		\\Users\\xw815String filename = "C:d\\Desktop\\column2.txt";
		PrintWriter writer0;
		PrintWriter writer1;
		PrintWriter writer2;
		try {
			writer0 = new PrintWriter(filename0);
			writer1 = new PrintWriter(filename1);
			writer2 = new PrintWriter(filename2);
			
			Iterator it = map.entrySet().iterator();
			while(it.hasNext())
			{
				Map.Entry pair = (Map.Entry)it.next();
				ArrayList<Integer> list=(ArrayList<Integer>) pair.getValue();
				System.out.println("how is the size= "+list.get(0));
//				write each key, value pair to each line
				writer0.println(list.get(0));
				
				System.out.println("how is the size= "+list.get(1));
				writer1.println(list.get(1));
				
				System.out.println("how is the size= "+list.get(2));
				writer2.println(list.get(2));
			}
			//close the writer
			writer0.close();
			writer1.close();
			writer2.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		Test test=new Test();
		String filename=test.getFileName();
		System.out.println(filename);
		HashMap<Integer,ArrayList<String>> map=test.readFile(filename);
		System.out.println(map);
		
		System.out.println("map size="+map.size());
//		test.writeFile0(map);
//		test.writeFile1(map);
//		test.writeFile2(map);
		test.writeFileAll(map);
	}

}














