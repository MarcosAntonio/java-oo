package model;

import java.util.Scanner;
 
//import java.util.ArrayList;
 
public class Empresa
{
        private static int QTD_FUNCIONARIOS = 4;
       
        private String razaoSocial;
        private String nomeFantasia;
        private String cnpj;
        private int cont = 0;
        //private ArrayList<Funcionario> funcionarios;
        Funcionario [] funcionarios = new Funcionario [QTD_FUNCIONARIOS];
       
        public Empresa(String razaoSocial, String nomeFantasia, String cnpj )
        {
                this.razaoSocial = razaoSocial;
                this.nomeFantasia = nomeFantasia;
                this.cnpj = cnpj;
        }
        public String toString()
        {
                return this.nomeFantasia + "-"+ this.razaoSocial+"-"+this.cnpj;
               
        }      
        public boolean add(Funcionario funcionario)
        {
                try
                {
                        if (cont < funcionarios.length)
                        {
                                //cont = 0;
                                funcionarios[cont] = funcionario;
                                cont++;
                        }
                }catch(ArrayIndexOutOfBoundsException e)
                {
                        System.out.println("erro: " + e);
                }
                return false;
               
        }
       
//      public boolean removerFuncionarios(Funcionario funcionarios)
//      {
//              boolean achou = false;
//              for  (int i = 0; i <= this.funcionarios.length; i++ )
//              {
//                      Funcionario f = this.funcionarios[i];
//                      if (f.getCpf().equals(funcionarios.getCpf()))
//                      {
//                              this.funcionarios[i] = null;
//                              achou = true;
//                             
//                      }
//              }
//              return achou;
//      }
        
       
        public boolean removerFuncionario(String cpf) {
                boolean achou = false;
               
                for (int i = 0; i < this.funcionarios.length; i++) {
                        try
                        {
                                Funcionario f = this.funcionarios[i];
                                if ((this.funcionarios[i] != null) && (f.getCpf().equals(cpf))) {
                                        this.funcionarios[i] = null;
                                        achou = true;
                                }
                        }
                        catch (ArrayIndexOutOfBoundsException e)
                        {
                                System.out.println("erro: " + e);
                        }
                }
               
                return achou;
        }
       
        public boolean alterarFuncionario(String cpf, String nome)
        {
        	boolean achou = false;
        	for (int i = 0; i< this.funcionarios.length; i++)
        	{
        		Funcionario f = this.funcionarios[i];
        		if ((this.funcionarios[i] != null) && (f.getCpf().equals(cpf)))
        		{
        			this.funcionarios[i].setNome(nome);
        			achou = true;
        		}
        	}
        	
        	return achou;
        }
       
        public void getFuncionarios()
        {
                for (int i = 0; i < this.funcionarios.length; i++) {
                        try
                        {
                                if (this.funcionarios[i] != null)
                                {
                                        System.out.println(this.funcionarios[i].getNome());
                                }
                        }
                        catch (ArrayIndexOutOfBoundsException e)
                        {
                                System.out.println("erro: " + e);
                        }
                }
        }
 
        public String getRazaoSocial()
        {
                return razaoSocial;
        }
 
        public void setRazaoSocial(String razaoSocial)
        {
                this.razaoSocial = razaoSocial;
        }
 
        public String getNomeFantasia()
        {
                return nomeFantasia;
        }
 
        public void setNomeFantasia(String nomeFantasia)
        {
                this.nomeFantasia = nomeFantasia;
        }
 
        public String getCnpj()
        {
                return cnpj;
        }
 
        public void setCnpj(String cnpj)
        {
                this.cnpj = cnpj;
        }
}