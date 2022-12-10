package org.thinkbigthings.zdd.server.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.time.Instant;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(StoreItem.class)
public abstract class StoreItem_ {

	public static volatile SingularAttribute<StoreItem, String> strain;
	public static volatile SingularAttribute<StoreItem, BigDecimal> myrcenePercent;
	public static volatile SingularAttribute<StoreItem, Instant> added;
	public static volatile SingularAttribute<StoreItem, Store> store;
	public static volatile SingularAttribute<StoreItem, BigDecimal> terpinolenePercent;
	public static volatile SingularAttribute<StoreItem, BigDecimal> limonenePercent;
	public static volatile SingularAttribute<StoreItem, BigDecimal> cbdPercent;
	public static volatile SingularAttribute<StoreItem, BigDecimal> humulenePercent;
	public static volatile SingularAttribute<StoreItem, BigDecimal> weightGrams;
	public static volatile SingularAttribute<StoreItem, BigDecimal> bisabololPercent;
	public static volatile SingularAttribute<StoreItem, BigDecimal> caryophyllenePercent;
	public static volatile SingularAttribute<StoreItem, BigDecimal> linaloolPercent;
	public static volatile SingularAttribute<StoreItem, BigDecimal> pinenePercent;
	public static volatile SingularAttribute<StoreItem, String> vendor;
	public static volatile SingularAttribute<StoreItem, Long> id;
	public static volatile SingularAttribute<StoreItem, Subspecies> subspecies;
	public static volatile SingularAttribute<StoreItem, Long> priceDollars;
	public static volatile SingularAttribute<StoreItem, BigDecimal> thcPercent;

	public static final String STRAIN = "strain";
	public static final String MYRCENE_PERCENT = "myrcenePercent";
	public static final String ADDED = "added";
	public static final String STORE = "store";
	public static final String TERPINOLENE_PERCENT = "terpinolenePercent";
	public static final String LIMONENE_PERCENT = "limonenePercent";
	public static final String CBD_PERCENT = "cbdPercent";
	public static final String HUMULENE_PERCENT = "humulenePercent";
	public static final String WEIGHT_GRAMS = "weightGrams";
	public static final String BISABOLOL_PERCENT = "bisabololPercent";
	public static final String CARYOPHYLLENE_PERCENT = "caryophyllenePercent";
	public static final String LINALOOL_PERCENT = "linaloolPercent";
	public static final String PINENE_PERCENT = "pinenePercent";
	public static final String VENDOR = "vendor";
	public static final String ID = "id";
	public static final String SUBSPECIES = "subspecies";
	public static final String PRICE_DOLLARS = "priceDollars";
	public static final String THC_PERCENT = "thcPercent";

}

