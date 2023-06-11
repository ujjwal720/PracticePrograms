package Shailesh;

public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer printer = new Printer();
		printer.print("Windows");
		

	}

}


class Printer {
    private PrinterImpl printerImpl;
 
    public Printer() {
        String osName = System.getProperty("os.name");
        if (osName.equals("Windows")) {
            printerImpl = new WindowsPrinterImpl();
        } else {
            printerImpl = new LinuxPrinterImpl();
        }
    }
 
    public void print(String text) {
        printerImpl.print(text);
    }
}

class PrinterImpl {
    public void print(String text) {
    }
}

class WindowsPrinterImpl extends PrinterImpl {
    public void print(String text) {
        // code to print text using a Windows printer
    	System.out.println("1");
    }
}

class LinuxPrinterImpl extends PrinterImpl {
    public void print(String text) {
        // code to print text using a Linux printer
    	System.out.println("2");
    }
}