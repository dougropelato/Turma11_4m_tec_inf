/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_servidor_c_t;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class Teste_Servidor_c_t {

    private int porta;
    private List<PrintStream> clientes;

    public Teste_Servidor_c_t(int porta) {
        this.porta = porta;
        this.clientes = new ArrayList<PrintStream>();
    }

    public class TrataCliente implements Runnable {
        private InputStream cliente;
        private Teste_Servidor_c_t servidor;

        public TrataCliente(InputStream cliente, Teste_Servidor_c_t servidor) {
            this.cliente = cliente;
            this.servidor = servidor;
        }

        public void run() {
            // quando chegar uma msg, distribui pra todos
            Scanner s = new Scanner(this.cliente);
            while (s.hasNextLine()) {
                servidor.distribuiMensagem(s.nextLine());
            }
            s.close();
        }
    }

    public void executa() throws IOException {
        ServerSocket servidor = new ServerSocket(this.porta);
        System.out.println("Porta 12345 aberta!");

        while (true) {
            Socket cliente = servidor.accept();// aceita um cliente
            System.out.println("Cliente: " + cliente.getInetAddress().getHostAddress());
            PrintStream ps = new PrintStream(cliente.getOutputStream()); // adiciona saida do cliente à lista
            this.clientes.add(ps);
            TrataCliente tc = new TrataCliente(cliente.getInputStream(), this); // cria tratador de cliente numa nova thread
            new Thread(tc).start();
        }
    }

    public void distribuiMensagem(String msg) {
        // envia msg para todo mundo
        for (PrintStream cliente : this.clientes) {
            cliente.println(msg);
        }
    }

    public static void main(String[] args) throws IOException {
        // inicia o servidor
        new Teste_Servidor_c_t(12345).executa();
    }

}
