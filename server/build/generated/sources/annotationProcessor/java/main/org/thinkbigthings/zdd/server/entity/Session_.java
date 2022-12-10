package org.thinkbigthings.zdd.server.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Session.class)
public abstract class Session_ {

	public static volatile SingularAttribute<Session, String> principalName;
	public static volatile SingularAttribute<Session, String> sessionId;
	public static volatile SingularAttribute<Session, String> primaryId;
	public static volatile SingularAttribute<Session, User> user;

	public static final String PRINCIPAL_NAME = "principalName";
	public static final String SESSION_ID = "sessionId";
	public static final String PRIMARY_ID = "primaryId";
	public static final String USER = "user";

}

