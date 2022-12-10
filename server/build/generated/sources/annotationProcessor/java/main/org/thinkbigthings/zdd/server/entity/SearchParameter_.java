package org.thinkbigthings.zdd.server.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SearchParameter.class)
public abstract class SearchParameter_ {

	public static volatile SingularAttribute<SearchParameter, String> field;
	public static volatile SingularAttribute<SearchParameter, Long> id;
	public static volatile SingularAttribute<SearchParameter, String> value;
	public static volatile SingularAttribute<SearchParameter, Operator> operator;
	public static volatile SingularAttribute<SearchParameter, SavedSearch> savedSearch;

	public static final String FIELD = "field";
	public static final String ID = "id";
	public static final String VALUE = "value";
	public static final String OPERATOR = "operator";
	public static final String SAVED_SEARCH = "savedSearch";

}

