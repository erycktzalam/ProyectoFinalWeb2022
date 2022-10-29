/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eryck Tz
 */
public class Noticia {
    
    private int noticiaId;
    private String titulo;
    private String datAbstract;
    private String byline;
    private String urlFoto;
    private String comentario;

    public Noticia(int noticiaId, String titulo, String datAbstract, String byline, String urlFoto, String comentario) {
        this.noticiaId = noticiaId;
        this.titulo = titulo;
        this.datAbstract = datAbstract;
        this.byline = byline;
        this.urlFoto = urlFoto;
        this.comentario = comentario;
    }

    public int getNoticiaId() {
        return noticiaId;
    }

    public void setNoticiaId(int noticiaId) {
        this.noticiaId = noticiaId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDatAbstract() {
        return datAbstract;
    }

    public void setDatAbstract(String datAbstract) {
        this.datAbstract = datAbstract;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
}


