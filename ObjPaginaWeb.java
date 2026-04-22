public class ObjPaginaWeb {

    private String urlpaginaWeb;
    private String tituloPagina;
    private String fechaAcceso;
    public ObjPaginaWeb(String urlpaginaWeb, String tituloPagina, String fechaAcceso) {
        this.urlpaginaWeb = urlpaginaWeb;
        this.tituloPagina = tituloPagina;
        this.fechaAcceso = fechaAcceso;
    }
    public ObjPaginaWeb() {
    }
    public String getUrlpaginaWeb() {
        return urlpaginaWeb;
    }
    public void setUrlpaginaWeb(String urlpaginaWeb) {
        this.urlpaginaWeb = urlpaginaWeb;
    }
    public String getTituloPagina() {
        return tituloPagina;
    }
    public void setTituloPagina(String tituloPagina) {
        this.tituloPagina = tituloPagina;
    }
    public String getFechaAcceso() {
        return fechaAcceso;
    }
    public void setFechaAcceso(String fechaAcceso) {
        this.fechaAcceso = fechaAcceso;
    }

        @Override
        public String toString() {
        return "URL: " + urlpaginaWeb +
            " | Título: " + tituloPagina +
            " | Fecha: " + fechaAcceso;

        }

    

    


}