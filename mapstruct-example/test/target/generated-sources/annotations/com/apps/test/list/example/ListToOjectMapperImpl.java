package com.apps.test.list.example;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2016-12-18T12:33:47+0530",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_112 (Oracle Corporation)"
)
public class ListToOjectMapperImpl implements ListToOjectMapper {

    private final ListToObjectUtil listToObjectUtil = new ListToObjectUtil();

    @Override
    public TargetObjectTypeClass sourceListToTargetObject(SourceListTypeClass sourceListTypeClass) {
        if ( sourceListTypeClass == null ) {
            return null;
        }

        TargetObjectTypeClass targetObjectTypeClass = new TargetObjectTypeClass();

        targetObjectTypeClass.setMyString( listToObjectUtil.last( sourceListTypeClass.getMyStrings() ) );
        targetObjectTypeClass.setMyInteger( listToObjectUtil.first( sourceListTypeClass.getMyIntegers() ) );

        return targetObjectTypeClass;
    }
}
