/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Modelo;

/**
 *
 * @author Elias
 */
public class Censados  {
    private Censo Id_censo;
    private String motivo_divorcio;
    private String fecha;
    private String estado_censo;
    private Integer Id;
    private String nombreCp;
    private String censador;

    public Censados() {
        this.Id_censo = null;
        this.motivo_divorcio = null;
        this.fecha = null;
        this.estado_censo = null;
        this.Id = null;
        this.nombreCp = null;
        this.censador = null;
    }

    public Censados(Censo Id_censo, String motivo_divorcio, String fecha, String estado_censo, Integer Id, String nombreCp, String censador) {
        this.Id_censo = Id_censo;
        this.motivo_divorcio = motivo_divorcio;
        this.fecha = fecha;
        this.estado_censo = estado_censo;
        this.Id = Id;
        this.nombreCp = nombreCp;
        this.censador = censador;
    }

    public Censo getId_censo() {
        return Id_censo;
    }

    public void setId_censo(Censo Id_censo) {
        this.Id_censo = Id_censo;
    }

    public String getMotivo_divorcio() {
        return motivo_divorcio;
    }

    public void setMotivo_divorcio(String motivo_divorcio) {
        this.motivo_divorcio = motivo_divorcio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado_censo() {
        return estado_censo;
    }

    public void setEstado_censo(String estado_censo) {
        this.estado_censo = estado_censo;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNombreCp() {
        return nombreCp;
    }

    public void setNombreCp(String nombreCp) {
        this.nombreCp = nombreCp;
    }

    public String getCensador() {
        return censador;
    }

    public void setCensador(String censador) {
        this.censador = censador;
    }
   
    
        
    }
    
