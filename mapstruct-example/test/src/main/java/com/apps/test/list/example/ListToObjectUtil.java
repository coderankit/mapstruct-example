/**
 * 
 */
package com.apps.test.list.example;

import java.util.List;
import java.util.Objects;

/**
 * @author agara
 *
 */
public class ListToObjectUtil {

	@FirstElement
	public <T> T first(List<T> lists) {

		return lists.stream().filter(Objects::nonNull).findFirst().orElse(null);
	}

	@LastElement
	public <T> T last(List<T> lists) {

		return lists.stream().filter(Objects::nonNull).reduce((ele1, ele2) -> ele2).orElse(null);
	}
}