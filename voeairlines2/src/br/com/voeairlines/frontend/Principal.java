package br.com.voeairlines.frontend;
import br.com.voeairlines.bo.*;

import javax.swing.*; //se tá amarelo = não esta usando

//Renan
/*
 * import javax.swing.JOptionPane; 
 * 
 * 
 */
public class Principal {

	public static void main(String[] args) {
	    
		//Declaração de um objeto
		ClienteBO cbo=new ClienteBO();
	     
		//Declaração de uma variável primitiva
		int idade; //FRONT-END
		
		//Declaração de uma variável de referência
		String leiaIdade; 
	  
		 
		//Entrada de Dados
		leiaIdade = JOptionPane.showInputDialog("Entre com sua idade:");
		//Classes Wrappers 
		
		//Conversão
        idade = Integer.parseInt(leiaIdade);
        
        
        JOptionPane.showMessageDialog(null,cbo.validaIdade(idade));
        
        /*
        if(idade < 18) {
        	JOptionPane.showMessageDialog(null,
    	    		"Embarque Não Autorizado!",
    	    		"VoeAirlines",
    	    		JOptionPane.ERROR_MESSAGE);
        }else {
        	JOptionPane.showMessageDialog(null,
    	    		"Boa Viagem! VoeAirlines Alcançando novos "
    	    		+ "voos com você!",
    	    		"VoeAirlines",
    	    		JOptionPane.INFORMATION_MESSAGE);
        }    
        */

	}

}
