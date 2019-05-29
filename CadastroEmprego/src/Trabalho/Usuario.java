package Trabalho;

import java.util.Scanner;
import java.util.ArrayList;
public class Usuario {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS");
        System.out.println("Digite os dados para o cadastro: "+"\n Nome ");
        String nome = l.nextLine();
        System.out.println("Login desejado ");
        String login = l.nextLine();
        System.out.println("Cargo ");
        String cargo = l.nextLine();
        System.out.println("Senha de acesso");
        int senha = l.nextInt();
        System.out.println("CPF");
        int cpf = l.nextInt();
        System.out.println("CEP");
        int cep = l.nextInt();
        System.out.println("Numero");
        int numero = l.nextInt();
        Dados usuario;
        usuario = new Dados();
        usuario.setNome(nome);
        usuario.setLogin(login);
        usuario.setCargo(cargo);
        usuario.setSenha(senha);
        ArrayList<Dados> usuarios = new ArrayList<Dados>();
        usuarios.add(usuario);
        System.out.println(usuario.getNome()+"\n"+usuario.getLogin()+"\n"+usuario.getCargo()+"\n"+usuario.getSenha());
     }
}