package com.hornitosapp.jpa.entities;

import com.hornitosapp.jpa.entities.Pedidos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-23T23:17:13")
@StaticMetamodel(Eventos.class)
public class Eventos_ { 

    public static volatile SingularAttribute<Eventos, String> descripcion;
    public static volatile SingularAttribute<Eventos, Integer> porcentajeDescuento;
    public static volatile SingularAttribute<Eventos, Integer> id;
    public static volatile ListAttribute<Eventos, Pedidos> pedidosList;
    public static volatile SingularAttribute<Eventos, String> nombre;

}