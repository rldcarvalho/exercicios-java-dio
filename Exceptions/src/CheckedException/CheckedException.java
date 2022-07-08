package CheckedException;

import javax.swing.*;
import java.io.*;

public class CheckedException  {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        }catch (FileNotFoundException e){
//            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo que você deseja imprimir" + e.getCause());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado");
            e.printStackTrace();
        } finally {
            System.out.println("Chegou no finnaly");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }
    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }
}
