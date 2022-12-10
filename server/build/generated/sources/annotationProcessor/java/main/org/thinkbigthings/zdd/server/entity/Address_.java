package org.thinkbigthings.zdd.server.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Address.class)
public abstract class Address_ {

	public static volatile SingularAttribute<Address, String> zip;
	public static volatile SingularAttribute<Address, String> city;
	public static volatile SingularAttribute<Address, Long> id;
	public static volatile SingularAttribute<Address, String> state;
	public static volatile SingularAttribute<Address, User> user;
	public static volatile SingularAttribute<Address, String> line1;

	public static final String ZIP = "zip";
	public static final String CITY = "city";
	public static final String ID = "id";
	public static final String STATE = "state";
	public static final String USER = "user";
	public static final String LINE1 = "line1";

}

