package exer9;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class HandlerClienteLog implements SOAPHandler<SOAPMessageContext> {

	
	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		
		Boolean saida = (Boolean) context.get(SOAPMessageContext.MESSAGE_OUTBOUND_PROPERTY);
		
		if(saida) {
			System.out.println("Cliente Log - Saindo a mensagem soap");
			log(context);
		}else {
			System.out.println("Cliente Log - Chegando a mensagem soap");
			log(context);
		}
		
		return true;
	}
	
	private void log(SOAPMessageContext context) {
		try {
			context.getMessage().writeTo(System.out);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void close(MessageContext arg0) {

	}

	//Executado caso aconteça um erro
	@Override
	public boolean handleFault(SOAPMessageContext arg0) {
		return true;
	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

}
