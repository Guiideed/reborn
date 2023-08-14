package app;

import java.util.Date;

import entidade.Ordem;
import utilidades.EstatusOrdenado;

public class Programa {
	public static void main(String[]args) {
		
		Ordem ordem = new Ordem(1080,new Date(), EstatusOrdenado.PAGAMENTO_PENDENTE);
		
		System.out.println(ordem);
		
		
		EstatusOrdenado eo1 = EstatusOrdenado.ENTREGUE;
		EstatusOrdenado eo2 = EstatusOrdenado.valueOf("ENTREGUE");
		
		
		System.out.println(eo1);
		System.out.println(eo2);
	}
}
