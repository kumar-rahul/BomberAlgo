//package com.tracxn.test;
//
//import java.util.LinkedList;
//
//public class TracxnList {
//	
//	private String bomberString;
//	private LinkedList<TracxnListModel> list;
//	private TracxnListModel nodeData;
//	private int threshold;
//
//	public TracxnList(String str){
//		this.threshold = 3;
//		this.bomberString = str;
//		this.list = new LinkedList<TracxnListModel>();
//	}
//	
//	public void service(){
//		for(int i=0;i<bomberString.length();i++){
//			int count = 0;
//			if(list.isEmpty()){
//				String character = String.valueOf(bomberString.charAt(i));
//				nodeData = new TracxnListModel(character,count+1);
//				list.add(nodeData);
//			}else{
//				String character = String.valueOf(bomberString.charAt(i));
//				if(character.equalsIgnoreCase(list.get(list.size()-1).getCharacter())){
//					//replace element by incrementing count:::set method
//					nodeData = new TracxnListModel(character,list.get(list.size()-1).getCount()+1);
//					list.set(list.size()-1,nodeData);
//				}else{
//					if(checkBomberString(character,count)){
//						bomberAlgo(character,count);
//					}else{
//						nodeData = new TracxnListModel(character,count+1);
//						list.add(nodeData);
//					}
//				}
//			}
//		}
//	}
//	
//	private boolean checkBomberString(String character,int count){
//		boolean status = false;
//		if(list.get(list.size()-1).getCount()>=threshold){
//			status = true;
//		}
//		return status;
//	}
//	
//	private void bomberAlgo(String character,int count){
//		list.remove(list.size()-1);
//		if(list.size()-1<0){
//			nodeData = new TracxnListModel(character,count+1);
//			list.add(nodeData);
//		}else if(character.equalsIgnoreCase(list.get(list.size()-1).getCharacter())){
//			nodeData = new TracxnListModel(character,list.get(list.size()-1).getCount()+1);
//			list.set(list.size()-1,nodeData);
//		}else{
//			nodeData = new TracxnListModel(character,count+1);
//			list.add(nodeData);
//		}
//	}
//	
//	public String output(){
//		StringBuilder sb=new StringBuilder();  
//		for(int i=0;i<list.size();i++){
//			for(int j=0;j<list.get(i).getCount();j++){
//				sb.append(list.get(i).getCharacter());
//			}
//		}
//		return sb.toString();
//	}
//}
