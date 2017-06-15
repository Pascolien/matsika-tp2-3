package epsi.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EpsiMessage.class)
public abstract class EpsiMessage_ {

	public static volatile SingularAttribute<EpsiMessage, Date> creationdate;
	public static volatile SingularAttribute<EpsiMessage, String> author;
	public static volatile SingularAttribute<EpsiMessage, Long> id;
	public static volatile SingularAttribute<EpsiMessage, String> content;

}

