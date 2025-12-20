package exer12;

import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.jws.WebService;

@WebService(endpointInterface = "exer12.ServicoImagem")
public class ImagemServicoImp implements ServicoImagem{

	@Override
	public Image dowload() {
		try {
			File image = new File("C://Estudo//imagens//soap.png");
			return ImageIO.read(image);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
