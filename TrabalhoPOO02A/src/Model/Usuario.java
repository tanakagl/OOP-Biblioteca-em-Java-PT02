package Model;



public class Usuario {
   //Declaracao dos atributos
    private String nome;
    private String ender;
    private String cpf;
    private int histCompra;
    private int histAluguel;
    private int compra;
    private String tipoUser;
    private String dataCompra;
    private String dataAluguel;
    private int histCompraPromo; //atributo q ira zerar depois de 3 meses
    private int histAluguelPromo; //atributo q ira zerar depois de 3 meses
    private int histAux;
    private String dataCadastro;
    private String id;
    
    public Usuario(String id,String nome, String ender, String cpf, String tipoUser){ //Constructor dos Usuarios
        this.id = id;
        this.nome = nome;
        this.ender = ender;
        this.cpf = cpf;
        this.tipoUser = tipoUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnder() {
        return ender;
    }

    public void setEnder(String ender) {
        this.ender = ender;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(String tipoUser) {
        this.tipoUser = tipoUser;
    }

    
    
    @Override //toString para printar os dados dos usuarios conforme o pedido
    public String toString(){
        return "ID do Usuário: " + id + "// Nome Completo: " + nome + "// Endereço: " + ender + "// CPF: " + cpf + "// Hist. de Livros Comprados: " + histCompra + "// Hist. de Livros Alugados: " + histAluguel + "// Tipo de usuário: " + tipoUser;
    }

}

