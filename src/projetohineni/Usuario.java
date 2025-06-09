package projetohineni;

public abstract class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String anotacoes;
    
    public Usuario(String nome, String email, String senha, String anotacoes){
        this.nome=nome;
        this.email=email;
        this.senha=senha;
        this.anotacoes=anotacoes;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public String setAnotacoes(){
        return anotacoes;
    }
}
