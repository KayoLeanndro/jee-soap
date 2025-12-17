package exer7;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface = "exer7.DataHora")
public class DataHoraImp implements DataHora{

	private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
	
	@Override
	public String get() {
		System.out.println("--> Executando get");
		return sdf.format(new Date());
	}

}
