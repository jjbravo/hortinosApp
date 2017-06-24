/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hornitosapp.jpa.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bratc
 */
@Entity
@Table(name = "pedidos")
@XmlRootElement
public class Pedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "nombre_cliente")
    private String nombreCliente;
    @Size(max = 45)
    @Column(name = "apellidos_cliente")
    private String apellidosCliente;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @Size(max = 80)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 12)
    @Column(name = "telefono")
    private String telefono;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total")
    private BigDecimal total;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @JoinColumn(name = "id_evento", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Eventos idEvento;
    @JoinColumn(name = "id_producto", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Productos idProducto;
    
    @JoinColumn(name = "id_mes", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Meses idMes;

    @Transient
    SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
     
    public Pedidos() {
    }

    public Pedidos(Integer id) {
        this.id = id;
    }

    public Pedidos(Integer id, String nombreCliente, String apellidosCliente, String email, String direccion, String telefono, BigDecimal total, Date fecha, Eventos idEvento, Productos idProducto, Meses idMes) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.total = total;
        this.fecha = fecha;
        this.idEvento = idEvento;
        this.idProducto = idProducto;
        this.idMes = idMes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

     public String getFecha() {
        return date.format(fecha);
    }

    public void setFecha(String fecha) {
        this.fecha = new Date();
    }

    public Eventos getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Eventos idEvento) {
        this.idEvento = idEvento;
    }

    public Productos getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Productos idProducto) {
        this.idProducto = idProducto;
    }
    
    public void setIdMes(Meses idMes) {
        this.idMes = idMes;
    }

    public Meses getIdMes() {
        return idMes;
    }
    

    @Override
    public String toString() {
        return "com.hornitosapp.jpa.entities.Pedidos[ id=" + id + " ]";
    }
    
}
