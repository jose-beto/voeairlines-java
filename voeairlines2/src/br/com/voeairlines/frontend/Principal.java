package br.com.voeairlines.frontend;
import br.com.voeairlines.bo.*;

import javax.swing.*; //se t� amarelo = n�o esta usando

//Renan
/*
 * import javax.swing.JOptionPane; 
 * 
 * 
 */
public class Principal {

	public static void main(String[] args) {
	    
		//Declara��o de um objeto
		ClienteBO cbo=new ClienteBO();
	     
		//Declara��o de uma vari�vel primitiva
		int idade; //FRONT-END
		
		//Declara��o de uma vari�vel de refer�ncia
		String leiaIdade; 
	  
		 
		//Entrada de Dados
		leiaIdade = JOptionPane.showInputDialog("Entre com sua idade:");
		//Classes Wrappers 
		
		//Convers�o
        idade = Integer.parseInt(leiaIdade);
        
        
        JOptionPane.showMessageDialog(null,cbo.validaIdade(idade));
        
        /*
        if(idade < 18) {
        	JOptionPane.showMessageDialog(null,
    	    		"Embarque N�o Autorizado!",
    	    		"VoeAirlines",
    	    		JOptionPane.ERROR_MESSAGE);
        }else {
        	JOptionPane.showMessageDialog(null,
    	    		"Boa Viagem! VoeAirlines Alcan�ando novos "
    	    		+ "voos com voc�!",
    	    		"VoeAirlines",
    	    		JOptionPane.INFORMATION_MESSAGE);
        }    
        */

	}

}
