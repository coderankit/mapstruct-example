/**
 * 
 */
package com.apps.test.list.example;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author agara
 *
 */
@Mapper(uses = ListToObjectUtil.class)
public interface ListToOjectMapper {

	ListToOjectMapper INSTANCE = Mappers.getMapper(ListToOjectMapper.class);

	@Mappings({
		@Mapping(source = "myIntegers", target = "myInteger", qualifiedBy = FirstElement.class),
		@Mapping(source = "myStrings", target = "myString", qualifiedBy = LastElement.class) 
	})
	TargetObjectTypeClass sourceListToTargetObject(SourceListTypeClass sourceListTypeClass);
}