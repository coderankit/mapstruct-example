/**
 * 
 */
package com.apps.test.list.example;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author agara
 *
 */
public class SourceListTypeClass {

	private List<String> myStrings;

	private List<Integer> myIntegers;

	public SourceListTypeClass(List<String> myStrings, List<Integer> myIntegers) {

		this.myStrings = myStrings.stream().collect(Collectors.toList());
		this.myIntegers = myIntegers.stream().collect(Collectors.toList());
	}

	public List<Integer> getMyIntegers() {

		return myIntegers;
	}

	public List<String> getMyStrings() {
		
		return myStrings;
	}
}