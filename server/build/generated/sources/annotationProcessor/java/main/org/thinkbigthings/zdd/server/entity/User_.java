package org.thinkbigthings.zdd.server.entity;

import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.Instant;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, Instant> registrationTime;
	public static volatile SingularAttribute<User, String> password;
	public static volatile SetAttribute<User, Address> addresses;
	public static volatile SetAttribute<User, Session> sessions;
	public static volatile SingularAttribute<User, String> displayName;
	public static volatile SetAttribute<User, Role> roles;
	public static volatile SingularAttribute<User, Long> id;
	public static volatile SingularAttribute<User, String> email;
	public static volatile SingularAttribute<User, Boolean> enabled;
	public static volatile SingularAttribute<User, SearchConfig> searchConfig;
	public static volatile SingularAttribute<User, String> username;

	public static final String REGISTRATION_TIME = "registrationTime";
	public static final String PASSWORD = "password";
	public static final String ADDRESSES = "addresses";
	public static final String SESSIONS = "sessions";
	public static final String DISPLAY_NAME = "displayName";
	public static final String ROLES = "roles";
	public static final String ID = "id";
	public static final String EMAIL = "email";
	public static final String ENABLED = "enabled";
	public static final String SEARCH_CONFIG = "searchConfig";
	public static final String USERNAME = "username";

}

