import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GerenciaArquivo {
	public static void gravaobj(ArrayList user, String nome) {
		try {
			File file = new File(nome + ".txt");
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
			output.writeObject(user);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public static ArrayList leobj(String nome) {
		try {
			File file = new File(nome + ".txt");
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
			ArrayList user = (ArrayList) input.readObject(); // tirar a trasformação em caso de erro
			return user;

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null;

	}

}
