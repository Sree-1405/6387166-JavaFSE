package factorymethodpattern;

public class Docu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentFactory wordfac = new WordDocumentFactory();
		Document worddoc = wordfac.createDocument();
		worddoc.open();
		
		DocumentFactory pdffac = new PdfDocumentFactory();
		Document pdfdoc = pdffac.createDocument();
		pdfdoc.open();
		
		DocumentFactory xcelfac = new ExcelDocumentFactory();
		Document xceldoc = xcelfac.createDocument();
		xceldoc.open();

	}

}
