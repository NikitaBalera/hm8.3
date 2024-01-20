public class Printer {
    public void printDocument(){
        private OfficeWorker officeWorker;

    public Printer(OfficeWorker officeWorker); {
            this.officeWorker = officeWorker;
        }

        public void print(String doc) {
            OfficeWorker.printDocument(doc);
        }

    }
}
