package Model;

public final class Cliente{
    private String nome = null;
    private String cpf = null;
    private String fone = null;
    private String celular = null;
    private String email = null;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
  public Cliente(String nome, String cpf, String fone, String celular, String email)
{
setNome(nome);
setCpf(cpf);
setFone(fone);
setCelular(celular);
setEmail(email);
}  

  public String tostring() {
    String ret = null;
    ret = "Cliente.: [" + getNome() + "]\n" +
          "CPF.....: [" + getCpf() + "]\n" +
          "Telefone: [" + getFone() + "]\n" +  
          "Celular.: [" + getCelular() + "]\n" +
          "Email...: [" + getEmail() + "]\n";
    return ret;
  }
    

}
