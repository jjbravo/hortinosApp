package com.hornitosapp.jpa.entities;

import com.hornitosapp.jpa.entities.Eventos;
import com.hornitosapp.jpa.entities.Meses;
import com.hornitosapp.jpa.entities.Productos;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-23T23:17:13")
@StaticMetamodel(Pedidos.class)
public class Pedidos_ { 

    public static volatile SingularAttribute<Pedidos, Date> fecha;
    public static volatile SingularAttribute<Pedidos, BigDecimal> total;
    public static volatile SingularAttribute<Pedidos, String> nombreCliente;
    public static volatile SingularAttribute<Pedidos, String> apellidosCliente;
    public static volatile SingularAttribute<Pedidos, Meses> idMes;
    public static volatile SingularAttribute<Pedidos, Eventos> idEvento;
    public static volatile SingularAttribute<Pedidos, String> direccion;
    public static volatile SingularAttribute<Pedidos, Integer> id;
    public static volatile SingularAttribute<Pedidos, Productos> idProducto;
    public static volatile SingularAttribute<Pedidos, String> telefono;
    public static volatile SingularAttribute<Pedidos, String> email;

}