package br.edu.ifpb.dac.avaliacao.q6.entidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author João Marcos F <joaomarccos.ads@gmail.com>
 */
@EntityListeners({ListennerConta.class})
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TIPO_CONTA", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "CONTA")
@Entity
public abstract class Conta implements Serializable{
    
    @ElementCollection    
    protected List<String> extrato;
    @Id    
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int codigo;
    @Column(unique = true)        
    protected int numero;
    protected int agencia;
    protected int digitoAgencia;
    protected int digitoConta;
    protected double saldo;
    protected String senha;

    public Conta() {
        generateNumeroConta();
        this.extrato = new ArrayList<>();        
    }

    public Conta(String senha) {
        this();                        
        this.digitoAgencia = 0001;
        this.digitoConta = 1;
        this.senha = senha;
        this.saldo = 0;
    }
    
    private void generateNumeroConta(){
        try{
            Path path = Paths.get("src/main/resources/numeros");
            
            try(BufferedReader reader = Files.newBufferedReader(path)){                
                this.numero = Integer.parseInt(reader.readLine());
            } catch (IOException ex) {
                Logger.getLogger(Conta.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Files.write(path, (this.numero+1+"").getBytes());
        } catch (IOException ex) {
            Logger.getLogger(Conta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumero() {
        return this.numero;
    }   

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getDigitoAgencia() {
        return digitoAgencia;
    }

    public void setDigitoAgencia(int digitoAgencia) {
        this.digitoAgencia = digitoAgencia;
    }

    public int getDigitoConta() {
        return digitoConta;
    }

    public void setDigitoConta(int digitoConta) {
        this.digitoConta = digitoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void addLog(String log){
        this.extrato.add(log);
    }

    public List<String> getExtrato() {
        return extrato;
    }

    public abstract boolean creditar(double valor);

    public abstract boolean debitar(double valor); 

}
