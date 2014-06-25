package com.anucana.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LocalCollectionUtils {

	public static <T> Collection<T> addToNewCollection(T... ts ){
		Collection<T> list = new ArrayList<T>();
		if(ts != null){
			for(T t : ts ){
				list.add(t);
			}
		}
		return list;
	}
	
	public static <T> List<T> addToNewList(T... ts ){
		List<T> list = new ArrayList<T>();
		if(ts != null){
			for(T t : ts ){
				list.add(t);
			}
		}
		return list;
	}
	
}
