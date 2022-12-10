package org.thinkbigthings.zdd.server.entity;

import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SavedSearch.class)
public abstract class SavedSearch_ {

	public static volatile SingularAttribute<SavedSearch, Long> id;
	public static volatile SetAttribute<SavedSearch, SearchParameter> searchParameters;
	public static volatile SingularAttribute<SavedSearch, SearchConfig> searchConfig;

	public static final String ID = "id";
	public static final String SEARCH_PARAMETERS = "searchParameters";
	public static final String SEARCH_CONFIG = "searchConfig";

}

