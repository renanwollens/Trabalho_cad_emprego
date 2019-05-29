package Trabalho;

public class Dados {
   private String nome;
   private int senha;
   private int cpf;
   private int cep;
   private String login;
   private String cargo;
   private int numero;
   public Dados(){
   }
   public String getNome(){
   return nome;
   }
   public void setNome(String name){
   nome = name;
   }
   public String getLogin(){
   return login;
   }
   public void setLogin(String log ){
   login = log;
   }
   public String getCargo(){
   return cargo;
   }
   public void setCargo(String car){
   cargo = car;
   }
   public void setSenha(int sen) {
    senha = sen;  
   }
public int getSenha() {
	// TODO Auto-generated method stub
	return senha;
}
}