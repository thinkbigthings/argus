package org.thinkbigthings.zdd.server.entity;

import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Store.class)
public abstract class Store_ {

	public static volatile SingularAttribute<Store, String> website;
	public static volatile SingularAttribute<Store, String> name;
	public static volatile SingularAttribute<Store, Long> id;
	public static volatile SetAttribute<Store, StoreItem> items;

	public static final String WEBSITE = "website";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String ITEMS = "items";

}

