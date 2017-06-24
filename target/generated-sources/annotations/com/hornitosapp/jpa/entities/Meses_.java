package com.hornitosapp.jpa.entities;

import com.hornitosapp.jpa.entities.Pedidos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-23T23:17:13")
@StaticMetamodel(Meses.class)
public class Meses_ { 

    public static volatile SingularAttribute<Meses, String> mes;
    public static volatile SingularAttribute<Meses, Integer> id;
    public static volatile ListAttribute<Meses, Pedidos> pedidosList;

}