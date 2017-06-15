package epsi.model;

import epsi.model.EpsiUserGroup.Group;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EpsiUserGroup.class)
public abstract class EpsiUserGroup_ {

	public static volatile SingularAttribute<EpsiUserGroup, EpsiUser> uid;
	public static volatile SingularAttribute<EpsiUserGroup, Group> role;

}

