package com.tracxn.test;

import java.util.LinkedList;
import java.util.Scanner;

public class TracxnTest {
	public static void main(String[] args) {
//		Input 1: aaabcccdee
//		Output: bdee
//		Explanation ->
//		Step 1: bcccdee
//		Step 2: bdee (Final Answer)
//
//		Input 2: abcdeeeeddcbfgf
//		Output : abccbfgf
//		Explanation ->
//		Step 1: abcdddcbfgf
//		Step 2: abccbfgf (Final Answer)
		Scanner sc = new Scanner(System.in);
        String testStr = sc.next();
		TracxnList ll = new TracxnList(testStr);
		ll.execute();
		System.out.println(ll.output());
		
	}
}

class TracxnList {
	private String bomberString;
	private LinkedList<TracxnListModel> list;
	private TracxnListModel nodeData;
	private int threshold;
	public TracxnList(String str){
		this.threshold = 3;
		this.bomberString = str;
		this.list = new LinkedList<TracxnListModel>();
	}
	public void execute(){
		for(int i=0;i<bomberString.length();i++){
			int count = 0;
			String character = String.valueOf(bomberString.charAt(i));
			if(list.isEmpty()){
//				String character = String.valueOf(bomberString.charAt(i));
				nodeData = new TracxnListModel(character,count+1);
				list.add(nodeData);
			}else{
//				String character = String.valueOf(bomberString.charAt(i));
				if(character.equalsIgnoreCase(list.get(list.size()-1).getCharacter())){
					nodeData = new TracxnListModel(character,list.get(list.size()-1).getCount()+1);
					list.set(list.size()-1,nodeData);
				}else{
					if(checkBomberString(character,count)){
						bomberAlgo(character,count);
					}else{
						nodeData = new TracxnListModel(character,count+1);
						list.add(nodeData);
					}
				}
			}
		}
	}
	private boolean checkBomberString(String character,int count){
		boolean status = false;
		if(list.get(list.size()-1).getCount()>=threshold){
			status = true;
		}
		return status;
	}
	private void bomberAlgo(String character,int count){
		list.remove(list.size()-1);
		if(list.size()-1<0){
			nodeData = new TracxnListModel(character,count+1);
			list.add(nodeData);
		}else if(character.equalsIgnoreCase(list.get(list.size()-1).getCharacter())){
			nodeData = new TracxnListModel(character,list.get(list.size()-1).getCount()+1);
			list.set(list.size()-1,nodeData);
		}else{
			nodeData = new TracxnListModel(character,count+1);
			list.add(nodeData);
		}
	}
	public String output(){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.get(i).getCount();j++){
				sb.append(list.get(i).getCharacter());
			}
		}
		return sb.toString();
	}
}
class TracxnListModel {
	private String character;
	private int count;
	public TracxnListModel(String character,int count){
		this.character = character;
		this.count = count;
	}
	public String getCharacter(){
		return character;
	}
	public int getCount(){
		return count;
	}
}