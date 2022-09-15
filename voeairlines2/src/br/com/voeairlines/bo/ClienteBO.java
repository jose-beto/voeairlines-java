package br.com.voeairlines.bo;

//Contrato
public class ClienteBO implements IValidacaoEmbarque {
    //Sobrepor - Polimorfismo. //depois..do intervalo.
	@Override
	public String validaIdade(int idade) {//BACK-END
		// TODO Auto-generated method stub
		String r;
		if(idade < IValidacaoEmbarque.IDADEMIN) {
			r = "Embarque N�o Autorizado";
		}else {
			r= "Boa Viagem!VoeAirlines Alcan�ando novos voos com voc�!";
		}
		return r;
	}
	
	
	

}
