
package leitura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LeCsv {
        
     public LinkedList<Cliente> leCsvClientes() throws IOException{         
      
         LinkedList<Cliente> clientes = new  LinkedList<Cliente>();             
        String current = new java.io.File( "." ).getCanonicalPath();        
        File inputFile = new File(current + "\\src\\arquivo.csv");
        BufferedReader stdin = new BufferedReader(new FileReader(inputFile));
        String[] keys = stdin.readLine().split(";");
        String values = stdin.readLine();
        String[] valArr;
        Cliente cliente;
        while (values != null) {
            valArr = values.split(";");
            cliente = new Cliente();
            cliente.setId(valArr[0]);
            cliente.setNome(valArr[1]);
            cliente.setEmail(valArr[2]);
            cliente.setDataNasc(valArr[3]);
            cliente.setTelefone(valArr[4]);
            cliente.setTotalCompras(new Double(valArr[5]));
            clientes.add(cliente);
            values = stdin.readLine();
        }
        stdin.close();
        
        //complete o codigo para ler o csv e criar as instancias de cliente.
        //rode o teste MainReadCsvTest.java para testar o seu código.
        
        return clientes;
     }
}
