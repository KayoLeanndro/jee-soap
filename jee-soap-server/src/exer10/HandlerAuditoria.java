package exer10;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class HandlerAuditoria implements LogicalHandler<LogicalMessageContext>{
	
	private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

	@Override
	public boolean handleMessage(LogicalMessageContext context) {
	Boolean saida = (Boolean) context.get(SOAPMessageContext.MESSAGE_OUTBOUND_PROPERTY);
		
		if(saida) {
			System.out.println("Auditoria - Saindo a mensagem soap" + sdf.format(new Date()));
		}else {
			System.out.println("Auditoria - Chegando a mensagem soap" + sdf.format(new Date()));
		}
		
		return true;
	}

	@Override
	public boolean handleFault(LogicalMessageContext context) {
		return true;
	}

	@Override
	public void close(MessageContext context) {
		
	}

}
