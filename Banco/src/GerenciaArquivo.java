import java.awt.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GerenciaArquivo {
	public static void WriteFile(String json, String caminho){ 
        Path arquivo = Paths.get(caminho);
     if (!Files.exists(arquivo)) { 
         BufferedWriter bw = null;
         try {
             Files.createFile(arquivo);
             bw = new BufferedWriter(new FileWriter(arquivo.toFile(), true));
             bw.write(json);
         } catch (IOException ex) {
             Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
         } finally {
             try {
                 bw.close();
             } catch (IOException ex) {
                 Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     } else {
         BufferedWriter bw = null;
         try {
             bw = new BufferedWriter(new FileWriter(arquivo.toFile(), true));
             bw.newLine();
             bw.write(json);
         } catch (IOException ex) {
             Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
         } finally {
             try {
                 bw.close();
             } catch (IOException ex) {
                 Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     }
 }

/*
 public static List<String> ReadFile(String caminho){
     List<String> linhas = new ArrayList<>();
     Path arquivo = Paths.get(caminho);
     if(Files.exists(arquivo)){
         try {
             linhas = Files.readAllLines(arquivo, Charset.defaultCharset());
         } catch (IOException ex) {
             Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     return linhas;
 }
*/

}
