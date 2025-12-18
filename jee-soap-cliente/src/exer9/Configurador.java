package exer9;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class Configurador implements HandlerResolver {

	@SuppressWarnings("rawtypes")
	@Override
	public List<Handler> getHandlerChain(PortInfo portInfo) {
		List<Handler> handles = new ArrayList<Handler>();
		handles.add(new HandlerClienteLog());
		return handles;
	}
	
}
