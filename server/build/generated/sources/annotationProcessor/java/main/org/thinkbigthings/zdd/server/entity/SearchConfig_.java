package org.thinkbigthings.zdd.server.entity;

import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.Instant;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SearchConfig.class)
public abstract class SearchConfig_ {

	public static volatile SetAttribute<SearchConfig, Store> searchStores;
	public static volatile SetAttribute<SearchConfig, SavedSearch> subSearches;
	public static volatile SingularAttribute<SearchConfig, Boolean> active;
	public static volatile SingularAttribute<SearchConfig, Long> id;
	public static volatile SingularAttribute<SearchConfig, User> user;
	public static volatile SingularAttribute<SearchConfig, Instant> lastSearch;

	public static final String SEARCH_STORES = "searchStores";
	public static final String SUB_SEARCHES = "subSearches";
	public static final String ACTIVE = "active";
	public static final String ID = "id";
	public static final String USER = "user";
	public static final String LAST_SEARCH = "lastSearch";

}

