package com.hornitosapp.jpa.entities;

import com.hornitosapp.jpa.entities.Pedidos;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-23T23:17:13")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> descripcion;
    public static volatile SingularAttribute<Productos, BigDecimal> valor;
    public static volatile SingularAttribute<Productos, Integer> id;
    public static volatile ListAttribute<Productos, Pedidos> pedidosList;
    public static volatile SingularAttribute<Productos, String> nombreProducto;

}