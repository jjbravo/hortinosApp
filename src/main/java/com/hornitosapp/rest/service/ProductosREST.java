
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hornitosapp.rest.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hornitosapp.jpa.entities.Productos;
import com.hornitosapp.jpa.sessions.ProductosFacade;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author bratc
 */
@Stateless
@Path("productos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProductosREST {
    

    @EJB
    private ProductosFacade productosEJB;
   
    /**
     * Obtiene todos los roles
     *
     * @return lista de roles
     */
    @GET
   // @RolesAllowed({"ADMIN"})
    public List<Productos> findAll() {
        return productosEJB.findAll();
    }
    
    @POST
    public Response create(Productos producto) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        try {
           
            productosEJB.create(producto);
            return Response.status(Response.Status.CREATED).entity(gson.toJson("El producto se creó correctamente!")).build();

        } catch (Exception e) {
            Logger.getLogger(ProductosREST.class.getName()).log(Level.SEVERE, null, e);
            return Response.status(Response.Status.BAD_REQUEST).entity(gson.toJson("Error al guardar el producto!.")).build();
        }
    }
    

     /**
     * Busca roles por su id
     *
     * @param id
     * @return roles
     */
    @GET
    @Path("{id}")
    public Productos findById(@PathParam("id") Integer id) {
        return productosEJB.find(id);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Productos producto){
        productosEJB.edit(producto);
    }
    
}
