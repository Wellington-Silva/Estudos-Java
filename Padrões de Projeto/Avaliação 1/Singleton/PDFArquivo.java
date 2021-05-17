package ifs.padrões_de_projeto.Singleton;

public class PDFArquivo {
    private static PDFArquivo pdf;

    private PDFArquivo() { }

    //padrão Singleton para o arquivo PDF emitida pelos Residentes
    public static PDFArquivo getInstance() {
        if(pdf == null) {
            System.out.println("Arquivo PDF para upload criado e visualizado!");
            pdf = new PDFArquivo();
        }
        return pdf;
    }
}
