
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hornitosapp.rest.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hornitosapp.jpa.entities.Roles;
import com.hornitosapp.jpa.sessions.RolesFacade;
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
@Path("roles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RolesREST {
    

    @EJB
    private RolesFacade rolesEJB;
   
    /**
     * Obtiene todos los roles
     *
     * @return lista de roles
     */
    @GET
   // @RolesAllowed({"ADMIN"})
    public List<Roles> findAll() {
        return rolesEJB.findAll();
    }
    
   

     /**
     * Busca roles por su id
     *
     * @param id
     * @return roles
     */
    @GET
    @Path("{id}")
    public Roles findById(@PathParam("id") Integer id) {
        return rolesEJB.find(id);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Roles role){
        rolesEJB.edit(role);
    }
    
}
